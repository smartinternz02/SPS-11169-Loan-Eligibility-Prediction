package org.ml;

import java.io.IOException;

import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.HistogramTrace;

public class DataAnalysis {

	
	public static void main(String args[])
	{
		System.out.println("data Analysis");
		try {
			Table test_data = Table.read().csv("/Users/apple/Desktop/JAVA/test_Y3wMUE5_7gLdaTN.csv");
			System.out.println(test_data.shape());
			
//			System.out.println(test_data.first(7));
			
//			System.out.println(test_data.last(7));
			
			System.out.println(test_data.structure());
			
			System.out.println(test_data.summary());
// 	        Histogram
			Layout layout1 = Layout.builder().title("Distribution of GENDER").build();
			HistogramTrace trace1 = HistogramTrace.builder(test_data.nCol("gender")).build();
			Plot.show(new Figure(layout1, trace1));
			
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
