package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asqi {
    public static final byte[] a = {42};
    public static final List b = aqjn.y("*");
    public static final asqi c = new asqi();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final CountDownLatch e = new CountDownLatch(1);
    public byte[] f;
    public byte[] g;

    public final List a(String str) {
        List aa = arsd.aa(str, new char[]{'.'});
        if (d.F(aqjn.ac(aa), "")) {
            return aqjn.am(aa, 1);
        }
        return aa;
    }

    public final void b() {
        arsb arsbVar;
        arsb arsbVar2;
        InputStream resourceAsStream;
        CountDownLatch countDownLatch;
        boolean z = false;
        while (true) {
            try {
                try {
                    try {
                        arsbVar = new arsb();
                        arsbVar2 = new arsb();
                        resourceAsStream = asqi.class.getResourceAsStream("publicsuffixes.gz");
                        break;
                    } catch (InterruptedIOException unused) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        aspx.b.k("Failed to read public suffix list", 5, e);
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                this.e.countDown();
                throw th;
            }
        }
        if (resourceAsStream == null) {
            countDownLatch = this.e;
        } else {
            asrk asrkVar = new asrk(new asrb(asre.b(resourceAsStream)));
            try {
                arsbVar.a = asrkVar.F(asrkVar.f());
                arsbVar2.a = asrkVar.F(asrkVar.f());
                armd.i(asrkVar, null);
                synchronized (this) {
                    Object obj = arsbVar.a;
                    obj.getClass();
                    this.f = (byte[]) obj;
                    Object obj2 = arsbVar2.a;
                    obj2.getClass();
                    this.g = (byte[]) obj2;
                }
                countDownLatch = this.e;
            } finally {
            }
        }
        countDownLatch.countDown();
    }
}
