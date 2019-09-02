package com.example.lab6


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_three.view.*

class ThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate(R.layout.fragment_three, container, false)
        view.btnCilckFragThree.setOnClickListener() {
            val toast = Toast.makeText(context, "Click On Fragment Three", Toast.LENGTH_SHORT)
            toast.show()
        }
        return view
    }


}
