package com.scorched.ember.sidediary.diaries;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scorched.ember.sidediary.R;
import com.scorched.ember.sidediary.models.Diary;

import java.util.List;

/**
 * Created by Ember on 14/07/2017.
 */

public class DiariesAdapter extends RecyclerView.Adapter<DiariesAdapter.ViewHolder> {

    private List<Diary> diaries;
    private Context context;

    public DiariesAdapter(Context context, List<Diary> diaries) {
        this.context = context;
        this.diaries = diaries;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.diary_layout,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return diaries.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case


        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
