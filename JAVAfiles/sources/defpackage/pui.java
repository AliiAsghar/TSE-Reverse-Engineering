package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pui implements akfb {
    public final arwe a;
    public final xnv b;
    public final String c;
    public final alhr d;
    public boolean e;
    public final qsa f;
    public final lgg g;
    public final ahiy h;
    public final qya i;
    public final qdq j;

    public pui(lgg lggVar, ahiy ahiyVar, arwe arweVar, xnv xnvVar, qsa qsaVar, qya qyaVar, qdq qdqVar, alhr alhrVar, enh enhVar) {
        lggVar.getClass();
        ahiyVar.getClass();
        arweVar.getClass();
        xnvVar.getClass();
        this.g = lggVar;
        this.h = ahiyVar;
        this.a = arweVar;
        this.b = xnvVar;
        this.f = qsaVar;
        this.i = qyaVar;
        this.j = qdqVar;
        this.c = "rcs_capabilities";
        this.d = alhrVar;
        this.e = true;
        enhVar.c(new aati(this, new pug(this), 1));
    }

    @Override // defpackage.akfb
    public final andc a() {
        return qjh.k(this.a, new puh(this, null));
    }

    @Override // defpackage.akfb
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        return aktp.ag(null);
    }

    @Override // defpackage.akfb
    public final /* synthetic */ Object c() {
        return this.c;
    }
}
