package com.brianschaaf.brianschaafsportfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> {


    private Project[] projects;

    public ProjectsAdapter(Project[] projects) {
        this.projects = projects;
    }

    @Override
    public int getItemCount() {
        return projects.length;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_job, viewGroup, false);

        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull ProjectsAdapter.ProjectViewHolder projectViewHolder, int i) {
        projectViewHolder.bind(projects[i]);
    }


    static class ProjectViewHolder extends RecyclerView.ViewHolder {

        private ImageView projectImage;
        private TextView projectTitle;
        private TextView projectPosition;
        private TextView projectDates;

        public ProjectViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);

            projectImage = itemView.findViewById(R.id.image_view_job_icon);
            projectTitle = itemView.findViewById(R.id.text_view_app_title);
            projectPosition = itemView.findViewById(R.id.text_view_position);
            projectDates = itemView.findViewById(R.id.text_view_dates);
        }

        public void bind(Project project) {
            projectTitle.setText(project.name);
            projectPosition.setText(project.position);
            projectImage.setImageResource(project.image);
            projectDates.setText(project.date);
        }
    }

}
