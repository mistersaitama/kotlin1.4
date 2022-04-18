package kg.geektech.kotlin14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayoutMediator
import kg.geektech.kotlin14.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    val tabs: Array<String> = arrayOf("+ , -", "count" , "history")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        binding.viewPager1.adapter = PagerAdapter(this)
        TabLayoutMediator(binding.tabs,binding.viewPager1){
            tab, position ->
            tab.text = tabs [position]
        }.attach()
    }
}