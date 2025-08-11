//
//  RootView.swift
//  goodhabit
//
//  Created by Gleb Krasnopolin on 2025-08-11.
//

import SwiftUI

struct RootView: View {
    var body: some View {
        TabView {
            MainView()
                .tag(0)

            StatsView()
                .tag(1)
        }
        .tabViewStyle(.page) 
    }
}
