package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apuw implements apvh {
    public final HttpURLConnection a;
    public final apus b;
    public final byte[] c;
    public long d;
    public int e = -1;
    public int f = 0;
    public aovn g;
    private final Executor h;
    private int i;

    public apuw(HttpURLConnection httpURLConnection, String str, apuu apuuVar, apus apusVar, Executor executor) {
        this.a = httpURLConnection;
        try {
            httpURLConnection.setRequestMethod(str);
            httpURLConnection.setReadTimeout(300000);
            httpURLConnection.setConnectTimeout(300000);
            httpURLConnection.setDoInput(true);
            this.b = apusVar;
            if (apusVar != null) {
                httpURLConnection.setDoOutput(true);
                if (apusVar.e() >= 0) {
                    long e = apusVar.e() - apusVar.d();
                    if (e < 2147483647L) {
                        httpURLConnection.setFixedLengthStreamingMode((int) e);
                    } else {
                        httpURLConnection.setFixedLengthStreamingMode(e);
                    }
                } else {
                    httpURLConnection.setChunkedStreamingMode(0);
                }
            }
            for (String str2 : apuuVar.c()) {
                Iterator it = apuuVar.b(str2).iterator();
                while (it.hasNext()) {
                    httpURLConnection.addRequestProperty(str2, (String) it.next());
                }
            }
            this.i = 1;
            this.c = new byte[65536];
            this.h = executor;
        } catch (ProtocolException e2) {
            throw new IllegalArgumentException("Invalid http method.", e2);
        }
    }

    @Override // defpackage.apvh
    public final long a() {
        return this.d;
    }

    @Override // defpackage.apvh
    public final ListenableFuture b() {
        anel anelVar = new anel(new apva(this, 1));
        Executor executor = this.h;
        if (executor == null) {
            arbj arbjVar = new arbj((char[]) null, (byte[]) null);
            arbjVar.j("Scotty-Uploader-HttpUrlConnectionHttpClient-%d");
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(arbj.t(arbjVar));
            newSingleThreadExecutor.execute(anelVar);
            newSingleThreadExecutor.shutdown();
        } else {
            executor.execute(anelVar);
        }
        return anelVar;
    }

    public final apuv c() {
        InputStream errorStream;
        apuu apuuVar;
        f();
        try {
            int responseCode = this.a.getResponseCode();
            try {
                errorStream = this.a.getInputStream();
            } catch (IOException unused) {
                errorStream = this.a.getErrorStream();
            }
            Map<String, List<String>> headerFields = this.a.getHeaderFields();
            if (headerFields != null) {
                apuuVar = new apuu();
                for (String str : headerFields.keySet()) {
                    if (str != null) {
                        Iterator<String> it = headerFields.get(str).iterator();
                        while (it.hasNext()) {
                            apuuVar.d(str, it.next());
                        }
                    }
                }
            } else {
                apuuVar = null;
            }
            return new apuv(responseCode, apuuVar, errorStream);
        } catch (IOException e) {
            throw new apvj(apvi.CONNECTION_ERROR, "Error while reading response code.", e);
        }
    }

    @Override // defpackage.apvh
    public final String d() {
        return null;
    }

    @Override // defpackage.apvh
    public final void e() {
        synchronized (this) {
            this.i = 3;
            notifyAll();
        }
    }

    public final synchronized void f() {
        int i;
        while (true) {
            i = this.i;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (i != 3) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            albo.y(z);
        } else {
            throw new apvj(apvi.CANCELED, "");
        }
    }

    public final boolean g() {
        try {
            return this.b.i();
        } catch (IOException e) {
            throw new apvj(apvi.REQUEST_BODY_READ_ERROR, e);
        }
    }

    @Override // defpackage.apvh
    public final synchronized void h(aovn aovnVar, int i, int i2) {
        this.g = aovnVar;
        if (i > 0) {
            this.e = i;
        }
        if (i2 >= 0) {
            this.f = i2;
        }
    }
}
