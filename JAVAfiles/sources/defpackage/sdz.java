package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sdz extends agmb {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sdz(byte[] r1) {
        /*
            r0 = this;
            agnw r1 = defpackage.d.P()
            agcp r1 = r1.W()
            r0.<init>(r1)
            r1 = 0
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sdz.<init>(byte[]):void");
    }

    public final qac a() {
        int i = qaa.a;
        qac qacVar = new qac();
        qacVar.ar(az());
        qacVar.a = (pyz) this.a;
        qacVar.b = (qam) this.c;
        qacVar.c = (Uri) this.b;
        qacVar.d = (qel) this.e;
        qacVar.e = (apwj) this.g;
        qacVar.f = (String) this.f;
        qacVar.g = (qep) this.d;
        qacVar.cF = aA();
        return qacVar;
    }

    public final void b(qel qelVar) {
        aC(3);
        this.e = qelVar;
    }

    public final void c(apwj apwjVar) {
        aC(4);
        this.g = apwjVar;
    }

    public final void d(qam qamVar) {
        aC(1);
        this.c = qamVar;
    }

    public final void e(Uri uri) {
        aC(2);
        this.b = uri;
    }

    public final void f(pyz pyzVar) {
        aC(0);
        this.a = pyzVar;
    }

    public final void g(String str) {
        aC(5);
        this.f = str;
    }

    public final void h(qep qepVar) {
        aC(6);
        this.d = qepVar;
    }

    public sdz() {
        super(a.bp());
        this.b = rvc.a;
    }
}
