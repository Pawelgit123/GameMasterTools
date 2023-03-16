package com.example.gamemastertools.alien;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gamemastertools.R;

import java.util.List;

public class AlienWeaponAdapterList extends RecyclerView.Adapter<AlienWeaponAdapterList.AlienWeaponHolderList> {

    private final List<AlienWeapon> list;

    public AlienWeaponAdapterList(List<AlienWeapon> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public AlienWeaponHolderList onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.weapon_item, parent, false);

        return new AlienWeaponHolderList(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull AlienWeaponHolderList holder, int position) {

        AlienWeapon alienWeapon = list.get(position);
        holder.weaponName.setText(alienWeapon.getName());
        holder.weaponType.setText("[" +alienWeapon.getType() +"]");
        holder.alienWeapon = alienWeapon;

        holder.itemView.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
            View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.weapon_dialog, null);
            TextView weaponNameDialog;
            TextView weaponManufacturerDialog;
            TextView weaponBonusDialog;
            TextView weaponDamageDialog;
            TextView weaponAmmoDialog;
            TextView weaponRangeDialog;
            TextView weaponWeightDialog;
            TextView weaponCostDialog;
            TextView weaponSpecialsDialog;
            TextView weaponTypeDialog;

            weaponNameDialog= dialogView.findViewById(R.id.textViewAlienWeaponDialogWeaponName);
            weaponManufacturerDialog= dialogView.findViewById(R.id.textViewAlienWeaponManufacturer);
            weaponBonusDialog=dialogView.findViewById(R.id.textViewAlienWeaponBonus);
            weaponDamageDialog=dialogView.findViewById(R.id.textViewAlienWeaponDamage);
            weaponAmmoDialog=dialogView.findViewById(R.id.textViewAlienWeaponAmmo);
            weaponRangeDialog=dialogView.findViewById(R.id.textViewAlienArmorAir);
            weaponWeightDialog=dialogView.findViewById(R.id.textViewAlienWeaponWeight);
            weaponCostDialog=dialogView.findViewById(R.id.textViewAlienWeaponCost);
            weaponSpecialsDialog=dialogView.findViewById(R.id.textViewAlienWeaponSpecials);
            weaponTypeDialog=dialogView.findViewById(R.id.textViewAlienWeaponType);

            weaponNameDialog.setText(alienWeapon.getName());
            weaponManufacturerDialog.setText(alienWeapon.getManufacturer());
            weaponBonusDialog.setText("+"+(alienWeapon.getBonus()));
            weaponDamageDialog.setText(String.valueOf(alienWeapon.getDamage()));
            weaponAmmoDialog.setText(alienWeapon.getAmmo());
            weaponRangeDialog.setText(alienWeapon.getRange());
            weaponWeightDialog.setText(alienWeapon.getWeight());
            weaponCostDialog.setText("$"+(alienWeapon.getCost()));
            weaponSpecialsDialog.setText(alienWeapon.getSpecials());
            weaponTypeDialog.setText("["+alienWeapon.getType()+"]");

            TextView weaponManufacturerDialogStatic;
            TextView weaponBonusDialogStatic;
            TextView weaponDamageDialogStatic;
            TextView weaponAmmoDialogStatic;
            TextView weaponRangeDialogStatic;
            TextView weaponWeightDialogStatic;
            TextView weaponCostDialogStatic;
            TextView weaponSpecialsDialogStatic;

            weaponManufacturerDialogStatic= dialogView.findViewById(R.id.textViewAlienWeaponManufacturerStatic);
            weaponBonusDialogStatic=dialogView.findViewById(R.id.textViewAlienWeaponBonusStatic);
            weaponDamageDialogStatic=dialogView.findViewById(R.id.textViewAlienWeaponDamageStatic);
            weaponAmmoDialogStatic=dialogView.findViewById(R.id.textViewAlienWeaponAmmoStatic);
            weaponRangeDialogStatic=dialogView.findViewById(R.id.textViewAlienWeaponRangeStatic);
            weaponWeightDialogStatic=dialogView.findViewById(R.id.textViewAlienWeaponWeightStatic);
            weaponCostDialogStatic=dialogView.findViewById(R.id.textViewAlienWeaponCostStatic);
            weaponSpecialsDialogStatic=dialogView.findViewById(R.id.textViewAlienWeaponSpecialsStatic);

            colorMyText(weaponNameDialog,holder,alienWeapon.listType);
            colorMyText(weaponManufacturerDialogStatic,holder,alienWeapon.listType);
            colorMyText(weaponBonusDialogStatic,holder,alienWeapon.listType);
            colorMyText(weaponDamageDialogStatic,holder,alienWeapon.listType);
            colorMyText(weaponAmmoDialogStatic,holder,alienWeapon.listType);
            colorMyText(weaponRangeDialogStatic,holder,alienWeapon.listType);
            colorMyText(weaponWeightDialogStatic,holder,alienWeapon.listType);
            colorMyText(weaponCostDialogStatic,holder,alienWeapon.listType);
            colorMyText(weaponSpecialsDialogStatic,holder,alienWeapon.listType);
            colorMyText(weaponTypeDialog,holder,alienWeapon.listType);

            builder.setView(dialogView);
            builder.show();
        });

        switch (alienWeapon.listType){
            case 3:holder.weaponType.setTextColor(ContextCompat.getColor(holder.weaponType.getContext(), R.color.teal_200));
                break;
            case 4: holder.weaponType.setTextColor(ContextCompat.getColor(holder.weaponType.getContext(), R.color.green));
                break;
            case 5: holder.weaponType.setTextColor(ContextCompat.getColor(holder.weaponType.getContext(), R.color.gold));
                break;
            case 6: holder.weaponType.setTextColor(ContextCompat.getColor(holder.weaponType.getContext(), R.color.red));
                break;
            case 7:holder.weaponType.setTextColor(ContextCompat.getColor(holder.weaponType.getContext(), R.color.alienbrown));
                break;
            case 8: holder.weaponType.setTextColor(ContextCompat.getColor(holder.weaponType.getContext(), R.color.alienviolet));
                break;
            default: holder.weaponType.setTextColor(ContextCompat.getColor(holder.weaponType.getContext(), R.color.white));
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class AlienWeaponHolderList extends RecyclerView.ViewHolder {

        TextView weaponName;
        TextView weaponType;
        AlienWeapon alienWeapon;

        public AlienWeaponHolderList(@NonNull View itemView) {
            super(itemView);
            weaponName = itemView.findViewById(R.id.textViewWeaponItemListName);
            weaponType = itemView.findViewById(R.id.textViewWeaponItemListType);
        }
    }

    public void colorMyText(TextView textView,AlienWeaponHolderList holder, int listType){
        switch (listType){
            case 3:textView.setTextColor(ContextCompat.getColor(holder.weaponType.getContext(), R.color.teal_200));
                break;
            case 4: textView.setTextColor(ContextCompat.getColor(holder.weaponType.getContext(), R.color.green));
                break;
            case 5: textView.setTextColor(ContextCompat.getColor(holder.weaponType.getContext(), R.color.gold));
                break;
            case 6: textView.setTextColor(ContextCompat.getColor(holder.weaponType.getContext(), R.color.red));
                break;
            case 7:textView.setTextColor(ContextCompat.getColor(holder.weaponType.getContext(), R.color.alienbrown));
                break;
            case 8: textView.setTextColor(ContextCompat.getColor(holder.weaponType.getContext(), R.color.alienviolet));
                break;
            default: textView.setTextColor(ContextCompat.getColor(holder.weaponType.getContext(), R.color.white));
        }
    }

    public void colorMyTextRandomPick(TextView textView, View view, int listType){
        switch (listType){
            case 3:textView.setTextColor(ContextCompat.getColor(view.getContext(), R.color.teal_200));
                break;
            case 4: textView.setTextColor(ContextCompat.getColor(view.getContext(), R.color.green));
                break;
            case 5: textView.setTextColor(ContextCompat.getColor(view.getContext(), R.color.gold));
                break;
            case 6: textView.setTextColor(ContextCompat.getColor(view.getContext(), R.color.red));
                break;
            case 7:textView.setTextColor(ContextCompat.getColor(view.getContext(), R.color.alienbrown));
                break;
            case 8: textView.setTextColor(ContextCompat.getColor(view.getContext(), R.color.alienviolet));
                break;
            default: textView.setTextColor(ContextCompat.getColor(view.getContext(), R.color.white));
        }
    }

}
