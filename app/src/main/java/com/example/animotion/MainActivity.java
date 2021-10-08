package com.example.animotion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    private RecyclerView rcvNhac;
    private NhacAdapter nhacAdapter;
    private ArrayList<Nhac> nhacs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvNhac= findViewById(R.id.rcvNhac);
        nhacs= new ArrayList<>();
        nhacs.add(new Nhac("Love Story","Taylor Swift",R.drawable.eclipse));
        nhacs.add(new Nhac("Love Story","Taylor Swift",R.drawable.eclipse));
        nhacs.add(new Nhac("Love Story","Taylor Swift",R.drawable.eclipse));
        nhacs.add(new Nhac("Love Story","Taylor Swift",R.drawable.eclipse));
        nhacs.add(new Nhac("Love Story","Taylor Swift",R.drawable.eclipse));
        nhacs.add(new Nhac("Love Story","Taylor Swift",R.drawable.eclipse));
        nhacs.add(new Nhac("Love Story","Taylor Swift",R.drawable.eclipse));
        nhacs.add(new Nhac("Love Story","Taylor Swift",R.drawable.eclipse));

        nhacAdapter= new NhacAdapter(this, nhacs,this);
        rcvNhac.setAdapter(nhacAdapter);
        rcvNhac.setLayoutManager(new LinearLayoutManager(this));

        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        rcvNhac.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void itemClick(int pos, ImageView imgTayLoy, TextView tvTayLoy, TextView tvLove) {
        Intent intent = new Intent(MainActivity.this, Motion3Activity.class);
        intent.putExtra("nhac",nhacs.get(pos));

        Pair<View, String> p1 = Pair.create((View)imgTayLoy,"img");
        Pair<View, String> p2 = Pair.create((View)tvTayLoy,"artist");
        Pair<View, String> p3 = Pair.create((View)tvLove,"song");

        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this,p1,p2,p3);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN){
            startActivity(intent, optionsCompat.toBundle());
        }else
            startActivity(intent);

    }
    }
