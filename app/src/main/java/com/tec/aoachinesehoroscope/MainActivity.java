package com.tec.aoachinesehoroscope;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.tec.aoachinesehoroscope.Horoscope.HoroscopeDetailActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    protected void initComponents(){
        ImageButton bueyImageButton         = findViewById(R.id.bueyMainImageButton);
        ImageButton caballoImageButton      = findViewById(R.id.caballoMainImageButton);
        ImageButton cabraImageButton        = findViewById(R.id.cabraMainImageButton);
        ImageButton dragonImageButton       = findViewById(R.id.dragonMainImageButton);
        ImageButton galloImageButton        = findViewById(R.id.galloMainImageButton);
        ImageButton gatoImageButton         = findViewById(R.id.gatoMainImageButton);
        ImageButton jabaliImageButton       = findViewById(R.id.jabaliMainImageButton);
        ImageButton monoImageButton         = findViewById(R.id.monoMainImageButton);
        ImageButton perroImageButton        = findViewById(R.id.perroMainImageButton);
        ImageButton rataImageButton         = findViewById(R.id.rataMainImageButton);
        ImageButton serpienteImageButton    = findViewById(R.id.serpienteMainImageButton);
        ImageButton tigreImageButton        = findViewById(R.id.tigreMainImageButton);

        bueyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal","Buey");
                intent.putExtra("content","(1937, 1949, 1961, 1973, 1985, 1997, 2009)\n" +
                        "Los búfalos o bueyes son animales pacientes y tranquilos, que irradian mucho cariño y amor e infunden respeto. Grandes trabajadores, se sienten " +
                        "a gusto rodeados del orden y la limpieza y logran el éxito gracias a su esfuerzo. Para ellos lo más importante es la familia, aunque son celosos con su pareja. " +
                        "Aman el arte y la música. No les gusta discutir, aunque sí que le obedezcan.");

                startActivity(intent);
            }
        });

        caballoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal","Caballo");
                intent.putExtra("content","(1942, 1954, 1966, 1978, 1990, 2002, 2014)\n" +
                        "Populares, optimistas, llenos de alegría, aventureros, elocuentes, impacientes, emprendedores, entusiastas con la vida, grandes amantes y amigos. " +
                        "Su gran pasión es el dinero y los viajes. Les gusta conocer gente nueva, distintas culturas, hablar idiomas y son el alma de las fiestas. Su atractivo físico " +
                        "y su belleza hace que les sea fácil encontrar el amor: trampa en la que caen sin remedio.");
                startActivity(intent);

            }
        });

        cabraImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal","Cabra");
                intent.putExtra("content","(1943, 1955, 1967, 1979, 1991, 2003, 2015)\n" +
                        "La cabra es creativa, artística, positiva, elegante, femenina, afable, compasiva, llorona, sensible, soñadora, orgullosa y triste. No persiguen la riqueza material " +
                        "y prefieren vivir de sus ensoñaciones. Aman la familia, los niños, el hogar y estar en contacto con la naturaleza. Son muy trabajadoras, aunque no les gusta la " +
                        "presión ni de una fecha límite, ni de un jefe.");

                startActivity(intent);
            }
        });

        dragonImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal","Dragon");
                intent.putExtra("content","(1940, 1952, 1964, 1976, 1988, 2000, 2012)\n" +
                        "Símbolo del Emperador en China, el dragón es imaginativo, magnánimo, emprendedor, afortunado y poderoso. Está lleno de fuerza y vitalidad. " +
                        "Es un verdadero acumulador de energía y si le enojas, se enfurecerá de tal manera que perderá los estribos. Será difícil calmarle, pues no cree ni a nadie ni en nadie. " +
                        "Suelen dar buenos consejos y son afortunados tanto en el dinero como en el amor. Son muy sentimentales y se enamoran locamente.");

                startActivity(intent);

            }
        });

        galloImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal","Gallo");
                intent.putExtra("content","(1945, 1957, 1969, 1981, 1993, 2005, 2017)\n" +
                        "Atractivo y seductor, con talento y apreciado. Son meticulosos, eficientes, ordenados, buenos conversadores, observadores, egoístas, usureros, pragmáticos y muy familiares. " +
                        "En el amor son románticos, obstinados y luchan por el control de su pareja. Suelen destacar como relaciones públicas o como artistas. No prestan demasiada atención a su salud.");

                startActivity(intent);

            }
        });

        gatoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal","Gato");
                intent.putExtra("content","(1903, 1915, 1927, 1939, 1951, 1963, 1975, 1987, 1999, 2011)\n" +
                        "Es muy buen año para el conejo, aprovecha todas las oportunidades que se te van a presentar y disfruta del año. Evita ser tan impulsivo y piensa antes de hablar, de esta " +
                        "manera evitarás arrepentirte de tus palabras.");

                startActivity(intent);

            }
        });

        jabaliImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal","Jabali");
                intent.putExtra("content","(1947, 1959, 1971, 1983 1995, 2007, 2019)\n" +
                        "Es un animal sincero, honesto, confiado, educado, cariñoso, servicial, valiente, decidido, con gran fuerza de voluntad, sin grandes pretensiones ni vanidad, " +
                        "con los pies en la tierra. Son muy agradables y tienen gusto y modales impecables. En el amor son sensuales, apasionado y pacientes, pero hasta un punto. " +
                        "Son muy trabajadores, aunque la falta de atracción por el deporte y la apatía harán que su físico se resienta y engorde en exceso.");

                startActivity(intent);

            }
        });

        monoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal","Mono");
                intent.putExtra("content","(1944, 1956, 1968, 1980, 1992, 2004, 2016)\n" +
                        "Animal más parecido al ser humano, es ingenioso, divertido, simpático, de mente rápida y despierta, comprador, persuasivo, sociable, capaces de resolver " +
                        "cualquier problema por difícil que sea con soltura. Sus relaciones amorosas y con los amigos suelen ser conflictivas, pues no soporta que no lo valoren. Gozan de buena salud, " +
                        "aunque sus excesos en las fiestas, alcohol y drogas podrían pasarle factura.");

                startActivity(intent);

            }
        });

        perroImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal","Perro");
                intent.putExtra("content","(1946, 1958, 1970, 1982, 1994, 2006, 2018)\n" +
                        "El perro es un ser dedicado al trabajo, honesto, confiable, diligente, con un gran sentido de la justicia y la lealtad. Cautiva a todos con su personalidad excitante, " +
                        "su buen humor y su gran capacidad para escuchar los problemas de los demás y dar buenos consejos. En el amor son fieles y leales, aunque muy celoso cuando su pareja " +
                        "no está en casa. Los nervios son su mayor problema de salud.");

                startActivity(intent);

            }
        });

        rataImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal","Rata");
                intent.putExtra("content","(1936, 1948, 1960, 1972, 1984, 1996, 2008)\n" +
                        "Los nacidos bajo el signo de la Rata son persona sabias a las que les gusta rodearse de familiares y amigos, a quienes ayudan en sus quehaceres y problemas diarios. " +
                        "Buenas trabajadoras, ahorradores y buenos administradores de su economía.");

                startActivity(intent);

            }
        });

        serpienteImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal","Serpiente");
                intent.putExtra("content","(1941, 1953, 1965, 1977, 1989, 2001, 2013)\n" +
                        "Las personas Serpientes son astutas, saben lo que quieren y cómo conseguirlo. Su conversación es elegante y fluida. Son intensos y prudentes a la vez. " +
                        "Son celosas y posesivas con su familia pero leales. Les gusta mimar a sus amigos y esperan de ellos una actitud recíproca. Si se sienten desdeñados o fracasan en sus tentativas, " +
                        "pueden estar enfadados durante horas, aunque son buenas para mantener la calma y parecer tranquilas en situaciones difíciles.");

                startActivity(intent);

            }
        });

        tigreImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal","Tigre");
                intent.putExtra("content","(1938, 1950, 1962, 1974, 1986, 1998, 2010)\n" +
                        "Las personas de este signo son muy pasionales y llenas de energía. No pasan desapercibidas, son aventureros, independientes, ingeniosos, impulsivos y les gusta la diversión. " +
                        "Son amigos para toda la vida, aunque les gusta ser el líder del grupo. En el mundo de las relaciones de pareja se muestran el más fuerte, sexy y seductor, aunque de " +
                        "comportamiento excesivo.");

                startActivity(intent);
            }
        });


    }
}
