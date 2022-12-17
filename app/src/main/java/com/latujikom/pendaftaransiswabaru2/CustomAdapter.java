package com.latujikom.pendaftaransiswabaru2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    Context context;
    ArrayList<String> person_id, person_name, person_address, person_handphone, person_gender, person_location;

    CustomAdapter(Context context, ArrayList person_id, ArrayList person_name, ArrayList person_address, ArrayList person_handphone, ArrayList person_gender, ArrayList person_location ){
        this.context = context;
        this.person_id = person_id;
        this.person_name = person_name;
        this.person_address = person_address;
        this.person_handphone = person_handphone;
        this.person_gender = person_gender;
        this.person_location = person_location;
    }

    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder holder, int position) {
        holder.person_id_txt.setText(String.valueOf(person_id.get(position)));
        holder.person_name_txt.setText(String.valueOf(person_name.get(position)));
        holder.person_address_txt.setText(String.valueOf(person_address.get(position)));
        holder.person_handphone_txt.setText(String.valueOf(person_handphone.get(position)));
        holder.person_gender_txt.setText(String.valueOf(person_gender.get(position)));
        holder.person_location_txt.setText(String.valueOf(person_location.get(position)));
    }

    @Override
    public int getItemCount() {
        return person_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView person_id_txt, person_name_txt, person_address_txt, person_handphone_txt, person_gender_txt, person_location_txt;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            person_id_txt = itemView.findViewById(R.id.person_id_txt);
            person_name_txt = itemView.findViewById(R.id.person_name_txt);
            person_address_txt = itemView.findViewById(R.id.person_address_txt);
            person_handphone_txt = itemView.findViewById(R.id.person_handphone_txt);
            person_gender_txt = itemView.findViewById(R.id.person_gender_txt);
            person_location_txt = itemView.findViewById(R.id.person_location_txt);
        }
    }
}
