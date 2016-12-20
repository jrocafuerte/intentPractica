package com.prueba.intentpractica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class detalleContacto extends AppCompatActivity {

    TextView tvNombre;
    TextView tvTelefono;
    TextView tvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_contacto);
        Bundle parametros = getIntent().getExtras();
        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        tvEmail = (TextView) findViewById(R.id.tvEmail);

        String nombre = parametros.get(getResources().getString(R.string.pnombre)).toString();
        String telefono = parametros.get(getResources().getString(R.string.ptelefono)).toString();
        String email = parametros.get(getResources().getString(R.string.pemail)).toString();

        tvNombre.setText(nombre);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
    }


    public void llamar(){
        
    }

    public void correo(){

    }
}
