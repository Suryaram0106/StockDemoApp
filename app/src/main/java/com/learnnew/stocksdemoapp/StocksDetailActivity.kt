package com.learnnew.stocksdemoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import com.learnnew.stocks.StockDetailsAdapter
import java.util.*

class StocksDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stocks_detail)


        val graphView = findViewById<GraphView>(R.id.idGraphView)

        // on below line we are adding data to our graph view.

        // on below line we are adding data to our graph view.
        val series: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf( // on below line we are adding
                // each point on our x and y axis.
                DataPoint(0.0, 1.0),
                DataPoint(1.0, 3.0),
                DataPoint(2.0, 4.0),
                DataPoint(3.0, 9.0),
                DataPoint(4.0, 6.0),
                DataPoint(5.0, 3.0),
                DataPoint(6.0, 6.0),
                DataPoint(7.0, 1.0),
                DataPoint(8.0, 2.0)
            )
        )

        graphView.addSeries(series)

        val recyclerView_overview = findViewById<RecyclerView>(R.id.recyclerview_stockdetailsactivity)

        val stock_adapter = StockDetailsAdapter(this)

        recyclerView_overview.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false))
        recyclerView_overview.setAdapter(stock_adapter)



        /*val surface = SciChartSurface(this)
        // Get a layout declared in "activity_main.xml" by id
        // Get a layout declared in "activity_main.xml" by id
        val chartLayout = findViewById<View>(R.id.chart_layout) as LinearLayout
        // Add the SciChartSurface to the layout
        // Add the SciChartSurface to the layout
        chartLayout.addView(surface)
        // Initialize the SciChartBuilder
        // Initialize the SciChartBuilder
        SciChartBuilder.init(this)
        // Obtain the SciChartBuilder instance
        // Obtain the SciChartBuilder instance
        val sciChartBuilder: SciChartBuilder = SciChartBuilder.instance()
        // Create a numeric X axis
        // Create a numeric X axis
        val xAxis: IAxis = sciChartBuilder.newNumericAxis()
            .withAxisTitle("X Axis Title")
            .withVisibleRange(-5.0, 15.0)
            .build()
        // Create a numeric Y axis
        // Create a numeric Y axis
        val yAxis: IAxis = sciChartBuilder.newNumericAxis()
            .withAxisTitle("Y Axis Title").withVisibleRange(0.0, 100.0).build()
        // Create a TextAnnotation and specify the inscription and position for it
        // Create a TextAnnotation and specify the inscription and position for it
        val textAnnotation: TextAnnotation = sciChartBuilder.newTextAnnotation()
            .withX1(5.0)
            .withY1(55.0)
            .withText("Hello World!")
            .withHorizontalAnchorPoint(HorizontalAnchorPoint.Center)
            .withVerticalAnchorPoint(VerticalAnchorPoint.Center)
            .withFontStyle(20F, ColorUtil.White)
            .build()
        // Create interactivity modifiers
        // Create interactivity modifiers
        val chartModifiers: ModifierGroup = sciChartBuilder.newModifierGroup()
            .withPinchZoomModifier().withReceiveHandledEvents(true).build()
            .withZoomPanModifier().withReceiveHandledEvents(true).build()
            .build()
        // Add the Y axis to the YAxes collection of the surface
        // Add the Y axis to the YAxes collection of the surface
        Collections.addAll(surface.getYAxes(), yAxis)
        // Add the X axis to the XAxes collection of the surface
        // Add the X axis to the XAxes collection of the surface
        Collections.addAll(surface.getXAxes(), xAxis)
        // Add the annotation to the Annotations collection of the surface
        // Add the annotation to the Annotations collection of the surface
        Collections.addAll(surface.getAnnotations(), textAnnotation)
        // Add the interactions to the ChartModifiers collection of the surface
        // Add the interactions to the ChartModifiers collection of the surface
        Collections.addAll(surface.getChartModifiers(), chartModifiers)*/


    }
}