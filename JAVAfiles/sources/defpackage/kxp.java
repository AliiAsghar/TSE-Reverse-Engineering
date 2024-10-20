package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxp extends agmc {
    final /* synthetic */ kxx a;

    public kxp(kxx kxxVar) {
        this.a = kxxVar;
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ void a(agoz agozVar) {
        xyo c = kxx.a.c();
        c.H("Invalidate data source during prefetch");
        c.z("loadingStatus", this.a.u);
        c.q();
        kxx kxxVar = this.a;
        kxxVar.w = null;
        gap gapVar = kxxVar.r;
        if (gapVar != null) {
            gapVar.b();
        }
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ void b(agoz agozVar, aglo agloVar) {
        xyo d = kxx.a.d();
        d.H("About to invalidate on prefetch");
        d.z("TriggerQuery", kxx.p(agloVar));
        d.q();
    }
}
