package defpackage;

import com.google.android.apps.messaging.ui.rcs.setup.auto.RcsPromoActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aayx extends zgr {
    private boolean n = false;

    public aayx() {
        u(new aazn(this, 1));
    }

    @Override // defpackage.zgw
    public final void y() {
        if (!this.n) {
            this.n = true;
            RcsPromoActivity rcsPromoActivity = (RcsPromoActivity) this;
            kqj kqjVar = (kqj) aS();
            rcsPromoActivity.t = (xnv) kqjVar.b.bV.b();
            rcsPromoActivity.w = (zas) kqjVar.d.b();
            rcsPromoActivity.u = kqjVar.f;
            rcsPromoActivity.v = (rrj) kqjVar.b.dp.b();
        }
    }
}
