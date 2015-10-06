package com.udg.miguel.intencionesimplicitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private View.OnClickListener click  = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            convertirkm();

        }
    };
    private View.OnClickListener click2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            convertircen();

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonkm = (Button) findViewById(R.id.btnkm);
        botonkm.setOnClickListener(click);
        Button botoncen = (Button) findViewById(R.id.btncentigrados);
        botoncen.setOnClickListener(click2);
    }

    private void convertirkm(){
        EditText kilo = (EditText)findViewById(R.id.txtkilometro);
        int km = Integer.parseInt(kilo.getText().toString());
        double millas = .621371;
        double resultado = km*millas;

        Intent a =new Intent(this,kilometros.class);
        a.putExtra("KM", resultado);
        startActivity(a);
    }

    private void convertircen() {
        EditText celsius = (EditText) findViewById(R.id.txtcentigrados);
        int cel = Integer.parseInt(celsius.getText().toString());
        double far = (cel*9)/5;
        double resultadogra = 32 + far;

        Intent f = new Intent(this,centigrados.class);
        f.putExtra("celsius", resultadogra);
        startActivity(f);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
