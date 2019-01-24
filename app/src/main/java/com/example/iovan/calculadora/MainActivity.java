package com.example.iovan.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button div,multi,sum,res;
    EditText txt1;
    double n1, n2,r;
    int op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.etiqueta);
        div = findViewById(R.id.div);
        multi = findViewById(R.id.por);
        res = findViewById(R.id.menos);
        sum = findViewById(R.id.mas);

        findViewById(R.id.uno).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  uno = txt1.getText().toString();
                uno = uno+"1";
                txt1.setText(uno);
            }
        });
        findViewById(R.id.dos).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  dos = txt1.getText().toString();
                dos = dos+"2";
                txt1.setText(dos);
            }
        });
        findViewById(R.id.tres).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  tres = txt1.getText().toString();
                tres = tres+"3";
                txt1.setText(tres);
            }
        });
        findViewById(R.id.cuatro).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  cuatro = txt1.getText().toString();
                cuatro = cuatro+"4";
                txt1.setText(cuatro);
            }
        });
        findViewById(R.id.cinco).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  cinco = txt1.getText().toString();
                cinco = cinco+"5";
                txt1.setText(cinco);
            }
        });
        findViewById(R.id.seis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  seis = txt1.getText().toString();
                seis = seis+"6";
                txt1.setText(seis);
            }
        });

        findViewById(R.id.siete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  siete = txt1.getText().toString();
                siete = siete+"7";
                txt1.setText(siete);
            }
        });
        findViewById(R.id.ocho).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  ocho = txt1.getText().toString();
                ocho = ocho+"8";
                txt1.setText(ocho);
            }
        });
        findViewById(R.id.nueve).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  nueve = txt1.getText().toString();
                nueve = nueve+"9";
                txt1.setText(nueve);
            }
        });

        findViewById(R.id.cero).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  cero = txt1.getText().toString();
                cero = cero+"0";
                txt1.setText(cero);
            }
        });

        findViewById(R.id.punto).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  punto = txt1.getText().toString();
                punto = punto+".";
                txt1.setText(punto);
            }
        });

        findViewById(R.id.mas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  mas = txt1.getText().toString();
                n1=Double.parseDouble(mas);
                txt1.setText("");
                op=1;

            }
        });

        findViewById(R.id.menos).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  menos = txt1.getText().toString();
                n1=Double.parseDouble(menos);
                txt1.setText("");
                op=2;

            }
        });

        findViewById(R.id.por).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  por = txt1.getText().toString();
                n1=Double.parseDouble(por);
                txt1.setText("");
                op=3;

            }
        });

        findViewById(R.id.div).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  div = txt1.getText().toString();
                n1=Double.parseDouble(div);
                txt1.setText("");
                op=4;

            }
        });

        findViewById(R.id.BorrarT).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  bt = txt1.getText().toString();
                n1=Double.parseDouble(bt);
                txt1.setText("");
                n1= 0.0;
                n2= 0.0;
                r = 0.0;
                op=5;

            }
        });

        findViewById(R.id.igual).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  igual = txt1.getText().toString();
                n2=Double.parseDouble(igual);

                if (op==1)
                {
                    r=n1+n2;
                }

                if (op==2)
                {
                    r=n1-n2;
                }

                if (op==3)
                {
                    r=n1*n2;
                }

                if (op==4)
                {
                    r=n1/n2;
                }
                if(op==5)
                {
                    r=0;
                }
                txt1.setText(""+r);
                n1=r;
            }
        });



    }
}
