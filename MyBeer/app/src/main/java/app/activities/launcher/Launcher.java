package app.activities.launcher;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import com.R;
import app.activities.main.Main;

public class Launcher extends AppCompatActivity {

    private final int DURATION_SPLASH = 2400;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        new Handler().postDelayed(() -> {

            startActivity(new Intent(Launcher.this, Main.class));
            overridePendingTransition(R.anim.zoom_back_in, R.anim.zoom_back_out);
            finish();

        },DURATION_SPLASH);
    }
}
