package co.nelson.appuno;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.DragStartHelper;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView usuarioDos,textoAnterior;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.PantallaTwo);
        usuarioDos =findViewById(R.id.usuarioDos);
        textoAnterior =findViewById(R.id.textoAnterior);

        String name = getIntent().getStringIntent("name");
        UsuarioDos.setText(name);

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