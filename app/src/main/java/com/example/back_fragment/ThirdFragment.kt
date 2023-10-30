package com.example.back_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_third, container, false)
        val thirdFragmentBacbButton=view.findViewById<Button>(R.id.btnThirdFragmentBack)
        thirdFragmentBacbButton.setOnClickListener {
            findNavController().popBackStack()
        }
        return view
    }

}