package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cb extends ce {
    final /* synthetic */ tb a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ se c;
    final /* synthetic */ rv d;
    final /* synthetic */ cg e;

    public cb(cg cgVar, tb tbVar, AtomicReference atomicReference, se seVar, rv rvVar) {
        this.e = cgVar;
        this.a = tbVar;
        this.b = atomicReference;
        this.c = seVar;
        this.d = rvVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [sc, cn] */
    @Override // defpackage.ce
    public final void a() {
        sb sbVar;
        StringBuilder sb = new StringBuilder("fragment_");
        cg cgVar = this.e;
        sb.append(cgVar.l);
        sb.append("_rq#");
        sb.append(cgVar.ad.getAndIncrement());
        String sb2 = sb.toString();
        cg cgVar2 = ((ca) this.a).a;
        ?? r2 = cgVar2.C;
        if (r2 instanceof sc) {
            sbVar = r2.gR();
        } else {
            sbVar = cgVar2.F().g;
        }
        this.b.set(sbVar.b(sb2, this.e, this.c, this.d));
    }
}
