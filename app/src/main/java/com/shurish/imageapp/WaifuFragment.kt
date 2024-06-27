package com.shurish.imageapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.shurish.imageapp.databinding.FragmentWaifuBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WaifuFragment : Fragment() {


    private lateinit var binding : FragmentWaifuBinding
    private val imageUrls = mutableListOf<String>()
    private lateinit var adapter: ImageAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding  = FragmentWaifuBinding.inflate(layoutInflater)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = ImageAdapter(requireContext(), imageUrls)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter

        binding.refreshButton.setOnClickListener {
            fetchImages()
        }

        fetchImages()
    }

    private fun fetchImages() {
        ApiClient.apiService.getWaifuImage().enqueue(object : Callback<ImageResponse> {
            override fun onResponse(call: Call<ImageResponse>, response: Response<ImageResponse>) {
                if (response.isSuccessful && response.body() != null) {
                    imageUrls.clear()
                    imageUrls.add(response.body()!!.url)
                    adapter.notifyDataSetChanged()

                    Log.d("Image Loaded", " image is sent")
                }
            }

            override fun onFailure(call: Call<ImageResponse>, t: Throwable) {
            }
        })
    }

}