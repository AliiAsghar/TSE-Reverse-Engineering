package defpackage;

import android.graphics.Typeface;
import defpackage.dli;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afyu extends arsm {
    final /* synthetic */ afzd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afyu(Object obj, afzd afzdVar) {
        super(obj);
        this.a = afzdVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        dje djeVar = (dje) obj2;
        afzd afzdVar = this.a;
        dqv b = afzdVar.b();
        djeVar.getClass();
        b.getClass();
        dli.a aVar = this.a.b;
        aVar.getClass();
        afzdVar.setBackgroundColor(ckw.b(djeVar.e()));
        if (djeVar.n() != null || djeVar.o() != null || djeVar.q() != null) {
            dli n = djeVar.n();
            dlx q = djeVar.q();
            if (q == null) {
                q = dlx.e;
            }
            dls o = djeVar.o();
            if (o != null) {
                i = o.a;
            } else {
                i = 0;
            }
            dlt p = djeVar.p();
            if (p != null) {
                i2 = p.a;
            } else {
                i2 = 65535;
            }
            Object a = aVar.a(n, q, i, i2).a();
            a.getClass();
            afzdVar.setTypeface((Typeface) a);
        }
        afzdVar.setTextColor(ckw.b(djeVar.f()));
        if (drm.b(djeVar.g()) != 0) {
            if (a.bB(drm.c(djeVar.g()), 8589934592L)) {
                afzdVar.setTextSize(afzdVar.getTextSize() * drm.a(djeVar.g()));
            } else {
                afzdVar.setTextSize(0, b.el(djeVar.g()));
            }
        }
        if (drm.b(djeVar.i()) != 0) {
            efn.f(afzdVar, b.en(djeVar.i()));
        }
        afzdVar.setIncludeFontPadding(false);
        if (true != a.bA(djeVar.d(), 2)) {
            i3 = 3;
        } else {
            i3 = 4;
        }
        afzdVar.setTextDirection(i3);
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
