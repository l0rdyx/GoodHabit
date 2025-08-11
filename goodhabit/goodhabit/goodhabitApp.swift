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
        KoinInitKt.doInitKoin()
    }
    var body: some Scene {
        WindowGroup {
            RootView()
        }
    }
}
