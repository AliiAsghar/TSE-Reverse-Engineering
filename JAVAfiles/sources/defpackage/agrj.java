package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agrj implements Runnable {
    final /* synthetic */ ahiy a;
    private final Uri b;

    public agrj(ahiy ahiyVar, Uri uri) {
        this.a = ahiyVar;
        this.b = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!((String) this.a.c).equals("/")) {
                String queryParameter = this.b.getQueryParameter("t");
                byte[] bytes = this.b.getEncodedQuery().getBytes(agqy.a);
                tm tmVar = new tm();
                tmVar.put(assi.a, "application/x-www-form-urlencoded");
                tmVar.put("Content-Length", Integer.toString(bytes.length));
                tmVar.put("charset", "utf-8");
                tmVar.put("Connection", "close");
                agrn.c();
                tmVar.put("User-Agent", agrl.a);
                ahiy ahiyVar = this.a;
                String b = ((agrk) ahiyVar.b).b((String) ahiyVar.c);
                if (!TextUtils.isEmpty(b)) {
                    tmVar.put("Cookie", b);
                }
                agrn c = agrn.c();
                if (((agrl) c).d == null) {
                    synchronized (c) {
                        if (((agrl) c).d == null) {
                            ((agrl) c).d = new agkx();
                        }
                    }
                }
                agkx agkxVar = ((agrl) c).d;
                HttpURLConnection httpURLConnection = null;
                try {
                    try {
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL((String) this.a.c).openConnection();
                        try {
                            httpURLConnection2.setDoOutput(true);
                            httpURLConnection2.setInstanceFollowRedirects(false);
                            httpURLConnection2.setRequestMethod("POST");
                            for (Map.Entry entry : tmVar.entrySet()) {
                                httpURLConnection2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                            httpURLConnection2.setUseCaches(false);
                            new DataOutputStream(httpURLConnection2.getOutputStream()).write(bytes);
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream(), agqy.a));
                            do {
                            } while (bufferedReader.readLine() != null);
                            bufferedReader.close();
                            int responseCode = httpURLConnection2.getResponseCode();
                            Map<String, List<String>> headerFields = httpURLConnection2.getHeaderFields();
                            if (responseCode == 200) {
                                Log.d("HatsLibTransmitter", "Successfully transmitted answer beacon of type: ".concat(String.valueOf(queryParameter)));
                                ahiy ahiyVar2 = this.a;
                                ((agrk) ahiyVar2.b).c((String) ahiyVar2.c, headerFields);
                            } else {
                                Log.e("HatsLibTransmitter", "Failed to transmit answer beacon of type: " + queryParameter + "; response code was: " + responseCode);
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                        } catch (IOException e) {
                            e = e;
                            httpURLConnection = httpURLConnection2;
                            Log.d("HatsLibTransmitter", "Failed to put answer", e);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection = httpURLConnection2;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } else {
                Log.d("HatsLibTransmitter", "Skipping transmission of beacon since answerUrl was \"/\", this should only happen during debugging.");
            }
        } catch (Exception e3) {
            Log.e("HatsLibTransmitter", "Transmission of answer beacon failed.", e3);
        }
    }
}
