package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class shi extends agmb {
    public long a;
    public long b;
    public long c;
    public long d;
    public Object e;

    public shi(byte[] bArr) {
        super(a.bp());
    }

    public final shh a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        shh shhVar = (shh) obj;
        shhVar.ar(az());
        shhVar.a = this.a;
        shhVar.b = this.b;
        shhVar.c = this.c;
        shhVar.d = (shs) this.e;
        shhVar.e = this.d;
        shhVar.cF = aA();
        return shhVar;
    }

    public final void b(long j) {
        aC(4);
        this.d = j;
    }

    public final void c(shs shsVar) {
        aC(3);
        this.e = shsVar;
    }

    public final void d(long j) {
        aC(1);
        this.b = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public shi() {
        /*
            r1 = this;
            agnw r0 = defpackage.d.P()
            agcp r0 = r0.W()
            r1.<init>(r0)
            shs r0 = defpackage.shs.a
            r1.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shi.<init>():void");
    }
}
