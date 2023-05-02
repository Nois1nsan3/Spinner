package zxy.android.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private Spinner sp1;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.tv1);
        et2 = (EditText) findViewById(R.id.tv2);
        sp1 = (Spinner) findViewById(R.id.spinner);
        tv3 = (TextView) findViewById(R.id.salida1);

        String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);

        sp1.setAdapter(adapter);
    }
    public void matematicas(View view){

        int num1, num2;
        int suma, resta, multiplicacion, division;
        String selec;

        num1=Integer.parseInt(et1.getText().toString());
        num2=Integer.parseInt(et2.getText().toString());
        selec=sp1.getSelectedItem().toString();

        if (selec.equals("Sumar")) {
            suma=num1+num2;
            tv3.setText("La suma es: "+suma);
        } else if (selec.equals("Restar")) {
            resta=num1-num2;
            tv3.setText("La resta es: "+resta);
        } else if (selec.equals("Multiplicar")) {
            multiplicacion=num1*num2;
            tv3.setText("La multiplicacion es: "+multiplicacion);
        } else if (selec.equals("Dividir")) {
            division=num1/num2;
            tv3.setText("La division es: "+division);
        }
    }
}