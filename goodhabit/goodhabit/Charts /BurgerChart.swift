
import SwiftUI
import Charts

func BurgerChart(data: [(day: String, value: Double)]) -> some ChartContent {
    ForEach(data, id: \.day) { item in
        
        LineMark(
            x: .value("Day", item.day),
            y: .value("Value", item.value),
            series: .value("something", "D")
        )
        .interpolationMethod(.catmullRom)
        .foregroundStyle(Color(red: 209/255, green: 114/255, blue: 19/255))
        //.shadow(color: .white.opacity(0.25), radius: 10)
        .lineStyle(.init(lineWidth: 30, lineCap: .round, lineJoin: .round))
        
        LineMark(
            x: .value("Day", item.day),
            y: .value("Value", item.value),
            series: .value("something", "C")
        )
        .interpolationMethod(.catmullRom)
        .foregroundStyle(Color.yellow)
        .shadow(color: .white.opacity(0.25), radius: 10)
        .lineStyle(.init(lineWidth: 15, lineCap: .round, lineJoin: .round))
        
        LineMark(
            x: .value("Day", item.day),
            y: .value("Value", item.value),
            series: .value("something", "B")
        )
        .interpolationMethod(.catmullRom)
        .foregroundStyle(Color.green)
        .shadow(color: .white.opacity(0.25), radius: 10)
        .lineStyle(.init(lineWidth: 10, lineCap: .round, lineJoin: .round))
        
        LineMark(
            x: .value("Day", item.day),
            y: .value("Value", item.value),
            series: .value("something", "A")
        )
        .interpolationMethod(.catmullRom)
        .foregroundStyle(Color.brown)
        .shadow(color: .white.opacity(0.25), radius: 10)
        .lineStyle(.init(lineWidth: 7, lineCap: .round, lineJoin: .round))
        
    }
}
