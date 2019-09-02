package com.example.lab6


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_one.view.*

class OneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate(R.layout.fragment_one, container, false )
            view.btnCilckFragOne.setOnClickListener(){
            var fragment: Fragment? = null
                fragment = TwoFragment()
                replaceFragment(fragment)
            }
        return view
    }
    fun replaceFragment(someFragment: Fragment) {
        val transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.framLayout, someFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
