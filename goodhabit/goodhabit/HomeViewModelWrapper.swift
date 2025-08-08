import Shared

class HomeScreenViewModelWrapper: ObservableObject {
    private let viewModel: HomeScreenViewModel

    init() {
        self.viewModel = KoinHelper().get()
    }

    func beerTap() {
        Task {
            try? await viewModel.beerTap()
        }
    }
}
