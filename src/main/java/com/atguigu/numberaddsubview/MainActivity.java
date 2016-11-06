package com.atguigu.numberaddsubview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private NumberAddSubView nb_addsub_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nb_addsub_view = (NumberAddSubView) findViewById(R.id.nb_addsub_view);

        nb_addsub_view.setOnButtonClickListenter(new NumberAddSubView.OnButtonClickListenter() {
            @Override
            public void onButtonAddClick(View view, int value) {
                Toast.makeText(MainActivity.this,"AddClick Vaule=="+value,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onButtonSubClick(View view, int value) {
                Toast.makeText(MainActivity.this,"SubClick Vaule=="+value,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
