package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aded extends wck {
    public static final void j(arlq arlqVar) {
        arlqVar.b(Status.k.withDescription("JibeService not initialized").asException());
    }

    @Override // defpackage.wck
    public final void b(wbg wbgVar, arlq arlqVar) {
        adtx.a().ifPresentOrElse(new abid(wbgVar, arlqVar, 9, null), new acbq(arlqVar, 19));
    }

    @Override // defpackage.wck
    public final void c(wbn wbnVar, arlq arlqVar) {
        adtx.a().ifPresentOrElse(new abid(wbnVar, arlqVar, 3, null), new acbq(arlqVar, 15));
    }

    @Override // defpackage.wck
    public final void d(wdd wddVar, arlq arlqVar) {
        adtx.a().ifPresentOrElse(new abid(wddVar, arlqVar, 4, null), new acbq(arlqVar, 13));
    }

    @Override // defpackage.wck
    public final void e(wdn wdnVar, arlq arlqVar) {
        adtx.a().ifPresentOrElse(new abid(wdnVar, arlqVar, 6, null), new acbq(arlqVar, 16));
    }

    @Override // defpackage.wck
    public final void f(wdr wdrVar, arlq arlqVar) {
        adtx.a().ifPresentOrElse(new abid(wdrVar, arlqVar, 7, null), new acbq(arlqVar, 17));
    }

    @Override // defpackage.wck
    public final void g(wdx wdxVar, arlq arlqVar) {
        adtx.a().ifPresentOrElse(new abid(wdxVar, arlqVar, 8, null), new acbq(arlqVar, 18));
    }

    @Override // defpackage.wck
    public final void h(web webVar, arlq arlqVar) {
        adtx.a().ifPresentOrElse(new abid(webVar, arlqVar, 5, null), new acbq(arlqVar, 14));
    }

    @Override // defpackage.wck
    public final void i() {
        throw new IllegalStateException("Not implemented anymore!");
    }
}
