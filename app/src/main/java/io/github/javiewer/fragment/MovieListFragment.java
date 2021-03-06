package io.github.javiewer.fragment;

import android.os.Bundle;
import androidx.annotation.Nullable;

import io.github.javiewer.JAViewer;
import okhttp3.ResponseBody;
import retrofit2.Call;

import com.bosphere.filelogger.FL;

/**
 * Project: JAViewer
 */
public class MovieListFragment extends MovieFragment {

    public String link;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getArguments();
        this.link = bundle.getString("link");
    }

    @Override
    public Call<ResponseBody> newCall(int page) {
        FL.d("fetch", "page url: %s", this.link + "/page/" + page);
        return JAViewer.SERVICE.get(this.link + "/page/" + page);
    }
}
