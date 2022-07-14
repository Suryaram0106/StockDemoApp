package com.learnnew.stocksdemoapp.ui.market

import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.learnnew.stocks.StocksActivityAdapter
import com.learnnew.stocksdemoapp.R
import com.learnnew.stocksdemoapp.StockActivityItem
import com.learnnew.stocksdemoapp.databinding.MarketFragmentBinding

class MarketFragment : Fragment() {

    private var _binding: MarketFragmentBinding? = null

    var arrow:String = Html.fromHtml("&#8593;").toString()
    var darrow:String = Html.fromHtml("&#8595;").toString()


    private var stockActivityLogo: ArrayList<Int>? = null
    private var stockActivityName: ArrayList<String>? = null
    private var stockActivityNameBrief: ArrayList<String>? = null
    private var stockActivityRange1: ArrayList<String>? = null
    private var stockActivityRange2: ArrayList<String>? = null
    private var shareValue1: ArrayList<String>? = null
    private var shareValue2: ArrayList<String>? = null

    private val binding get() = _binding!!

    companion object {
        fun newInstance() = MarketFragment()
    }

    private lateinit var viewModel: MarketViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = MarketFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val recyclerView_marketActivity = root.findViewById<RecyclerView>(R.id.recyclerview_marketMover)


        stockActivityLogo = java.util.ArrayList<Int>()
        stockActivityName = java.util.ArrayList<String>()
        stockActivityNameBrief = java.util.ArrayList<String>()
        stockActivityRange1 = java.util.ArrayList<String>()
        stockActivityRange2 = java.util.ArrayList<String>()
        shareValue1 = java.util.ArrayList<String>()
        shareValue2 = java.util.ArrayList<String>()

        stockActivityLogo!!.add(R.drawable.nvidia_40)
        stockActivityName!!.add("NVDA")
        stockActivityNameBrief!!.add("Nvidia")
        stockActivityRange1!!.add("25.94")
        stockActivityRange2 !!.add(arrow+" 0.14%")
        shareValue1 !!.add("$227.26")
        shareValue2 !!.add("10 shares")

        stockActivityLogo!!.add(R.drawable.adobe_40)
        stockActivityName!!.add("ADB")
        stockActivityNameBrief!!.add("Adobe Inc")
        stockActivityRange1!!.add("33.49")
        stockActivityRange2 !!.add(arrow+" 5.49%")
        shareValue1 !!.add("$643.58")
        shareValue2 !!.add("20 shares")

        stockActivityLogo!!.add(R.drawable.apple_40)
        stockActivityName!!.add("Apple")
        stockActivityNameBrief!!.add("Apple Inc")
        stockActivityRange1!!.add("25.88")
        stockActivityRange2 !!.add(darrow+" 1.82%")
        shareValue1 !!.add("$114.90")
        shareValue2 !!.add("27 shares")

        val stocksActivityAdapter = context?.let {
            StocksActivityAdapter(
                stockActivityLogo!!,
                stockActivityName!!,
                stockActivityNameBrief!!,
                stockActivityRange1!!,
                stockActivityRange2!!,
                shareValue1!!,
                shareValue2!!,
                it
            )
        }
        recyclerView_marketActivity.setLayoutManager(LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false))
        recyclerView_marketActivity.setAdapter(stocksActivityAdapter)



        return root
    }

    private fun filterList(text: String) {

        val filterdList = java.util.ArrayList<StockActivityItem>()
        for (item in stockActivityName!!) {

        }

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MarketViewModel::class.java)
        // TODO: Use the ViewModel
    }

}