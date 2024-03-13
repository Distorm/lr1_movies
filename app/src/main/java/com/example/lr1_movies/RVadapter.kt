package com.example.lr1_movies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lr1_movies.databinding.RvItemBinding


class RVadapter: RecyclerView.Adapter<RVadapter.MovieHolder>() {
    val moviesList = ArrayList<RVdataItem>()
    //получить доступ
    class MovieHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = RvItemBinding.bind(item)
        fun bind(movie: RVdataItem) = with(binding){
            itImageMovies.setImageResource(movie.it_image_movies)
            itName.text = movie.it_name
            itDate.text = movie.it_date
        }
    }
    //создание элемента
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return MovieHolder(view)
    }
    //размер массива
    override fun getItemCount(): Int {
        return moviesList.size
    }
    //заполнение элемента
    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        holder.bind(moviesList[position])

    }
}