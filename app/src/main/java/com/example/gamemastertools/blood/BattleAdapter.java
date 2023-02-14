package com.example.gamemastertools.blood;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gamemastertools.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BattleAdapter extends RecyclerView.Adapter<BattleAdapter.BattleViewHolder> {

    private final List<Human> adversaryList;

    public BattleAdapter(List<Human> adversaryList){
        this.adversaryList = adversaryList;
    }

    @NonNull
    @Override
    public BattleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.battle_item, parent, false);
        final BattleViewHolder holder = new BattleViewHolder(v);

        Dialog dialog = new Dialog(parent.getContext());
        dialog.setContentView(R.layout.wound_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        v.findViewById(R.id.btnAddWound).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();

                dialog.findViewById(R.id.btn_add_wound_one).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addWound(1,holder);
                        dialog.dismiss();

                    }
                });

                dialog.findViewById(R.id.btn_add_wound_two).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addWound(2,holder);
                        dialog.dismiss();
                    }
                });

                dialog.findViewById(R.id.btn_add_wound_three).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addWound(3,holder);
                        dialog.dismiss();
                    }
                });

                dialog.findViewById(R.id.btn_add_wound_four).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addWound(4, holder);
                        dialog.dismiss();
                    }
                });

                dialog.findViewById(R.id.btn_add_wound_five).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addWound(5, holder);
                        dialog.dismiss();
                    }
                });

                dialog.findViewById(R.id.btn_add_wound_six).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addWound(6, holder);
                        dialog.dismiss();
                    }
                });

                dialog.findViewById(R.id.btn_remove_wound_one).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        removeWound(1,holder);
                        dialog.dismiss();
                    }
                });

                dialog.findViewById(R.id.btn_remove_wound_two).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        removeWound(2,holder);
                        dialog.dismiss();
                    }
                });

                dialog.findViewById(R.id.btn_remove_wound_three).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        removeWound(3,holder);
                        dialog.dismiss();
                    }
                });

                dialog.findViewById(R.id.btn_remove_wound_four).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        removeWound(4,holder);
                        dialog.dismiss();
                    }
                });

                dialog.findViewById(R.id.btn_remove_wound_five).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        removeWound(5,holder);
                        dialog.dismiss();
                    }
                });

                dialog.findViewById(R.id.btn_remove_wound_six).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        removeWound(6,holder);
                        dialog.dismiss();
                    }
                });
            }
        });

        return holder;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull BattleViewHolder holder, int position) {

        Human human = adversaryList.get(position);
        holder.prowessTextView.setText(String.valueOf(human.getVirtueProwess()));
        holder.strengthTextView.setText(String.valueOf(human.getVirtueStrength()));
        holder.cunningTextView.setText(String.valueOf(human.getVirtueCunning()));
        holder.courageTextView.setText(String.valueOf(human.getVirtueCourage()));
        holder.wisdomTextView.setText(String.valueOf(human.getVirtueWisdom()));
        holder.beautyTextView.setText(String.valueOf(human.getVirtueBeauty()));
        holder.initiativeRolledTextView.setText(String.valueOf(human.getInitiative()));
        holder.initiativeDicesTextView.setText(String.valueOf(human.getInitiativeDices()));
        holder.combatDices.setText(String.valueOf(human.getCombatDices()));
        holder.bonusInitiative.setText("(+" + human.getBonusInitiative() + " mod)");
        holder.name.setText(human.getName());
        holder.isLeader.setText(human.getIsLeader());
        holder.weapon.setText("[" +human.getWeapon()+"]");

        Collections.sort(human.getWounds());
        String wound = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            wound = human.getWounds().stream().map(String::valueOf).collect(Collectors.joining(" "));
        }
        holder.wounds.setText(wound);
        holder.human = human;

        switch (human.getCombatDices()){
            case 12: holder.diceBox12.setVisibility(View.VISIBLE);
            case 11: holder.diceBox11.setVisibility(View.VISIBLE);
            case 10: holder.diceBox10.setVisibility(View.VISIBLE);
            case 9: holder.diceBox9.setVisibility(View.VISIBLE);
            case 8: holder.diceBox8.setVisibility(View.VISIBLE);
            case 7: holder.diceBox7.setVisibility(View.VISIBLE);
            case 6: holder.diceBox6.setVisibility(View.VISIBLE);
            case 5: holder.diceBox5.setVisibility(View.VISIBLE);
            case 4: holder.diceBox4.setVisibility(View.VISIBLE);
            case 3: holder.diceBox3.setVisibility(View.VISIBLE);
            case 2: holder.diceBox2.setVisibility(View.VISIBLE);
            case 1: holder.diceBox1.setVisibility(View.VISIBLE);
            break;
        }

    }

    @Override
    public int getItemCount() {
        return adversaryList.size();
    }

    public static class BattleViewHolder extends RecyclerView.ViewHolder {

        TextView prowessTextView;
        TextView strengthTextView;
        TextView cunningTextView;
        TextView courageTextView;
        TextView wisdomTextView;
        TextView beautyTextView;
        TextView initiativeRolledTextView;
        TextView initiativeDicesTextView;
        TextView combatDices;
        TextView bonusInitiative;
        TextView name;
        TextView isLeader;
        TextView weapon;
        TextView wounds;

        CheckBox diceBox1;
        CheckBox diceBox2;
        CheckBox diceBox3;
        CheckBox diceBox4;
        CheckBox diceBox5;
        CheckBox diceBox6;
        CheckBox diceBox7;
        CheckBox diceBox8;
        CheckBox diceBox9;
        CheckBox diceBox10;
        CheckBox diceBox11;
        CheckBox diceBox12;

        Human human;


        public BattleViewHolder(@NonNull View itemView) {
            super(itemView);
            prowessTextView = itemView.findViewById(R.id.textViewProwessNumber);
            strengthTextView = itemView.findViewById(R.id.textViewStrengthNumber);
            cunningTextView = itemView.findViewById(R.id.textViewCunningNumber);
            courageTextView = itemView.findViewById(R.id.textViewCourageNumber);
            wisdomTextView = itemView.findViewById(R.id.textViewWisdomNumber);
            beautyTextView = itemView.findViewById(R.id.textViewBeautyNumber);
            initiativeRolledTextView = itemView.findViewById(R.id.textAdversaryInitiativeRolledNumber);
            initiativeDicesTextView = itemView.findViewById(R.id.textInitiativeDicesNumber);
            combatDices = itemView.findViewById(R.id.textCombatdDicesNumber);
            bonusInitiative = itemView.findViewById(R.id.textBonusInitiative);
            name = itemView.findViewById(R.id.textAdversaryName);
            isLeader = itemView.findViewById(R.id.textAreYouLeader);
            weapon = itemView.findViewById(R.id.textWeapon);
            wounds = itemView.findViewById(R.id.textViewWounds);

            diceBox1 = itemView.findViewById(R.id.checkBoxDiceNumberOne);
            diceBox2 = itemView.findViewById(R.id.checkBoxDiceNumberTwo);
            diceBox3 = itemView.findViewById(R.id.checkBoxDiceNumberThree);
            diceBox4 = itemView.findViewById(R.id.checkBoxDiceNumberFour);
            diceBox5 = itemView.findViewById(R.id.checkBoxDiceNumberFive);
            diceBox6 = itemView.findViewById(R.id.checkBoxDiceNumberSix);
            diceBox7 = itemView.findViewById(R.id.checkBoxDiceNumberSeven);
            diceBox8 = itemView.findViewById(R.id.checkBoxDiceNumberEight);
            diceBox9 = itemView.findViewById(R.id.checkBoxDiceNumberNine);
            diceBox10 = itemView.findViewById(R.id.checkBoxDiceNumberTen);
            diceBox11 = itemView.findViewById(R.id.checkBoxDiceNumberEleven);
            diceBox12 = itemView.findViewById(R.id.checkBoxDiceNumberTwelve);

        }
    }

    void addWound(int wound, BattleViewHolder holder){
        Human human = adversaryList.get(holder.getAdapterPosition());
        ArrayList<Integer> wounds = human.getWounds();
        wounds.add(wound);
        notifyItemChanged(holder.getAdapterPosition());
    }

    void removeWound(int wound, BattleViewHolder holder){
        Human human = adversaryList.get(holder.getAdapterPosition());
        ArrayList<Integer> wounds = human.getWounds();
        wounds.remove(Integer.valueOf(wound));
        notifyItemChanged(holder.getAdapterPosition());
    }
}
