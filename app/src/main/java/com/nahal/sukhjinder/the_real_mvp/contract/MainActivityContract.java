package com.nahal.sukhjinder.the_real_mvp.contract;

import com.nahal.sukhjinder.the_real_mvp.model.City;
import com.nahal.sukhjinder.the_real_mvp.presenter.MainPresenter;

import java.util.List;

/**
 * Defines the contract between the View {@link com.nahal.sukhjinder.the_real_mvp.view.MainActivity}
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
