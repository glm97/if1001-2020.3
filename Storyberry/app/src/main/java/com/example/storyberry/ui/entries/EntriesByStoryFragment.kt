package com.example.storyberry.ui.entries

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.storyberry.R
import com.example.storyberry.Constants
import com.example.storyberry.databinding.FragmentEntriesbystoryBinding

class EntriesByStoryFragment: Fragment() {

    private lateinit var entriesByStoryViewModel: EntriesByStoryViewModel
    private lateinit var binding: FragmentEntriesbystoryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_entriesbystory,
            container,
            false
        )

        val adapter = StoriesAdapter(Constants.stories)
        binding.storiesList.adapter = adapter

        return binding.root
    }
}