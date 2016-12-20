package com.prueba.intentpractica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> contactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactos = new ArrayList<Contacto>();
        contactos.add(new Contacto("User 1 ","0986131385","notiene@notiene.com"));
        contactos.add(new Contacto("User 2 ","0912345567","notiene@gmail.com"));
        contactos.add(new Contacto("User 3 ","0989546213","notiene@hotmail.com"));
        contactos.add(new Contacto("User 4 ","0900124567","notiene@yahoo.com"));

        ArrayList<String> nombresContacto = new ArrayList<>();
        for (Contacto contacto:contactos ) {
            nombresContacto.add(contacto.getNombre());
        }

        ListView listaContactos = (ListView) findViewById(R.id.lvContactos);
        listaContactos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nombresContacto));
        listaContactos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, detalleContacto.class);
                i.putExtra(getResources().getString(R.string.pnombre),contactos.get(position).getNombre());
                i.putExtra(getResources().getString(R.string.ptelefono),contactos.get(position).getTelefono());
                i.putExtra(getResources().getString(R.string.pemail),contactos.get(position).getEmail());
                startActivity(i);
            }
        });



    }
}
