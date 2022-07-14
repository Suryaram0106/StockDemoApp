package com.learnnew.stocksdemoapp

class StockActivityItem {

    private var stockActivityLogo: Int = 0
    private var stockActivityName: String? = null
    private var stockActivityNameBrief: String? = null
    private var stockActivityRange1: String? = null
    private var stockActivityRange2: String? = null
    private var shareValue1: String? = null
    private var shareValue2: String? = null


    fun StockActivityItem() {}
    fun StockActivityItem(stockActivityLogo: Int?, stockActivityName: String?,stockActivityNameBrief: String?,stockActivityRange1 : String?, stockActivityRange2: String?,shareValue1:String?,shareValue2 :String? ) {
        this.stockActivityLogo = stockActivityLogo!!
        this.stockActivityName = stockActivityName!!
        this.stockActivityNameBrief=stockActivityNameBrief!!
        this.shareValue1 = shareValue1!!
        this.shareValue2=shareValue2!!
        this.stockActivityRange1=stockActivityRange1!!
        this.stockActivityRange2=stockActivityRange2!!

    }

    fun getStockActivityName(): String? {
        return stockActivityName
    }

    fun setStockActivityName(name: String?) {
        this.stockActivityName = name
    }

    fun getStockActivityNameBrief(): String? {
        return stockActivityNameBrief
    }

    fun setStockActivityNameBrief(name: String?) {
        this.stockActivityNameBrief = name
    }
}