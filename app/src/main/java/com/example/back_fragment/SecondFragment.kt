package com.example.back_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_second, container, false)
        val btnSecondNext=view.findViewById<Button>(R.id.btnSecondFragmentNext)
        val btnSecondBack=view.findViewById<Button>(R.id.btnSecondFragmentBack)

        btnSecondNext.setOnClickListener {
            val action=SecondFragmentDirections.actionSecondFragmentToThirdFragment()
            findNavController().navigate(action)
        }

        btnSecondBack.setOnClickListener {
            findNavController().popBackStack()
        }
        return view
    }

}