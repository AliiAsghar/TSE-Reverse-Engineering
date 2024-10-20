package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagg {
    public final armf a;
    public final Object b;
    public final Object c;
    public final Object d;

    public aagg(armf armfVar, armf armfVar2, xcx xcxVar, aafz aafzVar) {
        armfVar.getClass();
        armfVar2.getClass();
        this.d = armfVar;
        this.a = armfVar2;
        this.c = xcxVar;
        this.b = aafzVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [arwe, java.lang.Object] */
    public final akul a() {
        akul c;
        akrh e = aktp.e("PairedWatchNodeDataServiceImpl#markDeviceOnline");
        try {
            c = qjh.c(this.d, arpj.a, arwf.a, new zcb(this, (arpe) null, 8));
            armd.i(e, null);
            return c;
        } finally {
        }
    }

    public final boolean b(abee abeeVar) {
        if ((abeeVar.b & 1) != 0) {
            Object b = this.a.b();
            b.getClass();
            Duration ofDays = Duration.ofDays(((Number) b).longValue());
            apct apctVar = abeeVar.c;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            apctVar.getClass();
            if (ofDays.compareTo(Duration.between(aoue.m(apctVar), ((xnv) this.b).f())) > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wul] */
    public final boolean c() {
        akrh e = aktp.e("PairedWatchNodeDataServiceImpl#isRecentlyOnlineSync");
        try {
            boolean b = b((abee) this.c.l());
            armd.i(e, null);
            return b;
        } finally {
        }
    }

    public aagg(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.b = armfVar;
        this.a = armfVar2;
        this.d = armfVar3;
        this.c = armfVar4;
    }

    public aagg(armf armfVar, wul wulVar, arwe arweVar, arwe arweVar2, xnv xnvVar) {
        armfVar.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        xnvVar.getClass();
        this.a = armfVar;
        this.c = wulVar;
        this.d = arweVar;
        this.b = xnvVar;
    }
}
