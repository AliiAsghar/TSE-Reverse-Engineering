package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxt extends agmc {
    final /* synthetic */ kxu a;

    public kxt(kxu kxuVar) {
        this.a = kxuVar;
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ void a(agoz agozVar) {
        xyo c = kxx.a.c();
        c.H("Invalidate data source on query changes");
        c.z("loadingStatus", this.a.f.u);
        c.q();
        this.a.b();
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ void b(agoz agozVar, aglo agloVar) {
        xyo d = kxx.a.d();
        d.H("About to invalidate on query change");
        d.z("TriggerQuery", kxx.p(agloVar));
        d.q();
    }
}
