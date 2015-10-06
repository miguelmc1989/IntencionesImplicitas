package com.udg.miguel.intencionesimplicitas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Miguel on 06/10/2015.
 */
public class centigrados extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundactividad);
        Bundle cel = this.getIntent().getExtras();
        double f = cel.getDouble("celsius");

        TextView tvrespuesta = (TextView) findViewById(R.id.resulfar);
        tvrespuesta.setText(f + "°F");

    }
}
