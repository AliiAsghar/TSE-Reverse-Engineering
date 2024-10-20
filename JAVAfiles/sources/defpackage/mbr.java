package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class mbr implements mbm {
    private final String a;
    protected final String b;
    final /* synthetic */ mbs c;
    private final long d;
    private long e = -1;

    public mbr(mbs mbsVar, String str, String str2, long j) {
        this.c = mbsVar;
        this.b = str;
        this.a = str2;
        this.d = j;
    }

    @Override // defpackage.mbm
    public final long a() {
        return this.d;
    }

    @Override // defpackage.mbm
    public final String b() {
        return this.a;
    }

    @Override // defpackage.mbm
    public final boolean c() {
        xyo d;
        mbs mbsVar = this.c;
        ConcurrentHashMap concurrentHashMap = mbsVar.c;
        long a = mbsVar.e.a();
        if (!concurrentHashMap.remove(this.a, this)) {
            xyo d2 = mbs.a.d();
            d2.H("already reported timer");
            d2.z("histogramName", this.b);
            d2.L("lookupKey", this.a);
            d2.q();
            return false;
        }
        long j = a - this.d;
        e(j);
        long j2 = this.e;
        if (j2 != -1 && j >= j2) {
            d = mbs.a.e();
        } else {
            d = mbs.a.d();
        }
        d.L("key", this.a);
        d.y("timer took", j);
        d.q();
        return true;
    }

    @Override // defpackage.mbm
    public final /* synthetic */ void d(long j) {
        this.e = j;
    }

    protected void e(long j) {
        ((mbl) this.c.d.b()).g(this.b, j);
    }
}
