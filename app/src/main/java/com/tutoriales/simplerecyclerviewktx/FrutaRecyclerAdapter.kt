package com.tutoriales.simplerecyclerviewktx

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class FrutaRecyclerAdapter(val listaFrutas:List<Fruta>):RecyclerView.Adapter<FrutaRecyclerAdapter.FrutaVH>() { //el equivalente a heredar de recyclerview adapter

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FrutaVH {
        return FrutaVH(LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_view,parent,false))
    }

    override fun onBindViewHolder(holder: FrutaVH, position: Int) {
        holder.render(listaFrutas[position]) //el equivalente al on view bind del holder
    }

    override fun getItemCount(): Int = listaFrutas.size // el equivalente al return de una linea

    class FrutaVH(val view:View):RecyclerView.ViewHolder(view) { //El equivalente a crear el constructor y pasarle al super el view en una linea
        fun render(fruta:Fruta){
            view.findViewById<TextView>(R.id.text_view_titulo).text = fruta.nombre
            view.findViewById<TextView>(R.id.text_view_precio).text = fruta.precio.toString()
            Picasso.get().load(fruta.url).into(
                view.findViewById<ImageView>(R.id.image_view_foto)
            )
            view.setOnClickListener{
                Toast.makeText(view.context,"Has seleccionado la fruta: ${fruta.nombre}",Toast.LENGTH_SHORT).show()
            }
        }
    }
}

