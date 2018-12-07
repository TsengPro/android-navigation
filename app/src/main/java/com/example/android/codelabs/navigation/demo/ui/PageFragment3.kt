package com.example.android.codelabs.navigation.demo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android.codelabs.navigation.R
import kotlinx.android.synthetic.main.flow_step_two_fragment.*

class PageFragment3 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.flow_step_two_fragment, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        next_button.setOnClickListener {
            findNavController().navigate(R.id.ddd)
        }
    }

}
