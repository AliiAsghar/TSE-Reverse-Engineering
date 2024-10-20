package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tki extends agmb {
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public String f;
    public int g;
    public String h;
    public String i;

    public tki() {
        super(a.bp());
        this.g = 0;
    }

    public final tkh a() {
        return b(new tif(15));
    }

    public final tkh b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        tkh tkhVar = (tkh) obj;
        tkhVar.ar(az());
        tkhVar.a = this.a;
        tkhVar.b = this.b;
        tkhVar.c = this.c;
        tkhVar.d = this.d;
        tkhVar.e = this.e;
        tkhVar.f = this.f;
        tkhVar.g = this.g;
        tkhVar.h = this.h;
        tkhVar.i = this.i;
        tkhVar.cF = aA();
        return tkhVar;
    }

    @Deprecated
    public final tkh c() {
        agnw d;
        agnw d2;
        tkh b = b(new tif(14));
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        agnc.a(d2, "self_participants", b, new tkg(d, 2), new ter(b, 6));
        return b;
    }

    public final void d(String str) {
        aC(7);
        this.h = str;
    }

    public final void e(String str) {
        aC(1);
        this.b = str;
    }

    public final void f(int i) {
        aC(3);
        this.d = i;
    }

    public final void g(String str) {
        int i = this.az;
        if (i < 29080) {
            agnc.t("smsc", i);
        }
        aC(8);
        this.i = str;
    }

    public final void h(int i) {
        aC(4);
        this.e = i;
    }

    public final void i(int i) {
        aC(6);
        this.g = i;
    }

    public final void j(String str) {
        aC(5);
        this.f = str;
    }
}
