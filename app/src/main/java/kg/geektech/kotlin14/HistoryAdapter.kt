package kg.geektech.kotlin14

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.geektech.kotlin14.databinding.ItemhistoryBinding

class HistoryAdapter : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {
    private var list = arrayListOf<String>()

    class ViewHolder(private var binding: ItemhistoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(s: String) {
            binding.tvHist.text = s
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemhistoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
    fun setList(list: ArrayList<String>) {
        this.list = list
        notifyDataSetChanged()
    }
}

