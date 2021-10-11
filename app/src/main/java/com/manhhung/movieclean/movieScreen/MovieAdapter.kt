package com.manhhung.movieclean.movieScreen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.manhhung.movieclean.R
import com.manhhung.movieclean.base.BaseAdapter
import com.manhhung.movieclean.base.BaseViewHolder
import com.manhhung.movieclean.databinding.ItemMovieBinding
import com.manhhung.movieclean.entity.MoviePresentation


class MovieAdapter(
    private val onItemClick: (MoviePresentation) -> Unit
) : BaseAdapter<MoviePresentation, MovieAdapter.MovieViewHolder>(MoviePresentation.diffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MovieViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_movie,
                parent,
                false
            ), onItemClick
        )

    class MovieViewHolder(
        private val itemMovieBinding: ItemMovieBinding,
        onClickItem: (MoviePresentation) -> Unit
    ) : BaseViewHolder<MoviePresentation>(itemMovieBinding, onClickItem) {

        override fun bindData(item: MoviePresentation) {
            super.bindData(item)
            itemMovieBinding.movie = item
        }
    }
}

