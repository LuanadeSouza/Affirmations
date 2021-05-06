package br.com.luanadev.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.luanadev.affirmations.adapter.ItemAdapter
import br.com.luanadev.affirmations.data.Datasource
import br.com.luanadev.affirmations.databinding.ActivityMainBinding
import by.kirich1409.viewbindingdelegate.viewBinding

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val myDataset = Datasource().loadAffirmations()
        binding.recyclerView.adapter = ItemAdapter(this, myDataset)
        binding.recyclerView.setHasFixedSize(true)
    }
}