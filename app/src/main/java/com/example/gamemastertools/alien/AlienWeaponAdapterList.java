package com.example.gamemastertools.alien;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gamemastertools.R;
import com.example.gamemastertools.blood.Human;

import java.util.Collections;
import java.util.List;

public class AlienWeaponAdapterList extends RecyclerView.Adapter<AlienWeaponAdapterList.AlienWeaponHolderList>{

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

        public AlienWeaponHolderList(@NonNull View itemView) {
            super(itemView);

            weaponName = itemView.findViewById(R.id.textViewWeaponItemListName);
            weaponType = itemView.findViewById(R.id.textViewWeaponItemListType);
        }
    }

}
