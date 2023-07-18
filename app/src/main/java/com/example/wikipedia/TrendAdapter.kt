package com.example.wikipedia

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class TrendAdapter(private val data:ArrayList<TrendData>,val trendEvents:TrendEvents):RecyclerView.Adapter<TrendAdapter.TrendViewHolder>() {



    inner class TrendViewHolder(itemview:View, val context:Context):RecyclerView.ViewHolder(itemview){

        val namejohn=itemview.findViewById<TextView>(R.id.textname_john)

        val jobinformation=itemview.findViewById<TextView>(R.id.textjobinform_john)

        val likecounts=itemview.findViewById<TextView>(R.id.textlikecounts)

        val url=itemview.findViewById<ImageView>(R.id.imageurl_john)

        val textAdad=itemview.findViewById<TextView>(R.id.textadad)


@SuppressLint("SetTextI18n")
fun onBindViews(position: Int){

    namejohn.text=data[position].nameJohn.toString()
    jobinformation.text=data[position].titleJobJohn.toString()
    likecounts.text=data[position].likeCounts.toString()

    Glide.with(context)
        .load(data[position].urlJon.toString())
        .into(url)


    textAdad.text=(adapterPosition+1).toString()


itemView.setOnClickListener {

    trendEvents.onTrendItemClicked(data[position])




}





}








    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendViewHolder {

      val view= LayoutInflater.from(parent.context).inflate(R.layout.itemrecycleretrend,parent,false)
        return  TrendViewHolder(view,parent.context)

    }

    override fun onBindViewHolder(holder: TrendViewHolder, position: Int) {

        holder.onBindViews(position)



    }

    override fun getItemCount(): Int {
 return data.size

    }
    interface TrendEvents{

        fun onTrendItemClicked(trend:TrendData)


    }
}