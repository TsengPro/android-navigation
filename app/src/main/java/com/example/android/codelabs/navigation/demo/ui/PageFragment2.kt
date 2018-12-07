package com.example.android.codelabs.navigation.demo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.android.codelabs.navigation.R
import kotlinx.android.synthetic.main.flow_step_one_fragment.*

class PageFragment2 : Fragment() {

    override fun onStart() {
        super.onStart()
        Toast.makeText(context, arguments?.getString("paramter"), 1000).show()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.flow_step_one_fragment, null
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        next_button.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.next_action))
    }
}
