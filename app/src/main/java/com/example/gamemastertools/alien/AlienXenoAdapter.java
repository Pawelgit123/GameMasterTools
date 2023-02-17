package com.example.gamemastertools.alien;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gamemastertools.R;

public class AlienXenoAdapter extends RecyclerView.Adapter<AlienXenoAdapter.AlieXenoHolder> {

    private final AlienXenoCreature alienXeno;

    public AlienXenoAdapter(AlienXenoCreature alienXeno) {
        this.alienXeno = alienXeno;
    }

    @NonNull
    @Override
    public AlieXenoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.alien_item, parent, false);
        return new AlieXenoHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull AlieXenoHolder holder, int position) {

       holder.health.setText(alienXeno.getHealth());
       holder.armor.setText(String.valueOf(alienXeno.getArmor()));
       holder.armorFire.setText(String.valueOf(alienXeno.getArmorFire()));
       holder.speed.setText(String.valueOf(alienXeno.getSpeed()));
       holder.special.setText(alienXeno.getSpecial());
       holder.name.setText(alienXeno.getName());
       holder.type.setText(alienXeno.getType());
       holder.observation.setText(alienXeno.getObservation());
       holder.mobility.setText(alienXeno.getMobility());
       holder.virus.setText(alienXeno.getAcid());

        if(alienXeno.getType().equals("Xenomorph")){
            holder.virusAcidType.setText("Acid:");
        }
    }

    @Override
    public int getItemCount() {
        return 1;
    }


    public static class AlieXenoHolder extends RecyclerView.ViewHolder {

        TextView health;
        TextView armor;
        TextView armorFire;
        TextView speed;
        TextView mobility;
        TextView observation;
        TextView special;
        TextView name;
        TextView virus;
        TextView type;
        TextView virusAcidType;

        public AlieXenoHolder(@NonNull View itemView) {
            super(itemView);

            health = itemView.findViewById(R.id.textViewXenoHealth);
            armor = itemView.findViewById(R.id.textViewXenoArmor);
            armorFire = itemView.findViewById(R.id.textViewXenoArmorFire);
            speed = itemView.findViewById(R.id.textViewXenoSpeed);
            mobility = itemView.findViewById(R.id.textViewXenoMobility);
            observation = itemView.findViewById(R.id.textViewXenoObservation);
            special = itemView.findViewById(R.id.textViewXenoSpecials);
            name = itemView.findViewById(R.id.textViewXenoName);
            virus = itemView.findViewById(R.id.textViewXenoVirus);
            type = itemView.findViewById(R.id.textViewXenoType);
            virusAcidType = itemView.findViewById(R.id.textViewXenoVirusStatic);
        }
    }
}


