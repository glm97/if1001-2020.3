package com.example.storyberry.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.storyberry.R
import com.example.storyberry.databinding.FragmentEditprofileBinding


class EditProfileFragment: Fragment() {

    private lateinit var binding: FragmentEditprofileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_editprofile,
            container,
            false
        )
        return binding.root
    }
}