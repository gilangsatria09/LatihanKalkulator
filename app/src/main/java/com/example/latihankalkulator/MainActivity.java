package com.example.latihankalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.udojava.evalex.Expression;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Kalkulator Sederhana");

        Button satu = (Button)findViewById(R.id.satu);
        Button dua = (Button)findViewById(R.id.dua);
        Button tiga = (Button)findViewById(R.id.tiga);
        Button empat = (Button)findViewById(R.id.empat);
        Button lima = (Button)findViewById(R.id.lima);
        Button enam = (Button)findViewById(R.id.enam);
        Button tujuh = (Button)findViewById(R.id.tujuh);
        Button delapan = (Button)findViewById(R.id.delapan);
        Button sembilan = (Button)findViewById(R.id.sembilan);
        Button nol = (Button)findViewById(R.id.nol);
        Button koma = (Button)findViewById(R.id.decimal);
        Button tambah = (Button)findViewById(R.id.tambah);
        Button kali = (Button)findViewById(R.id.kali);
        Button bagi = (Button)findViewById(R.id.bagi);
        Button kurang = (Button)findViewById(R.id.kurang);
        Button samadengan = (Button)findViewById(R.id.samadengan);
        Button ac = (Button)findViewById(R.id.ac);
        final EditText container = (EditText)findViewById(R.id.container);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setText("");
            }
        });

        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setText(container.getText() + "1");
            }
        });
        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setText(container.getText()+"2");
            }
        });
        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setText(container.getText()+"3");
            }
        });
        empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setText(container.getText()+"4");
            }
        });
        lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setText(container.getText()+"5");
            }
        });
        enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setText(container.getText()+"6");
            }
        });
        tujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setText(container.getText()+"7");
            }
        });
        delapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setText(container.getText()+"8");
            }
        });
        sembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setText(container.getText()+"9");
            }
        });
        nol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setText(container.getText()+"0");
            }
        });
        koma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setText(container.getText()+".");
            }
        });
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setText(container.getText()+"+");
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setText(container.getText()+" - ");
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setText(container.getText()+" * ");
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setText(container.getText()+" / ");
            }
        });
        samadengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {;
                hitung();
            }
        });

    }
    public void hitung(){
//        for (int a=0;a<cont.length();a++){
//            char simbol = cont.charAt(a);
//            System.out.println(simbol);
//            if (simbol == '+'){
//                String parts[] = cont.split("\\+");
//                for (int i=0; i<=parts.length-1;i++){
//                    String hmm = parts[i].toString();
//                    int hey = Integer.parseInt(hmm);
//                    System.out.print(hey);
////                            parts[i] = String.valueOf(cont.split("\\+"));
////                            if(cont.endsWith("=")){
////                                container.setText("Ah tau deh");
////            Mencoba dengan cara ini gagal
////                            }
//                }
//            }
//        }
        EditText containerNomor = (EditText)findViewById(R.id.container);
        String cont = containerNomor.getText().toString();
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        Expression expression = new Expression(cont);
        BigDecimal result = expression.eval();
        containerNomor.setText(decimalFormat.format(result));
    }
}
