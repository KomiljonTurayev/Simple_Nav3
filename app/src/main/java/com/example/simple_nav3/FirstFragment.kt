package com.example.simple_nav3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.view.*
import kotlinx.android.synthetic.main.fragment_second.view.*
import kotlinx.android.synthetic.main.fragment_second.view.text_view2

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        view.text_view1.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
        }
        return view
    }


}