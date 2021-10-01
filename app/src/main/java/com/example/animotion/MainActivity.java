package com.example.animotion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

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
        nhacAdapter= new NhacAdapter(this, nhacs);
        rcvNhac.setAdapter(nhacAdapter);
        rcvNhac.setLayoutManager(new LinearLayoutManager(this));

        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        rcvNhac.setLayoutManager(linearLayoutManager);
    }

    public void itemClick(Nhac nhac, ImageView img) {
        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
//        // we are adding fade animation for enter transition.
        getWindow().setEnterTransition(fade);
//
//        // we are also setting fade animation for exit transition.
        getWindow().setExitTransition(fade);
//        // initializing our imageview.
        Intent intent = new Intent(MainActivity.this,Motion3Activity.class);

        intent.putExtra("key1",nhacs);
        ActivityOptionsCompat options =  ActivityOptionsCompat.makeSceneTransitionAnimation(
                MainActivity.this, img,
                ViewCompat.getTransitionName(img));
        startActivity(intent, options.toBundle());
    }
}