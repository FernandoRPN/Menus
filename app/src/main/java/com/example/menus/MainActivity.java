package com.example.menus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1_S;
    TextView textview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview1= findViewById(R.id.textview);
        button1_S= findViewById(R.id.btn1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);

        MenuItem item1= menu.add(0,1,1,"Opcion 1");
        MenuItem item2= menu.add(0,2,2,"Opcion 2");

        item1.setIcon(R.drawable.ic_launcher_foreground);
        item2.setIcon(R.drawable.ic_launcher_background);

        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem item){

        int id= item.getItemId();
        textview1.append("\n Menu : " + id);
        return true;
    }

    public void siguiente(View view){
        Toast.makeText(getApplicationContext(), "Pasamos al siguiente", Toast.LENGTH_LONG).show();
        Intent siguiente_1 = new Intent(this, Menu2.class);
        startActivity(siguiente_1);
    }
}