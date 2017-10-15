package com.jativa.ramiro.watercontroller;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;

import com.triggertrap.seekarc.SeekArc;

        import android.graphics.Color;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.CheckBox;
        import android.widget.SeekBar;
        import android.widget.TextView;

        import com.triggertrap.seekarc.SeekArc;


        import android.graphics.Color;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.CheckBox;
        import android.widget.SeekBar;
        import android.widget.Switch;
        import android.widget.TextView;

        import com.triggertrap.seekarc.SeekArc;

        import com.hitomi.cmlibrary.CircleMenu;
        import com.hitomi.cmlibrary.OnMenuSelectedListener;
        import com.triggertrap.seekarc.SeekArc;
        import com.triggertrap.seekarc.SeekArc.OnSeekArcChangeListener;

        import static com.jativa.ramiro.watercontroller.R.id.seekArc;

        import static com.jativa.ramiro.watercontroller.R.id.seekArc;


public class heatpumpActivity extends AppCompatActivity {


    // Variables declaration
    private SeekArc mSeekArc;
    private SeekBar mRotation;
    private SeekBar mStartAngle;
    private SeekBar mSweepAngle;
    private SeekBar mArcWidth;
    private SeekBar mProgressWidth;
    private CheckBox mRoundedEdges;
    private CheckBox mTouchInside;
    private CheckBox mClockwise;
    private TextView mSeekArcProgress;
    private CheckBox mEnabled;

    private int progressColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heatpump);

        mSeekArc = (SeekArc) findViewById(seekArc);
        mSeekArcProgress = (TextView) findViewById(R.id.seekArcProgress);

        mSeekArc.setOnSeekArcChangeListener(new OnSeekArcChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekArc seekArc) {
            }

            @Override
            public void onStartTrackingTouch(SeekArc seekArc) {
            }

            @Override
            public void onProgressChanged(SeekArc seekArc, int progress,
                                          boolean fromUser) {

                if (progress <= 25) progressColor = 1;
                else if (progress > 25 && progress < 75) progressColor = 2;
                else progressColor = 3;


                switch (progressColor) {
                    case 1: // Blade of Grass Green Color
                        // Source: http://www.colourlovers.com/palette/264688/Grass_Green
                        // Green Color RGB(1,166,17)
                        mSeekArcProgress.setTextColor(Color.rgb(1,166,17));
                        break;
                    case 2: mSeekArcProgress.setTextColor(Color.YELLOW);
                        break;
                    case 3: mSeekArcProgress.setTextColor(Color.RED);
                        break;
                    default: ;
                }

                mSeekArcProgress.setText(String.valueOf(progress));

            }
        });
    }
}
