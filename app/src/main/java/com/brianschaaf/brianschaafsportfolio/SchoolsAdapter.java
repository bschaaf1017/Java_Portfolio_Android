package com.brianschaaf.brianschaafsportfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class SchoolsAdapter extends RecyclerView.Adapter<SchoolsAdapter.SchoolViewHolder> {
    Project[] schools;

    public SchoolsAdapter(Project[] schools) {
        this.schools = schools;
    }

    @Override
    public int getItemCount() {
        return schools.length;
    }

    @NonNull
    @NotNull
    @Override
    public SchoolViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_school, parent, false);
        return new SchoolViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull SchoolsAdapter.SchoolViewHolder holder, int position) {
        holder.bind(schools[position]);


    }

    protected class SchoolViewHolder extends RecyclerView.ViewHolder {

        ImageView schoolImage;
        TextView schoolName;
        TextView studied;
        TextView date;

        public SchoolViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            schoolImage = itemView.findViewById(R.id.image_view_school_icon);
            schoolName = itemView.findViewById(R.id.text_view_school_name);
            studied = itemView.findViewById(R.id.text_view_studied);
            date = itemView.findViewById(R.id.text_view_dates_school);
        }

        public void bind(Project school) {
            schoolImage.setImageResource(school.image);
            schoolName.setText(school.name);
            studied.setText(school.position);
            date.setText(school.date);

        }
    }


}
