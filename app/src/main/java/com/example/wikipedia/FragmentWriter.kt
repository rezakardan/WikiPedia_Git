package com.example.wikipedia

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wikipedia.databinding.FragmentwriterBinding

class FragmentWriter:Fragment() {

lateinit var binding: FragmentwriterBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentwriterBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


binding.adresssite.setOnClickListener {

    val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.reedsy.com/freelancer/how-to-become-a-writer/"))
    startActivity(intent)



}





    }


}