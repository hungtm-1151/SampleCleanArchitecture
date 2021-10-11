package com.manhhung.movieclean.movieScreen

import com.manhhung.movieclean.R
import com.manhhung.movieclean.base.BaseFragment
import com.manhhung.movieclean.databinding.MovieFragmentBinding
import com.manhhung.movieclean.entity.MoviePresentation
import com.manhhung.movieclean.utils.showToast
import org.koin.androidx.viewmodel.ext.android.viewModel

class MovieFragment : BaseFragment<MovieFragmentBinding>() {

    private val movieAdapter = MovieAdapter(::clickMovie)
    override val layoutId = R.layout.movie_fragment
    override val viewModel by viewModel<MovieViewModel>()

    override fun initViews() {
    }

    override fun initData() {
        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            movieVM = viewModel
            recyclerMovie.adapter = movieAdapter
        }
    }

    override fun initActions() {
    }

    private fun clickMovie(moviePresentation: MoviePresentation) {
        context?.showToast("Click Movie")
    }
}