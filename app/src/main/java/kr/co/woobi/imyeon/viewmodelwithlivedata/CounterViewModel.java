package kr.co.woobi.imyeon.viewmodelwithlivedata;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {
    public CounterViewModel() {
        counter.setValue(0);
    }

    public MutableLiveData<Integer> counter=new MutableLiveData<>();

    public void increase(){
        counter.setValue(counter.getValue() + 1);
    }

    public void decrease(){
        counter.setValue(counter.getValue() -1);
    }




}
