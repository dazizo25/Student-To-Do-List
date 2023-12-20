package com.example.student_to_do_list;
// ViewHolder code for RecyclerView


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class taskViewHolder
        extends RecyclerView.ViewHolder {
    TextView todoTask;
    TextView taskCmt;
    TextView examDate;
    View view;

    taskViewHolder(View itemView)
    {
        super(itemView);
        todoTask
                = (TextView)itemView
                .findViewById(R.id.todoTask);
        examDate
                = (TextView)itemView
                .findViewById(R.id.todoTask);
        taskCmt
                = (TextView)itemView
                .findViewById(R.id.taskCmt);
        view = itemView;
    }
}
