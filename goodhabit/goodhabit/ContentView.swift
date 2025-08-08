import SwiftUI

struct ContentView: View {
    @State private var showToast = false
    @StateObject private var viewModel: HomeScreenViewModelWrapper

    init() {
        _viewModel = StateObject(wrappedValue: HomeScreenViewModelWrapper())
    }
    let screenHeight = UIScreen.main.bounds.height
    let screenWidth = UIScreen.main.bounds.width

    
    let columns = [
        GridItem(.flexible()),
        GridItem(.flexible())
    ]
    var body: some View {
        LazyVGrid(columns: columns, spacing: 20) {
            Button("🍺") {
                viewModel.beerTap()
            }.frame(
                width: screenWidth / 2,
                height: screenHeight / 2
            )
            Button("🍺") {
                viewModel.beerTap()
            }.frame(
                width: screenWidth / 2,
                height: screenHeight / 2
            )
            Button("🍺") {
                viewModel.beerTap()
            }.frame(
                width: screenWidth / 2,
                height: screenHeight / 2
            )
            Button("🍺") {
                viewModel.beerTap()
            }.frame(
                width: screenWidth / 2,
                height: screenHeight / 2
            )
        }
        .padding()
    }
}
