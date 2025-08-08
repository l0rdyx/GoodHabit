import SwiftUI

struct ContentView: View {
    @StateObject private var viewModel: HomeScreenViewModelWrapper

    init() {
        print("🟡 ContentView init")
        _viewModel = StateObject(wrappedValue: HomeScreenViewModelWrapper())
    }

    var body: some View {
        VStack {
            Text("🍺 Beer Tracker")
                .font(.largeTitle)

            Button("Log Beer Tap") {
                viewModel.beerTap()
            }
            .padding()
        }.background(Color.red)
    }
}
