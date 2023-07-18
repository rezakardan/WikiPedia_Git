package com.example.wikipedia

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wikipedia.databinding.FragmenttranslatorBinding

class FragmentTranslator:Fragment() {

lateinit var binding: FragmenttranslatorBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmenttranslatorBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        binding.btntranslate.setOnClickListener {

           val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fluentu.com/blog/how-to-become-a-translator/"))

            startActivity(intent)




        }
    }
}