package com.example.collegeapp.ui.notice.domain.utils;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.collegeapp.databinding.NewsfeedItemLayoutBinding;
import com.example.collegeapp.ui.notice.domain.models.NoticeData;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class NoticeAdapter1 extends ListAdapter<NoticeData, NoticeAdapter1.ViewHolder> {

    private static final String TAG = NoticeAdapter1.class.getSimpleName();

    public NoticeAdapter1() {
        super(new NoticeAdapterDiffUtil());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return ViewHolder.from(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NoticeData data = getItem(position);
        holder.bind(data);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final NewsfeedItemLayoutBinding dataBinding;

        private ViewHolder(NewsfeedItemLayoutBinding dataBinding) {
            super(dataBinding.getRoot());
            this.dataBinding = dataBinding;
        }

        public void bind(NoticeData data) {
            Log.d(TAG, "Notice Data :- " + data);
            Log.d(TAG, "Notice Data img :- "+data.getImage());
            final Context context = dataBinding.getRoot().getContext();

            dataBinding.deleteNoticeTitle.setText(data.getTitle());
            dataBinding.date.setText(data.getDate());
            dataBinding.time.setText(data.getImage());


            Glide.with(context)
                    .load(data.getTime())
                    .into(dataBinding.deleteNoticeImage);

        }

        public static ViewHolder from(ViewGroup parent) {
            final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            final NewsfeedItemLayoutBinding dataBinding = NewsfeedItemLayoutBinding.inflate(inflater, parent, false);
            return new ViewHolder(dataBinding);
        }
    }

    private static class NoticeAdapterDiffUtil extends DiffUtil.ItemCallback<NoticeData> {

        @Override
        public boolean areItemsTheSame(@NonNull NoticeData oldItem, @NonNull NoticeData newItem) {
            return oldItem.getKey().equals(newItem.getKey());
        }

        @Override
        public boolean areContentsTheSame(@NonNull NoticeData oldItem, @NonNull NoticeData newItem) {
            return oldItem.equals(newItem);
        }
    }
}
