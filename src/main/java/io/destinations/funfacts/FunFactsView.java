package io.destinations.funfacts;

import java.util.ArrayList;

import objects.FunFact;


interface FunFactsView {
    void showProgressDialog();
    void hideProgressDialog();
    void setupViewPager(ArrayList<FunFact> factsArray);
}
