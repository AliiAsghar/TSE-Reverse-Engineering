package defpackage;

import defpackage.bzj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzl extends arpw implements arqv<bzj.d, arpe<? super Boolean>, Object> {
    /* synthetic */ Object a;

    public bzl(arpe arpeVar) {
        super(2, arpeVar);
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzl) c((bzj.d) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z;
        aqil.P(obj);
        if (((bzj.d) this.a) == bzj.d.a) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        bzl bzlVar = new bzl(arpeVar);
        bzlVar.a = obj;
        return bzlVar;
    }
}
