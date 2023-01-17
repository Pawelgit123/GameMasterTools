package com.example.gamemastertools.blood;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gamemastertools.R;

import java.util.List;

public class BattleAdapter extends RecyclerView.Adapter<BattleAdapter.BattleViewHolder> {

    public BattleAdapter(Battle battle){
        adversaryList = battle.getAdversaryList();
    }

    private final List<Adversary> adversaryList;

    @NonNull
    @Override
    public BattleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.battle_item, parent, false);

        return new BattleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BattleViewHolder holder, int position) {

        Human human = (Human) adversaryList.get(position);
        holder.prowess.setText(human.getVirtueProwess());
        holder.strength.setText(human.getVirtueStrength());
        holder.cunning.setText(human.getVirtueCunning());
        holder.courage.setText(human.getVirtueCourage());
        holder.wisdom.setText(human.getVirtueWisdom());
        holder.beauty.setText(human.getVirtueBeauty());
        holder.initiativeRolled.setText(human.getInitiative());
        holder.initiativeDices.setText(human.getInitiativeDices());

    }

    @Override
    public int getItemCount() {
        return adversaryList.size();
    }

    public static class BattleViewHolder extends RecyclerView.ViewHolder {

        TextView prowess;
        TextView strength;
        TextView cunning;
        TextView courage;
        TextView wisdom;
        TextView beauty;
        TextView initiativeRolled;
        TextView initiativeDices;

        public BattleViewHolder(@NonNull View itemView) {
            super(itemView);
            prowess = itemView.findViewById(R.id.textViewProwessNumber);
            strength = itemView.findViewById(R.id.textViewStrengthNumber);
            cunning = itemView.findViewById(R.id.textViewCunningNumber);
            courage = itemView.findViewById(R.id.textViewCourageNumber);
            wisdom = itemView.findViewById(R.id.textViewWisdomNumber);
            beauty = itemView.findViewById(R.id.textViewBeautyNumber);
            initiativeRolled = itemView.findViewById(R.id.textAdversaryInitiativeRolledNumber);
            initiativeDices = itemView.findViewById(R.id.textInitiativeDicesNumber);

        }
    }
}
