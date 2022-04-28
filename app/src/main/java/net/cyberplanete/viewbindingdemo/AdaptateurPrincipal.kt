package net.cyberplanete.viewbindingdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


import net.cyberplanete.viewbindingdemo.databinding.RecyclerViewItemsBinding

class AdaptateurPrincipal (private val taskList: List<Task>): RecyclerView.Adapter<AdaptateurPrincipal.VuePrincipaleConteneur>() {


    inner class VuePrincipaleConteneur (private val itemBinding: RecyclerViewItemsBinding): RecyclerView.ViewHolder(itemBinding.root)
    {

        fun bindItem (task: Task)
        {
            itemBinding.titleTv.text = task.title
            itemBinding.timeTv.text = task.timestamp
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VuePrincipaleConteneur {

        return VuePrincipaleConteneur(RecyclerViewItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: VuePrincipaleConteneur, position: Int) {
        val task = taskList[position]
        holder.bindItem(task)
    }

    override fun getItemCount(): Int {
        return taskList.size
    }
}