package br.com.luanadev.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import br.com.luanadev.affirmations.databinding.ActivityMainBinding
import br.com.luanadev.affirmations.adapter.ItemAdapter
import br.com.luanadev.affirmations.model.loadAffirmations
import by.kirich1409.viewbindingdelegate.viewBinding

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val itemAdapter by lazy { ItemAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        itemAdapter.apply {
            gotItItemClickListener = {
                onDismissTips()
            }
        }
        binding.recyclerView.adapter = ConcatAdapter(itemAdapter)
        itemAdapter.submitList(loadAffirmations)
    }

    private fun onDismissTips() {
        itemAdapter.notifyItemRemoved(0)
    }
}