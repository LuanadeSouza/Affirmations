package br.com.luanadev.affirmations.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import br.com.luanadev.affirmations.databinding.ListItemBinding
import br.com.luanadev.affirmations.model.Affirmation

class ItemAdapter : ListAdapter<Affirmation, ItemAdapter.ItemViewHolder>(DIFF_CALLBACK) {

    var gotItItemClickListener: (() -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Affirmation>() {
            override fun areItemsTheSame(oldItem: Affirmation, newItem: Affirmation): Boolean {
                return oldItem.title == newItem.title
            }

            override fun areContentsTheSame(oldItem: Affirmation, newItem: Affirmation): Boolean {
                return oldItem == newItem
            }

        }
    }

    class ItemViewHolder(
        private val itemBinding: ListItemBinding
    ) : RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(affirmation: Affirmation) {
            itemBinding.itemTitle.text = affirmation.title
            itemBinding.itemImage.setImageResource(affirmation.logo)
        }

        companion object {
            fun create(parent: ViewGroup): ItemViewHolder {
                val itemBinding = ListItemBinding
                    .inflate(LayoutInflater.from(parent.context), parent, false)

                return ItemViewHolder(itemBinding)
            }
        }
    }
}
