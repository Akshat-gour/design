package com.example.design;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KICK kickstart= new KICK(19,200);
//        Log.i("mytag",kickstart.getAge()+"");
//        kickstart.setAge(5);
//        Log.i("mytag",kickstart.getAge()+"");

    }

}

