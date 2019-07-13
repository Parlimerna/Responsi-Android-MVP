package com.example.responsi.Presenter;

import com.example.responsi.MainView;
import com.example.responsi.Model.People;
import com.example.responsi.Service.APIService;

public class MainPresenterImpl implements MainInterface{

    private MainView mainView;
    private People people;
    private APIService service = new APIService();

}
