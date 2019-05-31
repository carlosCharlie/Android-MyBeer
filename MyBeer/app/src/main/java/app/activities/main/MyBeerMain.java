package app.activities.main;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import com.R;

public abstract class MyBeerMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    /**
     * Show the progress bar component visible and put invisble the rest of the view.
     */
    protected void setProgressBar(String text, View goneView, View visibleView, TextView textView){

        goneView.setVisibility(View.GONE);
        visibleView.setVisibility(View.VISIBLE);

        if (textView != null) textView.setText(text);
    }

    /**
     * Show the view visible and put invisble progress bar component.
     */
    protected void removeProgressBar(View goneView, View visibleView){

        goneView.setVisibility(View.GONE);
        visibleView.setVisibility(View.VISIBLE);
    }

    /**
     * Start the animation between with layouts that enters as a parameter.
     */
    protected void startLeftAnimation(Context context, View rOut, View rIn) {

        Animation registerMainAnimationLeftIn = AnimationUtils.loadAnimation(context, R.anim.left_in);
        Animation registerMainAnimationLeftOut = AnimationUtils.loadAnimation(context, R.anim.left_out);

        rOut.startAnimation(registerMainAnimationLeftOut);
        rIn.startAnimation(registerMainAnimationLeftIn);
    }

    /**
     * Start the animation between with layouts that enters as a parameter.
     */
    protected void startRightAnimation(Context context, View rOut, View rIn) {

        Animation registerMainAnimationRightIn = AnimationUtils.loadAnimation(context, R.anim.right_in);
        Animation registerMainAnimationRightOut = AnimationUtils.loadAnimation(context, R.anim.right_out);

        rOut.startAnimation(registerMainAnimationRightOut);
        rIn.startAnimation(registerMainAnimationRightIn);
    }

    /**
     * Set the action bar in the view
     */
    protected abstract void setAppBar();

    /**
     * Inicializate all components of the view
     */
    protected abstract void inicializateView();

    /**
     * Throw a information message
     *
     * @param msg the message to show
     */
    protected void throwToast(int msg) { Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show(); }
    protected void throwToast(String msg) { Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show(); }
}
