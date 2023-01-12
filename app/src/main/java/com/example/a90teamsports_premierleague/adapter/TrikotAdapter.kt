package com.example.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.a90teamsports_premierleague.R
import com.example.a90teamsports_premierleague.data.model.Trikot


// der Adapter braucht den Context um auf String Resourcen zuzugreifen
// und die Liste an Jokes um sie für die RecyclerView vorzubereiten
class TrikotAdapter(
    private val context: Context,
    private val dataset: List<Trikot>
) : RecyclerView.Adapter<TrikotAdapter.ViewHolder>() {

    // IDEE EINES VIEWHOLDERS
    // der ViewHolder weiß welche Teile des Layouts beim Recycling angepasst werden
    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

            val imageView = view.findViewById<ImageView>(R.id.trikot_image)
            val trikotName = view.findViewById<TextView>(R.id.trikot_name)
            val trikotPrice = view.findViewById<TextView>(R.id.trikot_price)
            val trikotHersteller = view.findViewById<TextView>(R.id.trikot_hersteller)
            val adapterButton =view.findViewById<Button>(R.id.trikot_add_button)
    }

    // ERSTELLEN DES VIEWHOLDERS
    // hier werden neue ViewHolder erstellt
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.trikot_item, parent, false)

        return ViewHolder(adapterLayout)
    }

    // BEFÜLLEN DES VIEWHOLDERS
    // hier findet der Recyclingprozess statt
    // die vom ViewHolder bereitgestellten Parameter werden verändert
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val trikot = dataset[position]

        holder.imageView.setImageResource(trikot.imageResource)
        holder.trikotName.text = trikot.team
        holder.trikotPrice.text = trikot.price.toString()
        holder.trikotHersteller.text = trikot.hersteller

        holder.adapterButton.setOnClickListener {
            Toast.makeText(
                context, " freut sich schon auf euer Date.!",
                Toast.LENGTH_SHORT)
                .show()
        }

    }

    // damit der LayoutManager weiß wie lang die Liste ist
    override fun getItemCount(): Int {
        return dataset.size
    }
}