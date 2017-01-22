package com.dato_con_actvity.devix.datosconactivity;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView txt1;
    public EditText edt1;
    public Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextView) findViewById(R.id.txtViewUno);
        btn1 = (Button) findViewById(R.id.BtnUno);
        edt1 = (EditText) findViewById(R.id.EdtUno);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("NOMBRE", edt1.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
