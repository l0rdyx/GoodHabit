import Shared

class HomeScreenViewModelWrapper: ObservableObject {
    private let viewModel: HomeScreenViewModel

    init() {
        print("Init vm")
        self.viewModel = KoinHelper().get()
        print("vm")
    }

    func beerTap() {
        Task {
            try? await viewModel.beerTap()
        }
    }
}
