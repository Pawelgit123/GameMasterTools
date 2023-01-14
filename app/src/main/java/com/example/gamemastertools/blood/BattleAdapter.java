package com.example.gamemastertools.blood;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gamemastertools.R;

import java.util.List;

public class BattleAdapter extends RecyclerView.Adapter<BattleAdapter.BattleViewHolder> {

    List<Adversary> adversaryList;

    public BattleAdapter(Battle battle){
        adversaryList = battle.getAdversaryList();
    }

    @NonNull
    @Override
    public BattleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.battle_item, parent, false);

        return new BattleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BattleViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return adversaryList.size();
    }

    public static class BattleViewHolder extends RecyclerView.ViewHolder {

        public BattleViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
