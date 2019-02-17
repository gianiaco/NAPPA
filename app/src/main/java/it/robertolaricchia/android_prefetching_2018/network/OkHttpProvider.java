package it.robertolaricchia.android_prefetching_2018.network;

import it.robertolaricchia.android_prefetching_lib.PrefetchingLib;
import okhttp3.OkHttpClient;

public class OkHttpProvider {

    private static OkHttpProvider okHttpProvider = null;

    public static OkHttpProvider getInstance() {
        if (OkHttpProvider.okHttpProvider == null) {
            okHttpProvider = new OkHttpProvider();
        }
        return okHttpProvider;
    }

    private OkHttpClient okHttpClient;

    private OkHttpProvider() {
        okHttpClient = new OkHttpClient();
        okHttpClient = PrefetchingLib.getOkHttp(okHttpClient);
    }

    public OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }
}
