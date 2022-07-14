package com.learnnew.stocksdemoapp.ui.home

import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.learnnew.stocks.StockWatchlistAdapter
import com.learnnew.stocks.StocksActivityAdapter
import com.learnnew.stocksdemoapp.R
import com.learnnew.stocksdemoapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    var arrow:String = Html.fromHtml("&#8593;").toString()

    private var stockLogoList: ArrayList<Int>? = null
    private var stockGraphList: ArrayList<Int>? = null
    private var stockNameList: ArrayList<String>? = null
    private var stockNameBriefList: ArrayList<String>? = null
    private var stockRangeList: ArrayList<String>? = null
    private var stockValueList: ArrayList<String>? = null
    private var stockValueDollarList: ArrayList<String>? = null

    private var stockActivityLogo: ArrayList<Int>? = null
    private var stockActivityName: ArrayList<String>? = null
    private var stockActivityNameBrief: ArrayList<String>? = null
    private var stockActivityRange1: ArrayList<String>? = null
    private var stockActivityRange2: ArrayList<String>? = null
    private var shareValue1: ArrayList<String>? = null
    private var shareValue2: ArrayList<String>? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val txtPortfolio: TextView = root.findViewById<TextView>(R.id.portfolio_inc)
        txtPortfolio.setText("2.11% "+arrow)

        val recyclerView_watchlist = root.findViewById<RecyclerView>(R.id.recyclerview_watchlist)

        val recyclerView_stocksActivity = root.findViewById<RecyclerView>(R.id.recyclerview_stocksactivity)

        stockLogoList = java.util.ArrayList<Int>()
        stockGraphList = java.util.ArrayList<Int>()
        stockNameList = java.util.ArrayList<String>()
        stockNameBriefList = java.util.ArrayList<String>()
        stockRangeList = java.util.ArrayList<String>()
        stockValueList = java.util.ArrayList<String>()
        stockValueDollarList = java.util.ArrayList<String>()

        stockActivityLogo = java.util.ArrayList<Int>()
        stockActivityName = java.util.ArrayList<String>()
        stockActivityNameBrief = java.util.ArrayList<String>()
        stockActivityRange1 = java.util.ArrayList<String>()
        stockActivityRange2 = java.util.ArrayList<String>()
        shareValue1 = java.util.ArrayList<String>()
        shareValue2 = java.util.ArrayList<String>()


        stockLogoList!!.add(R.drawable.adobe_40)
        stockGraphList!!.add(R.drawable.chart_48)
        stockNameList!!.add("ADB")
        stockNameBriefList!!.add("Adobe Inc")
        stockRangeList!!.add(arrow+" 5.49%")
        stockValueList!!.add("33.49")
        stockValueDollarList!!.add("$643.78")

        stockLogoList!!.add(R.drawable.tesla_40)
        stockGraphList!!.add(R.drawable.chart_48)
        stockNameList!!.add("TSLA")
        stockNameBriefList!!.add("Tesla")
        stockRangeList!!.add(arrow+" 5.49%")
        stockValueList!!.add("25.49")
        stockValueDollarList!!.add("$909.78")

        stockLogoList!!.add(R.drawable.adobe_40)
        stockGraphList!!.add(R.drawable.chart_48)
        stockNameList!!.add("ADB")
        stockNameBriefList!!.add("Adobe Inc")
        stockRangeList!!.add(arrow+" 5.49%")
        stockValueList!!.add("33.49")
        stockValueDollarList!!.add("$643.78")

        stockLogoList!!.add(R.drawable.tesla_40)
        stockGraphList!!.add(R.drawable.chart_48)
        stockNameList!!.add("TSLA")
        stockNameBriefList!!.add("Tesla")
        stockRangeList!!.add(arrow+" 5.49%")
        stockValueList!!.add("25.49")
        stockValueDollarList!!.add("$909.78")

        val adapter = context?.let {
            StockWatchlistAdapter(
                stockLogoList!!,
                stockGraphList!!,
                stockNameList!!,
                stockNameBriefList!!,
                stockRangeList!!,
                stockValueList!!,
                stockValueDollarList!!,
                it
            )
        }
        recyclerView_watchlist.setLayoutManager(LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false))
        recyclerView_watchlist.setAdapter(adapter)

        stockActivityLogo!!.add(R.drawable.nvidia_40)
        stockActivityName!!.add("NVDA")
        stockActivityNameBrief!!.add("Nvidia")
        stockActivityRange1!!.add("25.94")
        stockActivityRange2 !!.add(arrow+" 0.14%")
        shareValue1 !!.add("$227.26")
        shareValue2 !!.add("10 shares")

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
        recyclerView_stocksActivity.setLayoutManager(LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false))
        recyclerView_stocksActivity.setAdapter(stocksActivityAdapter)




        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}