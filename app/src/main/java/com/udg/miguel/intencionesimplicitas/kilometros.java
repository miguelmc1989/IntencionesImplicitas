package com.udg.miguel.intencionesimplicitas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Miguel on 06/10/2015.
 */
public class kilometros extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terceractividad);
        Bundle km = this.getIntent().getExtras();
        double a = km.getDouble("KM");

        TextView tvrespuesta = (TextView) findViewById(R.id.resulkm);
        tvrespuesta.setText(a + "Millas");

    }
}