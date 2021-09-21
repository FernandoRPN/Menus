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

public class Menu3 extends AppCompatActivity {
    TextView textview1;
    Button button2_S,button1_R;

    SubMenu sub1,sub2;
    MenuItem item1,item2,item3,item4,item5,item6,item7,item8,item9,item10;
    boolean[] check={false,false,false,false,false,false,false,false,false,false};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casilla);
        textview1=(TextView) findViewById(R.id.textview);
        button2_S=(Button) findViewById(R.id.btn2);
        button1_R=(Button) findViewById(R.id.btn3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        super.onCreateOptionsMenu(menu);
        sub1= menu.addSubMenu(0,1,1,"Menu 1");
        sub1.setHeaderIcon(R.drawable.ic_launcher_foreground);
        sub2= menu.addSubMenu(0,2,2,"Menu 2");
        sub2.setHeaderIcon(R.drawable.ic_launcher_foreground);

        item1= sub1.add(1,3,3,"Opción 1");
        item2= sub1.add(1,4,4,"Opción 2");
        item3= sub1.add(1,5,5,"Opción 3");
        item4= sub1.add(1,6,6,"Opción 4");
        item5= sub1.add(1,7,7,"Opción 5");
        item6= sub2.add(2,8,8,"Opción 6");
        item7= sub2.add(2,9,9,"Opción 7");
        item8= sub2.add(2,10,10,"Opción 8");
        item9= sub2.add(2,11,11,"Opción 9");
        item10= sub2.add(2,12,12,"Opción 10");
        return true; }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        item1.setCheckable(true).setChecked(check[0]);
        item2.setCheckable(true).setChecked(check[1]);
        item3.setCheckable(true).setChecked(check[2]);
        item4.setCheckable(true).setChecked(check[3]);
        item5.setCheckable(true).setChecked(check[4]);
        item6.setCheckable(true).setChecked(check[5]);
        item7.setCheckable(true).setChecked(check[6]);
        item8.setCheckable(true).setChecked(check[7]);
        item9.setCheckable(true).setChecked(check[8]);
        item10.setCheckable(true).setChecked(check[9]);
        return true; }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id > 2 && id < 12) {
                    if (check[id-3]==false){
                        textview1.append("\n Se activo casilla de  " + (id-2));
                        check[id-3] = true;

                    }else if (check[id-3]==true){
                        textview1.append("\n Se desactivo casilla de  " + (id-2));
                        check[id-3] = false;
                    }



            }
         return true;

    }


    public void regresar(View view){
        Intent regresar1 = new Intent(this,Menu2.class);
        startActivity(regresar1);
    }

    public void siguiente(View view){
        Toast.makeText(getApplicationContext(), "Pasamos al siguiente", Toast.LENGTH_LONG).show();
        Intent siguiente_1 = new Intent(this, Menu4.class);
        startActivity(siguiente_1);
    }
}
