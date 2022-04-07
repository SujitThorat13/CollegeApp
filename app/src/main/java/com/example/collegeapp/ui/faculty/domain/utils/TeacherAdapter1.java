package com.example.collegeapp.ui.faculty.domain.utils;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.collegeapp.R;
import com.example.collegeapp.databinding.FacultyItemLayoutBinding;
import com.example.collegeapp.ui.faculty.domain.models.TeacherData;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class TeacherAdapter1 extends ListAdapter<TeacherData, TeacherAdapter1.ViewHolder> {

    public TeacherAdapter1() {
        super(new TeacherDataDiff());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return ViewHolder.from(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TeacherData data = getItem(position);
        holder.onBind(data);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final FacultyItemLayoutBinding dataBinding;

        private ViewHolder(@NonNull FacultyItemLayoutBinding dataBinding) {
            super(dataBinding.getRoot());
            this.dataBinding = dataBinding;
        }

        public void onBind(TeacherData data) {
            dataBinding.teacherName.setText(data.getName());
            dataBinding.teacherEmail.setText(data.getEmail());
            dataBinding.teacherPost.setText(data.getPost());

            Glide.with(dataBinding.getRoot())
                    .load(data.getImage())
                    .placeholder(R.drawable.avatarimage)
                    .into(dataBinding.teacherImage);
        }

        public static ViewHolder from(ViewGroup parent) {
            final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            final FacultyItemLayoutBinding dataBinding = FacultyItemLayoutBinding.inflate(inflater, parent, false);
            return new ViewHolder(dataBinding);
        }
    }

    private static class TeacherDataDiff extends DiffUtil.ItemCallback<TeacherData> {

        @Override
        public boolean areItemsTheSame(@NonNull TeacherData oldItem, @NonNull TeacherData newItem) {
            return oldItem.getKey().equals(newItem.getKey());
        }

        @Override
        public boolean areContentsTheSame(@NonNull TeacherData oldItem, @NonNull TeacherData newItem) {
            return oldItem.getEmail().equals(newItem.getEmail());
        }
    }
}