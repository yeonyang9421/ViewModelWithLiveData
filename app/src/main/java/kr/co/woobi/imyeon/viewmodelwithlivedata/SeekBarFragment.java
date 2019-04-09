package kr.co.woobi.imyeon.viewmodelwithlivedata;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import kr.co.woobi.imyeon.viewmodelwithlivedata.databinding.FragmentSeekBarBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class SeekBarFragment extends Fragment {


    public SeekBarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seek_bar, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final SeekBarShareViewModel viewModel = ViewModelProviders.of(requireActivity()).get(SeekBarShareViewModel.class);

        final FragmentSeekBarBinding binding = DataBindingUtil.bind(view);
        binding.setLifecycleOwner(requireActivity());
        binding.setViewModel(viewModel);

        binding.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                viewModel.progress.setValue(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
       /* viewModel.progress.observe(requireActivity(), new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer progress) {
                binding.seekBar.setProgress(progress);
            }
        });*/
    }
}
