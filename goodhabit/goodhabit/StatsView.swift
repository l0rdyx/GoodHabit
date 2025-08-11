//
//  StatsView.swift
//  goodhabit
//
//  Created by Gleb Krasnopolin on 2025-08-11.
//
import SwiftUI
import Charts

struct StatsView: View {
    let data: [(day: String, value: Double)] = [
            ("Mon", 3), ("Tue", 4), ("Wed", 2.5), ("Thu", 5), ("Fri", 3.5)
    ]
    var body: some View {
        VStack {
            baseChart { BeerChart(data: data) }
            baseChart { BurgerChart(data: data) }
        }
    }
}
