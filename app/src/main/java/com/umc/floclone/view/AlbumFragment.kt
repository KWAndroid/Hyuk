package com.umc.floclone.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.umc.floclone.MainActivity
import com.umc.floclone.R
import com.umc.floclone.databinding.FragmentAlbumBinding

class AlbumFragment : Fragment() {

    private lateinit var binding: FragmentAlbumBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAlbumBinding.inflate(layoutInflater)

        with(binding) {
            albumBackIv.setOnClickListener {
                (context as MainActivity).supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.main_frm, HomeFragment())
                    .commitAllowingStateLoss()
            }

            songLalacLayout.setOnClickListener {
                Toast.makeText(context, "LILAC", Toast.LENGTH_SHORT).show()
            }

            songFluLayout.setOnClickListener {
                Toast.makeText(context, "FLU", Toast.LENGTH_SHORT).show()
            }

            songCoinLayout.setOnClickListener {
                Toast.makeText(context, "COIN", Toast.LENGTH_SHORT).show()
            }

            songSpringLayout.setOnClickListener {
                Toast.makeText(context, "봄 안녕 봄", Toast.LENGTH_SHORT).show()
            }

            songCelebrityLayout.setOnClickListener {
                Toast.makeText(context, "Celebrity", Toast.LENGTH_SHORT).show()
            }

            songSingLayout.setOnClickListener {
                Toast.makeText(context, "돌림노래 (Feat. Dean)", Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }

}