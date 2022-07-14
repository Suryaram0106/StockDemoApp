package com.learnnew.stocks

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.learnnew.stocksdemoapp.R

class StockDetailsAdapter (
//private val stock_Logo: ArrayList<Int>,
//private val stock_Name: ArrayList<String>,
//private val stock_Name_Brief: ArrayList<String>,
//private val stock_Rage1: ArrayList<String>,
//private val stock_Rage2: ArrayList<String>,
//private val share_Value1: ArrayList<String>,
//private val share_Value2: ArrayList<String>,
private val context: Context
) :
RecyclerView.Adapter<StockDetailsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.stock_detail_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // loading the images from the position
        //Glide.with(holder.itemView.context).load(stock_Logo[position]).into(holder.stockLogo)

        //holder.stockName.text = stock_Name[position].toString()
        //holder.stockNameBrief.text = stock_Name_Brief[position].toString()
        //holder.stockRange1.text = stock_Rage1[position].toString()
        //holder.stockRange2.text = stock_Rage2[position].toString()
        //holder.shareValue1.text = share_Value1[position].toString()
        //holder.shareValue2.text = share_Value2[position].toString()

    }

    override fun getItemCount(): Int {
       return 1
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //var stockLogo: ImageView
        //var stockName: TextView
        //var stockNameBrief: TextView
        //var stockRange1: TextView
        //var stockRange2: TextView
        //var shareValue1: TextView
        //var shareValue2: TextView


        init {

          //  stockLogo = itemView.findViewById(R.id.stock_logo)
           // stockName = itemView.findViewById(R.id.stock_name)
           // stockNameBrief = itemView.findViewById(R.id.stock_name_brief)
            //stockRange1 = itemView.findViewById(R.id.stock_range1)
            //stockRange2 = itemView.findViewById(R.id.stock_range2)
            //shareValue1 = itemView.findViewById(R.id.stock_value_dollar1)
            //shareValue2 = itemView.findViewById(R.id.stock_value_dollar2)

        }
    }
}

