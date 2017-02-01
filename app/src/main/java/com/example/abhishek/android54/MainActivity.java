package com.example.abhishek.android54;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbutton = (Button)findViewById(R.id.button_context);
        registerForContextMenu(mbutton);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.action1:
                Toast.makeText(getApplicationContext(),"Action 1 Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.action2:
                Toast.makeText(getApplicationContext(),"Action 2 Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.action3:
                Toast.makeText(getApplicationContext(),"Action 3 Selected", Toast.LENGTH_LONG).show();
                break;

        }
        return super.onContextItemSelected(item);
    }
}
