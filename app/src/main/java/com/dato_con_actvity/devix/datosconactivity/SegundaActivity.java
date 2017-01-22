package com.dato_con_actvity.devix.datosconactivity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    public TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        txt2 = (TextView) findViewById(R.id.txtViewDos);


        Bundle bundle = this.getIntent().getExtras();
        txt2.setText("Hola "+bundle.getString("NOMBRE"));
    }
}
