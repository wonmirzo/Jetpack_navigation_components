package com.wonmirzo.fragment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.wonmirzo.R
import com.wonmirzo.model.User

class SecondFragment : Fragment(R.layout.fragment_second) {
    private var user: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments.let {
            user = it!!.getSerializable("user") as User
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Toast.makeText(requireContext(), user.toString(), Toast.LENGTH_SHORT).show()
    }
}