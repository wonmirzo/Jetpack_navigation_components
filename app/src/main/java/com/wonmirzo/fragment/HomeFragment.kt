package com.wonmirzo.fragment

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.wonmirzo.R
import com.wonmirzo.databinding.FragmentHomeBinding
import com.wonmirzo.model.User
import com.wonmirzo.utils.Utils
import com.wonmirzo.viewBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
    private val binding by viewBinding { FragmentHomeBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnClickMe.setOnClickListener {
            findNavController().navigate(
                R.id.action_homeFragment_to_secondFragment,
                bundleOf(
                    "key" to "value",
                    "user" to User("Mirzohid", 20)
                ),
                Utils.navOptions()
            )
        }
    }
}