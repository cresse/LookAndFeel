package tcss450.uw.edu.lookandfeel;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AnimationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);
        Log.i("AnimationsActivity", "is this working.");
    }

    public void animateSpin(View view) {
        Log.d("AnimationsActivity", "entered animatespin");
        View v = findViewById(R.id.animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.rotate_and_spin);
        set.setTarget(v);
        set.start();
    }

    public void animateMove(View view) {
        View v = findViewById(R.id.animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                R.animator.move);
        set.setTarget(v);
        set.start();
    }

    public void animateFade(View view) {
        View v = findViewById(R.id.animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                R.animator.fade);
        set.setTarget(v);
        set.start();
    }

    public void animateCheckpoint(View view) {
        View v = findViewById(R.id.animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                R.animator.checkpoint);
        set.setTarget(v);
        set.start();
    }

}
