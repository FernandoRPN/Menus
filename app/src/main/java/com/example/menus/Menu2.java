package com.example.menus;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Menu2 extends AppCompatActivity {
    TextView textview1;
    Button button2_S,button1_R;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu);
        textview1=(TextView) findViewById(R.id.textview);
        button2_S=(Button) findViewById(R.id.btn2);
        button1_R=(Button) findViewById(R.id.btn3);
    }

    @Override public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        SubMenu sub1= menu.addSubMenu(0,1,1,"Menu 1 id 1");
        sub1.setHeaderIcon(R.drawable.ic_launcher_foreground);
        SubMenu sub2= menu.addSubMenu(0,2,1,"Menu 2 id 2");
        sub2.setHeaderIcon(R.drawable.ic_launcher_foreground);

        MenuItem item1= sub1.add(0,3,3,"SubMenu 1");
        MenuItem item2= sub1.add(0,4,4,"SubMenu 2");
        MenuItem item3= sub1.add(0,5,5,"SubMenu 3");
        MenuItem item4= sub1.add(0,6,6,"SubMenu 4");
        MenuItem item5= sub2.add(0,7,7,"SubMenu 5");
        MenuItem item6= sub2.add(0,8,8,"SubMenu 6");
        MenuItem item7= sub2.add(0,9,9,"SubMenu 7");
        MenuItem item8= sub2.add(0,10,10,"SubMenu 8");
        MenuItem item9= sub2.add(0,11,11,"SubMenu 9");
        MenuItem item10= sub2.add(0,12,12,"SubMenu 10");
        return true; }

        @Override public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id > 2) textview1.append("\n Ha pulsado el subMenu " + (id-2) + " con id "+id);
        return true; }


    public void regresar(View view){
        Intent regresar1 = new Intent(this, MainActivity.class);
        startActivity(regresar1);
    }

    public void siguiente(View view){
        Toast.makeText(getApplicationContext(), "Pasamos al siguiente", Toast.LENGTH_LONG).show();
        Intent siguiente_1 = new Intent(this, Menu3.class);
        startActivity(siguiente_1);
    }
}
