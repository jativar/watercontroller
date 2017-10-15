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

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.jativa.ramiro.watercontroller.R.id.seekArc;

public class MainActivity extends AppCompatActivity {

    //Declare variables for CircleMenu
    String arrayName[]={"Water Filter",
                        "DHW",
                        "Heat Pump",
                        "Water Pump",
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
        circleMenu.setMainMenu(Color.parseColor("#000000"),R.drawable.ic_add,R.drawable.ic_remove)
                .addSubMenu(Color.parseColor("#000000"),R.drawable.ic_waterfilterstiebeleltronasia)
                .addSubMenu(Color.parseColor("#000000"),R.drawable.ic_dhw)
                .addSubMenu(Color.parseColor("#000000"),R.drawable.ic_heatpump)
                .addSubMenu(Color.parseColor("#000000"),R.drawable.ic_waterpump)
                .addSubMenu(Color.parseColor("#000000"),R.drawable.ic_handdryer)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        //Toast.makeText(MainActivity.this, "You selected "+arrayName[index], Toast.LENGTH_SHORT).show();

                        if (index == 0) {
                            // You selected Water Filter arrayName[0]
                            //Toast.makeText(MainActivity.this, "You selected " + arrayName[0] , Toast.LENGTH_SHORT).show();

                            Toast.makeText(MainActivity.this, "Innovative nano alumina fibers" , Toast.LENGTH_SHORT).show();

                            Intent waterfilter = new Intent(MainActivity.this, waterfilterActivity.class);

                            startActivity(waterfilter);

                        };

                        if (index == 1) {
                            // You selected Domestic Heat Water DHW
                            //Toast.makeText(MainActivity.this, "You selected " + arrayName[1], Toast.LENGTH_SHORT).show();
                            //TextView dwh = (TextView) findViewById(R.id.dwh);

                            Toast.makeText(MainActivity.this, "Earth Leakage Circuit Breaker", Toast.LENGTH_SHORT).show();

                            Intent dwh = new Intent(MainActivity.this, DWHActivity.class);

                            startActivity(dwh);
                        };

                        if (index == 2) {
                            // You selected Heat Pump that corresponds to arrayName[2]

                            Toast.makeText(MainActivity.this, "Reduces energy costs", Toast.LENGTH_SHORT).show();

                            Intent heatpump = new Intent(MainActivity.this, heatpumpActivity.class);

                            startActivity(heatpump);
                        };

                        if (index == 3) {
                            // You selected Water Pump that corresponds to arrayName[3]

                            Toast.makeText(MainActivity.this, "Constant Pressure", Toast.LENGTH_SHORT).show();

                            Intent waterpump = new Intent(MainActivity.this, waterpumpActivity.class);

                            startActivity(waterpump);

                        };

                        if (index == 4) {
                            // You selected Hand Dryer that corresponds to arrayName[4]

                            Toast.makeText(MainActivity.this, "Award-winning European design", Toast.LENGTH_SHORT).show();

                            Intent handdryer = new Intent(MainActivity.this, handdryerActivity.class);

                            startActivity(handdryer);

                        };

                    }
                });


        /****************************
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

