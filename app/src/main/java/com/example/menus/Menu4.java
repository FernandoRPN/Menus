package com.example.menus;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class Menu4 extends AppCompatActivity {
    TextView textview1,textviewAc;
    Button button2_S,button1_R,buttonAc;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contexto);
        textview1=(TextView) findViewById(R.id.textview);

        textviewAc=(TextView) findViewById(R.id.textviewAccion);
        textviewAc.setOnCreateContextMenuListener(this);

        button2_S=(Button) findViewById(R.id.btn2);
        button1_R=(Button) findViewById(R.id.btn3);

        buttonAc=(Button) findViewById(R.id.btnAccion);
        buttonAc.setOnCreateContextMenuListener(this);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo info) {
        super.onCreateContextMenu(menu, v, info);
        if(v.getId()==R.id.textviewAccion){
            menu.setHeaderTitle("Menú texto");
            menu.setHeaderIcon(R.drawable.ic_launcher_foreground);
            menu.add(0,1,1,"item 1");
            menu.add(0,2,2,"ítem 2");
            menu.add(0,3,3,"ítem 3"); }

        if(v.getId()==R.id.btnAccion){
            //Con ayuda del boton mustra la ventana de la lista de los menús.
            menu.setHeaderTitle("Menú botón");
            menu.setHeaderIcon(R.drawable.ic_launcher_background);
            menu.add(0,4,4,"ítem 4");
            menu.add(0,5,5,"item 5");
            menu.add(0,6,6,"ítem 6");
        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        int id=item.getItemId();
        textview1.append(" Seleccionaste el item "+id);
        return true; }

    public void regresar(View view){
        Intent regresar1 = new Intent(this,Menu3.class);
        startActivity(regresar1);
    }

    public void siguiente(View view){
        Toast.makeText(getApplicationContext(), "Inicio", Toast.LENGTH_LONG).show();
        Intent siguiente_1 = new Intent(this, MainActivity.class);
        startActivity(siguiente_1);
    }

}
