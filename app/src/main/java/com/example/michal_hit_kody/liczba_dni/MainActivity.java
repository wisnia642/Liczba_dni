package com.example.michal_hit_kody.liczba_dni;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView liczba_dni;
    TextView napis;
    TextView pozostalo;
    String czas_teraz;
    String czas_slubu;
    Runnable refresh;
    ImageView zdjecie;
    Drawable drawable;
    Handler handler = new Handler();
    Date d1,d2;

    int n=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liczba_dni = (TextView) findViewById(R.id.textView2);
        napis = (TextView) findViewById(R.id.textView);
        pozostalo = (TextView) findViewById(R.id.textView3);
        zdjecie = (ImageView) findViewById(R.id.imageView);

        refresh = new Runnable() {
            public void run() {
                // Do something
                handler.postDelayed(refresh, 1000);
                // Log.i("data","dupa");

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

                    czas_teraz = sdf.format(new Date());

                    czas_slubu = "13/10/2017 15:00:00";

                    try {
                        d1 = sdf.parse(czas_teraz);
                        d2 = sdf.parse(czas_slubu);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    long diff = d1.getTime() - d2.getTime();

                    long diffSeconds = diff / 1000 % 60;
                    long diffMinutes = diff / (60 * 1000) % 60;
                    long diffHours = diff / (60 * 60 * 1000) % 24;
                    long diffDays = diff / (24 * 60 * 60 * 1000);

                    //  Log.i("data", " " + String.valueOf(diffDays * (-a)));
                    //   Log.i("data", " " + String.valueOf(diffHours * (-a)));
                    //   Log.i("data", " " + String.valueOf(diffMinutes * (-a)));
                    //  Log.i("data", " " + String.valueOf(diffSeconds * (-a)));

                    switch (String.valueOf(diffDays * (-1))) {
                        case "120":
                            //Log.i("dupa","dupa");
                            zdjecie.setImageResource(R.drawable.a);
                            break;
                        case "119":
                            zdjecie.setImageResource(R.drawable.aa);
                            break;
                        case "118":
                            zdjecie.setImageResource(R.drawable.ab);
                            break;
                        case "117":
                            zdjecie.setImageResource(R.drawable.ac);
                            break;
                        case "116":
                            zdjecie.setImageResource(R.drawable.ad);
                            break;
                        case "115":
                            zdjecie.setImageResource(R.drawable.ae);
                            break;
                        case "114":
                            zdjecie.setImageResource(R.drawable.af);
                            break;
                        case "113":
                            zdjecie.setImageResource(R.drawable.ag);
                            break;
                        case "112":
                            zdjecie.setImageResource(R.drawable.ah);
                            break;
                        case "111":
                            zdjecie.setImageResource(R.drawable.ai);
                            break;
                        case "110":
                            zdjecie.setImageResource(R.drawable.aj);
                            break;
                        case "109":
                            zdjecie.setImageResource(R.drawable.ak);
                            break;
                        case "108":
                            zdjecie.setImageResource(R.drawable.al);
                            break;
                        case "107":
                            zdjecie.setImageResource(R.drawable.am);
                            break;
                        case "106":
                            zdjecie.setImageResource(R.drawable.an);
                            break;
                        case "105":
                            zdjecie.setImageResource(R.drawable.ao);
                            break;
                        case "104":
                            zdjecie.setImageResource(R.drawable.ap);
                            break;
                        case "103":
                            zdjecie.setImageResource(R.drawable.ar);
                            break;
                        case "102":
                            zdjecie.setImageResource(R.drawable.as);
                            break;
                        case "101":
                            zdjecie.setImageResource(R.drawable.b);
                            break;
                        case "100":
                            zdjecie.setImageResource(R.drawable.ba);
                            break;
                        case "99":
                            zdjecie.setImageResource(R.drawable.bc);
                            break;
                        case "98":
                            zdjecie.setImageResource(R.drawable.bd);
                            break;
                        case "97":
                            zdjecie.setImageResource(R.drawable.be);
                            break;
                        case "96":
                            zdjecie.setImageResource(R.drawable.bf);
                            break;
                        case "95":
                            zdjecie.setImageResource(R.drawable.bg);
                            break;
                        case "94":
                            zdjecie.setImageResource(R.drawable.bh);
                            break;
                        case "93":
                            zdjecie.setImageResource(R.drawable.bi);
                            break;
                        case "92":
                            zdjecie.setImageResource(R.drawable.bj);
                            break;
                        case "91":
                            zdjecie.setImageResource(R.drawable.bk);
                            break;
                        case "90":
                            zdjecie.setImageResource(R.drawable.bm);
                            break;
                        case "89":
                            zdjecie.setImageResource(R.drawable.bn);
                            break;
                        case "87":
                            zdjecie.setImageResource(R.drawable.br);
                            break;
                        case "86":
                            zdjecie.setImageResource(R.drawable.bw);
                            break;
                        case "85":
                            zdjecie.setImageResource(R.drawable.c);
                            break;
                        case "84":
                            zdjecie.setImageResource(R.drawable.d);
                            break;
                        case "83":
                            zdjecie.setImageResource(R.drawable.e);
                            break;
                        case "82":
                            zdjecie.setImageResource(R.drawable.f);
                            break;
                        case "81":
                            zdjecie.setImageResource(R.drawable.g);
                            break;
                        case "80":
                            zdjecie.setImageResource(R.drawable.h);
                            break;
                        case "79":
                            zdjecie.setImageResource(R.drawable.i);
                            break;
                        case "78":
                            zdjecie.setImageResource(R.drawable.j);
                            break;
                        case "77":
                            zdjecie.setImageResource(R.drawable.k);
                            break;
                        case "76":
                            zdjecie.setImageResource(R.drawable.l);
                            break;
                        case "75":
                            zdjecie.setImageResource(R.drawable.m);
                            break;
                        case "74":
                            zdjecie.setImageResource(R.drawable.n);
                            break;
                        case "73":
                            zdjecie.setImageResource(R.drawable.o);
                            break;
                        case "72":
                            zdjecie.setImageResource(R.drawable.p);
                            break;
                        case "71":
                            zdjecie.setImageResource(R.drawable.r);
                            break;
                        case "70":
                            zdjecie.setImageResource(R.drawable.s);
                            break;
                        case "69":
                            zdjecie.setImageResource(R.drawable.t);
                            break;
                        case "68":
                            zdjecie.setImageResource(R.drawable.u);
                            break;
                        case "67":
                            zdjecie.setImageResource(R.drawable.w);
                            break;
                        case "66":
                            zdjecie.setImageResource(R.drawable.x);
                            break;
                        case "65":
                            zdjecie.setImageResource(R.drawable.y);
                            break;
                        case "64":
                            zdjecie.setImageResource(R.drawable.z);
                            break;
                        case "63":
                            zdjecie.setImageResource(R.drawable.a);
                            break;
                        case "62":
                            zdjecie.setImageResource(R.drawable.aa);
                            break;
                        case "61":
                            zdjecie.setImageResource(R.drawable.ab);
                            break;
                        case "60":
                            zdjecie.setImageResource(R.drawable.ac);
                            break;
                        case "59":
                            zdjecie.setImageResource(R.drawable.ad);
                            break;
                        case "58":
                            zdjecie.setImageResource(R.drawable.ae);
                            break;
                        case "57":
                            zdjecie.setImageResource(R.drawable.af);
                            break;
                        case "56":
                            zdjecie.setImageResource(R.drawable.ag);
                            break;
                        case "55":
                            zdjecie.setImageResource(R.drawable.ah);
                            break;
                        case "54":
                            zdjecie.setImageResource(R.drawable.ai);
                            break;
                        case "53":
                            zdjecie.setImageResource(R.drawable.aj);
                            break;
                        case "52":
                            zdjecie.setImageResource(R.drawable.ak);
                            break;
                        case "51":
                            zdjecie.setImageResource(R.drawable.al);
                            break;
                        case "50":
                            zdjecie.setImageResource(R.drawable.am);
                            break;
                        case "49":
                            zdjecie.setImageResource(R.drawable.an);
                            break;
                        case "48":
                            zdjecie.setImageResource(R.drawable.ao);
                            break;
                        case "47":
                            zdjecie.setImageResource(R.drawable.ap);
                            break;
                        case "46":
                            zdjecie.setImageResource(R.drawable.ar);
                            break;
                        case "45":
                            zdjecie.setImageResource(R.drawable.as);
                            break;
                        case "44":
                            zdjecie.setImageResource(R.drawable.b);
                            break;
                        case "43":
                            zdjecie.setImageResource(R.drawable.ba);
                            break;
                        case "42":
                            zdjecie.setImageResource(R.drawable.bb);
                            break;
                        case "41":
                            zdjecie.setImageResource(R.drawable.bc);
                            break;
                        case "40":
                            zdjecie.setImageResource(R.drawable.bd);
                            break;
                        case "39":
                            zdjecie.setImageResource(R.drawable.be);
                            break;
                        case "38":
                            zdjecie.setImageResource(R.drawable.bf);
                            break;
                        case "37":
                            zdjecie.setImageResource(R.drawable.bg);
                            break;
                        case "36":
                            zdjecie.setImageResource(R.drawable.bh);
                            break;
                        case "35":
                            zdjecie.setImageResource(R.drawable.bi);
                            break;
                        case "34":
                            zdjecie.setImageResource(R.drawable.bj);
                            break;
                        case "33":
                            zdjecie.setImageResource(R.drawable.bk);
                            break;
                        case "32":
                            zdjecie.setImageResource(R.drawable.bm);
                            break;
                        case "31":
                            zdjecie.setImageResource(R.drawable.bn);
                            break;
                        case "30":
                            zdjecie.setImageResource(R.drawable.br);
                            break;
                        case "29":
                            zdjecie.setImageResource(R.drawable.bw);
                            break;
                        case "28":
                            zdjecie.setImageResource(R.drawable.c);
                            break;
                        case "27":
                            zdjecie.setImageResource(R.drawable.d);
                            break;
                        case "26":
                            zdjecie.setImageResource(R.drawable.e);
                            break;
                        case "25":
                            zdjecie.setImageResource(R.drawable.f);
                            break;
                        case "24":
                            zdjecie.setImageResource(R.drawable.g);
                            break;
                        case "23":
                            zdjecie.setImageResource(R.drawable.h);
                            break;
                        case "22":
                            zdjecie.setImageResource(R.drawable.i);
                            break;
                        case "21":
                            zdjecie.setImageResource(R.drawable.j);
                            break;
                        case "20":
                            zdjecie.setImageResource(R.drawable.k);
                            break;
                        case "19":
                            zdjecie.setImageResource(R.drawable.l);
                            break;
                        case "18":
                            zdjecie.setImageResource(R.drawable.m);
                            break;
                        case "17":
                            zdjecie.setImageResource(R.drawable.n);
                            break;
                        case "16":
                            zdjecie.setImageResource(R.drawable.o);
                            break;
                        case "15":
                            zdjecie.setImageResource(R.drawable.p);
                            break;
                        case "14":
                            zdjecie.setImageResource(R.drawable.r);
                            break;
                        case "13":
                            zdjecie.setImageResource(R.drawable.s);
                            break;
                        case "12":
                            zdjecie.setImageResource(R.drawable.t);
                            break;
                        case "11":
                            zdjecie.setImageResource(R.drawable.u);
                            break;
                        case "10":
                            zdjecie.setImageResource(R.drawable.w);
                            break;
                        case "9":
                            zdjecie.setImageResource(R.drawable.x);
                            break;
                        case "8":
                            zdjecie.setImageResource(R.drawable.y);
                            break;
                        case "7":
                            zdjecie.setImageResource(R.drawable.z);
                            break;
                        case "6":
                            zdjecie.setImageResource(R.drawable.aa);
                            break;
                        case "5":
                            zdjecie.setImageResource(R.drawable.ab);
                            break;
                        case "4":
                            zdjecie.setImageResource(R.drawable.ac);
                            break;
                        case "3":
                            zdjecie.setImageResource(R.drawable.ad);
                            break;
                        case "2":
                            zdjecie.setImageResource(R.drawable.ae);
                            break;
                        case "1":
                            zdjecie.setImageResource(R.drawable.af);
                            break;
                        case "0":
                            napis.setText("To już dzisiaj :* :* :* ");
                            pozostalo.setText("Pozostały godziny :D");
                            zdjecie.setImageResource(R.drawable.image2);
                            break;

                    }

                    if(diffDays * (-1)>=0) {
                        liczba_dni.setText(String.valueOf(diffDays * (-1)) + " dni  " + String.valueOf(diffHours * (-1)) + " godz  " +
                                String.valueOf(diffMinutes * (-1)) + " min  " + String.valueOf(diffSeconds * (-1)) + " sek ");
                    }else
                    {
                        napis.setText("NA ZAWSZE RAZEM");
                        zdjecie.setImageResource(R.drawable.image3);
                        liczba_dni.setText("Kocham Cię do końca świata");
                        pozostalo.setText("Stało się :p");
                    }
                }

            }

            ;handler.post(refresh);

    }
}
