package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vhq implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ vhq(uji ujiVar, Uri uri, long j, long j2, int i) {
        this.e = i;
        this.d = ujiVar;
        this.c = uri;
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [uji, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [armf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.e != 0) {
            long j = this.b;
            try {
                this.d.c(((Uri) this.c).toString(), this.a, j);
                return;
            } catch (RuntimeException e) {
                ujd.a.r("Error while calling #onProgress", e);
                return;
            }
        }
        aozy aozyVar = (aozy) this.d;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        long j2 = this.a;
        asgx asgxVar = (asgx) aozyVar.b;
        asgx asgxVar2 = asgx.a;
        asgxVar.f = atpj.b(30);
        apct b = apds.b(j2);
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        Object obj = this.c;
        asgx asgxVar3 = (asgx) aozyVar.b;
        b.getClass();
        asgxVar3.h = b;
        asgxVar3.b |= 4;
        maq maqVar = (maq) ((yyt) obj).c.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.XSL_REQUEST_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        long j3 = this.b;
        amfr amfrVar2 = (amfr) amfqVar.b;
        asgx asgxVar4 = (asgx) aozyVar.s();
        asgxVar4.getClass();
        amfrVar2.aI = asgxVar4;
        amfrVar2.e |= 16777216;
        maqVar.m(amfqVar, amrs.XSL_REQUEST_EVENT, new mbh(j2, j3));
    }

    public /* synthetic */ vhq(yyt yytVar, aozy aozyVar, long j, long j2, int i) {
        this.e = i;
        this.c = yytVar;
        this.d = aozyVar;
        this.a = j;
        this.b = j2;
    }
}
