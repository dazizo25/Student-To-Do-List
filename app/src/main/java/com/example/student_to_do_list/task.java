package com.example.student_to_do_list;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

//import com.prolificinteractive
//        .materialcalendarview
//        .MaterialCalendarView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task extends AppCompatActivity
        implements NavigationView
        .OnNavigationItemSelectedListener {

    ImageGalleryAdapter2 adapter;
    RecyclerView recyclerView;
    ClickListiner listiner;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar
                = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        List<taskDate> list = new ArrayList<>();
        list = getData();

        recyclerView
                = (RecyclerView)findViewById(
                R.id.recyclerView);
        listiner = new ClickListiner() {
            @Override
            public void click(int index){
                Toast.makeTexT(this,"clicked item index is "+index,Toast.LENGTH_LONG).show();
            }
        };
        adapter
                = new ImageGalleryAdapter2(
                list, getApplication(),listiner);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(exam.this));
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }

    // Sample data for RecyclerView
    private List<taskDate> getData()
    {
        List<taskDate> list = new ArrayList<>();
        list.add(new taskDate("First Exam",
                "May 23, 2015",
                "Best Of Luck"));
        list.add(new taskDate("Second Exam",
                "June 09, 2015",
                "b of l"));
        list.add(new taskDate("My Test Exam",
                "April 27, 2017",
                "This is testing exam .."));

        return list;
    }
}
