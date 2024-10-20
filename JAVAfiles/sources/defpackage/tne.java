package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tne extends agmb {
    public int a;
    public String b;
    public Object c;

    public tne(byte[] bArr) {
        super(rog.d());
        this.c = Instant.EPOCH;
    }

    public final tnd a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        tnd tndVar = (tnd) obj;
        tndVar.ar(az());
        tndVar.a = this.a;
        tndVar.b = this.b;
        tndVar.c = (tnm) this.c;
        tndVar.cF = aA();
        return tndVar;
    }

    @Deprecated
    public final void b() {
        agnw d;
        agnw d2;
        tnd a = a(new tls(11));
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        agnc.a(d2, "supersort_labels", a, new tkg(d, 4), new swb(14));
    }

    public final void c(int i) {
        aC(0);
        this.a = i;
    }

    public final void d(String str) {
        aC(1);
        this.b = str;
    }

    public final void e(tnm tnmVar) {
        aC(2);
        this.c = tnmVar;
    }

    public final rnz f(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        rnz rnzVar = (rnz) obj;
        rnzVar.ar(az());
        rnzVar.a = (Instant) this.c;
        rnzVar.b = this.a;
        rnzVar.c = this.b;
        rnzVar.cF = aA();
        return rnzVar;
    }

    public final void g(String str) {
        int i = this.az;
        if (i < 0) {
            agnc.t("backup_id", i);
        }
        aC(2);
        this.b = str;
    }

    public final void h(Instant instant) {
        int i = this.az;
        if (i < 0) {
            agnc.t("created_timestamp", i);
        }
        aC(0);
        this.c = instant;
    }

    public final void i(int i) {
        int i2 = this.az;
        if (i2 < 0) {
            agnc.t("schema_version", i2);
        }
        aC(1);
        this.a = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tne() {
        /*
            r1 = this;
            agnw r0 = defpackage.d.P()
            agcp r0 = r0.W()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tne.<init>():void");
    }
}
