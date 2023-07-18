package com.example.wikipedia

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.wikipedia.databinding.ItemrecyclerexploreBinding

class ExploreAdapter(val data: ArrayList<ExploreData>, val exploreEvents:ExploreEvents) :
    RecyclerView.Adapter<ExploreAdapter.exploreViewHolder>() {

    lateinit var binding: ItemrecyclerexploreBinding

    inner class exploreViewHolder(itemview: View, val context: Context) :
        RecyclerView.ViewHolder(itemview) {


        fun onbindViews(exploredata: ExploreData) {


            binding.nameJamiro.text = exploredata.txtjamiro.toString()
            binding.jobJamiro.text = exploredata.txtjobjamiro.toString()
            binding.informationJamiro.text = exploredata.txtinformjamiro.toString()

            Glide.with(context)

                .load(exploredata.url_img)
                .into(binding.imageJamiroque)


itemView.setOnClickListener {

    exploreEvents.onExploreItemClicked(exploredata)


}


        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): exploreViewHolder {

        binding =
            ItemrecyclerexploreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return exploreViewHolder(binding.root, parent.context)

    }

    override fun onBindViewHolder(holder: exploreViewHolder, position: Int) {

        holder.onbindViews(data[position])


    }

    override fun getItemCount(): Int {

        return data.size


    }
    interface ExploreEvents{

        fun onExploreItemClicked(exploredata:ExploreData)


    }



}