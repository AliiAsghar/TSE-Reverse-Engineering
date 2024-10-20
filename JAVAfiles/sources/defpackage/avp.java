package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class avp implements avi {
    final /* synthetic */ cwo a;

    public avp(cwo cwoVar) {
        this.a = cwoVar;
    }

    @Override // defpackage.avi
    public final Object a(cti ctiVar, arqg arqgVar, arpe arpeVar) {
        cjp cjpVar;
        View a = cwq.a(this.a);
        long a2 = ctj.a(ctiVar);
        cjp cjpVar2 = (cjp) arqgVar.a();
        if (cjpVar2 != null) {
            cjpVar = cjpVar2.f(a2);
        } else {
            cjpVar = null;
        }
        if (cjpVar != null) {
            a.requestRectangleOnScreen(new Rect((int) cjpVar.b, (int) cjpVar.c, (int) cjpVar.d, (int) cjpVar.e), false);
        }
        return arnb.a;
    }
}
