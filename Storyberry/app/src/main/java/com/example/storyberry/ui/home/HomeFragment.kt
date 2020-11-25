package com.example.storyberry.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.example.storyberry.R
import com.example.storyberry.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_home,
            container,
            false
        )

        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        binding.locationHome.text = homeViewModel.location
        binding.nameHome.text = homeViewModel.name
        binding.editProfileHome.setOnClickListener { onEditProfile() }

        return binding.root
        }

    fun onEditProfile() {
        var action = R.id.action_navigation_home_to_navigation_editprofile
        NavHostFragment.findNavController(this).navigate(action)
    }


}