package com.example.android.bluetoothchat;

/**
 * Created by bentr_000 on 11/03/2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class DataDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_detail);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.data_detail, menu);
        return true;
    }
}
