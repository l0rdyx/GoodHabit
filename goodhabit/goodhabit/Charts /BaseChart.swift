import SwiftUI
import Charts

@ViewBuilder
func baseChart<Content: ChartContent>(
    @ChartContentBuilder _ content: () -> Content
) -> some View {
    Chart { content() }
        .chartXAxis { AxisMarks { AxisTick(); AxisValueLabel() } }
        .chartYAxis { AxisMarks { AxisTick(); AxisValueLabel() } }
        .chartPlotStyle { $0.background(.black) }
        .frame(height: 200)
        .padding()
        .background(.black)
}

