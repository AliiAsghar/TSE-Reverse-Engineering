package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tfi extends agmb {
    public String a;
    public Uri b;
    public String c;
    public int d;
    public int e;
    public long f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tfi() {
        /*
            r1 = this;
            agnw r0 = defpackage.d.P()
            agcp r0 = r0.W()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfi.<init>():void");
    }

    public final tfh a() {
        int i = tdb.a;
        tfh tfhVar = new tfh();
        tfhVar.ar(az());
        tfhVar.a = this.a;
        tfhVar.b = this.b;
        tfhVar.c = this.c;
        tfhVar.d = this.d;
        tfhVar.e = this.e;
        tfhVar.f = this.f;
        tfhVar.cF = aA();
        return tfhVar;
    }

    public final void b(String str) {
        aC(2);
        this.c = str;
    }

    public final void c(Uri uri) {
        aC(1);
        this.b = uri;
    }

    public final void d(int i) {
        aC(4);
        this.e = i;
    }

    public final void e(long j) {
        aC(5);
        this.f = j;
    }

    public final void f(String str) {
        aC(0);
        this.a = str;
    }

    public final void g(int i) {
        aC(3);
        this.d = i;
    }
}
