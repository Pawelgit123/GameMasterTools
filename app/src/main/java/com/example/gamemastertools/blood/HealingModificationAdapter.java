package com.example.gamemastertools.blood;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gamemastertools.R;

import java.util.List;

public class HealingModificationAdapter extends RecyclerView.Adapter<HealingModificationAdapter.HealingModificationViewHolder>{

    private final List<HealingModification> healingModificationList;

    public HealingModificationAdapter(List<HealingModification> healingModificationList) {
        this.healingModificationList = healingModificationList;
    }

    @NonNull
    @Override
    public HealingModificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.healing_mod_item, parent, false);
        return new HealingModificationViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HealingModificationViewHolder holder, int position) {

        HealingModification healingModification = healingModificationList.get(position);

        holder.modificationName.setText(healingModification.getName());
        holder.modificationDescription.setText(healingModification.getDescription());
        holder.modificationModNumber.setText(String.valueOf(healingModification.getMod()));

    }

    @Override
    public int getItemCount() {
        return healingModificationList.size();
    }

    public static class HealingModificationViewHolder extends RecyclerView.ViewHolder{

        TextView modificationName;
        TextView modificationModNumber;
        TextView modificationDescription;

        public HealingModificationViewHolder(@NonNull View itemView) {
            super(itemView);

            modificationName = itemView.findViewById(R.id.textViewHealingModificationName);
            modificationModNumber = itemView.findViewById(R.id.textViewHealingModificationMod);
            modificationDescription = itemView.findViewById(R.id.textViewHealingModificationDescription);
        }
    }
}
