package com.nahal.sukhjinder.travel_guide.contract;

import com.nahal.sukhjinder.travel_guide.model.City;
import com.nahal.sukhjinder.travel_guide.presenter.MainPresenter;

import java.util.List;

/**
 * Defines the contract between the View {@link com.nahal.sukhjinder.travel_guide.view.MainActivity}
 * and the presenter {@link MainPresenter}
 */

public interface MainActivityContract {

    interface View {
        void initRecyclerView(List<City> cities);
    }

    interface Presenter {
        List<City> loadCities();
    }
}
