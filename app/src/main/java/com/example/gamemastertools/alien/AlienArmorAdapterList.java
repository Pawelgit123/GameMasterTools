package com.example.gamemastertools.alien;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gamemastertools.R;

import java.util.List;

public class AlienArmorAdapterList extends RecyclerView.Adapter<AlienArmorAdapterList.AlienArmorHolderList> {

    private final List<AlienArmor> alienArmorList;

    public AlienArmorAdapterList(List<AlienArmor> alienArmorList) {
        this.alienArmorList = alienArmorList;
    }

    @NonNull
    @Override
    public AlienArmorHolderList onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.armor_item, parent, false);

        return new AlienArmorHolderList(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull AlienArmorHolderList holder, int position) {

        AlienArmor alienArmor = alienArmorList.get(position);
        holder.name.setText(alienArmor.getName());
        holder.type.setText("["+alienArmor.getType()+"]");

        holder.itemView.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
            View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.armor_dialog, null);

            TextView armorName;
            TextView armorRating;
            TextView armorWeight;
            TextView armorComms;
            TextView armorCost;
            TextView armorAir;
            TextView armorABC;
            TextView armorVacuum;
            TextView armorFire;
            TextView armorACID;
            TextView armorAdditional;
            TextView armorNegatives;
            TextView armorType;

            armorName = dialogView.findViewById(R.id.textViewAlienArmorDialogArmorName);
            armorRating = dialogView.findViewById(R.id.textViewAlienArmorRating);
            armorWeight = dialogView.findViewById(R.id.textViewAlienArmorWeight);
            armorComms = dialogView.findViewById(R.id.textViewAlienArmorComms);
            armorCost = dialogView.findViewById(R.id.textViewAlienArmorCost);
            armorAir = dialogView.findViewById(R.id.textViewAlienArmorAir);
            armorABC = dialogView.findViewById(R.id.textViewAlienArmorABC);
            armorVacuum = dialogView.findViewById(R.id.textViewAlienArmorVacuum);
            armorFire = dialogView.findViewById(R.id.textViewAlienArmorFireResistant);
            armorACID = dialogView.findViewById(R.id.textViewAlienArmorAcidResistance);
            armorAdditional = dialogView.findViewById(R.id.textViewAlienArmorSpecials);
            armorNegatives = dialogView.findViewById(R.id.textViewAlienArmorNegatives);
            armorType = dialogView.findViewById(R.id.textViewAlienArmorType);

            armorName.setText(alienArmor.getName());
            armorRating.setText(alienArmor.getArmorValue());
            armorWeight.setText(alienArmor.getWeight());
            armorCost.setText("$"+(alienArmor.getCost()));
            armorAir.setText(String.valueOf(alienArmor.getAir()));
            armorAdditional.setText(alienArmor.getAdditional());
            armorNegatives.setText(alienArmor.getNegatives());
            armorType.setText(alienArmor.getType());

            armorFire.setVisibility(View.INVISIBLE);
            armorABC.setVisibility(View.INVISIBLE);
            armorComms.setVisibility(View.INVISIBLE);
            armorVacuum.setVisibility(View.INVISIBLE);
            armorACID.setVisibility(View.INVISIBLE);

            if(alienArmor.fire){
                armorFire.setVisibility(View.VISIBLE);
            }
            if(alienArmor.abc){
                armorABC.setVisibility(View.VISIBLE);
            }
            if(alienArmor.communication){
                armorComms.setVisibility(View.VISIBLE);
            }
            if(alienArmor.vacuum){
                armorVacuum.setVisibility(View.VISIBLE);
            }
            if(alienArmor.acid){
                armorACID.setVisibility(View.VISIBLE);
            }

            builder.setView(dialogView);
            builder.show();
        });


    }

    @Override
    public int getItemCount() {
        return alienArmorList.size();
    }


    public static class AlienArmorHolderList extends RecyclerView.ViewHolder {

        TextView name;
        TextView type;
        AlienArmor alienArmor;


        public AlienArmorHolderList(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.textViewArmorItemListName);
            type = itemView.findViewById(R.id.textViewArmorItemListType);
        }
    }
}
