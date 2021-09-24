package com.example.animotion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class AnimotionActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animotion1);
        Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        getWindow().setEnterTransition(fade);

        getWindow().setExitTransition(fade);

        final ImageView imageView =findViewById(R.id.image1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnimotionActivity1.this, ShareElementActivity3.class);
                ActivityOptionsCompat options =ActivityOptionsCompat.makeSceneTransitionAnimation(
                        AnimotionActivity1.this,imageView, ViewCompat.getTransitionName(imageView));
                startActivity(intent,options.toBundle());
            }
        });
        final ImageView imageView2 = findViewById(R.id.image2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // and adding animation between this two activities.
                Intent intent = new Intent(AnimotionActivity1.this,
                        ShareElementActivity2.class);
                // below method is used to make scene transition
                // and adding fade animation in it.
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                AnimotionActivity1.this, imageView2,
                                ViewCompat.getTransitionName(imageView2));

                // starting our activity with below method.
                startActivity(intent, options.toBundle());
            }
        });

    }
}