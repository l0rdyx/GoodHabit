import SwiftUI
import Charts

func BeerChart(data: [(day: String, value: Double)]) -> some ChartContent {
    ForEach(data, id: \.day) { item in
        AreaMark(
            x: .value("Day", item.day),
            y: .value("Value", item.value)
        )
        .interpolationMethod(.catmullRom)
        .foregroundStyle(
            .linearGradient(
                colors: [
                    .yellow.opacity(0.75),
                    .yellow.opacity(0.75),
                    .clear
                ],
                startPoint: .top,
                endPoint: .bottom
            )
        )
        .shadow(color: .yellow.opacity(0.25), radius: 10)

        LineMark(
            x: .value("Day", item.day),
            y: .value("Value", item.value)
        )
        .interpolationMethod(.catmullRom)
        .foregroundStyle(.white)
        .shadow(color: .white.opacity(0.25), radius: 10)
        .lineStyle(.init(lineWidth: 15, lineCap: .round, lineJoin: .round))
    }
}
