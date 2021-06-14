package com.example.lottonumber.ui.home

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lottonumber.R
import com.example.lottonumber.databinding.FragmentHomeBinding
import splitties.intents.IntentSpec
import java.util.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)



        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textView11
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = binding.textView11.text
        })

        binding.btnStart.setOnClickListener {

            //배열로 할수 있지 않을까?
            // 공모양
            binding.tvOne.text = randomNumber(44).toString()
            binding.tvTwo.text = randomNumber(44).toString()
            binding.tvThree.text = randomNumber(44).toString()
            binding.tvFour.text = randomNumber(44).toString()
            binding.tvFive.text = randomNumber(44).toString()
            binding.tvSix.text = randomNumber(44).toString()
           //splittes의 intent는 어떻게 쓰는거지?



        }

        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    fun randomNumber(from: Int): Int {
        var random = Random()
        return random.nextInt(from) + 1
    }


}