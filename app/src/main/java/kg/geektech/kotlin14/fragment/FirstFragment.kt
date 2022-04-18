package kg.geektech.kotlin14.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import kg.geektech.kotlin14.MainViewModel
import kg.geektech.kotlin14.R
import kg.geektech.kotlin14.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private lateinit var viewModel: MainViewModel
    private var list = arrayListOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        binding.btnPlus.setOnClickListener{
            viewModel.onIncrementClick()
            list.add(viewModel.plus)
            viewModel.setCommands(list)
        }
        binding.btnMinus.setOnClickListener{
            viewModel.onDecrementClick()
            list.add(viewModel.minus)
            viewModel.setCommands(list)
        }
    }
}
