package com.example.laboratorio5_navigationcomponent.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.laboratorio5_navigationcomponent.R
import com.example.laboratorio5_navigationcomponent.databinding.FragmentBillboardBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BillboardFragment : Fragment() {

    private lateinit var binding: FragmentBillboardBinding
    private lateinit var btnCreateNewMovie: FloatingActionButton
    private lateinit var starWarsCv: CardView
    private lateinit var harryPotterCv: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentBillboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnCreateNewMovie = view.findViewById(R.id.btn_NavCreateNewMovie)
        starWarsCv = view.findViewById(R.id.startWarsCardView)
        harryPotterCv = view.findViewById(R.id.harryPotterCardView)

        starWarsCv.setOnClickListener {
            it.findNavController().navigate(R.id.action_billboardFragment_to_movieFragment)
        }
        harryPotterCv.setOnClickListener {
            it.findNavController().navigate(R.id.action_billboardFragment_to_movieFragment)
        }

        btnCreateNewMovie.setOnClickListener{
            it.findNavController().navigate(R.id.action_billboardFragment_to_createMovieFragment)
        }
    }



}