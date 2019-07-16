package com.ravi.commitsfromgit.adapter;

import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ravi.commitsfromgit.R;
import com.ravi.commitsfromgit.pojo.MyCommits;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<MyCommits> data;

    @Inject
    public RecyclerViewAdapter() {
        data = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_list_row, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtName.setText(data.get(position).getCommit().getAuthor().getName());
        holder.txtCommitId.setText(data.get(position).getSha());

        holder.txtCommitMessage.setText(data.get(position).getCommit().getMessage());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txtName;
        private TextView txtCommitId;
        private TextView txtCommitMessage;
        ViewHolder(View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtCommitId = itemView.findViewById(R.id.txtCommitId);
            txtCommitMessage = itemView.findViewById(R.id.txtCommitMessage);


        }
    }



    public void setData(List<MyCommits> data) {
        this.data.addAll(data);
        notifyDataSetChanged();
    }
}
