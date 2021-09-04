package com.example.tp3peliculas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tp3peliculas.Adaptador.PeliculaAdapter;
import com.example.tp3peliculas.Modelo.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvLista;
    private PeliculaAdapter adapter;
    private List<Pelicula> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVista();
        inicializarValores();
    }
    private void inicializarVista(){
        rvLista = findViewById(R.id.rvLista);
    }
    private void inicializarValores(){
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        items = getItems();
        adapter = new PeliculaAdapter(items);
        rvLista.setAdapter(adapter);
    }
    private List<Pelicula> getItems(){
        List<Pelicula> itemLists = new ArrayList<>();
        itemLists.add(new Pelicula("El discurso del rey",  "El eje principal es el miedo escénico provocado por la tartamudez del protagonista, el príncipe Alberto....",R.drawable.discursorey,
                "El eje principal es el miedo escénico provocado por la tartamudez del protagonista, el príncipe Alberto. Cuando su padre muere y su hermano decide abdicar, es él quien tiene " +
                        "que asumir sus responsabilidades como rey, pero cree que no está preparado. Debido a su tartamudeo, al príncipe le da pavor hablar en público, pero tiene un objetivo: con ayuda de " +
                        "su logopeda va a prepararse un discurso muy importante para todo el país: la declaración de guerra a la Alemania nazi en plena Segunda Guerra Mundial. Y para ello solo puede hacer " +
                        "una cosa: tesón y mucha práctica.", "ACTORES: Colin Firth, Helena Carter, Derek Jacobi, Geoffrey Rush", "DIRECTOR: Tom Hooper"));
        itemLists.add(new Pelicula("En busca de la felicidad", "Los sentimientos y las emociones permanecen a flor de piel en la primera película que Wil....", R.drawable.enbuscadelafelicidad,
                "Los sentimientos y las emociones permanecen a flor de piel en la primera película que Will Smith protagonizó junto a su hijo Jaden. Está basada en la historia real de Chris Gardner," +
                        " quien invierte todos sus ahorros en desarrollar escáneres de densidad ósea portátiles para vender a los médicos. Tras fracasar y quedarse en bancarrota, su mujer lo abandona, dejando a " +
                        "su hijo a su cargo. Ambos tienen que enfrentarse a la difícil situación de vivir en la calle y empezar desde cero. La película enseña qué significa el valor y la capacidad de superar " +
                        "obstáculos pese a la adversidad, sobre todo cuando se trata de luchar por tus hijos", "ACTORES: Will Smith, Thandiwe Newton, Jaden Smith, Dan Castellaneta", "DIRECTOR: Gabriele Muccino"));
        itemLists.add(new Pelicula("Equals", "En una sociedad futurista y distópica, las emociones humanas han conseguido ser totalmente erradic....", R.drawable.equals, "En una sociedad " +
                "futurista y distópica, las emociones humanas han conseguido ser totalmente erradicadas a raíz de una guerra. Por ello, todo el mundo vive en paz en una sociedad pacífica y tranquila, pero no " +
                "tarda en aparecer un virus que cambia el destino del planeta. Resulta de gran interés la forma en que se plantea la relación entre personas y cómo se afrontan los problemas en una civilización " +
                "que ha eliminado todo aquello que diferencia a los humanos de un robot: los sentimientos. ", "ACTORES: Nicholas Hoult, Kristen Stewart, Jacki Weaver, Guy Pearce", "DIRECTOR: Drake Doremus "));
        itemLists.add(new Pelicula("Inteligencia Artificial", "Una película de ciencia ficción con la que Steven Spielberg consiguió emocionarnos en 20....", R.drawable.inteligenciaartificial,
                "Una película de ciencia ficción con la que Steven Spielberg consiguió emocionarnos en 2001. Cuenta la historia de David, un niño robot al que le programan un amor muy intenso" +
                        " por su madre, la mujer que lo compró. Sin embargo, su condición artificial despertará sentimientos contradictorios entre todos aquellos que se encuentren con él. Este niño no es humano" +
                        " pero a lo largo de la película quizá descubramos que el sentimiento es igualmente real y poderoso.", "ACTORES: Haley Joel Osment, Jude Law, Frances O'Connor", "DIRECTOR: Steven Spielberg"));
        itemLists.add(new Pelicula("Mejor...imposible",  "Jack Nicholson interpreta en este largometraje a Melvin, un escritor maniático y odioso que parece...",R.drawable.mejorimposible,
                "Jack Nicholson interpreta en este largometraje a Melvin, un escritor maniático y odioso que parece no mostrar ningún tipo de sensibilidad y empatía hacía los demás. Todo cambia el día que" +
                        " empieza a cuidar al perro de su vecino Simon e inicie una relación con Carol Connelly (Helen Hunt), la paciente camarera que trabaja en el restaurante al que Melvin acude con bastante frecuencia." +
                        " Ella es madre soltera y tiene un hijo enfermo.", "ACTORES: Jack Nicholson, Helen Hunt, Greg Kinnear", "DIRECTOR: James L. Brooks"));
        itemLists.add(new Pelicula("Quedate a mi lado",  "Esta película muestra lo duras que pueden ser las relaciones en una familia tras...",R.drawable.quedateamilado,
                "Esta película muestra lo duras que pueden ser las relaciones en una familia tras un divorcio. Luke e Isabel están enamorados, pero, a pesar de todos sus intentos, ésta no consigue congeniar" +
                        " con los hijos de su pareja, ya que Jackie, la exmujer de Luke, no se lo pone nada fácil. Sin embargo, esta relación se complica mucho más cuando a Jackie le diagnostican un cáncer y se da cuenta" +
                        " de que no estará para siempre con sus hijos. Es en este momento cuando se da cuenta de que la situación familiar debe cambiar.", "ACTORES: Julia Roberts, Susan Sarandon, Ed Harris", "DIRECTOR: Chris Columbus"));
        itemLists.add(new Pelicula("Rainman",  "Charlie Babbit, un joven rico y, sobre todo, muy egoísta descubre que su padre, al morir, le ha dejado...",R.drawable.rainman,
                "Charlie Babbit, un joven rico y, sobre todo, muy egoísta descubre que su padre, al morir, le ha dejado toda su fortuna a un beneficiaro desconocido. Al investigar un poco más, Charlie descubre " +
                        "que el beneficiario es su hermano Raymond, cuya existencia, hasta entonces, desconocía por completo. Cuando Charlie comprueba que su hermano sufre el espectro autista, deduce que será muy sencillo" +
                        " hacer que renuncie a su parte de la herencia. Así, los dos hermanos emprenden un inesperado viaje en el tendrán que convivir durante días y en el que Charlie aprenderá a conocer a Raymond.",
                "ACTORES: Dustin Hoffman, Tom Cruise, Valeria Golino", "DIRECTOR: Barry Levinson"));
        itemLists.add(new Pelicula("Wonder",  "El protagonista, conocido como Auggie, es un niño de 10 años que vive con un casco de astronauta ...",R.drawable.wonder,
                "El protagonista, conocido como Auggie, es un niño de 10 años que vive con un casco de astronauta siempre puesto. ¿La razón? Numerosas cirugías le habían dejado un aspecto deforme, por lo que se" +
                        " ha ocultado siempre del resto incluso negándose a acudir a la escuela. Pero todo cambia cuando debe comenzar el instituto, momento en el que deberá mostrarse al mundo y relacionarse con sus compañeros" +
                        " de clase. Toda una lección sobre cómo lidiar con complejos, cómo gestionar relaciones de amistad y aprender a identificar sensaciones y sentimientos.",
                "ACTORES: Julia Roberts, Jacob Tremblay, Owen Wilson", "DIRECTOR: Stephen Chbosky"));

        return itemLists;
    }
}