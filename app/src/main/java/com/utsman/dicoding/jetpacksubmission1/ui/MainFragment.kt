package com.utsman.dicoding.jetpacksubmission1.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.utsman.dicoding.jetpacksubmission1.R
import com.utsman.dicoding.jetpacksubmission1.data.Movies
import com.utsman.dicoding.jetpacksubmission1.ui.adapter.MainMovieAdapter
import com.utsman.dicoding.jetpacksubmission1.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.fragment_item.*

class MainFragment : Fragment() {

    private val mainViewModel by lazy {
        ViewModelProviders.of(this)[MainViewModel::class.java]
    }

    companion object {
        fun instance(type: String): MainFragment {
            val mainFragment = MainFragment()
            val bundle = Bundle()
            bundle.putString("type", type)
            mainFragment.arguments = bundle
            return mainFragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_item, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val type = arguments?.getString("type", "movies") as String
        setupRecyclerView(mainViewModel.getMovieData(type))
    }

    private fun setupRecyclerView(list: List<Movies>) {
        val mainAdapter = MainMovieAdapter(list)

        recycler_view_main.layoutManager = LinearLayoutManager(context)
        recycler_view_main.adapter = mainAdapter
    }
}