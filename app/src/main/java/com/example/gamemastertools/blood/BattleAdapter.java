package com.example.gamemastertools.blood;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gamemastertools.R;

import java.util.List;

public class BattleAdapter extends RecyclerView.Adapter<BattleAdapter.BattleViewHolder> {

    private final List<Human> adversaryList;

    public BattleAdapter(List<Human> adversaryList){
        this.adversaryList = adversaryList;
    }

    @NonNull
    @Override
    public BattleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.battle_item, parent, false);

        return new BattleViewHolder(v);
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
        holder.bonusInitiative.setText("+" + human.getBonusInitiative());

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

        }
    }
}
