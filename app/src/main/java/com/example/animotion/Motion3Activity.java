package com.example.animotion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class Motion3Activity extends AppCompatActivity {

    ImageView imgTayloy;
    Nhac nhac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion3);

        imgTayloy = findViewById(R.id.imgTayLoy);
        Intent intent = getIntent();
        if (intent != null) {
            nhac = (Nhac) intent.getSerializableExtra("key1");
            imgTayloy.setImageResource(nhac.getImgtayloy());
            Fade fade = new Fade();
            View decor = getWindow().getDecorView();

            //below methods are used for adding enter and exit transition.
            getWindow().setEnterTransition(fade);
            getWindow().setExitTransition(fade);
        }
    }
}