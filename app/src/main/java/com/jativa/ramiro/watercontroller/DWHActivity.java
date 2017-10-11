package com.jativa.ramiro.watercontroller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;

import com.triggertrap.seekarc.SeekArc;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.triggertrap.seekarc.SeekArc;
import com.triggertrap.seekarc.SeekArc.OnSeekArcChangeListener;

import static com.jativa.ramiro.watercontroller.R.id.seekArc;

import static com.jativa.ramiro.watercontroller.R.id.seekArc;

/**
 * Created by Belenchis on 11/10/2017.
 */

public class DWHActivity extends AppCompatActivity {


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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dwh);

        /****************************/
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
                mSeekArcProgress.setText(String.valueOf(progress));
            }
        });
        /********************************/
    }
}
