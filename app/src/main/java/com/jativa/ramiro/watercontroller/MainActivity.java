package com.jativa.ramiro.watercontroller;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.triggertrap.seekarc.SeekArc;
import com.triggertrap.seekarc.SeekArc.OnSeekArcChangeListener;

import static com.jativa.ramiro.watercontroller.R.id.seekArc;

public class MainActivity extends AppCompatActivity {

    //Declare variables for CircleMenu
    String arrayName[]={"Renewables",
                        "DHW",
                        "Central heating",
                        "Information & engineering",
                        "New developments 2017"};


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
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu = (CircleMenu) findViewById(R.id.circle_menu);
        // Set MainMenu and SubMenu
        circleMenu.setMainMenu(Color.parseColor("#f44336"),R.drawable.ic_add,R.drawable.ic_remove)
                .addSubMenu(Color.parseColor("#ea80fc"),R.drawable.ic_renewables)
                .addSubMenu(Color.parseColor("#82b1ff"),R.drawable.ic_dhw)
                .addSubMenu(Color.parseColor("#b39ddb"),R.drawable.ic_centralheating)
                .addSubMenu(Color.parseColor("#ff9100"),R.drawable.ic_infoandengineering)
                .addSubMenu(Color.parseColor("#64ffda"),R.drawable.ic_newdevelopments2017)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText(MainActivity.this, "You selected "+arrayName[index], Toast.LENGTH_SHORT).show();

                        if (index == 1) {
                            Toast.makeText(MainActivity.this, "You selected again DHW " + arrayName[1], Toast.LENGTH_SHORT).show();
                            //TextView dwh = (TextView) findViewById(R.id.dwh);
                            Intent dwh = new Intent(MainActivity.this, DWHActivity.class);
                            startActivity(dwh);
                        };
                    }
                });


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

