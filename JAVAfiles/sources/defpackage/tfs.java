package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tfs extends agmb {
    public Uri a;
    public Uri b;
    public String c;
    public String d;
    public int e;
    public int f;
    public long g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tfs() {
        /*
            r1 = this;
            agnw r0 = defpackage.d.P()
            agcp r0 = r0.W()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfs.<init>():void");
    }

    public final tfr a() {
        int i = tfq.a;
        tfr tfrVar = new tfr();
        tfrVar.ar(az());
        tfrVar.a = this.a;
        tfrVar.b = this.b;
        tfrVar.c = this.c;
        tfrVar.d = this.d;
        tfrVar.e = this.e;
        tfrVar.f = this.f;
        tfrVar.g = this.g;
        tfrVar.cF = aA();
        return tfrVar;
    }

    public final void b(Uri uri) {
        aC(1);
        this.b = uri;
    }

    public final void c(String str) {
        aC(2);
        this.c = str;
    }

    public final void d(int i) {
        aC(5);
        this.f = i;
    }

    public final void e(String str) {
        aC(3);
        this.d = str;
    }

    public final void f(Uri uri) {
        aC(0);
        this.a = uri;
    }

    public final void g(int i) {
        aC(4);
        this.e = i;
    }
}
