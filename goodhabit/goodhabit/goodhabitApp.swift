//
//  goodhabitApp.swift
//  goodhabit
//
//  Created by Gleb Krasnopolin on 2025-08-08.
//

import SwiftUI
import Shared

@main
struct goodhabitApp: App {
    init() {
        print("Creating VM")
        KoinInitKt.doInitKoin()
        print("Created VM")
    }
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
