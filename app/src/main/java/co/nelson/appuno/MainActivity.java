package co.nelson.appuno;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.DragStartHelper;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView nombreUsuario;
   Button btn1,btn2,send;

   String Tag = "Prueba";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreUsuario = (TextView) findViewById(R.id.usuario);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        send = findViewById(R.id.btnsend);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario.setText("Presioné Boton Uno");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario.setText("Presioné Boton Dos");
            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String textoActual = nombreUsuario.getText().toString();
               String nombre = "jose"

               Intent pasarInfo = new Intent(this,PantallaTwo.class);

               pasarInfo.putExtra("name",nombre);
               starActivity(pasarInfo);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i (Tag, "Esto en Onstart" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag, "Estoy en OnResume" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag, "Estoy en OnPause" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag, "Estoy en OnStop" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,  "Estoy en OnDestroy" );
    }
}