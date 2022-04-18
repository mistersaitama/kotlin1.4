package kg.geektech.kotlin14.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.lifecycle.ViewModelProvider
import kg.geektech.kotlin14.HistoryAdapter
import kg.geektech.kotlin14.MainViewModel
import kg.geektech.kotlin14.R
import kg.geektech.kotlin14.databinding.FragmentThirtBinding
import kg.geektech.kotlin14.databinding.ItemhistoryBinding

class ThirtFragment : Fragment() {

    private lateinit var binding: FragmentThirtBinding
    private lateinit var  viewModel: MainViewModel
    private lateinit var adapter: HistoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirtBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        adapter = HistoryAdapter()
        viewModel.commands.observe(viewLifecycleOwner){
            adapter.setList(it)
        }
        binding.fragmentThirt.adapter = adapter
    }

}
