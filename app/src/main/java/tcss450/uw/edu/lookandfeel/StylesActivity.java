package tcss450.uw.edu.lookandfeel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class StylesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_styles);
    }

    public void launchAnimations(View view) {
        Log.d("debug", "is this working.");
        Intent intent = new Intent(this, AnimationsActivity.class);
        startActivity(intent);
    }
}
