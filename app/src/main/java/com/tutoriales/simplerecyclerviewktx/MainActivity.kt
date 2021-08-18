package com.tutoriales.simplerecyclerviewktx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var listaFrutas:List<Fruta>
    lateinit var recyclerFrutas:RecyclerView
    lateinit var recyclerAdapterFruta: FrutaRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        llenarDatos()
        iniciarVista()
    }

    private fun llenarDatos(){
        listaFrutas = listOf(
            Fruta(1,"Pera",5.50f,"https://static.wixstatic.com/media/a7dee3_4c558736f7b243329c59427d855d278c~mv2.jpg/v1/fill/w_1000,h_1000,al_c,q_90/a7dee3_4c558736f7b243329c59427d855d278c~mv2.jpg"),
            Fruta(2,"Manzana",3.45f,"https://st3.depositphotos.com/1000141/19510/i/600/depositphotos_195100452-stock-photo-apple-with-leaf.jpg"),
            Fruta(3,"Sandia",4.33f,"https://www.frutas-hortalizas.com/img/fruites_verdures/presentacio/30.jpg"),
            Fruta(4,"Papaya",2.25f,"https://plazavea.vteximg.com.br/arquivos/ids/182396-450-450/papaya-extra-kg.jpg"),
            Fruta(5,"Uvas",3.42f,"https://fundaciondelcorazon.com/images/stories/corazon-facil/impulso-vital/uvas.jpg"),
            Fruta(6,"Platano",4.15f,"https://pbs.twimg.com/profile_images/904323476554739713/DPi5M3pY.jpg"),
            Fruta(7,"Mandarina",1.20f,"https://elpoderdelconsumidor.org/wp-content/uploads/2016/11/mandarina.jpg")
        )
    }

    private fun iniciarVista(){
        recyclerFrutas = findViewById(R.id.recycler_view_frutas)
        recyclerFrutas.layoutManager = LinearLayoutManager(this)
        recyclerAdapterFruta = FrutaRecyclerAdapter(listaFrutas)
        recyclerFrutas.adapter=recyclerAdapterFruta
    }
}