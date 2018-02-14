package com.school.jishan.demoschoolbyjishan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        Thread thread=new Thread()
        {
            public void run()
            {
                try {
                    sleep(3000);
                    startActivity(new Intent(SplashScreen.this, Login.class));
                    finish();

                }catch (Exception e)
                {

                }
            }
        };thread.start();

    }
}
