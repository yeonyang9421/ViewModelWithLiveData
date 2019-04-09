package kr.co.woobi.imyeon.viewmodelwithlivedata;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class SeekBarShareViewModel extends ViewModel {
    public MutableLiveData<Integer> progress=new MutableLiveData<>();



}
