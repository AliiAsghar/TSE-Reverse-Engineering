package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class roh implements rkh {
    private final xnv a;

    public roh(xnv xnvVar) {
        xnvVar.getClass();
        this.a = xnvVar;
    }

    @Override // defpackage.rkd
    public final void a() {
        roc rocVar = new roc();
        rocVar.e();
        rocVar.a().V();
    }

    @Override // defpackage.rkd
    public final void b(rkc rkcVar) {
        String[] strArr = rog.a;
        int i = rlm.a;
        tne tneVar = new tne(null);
        tneVar.h(this.a.f());
        tneVar.g(UUID.randomUUID().toString());
        tneVar.i(120);
        agnc.a(rog.b(), "backup_metadata", tneVar.f(new roi(1)), new rbw(rog.b(), 19), new rbc(5));
    }
}
