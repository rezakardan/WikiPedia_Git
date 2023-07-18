package com.example.wikipedia

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.example.wikipedia.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {


    lateinit var binding: ActivityMain2Binding
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

setSupportActionBar(binding.toolbarmain2)
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        binding.collapsemain.setExpandedTitleColor(ContextCompat.getColor(this,
            android.R.color.transparent))









        val data=intent.getParcelableExtra<ExploreData>("exploreitem")

if (data!=null){

    showExplore(data)



}





        val datatr=intent.getParcelableExtra<TrendData>("trendItem")
        if (datatr!=null){


            showTrend(datatr)




        }
}

    private fun showTrend(datatr: TrendData) {
        Glide.with(this)
            .load(datatr.urlJon)
            .into(binding.imageMain2)

        binding.jobJamiroMain2.text=datatr.nameJohn
        binding.informJamiroMain2.text=datatr.titleJobJohn

        binding.matneMain2.text=datatr.matnJob


        binding.fabmain.setOnClickListener {
             val address = "https://en.wikipedia.org/wiki/Main_Page"

            val intent=Intent(Intent.ACTION_VIEW, Uri.parse(address))

            startActivity(intent)



        }




    }


    fun showExplore(exploreData: ExploreData){


        Glide.with(this)
            .load(exploreData.url_img)
            .into(binding.imageMain2)


        binding.jobJamiroMain2.text=exploreData.txtjamiro
        binding.informJamiroMain2.text=exploreData.txtjobjamiro.toString()
        binding.matneMain2.text=exploreData.txtinformjamiro.toString()


        binding.fabmain.setOnClickListener {
            // val address = "https://en.wikipedia.org/wiki/Main_Page"

            val intent=Intent(Intent.ACTION_VIEW, Uri.parse(exploreData.adressUrl))

            startActivity(intent)



        }



    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==android.R.id.home){

            onBackPressed()



        }
       return true
    }
}