package acp.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int x;
    ImageView img;
    private static final int[] novaImg = { R.drawable.praia1, R.drawable.lago1 };
    Button a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v;
    Animation a_blink, a_bounce, a_mixed, a_rotate, a_sample;
    Animation a_move, a_sequencial, a_translate, a_scale, a_alpha;
    Animation a_fadein, a_fadeout, a_lefttoright, a_righttoleft;
    Animation a_slideleft, a_slideright, a_slideup, a_slidedown;
    Animation a_zoomin, a_zoomout, a_zoom_fadein, a_zoom_fadeout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x = 1;
        img = findViewById(R.id.imageView);
        a= findViewById(R.id.android1);
        b= findViewById(R.id.android2);
        c= findViewById(R.id.android3);
        d= findViewById(R.id.android4);
        e= findViewById(R.id.android5);
        f= findViewById(R.id.android6);
        g= findViewById(R.id.android7);
        h= findViewById(R.id.android8);
        i= findViewById(R.id.android9);
        j= findViewById(R.id.android10);
        k= findViewById(R.id.android11);
        l= findViewById(R.id.android12);
        m= findViewById(R.id.android13);
        n= findViewById(R.id.android14);
        o= findViewById(R.id.android15);
        p= findViewById(R.id.android16);
        q= findViewById(R.id.android17);
        r= findViewById(R.id.android0);
        s= findViewById(R.id.android01);
        t= findViewById(R.id.android02);
        u= findViewById(R.id.android03);
        v= findViewById(R.id.android04);

        a_blink = AnimationUtils.loadAnimation(MainActivity.this,R.anim.blink_anim);
        a_bounce = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
        a_mixed = AnimationUtils.loadAnimation(MainActivity.this,R.anim.mixed_anim);
        a_rotate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
        a_sample = AnimationUtils.loadAnimation(MainActivity.this,R.anim.sample_anim);
        a_move = AnimationUtils.loadAnimation(MainActivity.this,R.anim.move);
        a_sequencial = AnimationUtils.loadAnimation(MainActivity.this,R.anim.sequencial);
        a_translate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate);
        a_scale = AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);
        a_alpha = AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);
        a_fadein = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadein);
        a_fadeout = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadeout);
        a_lefttoright = AnimationUtils.loadAnimation(MainActivity.this,R.anim.lefttoright);
        a_righttoleft = AnimationUtils.loadAnimation(MainActivity.this,R.anim.righttoleft);
        a_slideleft = AnimationUtils.loadAnimation(MainActivity.this,R.anim.slide_left);
        a_slideright = AnimationUtils.loadAnimation(MainActivity.this,R.anim.slide_right);
        a_slideup= AnimationUtils.loadAnimation(MainActivity.this,R.anim.slide_up);
        a_slidedown = AnimationUtils.loadAnimation(MainActivity.this,R.anim.slide_down);
        a_zoomin = AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomin);
        a_zoomout = AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomout);
        a_zoom_fadein = AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom_fade_in);
        a_zoom_fadeout = AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom_fade_out);


        img.setImageResource(R.drawable.praia1);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_blink);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_bounce);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_mixed);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_rotate);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_sample);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_fadein);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_fadeout);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_lefttoright);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_righttoleft);
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_slideleft);
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_slideright);
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_slideup);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_slidedown);
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_zoomin);
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_zoomout);
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_zoom_fadein);
            }
        });
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_zoom_fadeout);
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_move);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_sequencial);
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_translate);
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_scale);
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(a_alpha);
            }
        });

        final Handler handler = new Handler();
        handler.postDelayed( new Runnable()
        {
            @Override
            public void run() {

                img.setAnimation(a_alpha);

            }
        }, 2000);

    }
}