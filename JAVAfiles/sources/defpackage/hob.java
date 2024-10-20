package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hob implements hns {
    private final hrv a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;

    public hob(hrv hrvVar, int i) {
        this.a = hrvVar;
        this.b = i;
    }

    private static int b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e);
                return -1;
            }
            return -1;
        }
    }

    private final InputStream e(URL url, int i, URL url2, Map map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new hmy("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpURLConnection.setConnectTimeout(this.b);
                httpURLConnection.setReadTimeout(this.b);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.c = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.d = this.c.getInputStream();
                    if (this.e) {
                        return null;
                    }
                    int b = b(this.c);
                    int i2 = b / 100;
                    if (i2 == 2) {
                        HttpURLConnection httpURLConnection2 = this.c;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.d = new hyk(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                this.d = httpURLConnection2.getInputStream();
                            }
                            return this.d;
                        } catch (IOException e) {
                            throw new hmy("Failed to obtain InputStream", b(httpURLConnection2), e);
                        }
                    }
                    if (i2 == 3) {
                        String headerField = this.c.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                d();
                                return e(url3, i + 1, url, map);
                            } catch (MalformedURLException e2) {
                                throw new hmy("Bad redirect url: ".concat(String.valueOf(headerField)), b, e2);
                            }
                        }
                        throw new hmy("Received empty or null redirect url", b);
                    }
                    if (b == -1) {
                        throw new hmy("Http request failed", -1);
                    }
                    try {
                        throw new hmy(this.c.getResponseMessage(), b);
                    } catch (IOException e3) {
                        throw new hmy("Failed to get a response message", b, e3);
                    }
                } catch (IOException e4) {
                    throw new hmy("Failed to connect or obtain data", b(this.c), e4);
                }
            } catch (IOException e5) {
                throw new hmy("URL.openConnection threw", 0, e5);
            }
        }
        throw new hmy("Too many (> 5) redirects!", -1);
    }

    @Override // defpackage.hns
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.hns
    public final void d() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.hns
    public final void eX() {
        this.e = true;
    }

    @Override // defpackage.hns
    public final void f(hlh hlhVar, hnr hnrVar) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                hrv hrvVar = this.a;
                if (hrvVar.f == null) {
                    if (TextUtils.isEmpty(hrvVar.e)) {
                        String str = hrvVar.d;
                        if (TextUtils.isEmpty(str)) {
                            URL url = hrvVar.c;
                            hwr.i(url);
                            str = url.toString();
                        }
                        hrvVar.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
                    }
                    hrvVar.f = new URL(hrvVar.e);
                }
                hnrVar.b(e(hrvVar.f, 0, null, this.a.b.a()));
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                hnrVar.e(e);
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + hyq.a(elapsedRealtimeNanos));
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + hyq.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }

    @Override // defpackage.hns
    public final int g() {
        return 2;
    }
}
