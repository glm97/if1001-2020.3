package com.example.storyberry.ui.entries

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.storyberry.R

class StoriesAdapter (private val stories: Array<Story>): RecyclerView.Adapter<StoriesAdapter.StoriesViewHolder>() {

    override fun getItemCount(): Int = stories.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_story, parent, false)
        return StoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoriesViewHolder, position: Int) {
        val item = stories[position]
        holder.title.text = item.title
        holder.author.text = item.author
        holder.status.text = item.status
    }

    class StoriesViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val title: Button = item.findViewById(R.id.storyTitleItem)
        val author: TextView = item.findViewById(R.id.storyAuthorItem)
        val status: TextView = item.findViewById(R.id.storyStatusItem)
    }
}

