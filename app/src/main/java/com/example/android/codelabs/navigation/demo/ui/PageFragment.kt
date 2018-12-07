package com.example.android.codelabs.navigation.demo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android.codelabs.navigation.R
import kotlinx.android.synthetic.main.home_fragment.*

class PageFragment : Fragment() {

    /**
     * 支持两种跳转方式标签导航。以及通过id进行导航
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.home_fragment, null
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigate_destination_button.setOnClickListener {
            var bundle = Bundle()
            bundle.putString("paramter", "2019")
            findNavController().navigate(R.id.next_action, bundle)
        }
        //two
        navigate_action_button.setOnClickListener {

        }
    }
}
