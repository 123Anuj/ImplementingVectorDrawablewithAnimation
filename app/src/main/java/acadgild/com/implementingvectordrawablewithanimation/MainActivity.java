package acadgild.com.implementingvectordrawablewithanimation;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimatorSet set;
    Object target;

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView= (ImageView) findViewById(R.id.activity_vector_drawable_image);


        AnimatedVectorDrawableCompat compat=  AnimatedVectorDrawableCompat.create(this,R.drawable.ic_android_black_24dp);
        imageView.setImageDrawable(compat);
        compat.start();

//                ((Animatable) imageView.getDrawable()).start();
//
//                set = (AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this, R.anim.rotation);
//                target = imageView;
//                set.setTarget(target);
//                set.start();


    }
}
