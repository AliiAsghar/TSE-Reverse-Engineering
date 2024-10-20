package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tlb extends agmb {
    public long a;
    public long b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tlb(byte[] r1) {
        /*
            r0 = this;
            agnw r1 = defpackage.d.P()
            agcp r1 = r1.W()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tlb.<init>(byte[]):void");
    }

    public final tla a() {
        int i = tif.a;
        tla tlaVar = new tla();
        tlaVar.ar(az());
        tlaVar.a = this.a;
        tlaVar.b = (String) this.c;
        tlaVar.c = (String) this.d;
        tlaVar.d = (byte[]) this.e;
        tlaVar.e = this.b;
        tlaVar.cF = aA();
        return tlaVar;
    }

    public final void b(byte[] bArr) {
        aC(3);
        this.e = bArr;
    }

    public final void c(String str) {
        aC(1);
        this.c = str;
    }

    public final void d(String str) {
        aC(2);
        this.d = str;
    }

    public final tiq e(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        tiq tiqVar = (tiq) obj;
        tiqVar.ar(az());
        tiqVar.a = this.a;
        tiqVar.b = this.b;
        tiqVar.c = (lwq) this.c;
        tiqVar.d = (tja) this.e;
        tiqVar.e = (tiz) this.d;
        tiqVar.cF = aA();
        return tiqVar;
    }

    public final void f() {
        agnw d;
        agnw d2;
        tiq e = e(new tif(4));
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        agnc.a(d2, "restore_workflow_files", e, new tkg(d, 1), new ter(e, 5));
    }

    public final void g(lwq lwqVar) {
        aC(2);
        this.c = lwqVar;
    }

    public final void h(tja tjaVar) {
        aC(3);
        this.e = tjaVar;
    }

    public final void i(tiz tizVar) {
        aC(4);
        this.d = tizVar;
    }

    public final void j(long j) {
        aC(1);
        this.b = j;
    }

    public tlb() {
        super(a.bp());
        this.b = 0L;
    }
}
