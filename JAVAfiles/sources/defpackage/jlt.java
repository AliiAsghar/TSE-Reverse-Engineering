package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlt implements afkx {
    final /* synthetic */ jlw a;

    public jlt(jlw jlwVar) {
        this.a = jlwVar;
    }

    public final jha a(afcq afcqVar, boolean z) {
        alhp alhpVar;
        if (afcqVar instanceof afcv) {
            return new jgv((afcv) afcqVar);
        }
        Uri uri = null;
        byte b = 0;
        if (z) {
            alhpVar = alhp.b(this.a.k);
        } else {
            alhpVar = null;
        }
        return new jgz(afcqVar, new jgy(uri, alhpVar, b == true ? 1 : 0, 27));
    }

    @Override // defpackage.afku
    public final Object b(afcq afcqVar, arpe arpeVar) {
        jlw jlwVar = this.a;
        return arro.q(jlwVar.c, new jls(afcqVar, jlwVar, this, null), arpeVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ascv, java.lang.Object] */
    @Override // defpackage.afkx
    public final ascv c() {
        jlw jlwVar = this.a;
        return qkf.d(jlwVar.p.a, jlwVar.e, jld.c);
    }

    @Override // defpackage.afku
    public final void d() {
        jlw jlwVar = this.a;
        qjh.l(jlwVar.e, null, new jks(jlwVar, (arpe) null, 3), 3);
    }

    @Override // defpackage.afku
    public final void f(afcq afcqVar) {
        afcqVar.getClass();
        this.a.e(new ipk(afcqVar, 16));
    }

    @Override // defpackage.afku
    public final void g(afcq afcqVar) {
        yig.c();
        alvw d = jlw.a.d();
        d.X(alwp.a, "BugleComposeRow2");
        ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$hugoDraftAttachmentsController$1", "send", 420, "DraftAttachmentController.kt")).t("Launching direct send %s", afcqVar);
        jlw jlwVar = this.a;
        qjh.l(jlwVar.d, null, new gvr(afcqVar, jlwVar, this, (arpe) null, 16), 3);
    }

    public final void h(String str, Boolean bool) {
        this.a.p.e(new geg(str, bool, 10));
    }

    @Override // defpackage.afku
    public final void e() {
    }
}
