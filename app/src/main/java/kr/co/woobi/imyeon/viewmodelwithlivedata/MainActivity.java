package kr.co.woobi.imyeon.viewmodelwithlivedata;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import kr.co.woobi.imyeon.viewmodelwithlivedata.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final ActivityMainBinding binding=DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setLifecycleOwner(this);
        final CounterViewModel viewModel= ViewModelProviders.of(this).get(CounterViewModel.class);


        //초기값 설정
//        binding.textCounter.setText(viewModel.counter.getValue()+"");

        binding.setViewModel(viewModel);
/*        binding.fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              viewModel.increase();
            }
        });
        binding.fabSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.decrease();
            }
        });*/
/*        viewModel.counter.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer integer) {
                //UI 업데이트
                binding.textCounter.setText(integer + "");
            }
        });*/
    }

}
