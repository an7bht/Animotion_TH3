package com.example.animotion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Motion3Activity extends AppCompatActivity {

    ImageView imgTayloy;
    TextView tvTayLoy, tvLove;
    Nhac nhac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion3);

        imgTayloy = findViewById(R.id.imageView3);
        tvTayLoy = findViewById(R.id.textView16);
        tvLove = findViewById(R.id.textView14);
        Nhac item =(Nhac) getIntent().getExtras().getSerializable("nhac");

        imgTayloy.setImageResource(item.getImgtayloy());
        tvTayLoy.setText(item.getTayloy());
        tvLove.setText(item.getLove());
//        Intent intent = getIntent();
//        if (intent != null) {
//            nhac = (Nhac) intent.getSerializableExtra("key1");
//            imgTayloy.setImageResource(nhac.getImgtayloy());
//            Fade fade = new Fade();
//            View decor = getWindow().getDecorView();
//            //below methods are used for adding enter and exit transition.
//            getWindow().setEnterTransition(fade);
//            getWindow().setExitTransition(fade);
//        }
    }
}