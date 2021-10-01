package com.example.animotion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ShareElementActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_element3);

        Fade fade = new Fade();
        View decor =getWindow().getDecorView();

        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

        final Button btnback3 =findViewById(R.id.btnback3);
        btnback3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShareElementActivity3.this, AnimotionActivity1.class);
                ActivityOptionsCompat options =ActivityOptionsCompat.makeSceneTransitionAnimation(
                        ShareElementActivity3.this,btnback3, ViewCompat.getTransitionName(btnback3));
                startActivity(intent,options.toBundle());
            }
        });
    }
}