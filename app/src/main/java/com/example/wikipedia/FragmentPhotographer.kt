package com.example.wikipedia

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wikipedia.databinding.FragmentphotographerBinding

class FragmentPhotographer:Fragment() {

lateinit var binding: FragmentphotographerBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentphotographerBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnphotographer.setOnClickListener {

            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pixpa.com/blog/how-to-become-a-professional-photographer"))
startActivity(intent)

        }
    }
}