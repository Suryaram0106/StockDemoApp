package com.learnnew.stocks

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.learnnew.stocksdemoapp.R
import com.learnnew.stocksdemoapp.StocksDetailActivity
import java.security.AccessController.getContext


class StockWatchlistAdapter(
    private val stock_Logo: ArrayList<Int>,
    private val graph_Image: ArrayList<Int>,
    private val stock_Name: ArrayList<String>,
    private val stock_Name_Brief: ArrayList<String>,
    private val stock_Rage: ArrayList<String>,
    private val stock_Value: ArrayList<String>,
    private val stock_Value_Dollar: ArrayList<String>,
    private val context: Context
) :
    RecyclerView.Adapter<StockWatchlistAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.watchlist_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // loading the images from the position
        Glide.with(holder.itemView.context).load(stock_Logo[position]).into(holder.stockLogo)
        Glide.with(holder.itemView.context).load(graph_Image[position]).into(holder.graphImage)
        holder.stockName.text = stock_Name[position].toString()
        holder.stockNameBrief.text = stock_Name_Brief[position].toString()
        holder.stockRange.text = stock_Rage[position].toString()
        holder.stockValue.text = stock_Value[position].toString()
        holder.stockValueDollar.text = stock_Value_Dollar[position].toString()


        holder.cardWatchList.setOnClickListener(View.OnClickListener {
            val intent = Intent(this.context, StocksDetailActivity::class.java)
            context.startActivity(intent)
        })


    }
    override fun getItemCount(): Int {
        return stock_Logo.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var cardWatchList: CardView
        var stockLogo: ImageView
        var graphImage: ImageView
        var stockName: TextView
        var stockNameBrief: TextView
        var stockRange: TextView
        var stockValue: TextView
        var stockValueDollar: TextView


        init {

            stockLogo = itemView.findViewById(R.id.stock_logo)
            graphImage = itemView.findViewById(R.id.graph_image)
            stockName = itemView.findViewById(R.id.stock_name)
            stockNameBrief = itemView.findViewById(R.id.stock_name_brief)
            stockRange = itemView.findViewById(R.id.stock_range)
            stockValue = itemView.findViewById(R.id.stock_value)
            stockValueDollar = itemView.findViewById(R.id.stock_value_dollar)
            cardWatchList = itemView.findViewById(R.id.card_watchlist)

        }
    }
}

