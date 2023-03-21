package com.example.gamemastertools.houses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gamemastertools.R;

import java.util.List;

public class HouseAdapter extends RecyclerView.Adapter<HouseAdapter.HouseHolder> {

    private final List<House> houseList;

    public HouseAdapter(List<House> houseList) {
        this.houseList = houseList;
    }

    @NonNull
    @Override
    public HouseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.house_item, parent, false);

        return new HouseAdapter.HouseHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HouseHolder holder, int position) {

        House house = houseList.get(position);
        holder.houseName.setText(house.getName());
        holder.houseDescription.setText(house.getDescription());
        holder.houseVirtue.setText(house.getVirtue());
        holder.houseLogo.setImageResource(house.getHouseLogo());
        holder.houseAdditional.setText(house.getAdditional());
    }

    @Override
    public int getItemCount() {
        return houseList.size();
    }

    public static class HouseHolder extends RecyclerView.ViewHolder {

        ImageView houseLogo;
        TextView houseName;
        TextView houseDescription;
        TextView houseVirtue;
        TextView houseAdditional;

        public HouseHolder(@NonNull View itemView) {
            super(itemView);

            houseLogo = itemView.findViewById(R.id.imageViewHousesItemHouseLogo);
            houseName = itemView.findViewById(R.id.textViewHousesItemHouseName);
            houseDescription = itemView.findViewById(R.id.textViewHousesItemHouseDescription);
            houseVirtue = itemView.findViewById(R.id.textViewHousesItemHousesVirtue);
            houseAdditional = itemView.findViewById(R.id.textViewHousesItemHouseAdditional);
        }
    }
}
