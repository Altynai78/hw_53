package com.example.hw_53.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class TaskAdapter() : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

        private val data: ArrayList<Task> = arrayListOf()


        fun addTask(task: Task) {
            data.add(0, task)
            notifyItemChanged(0)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
            return TaskViewHolder(
                ItemTaskBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }


        override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
            holder.bind(data[position])
        }

        override fun getItemCount(): Int = data.size


        inner class TaskViewHolder(private val binding: ItemTaskBinding) : RecyclerView.ViewHolder(binding.root) {
            fun bind(task: Task) {
                binding.tvTitle.text = task.title
                binding.tvDesc.text = task.desc

            }
        }
    }
