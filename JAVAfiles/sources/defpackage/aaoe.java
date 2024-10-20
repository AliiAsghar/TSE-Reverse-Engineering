package defpackage;

import com.google.android.apps.messaging.ui.debug.database.DatabaseActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaoe extends zgr {
    private boolean n = false;

    public aaoe() {
        u(new zji(this, 14));
    }

    @Override // defpackage.zgw
    public final void y() {
        if (!this.n) {
            this.n = true;
            DatabaseActivity databaseActivity = (DatabaseActivity) this;
            kqj kqjVar = (kqj) aS();
            databaseActivity.t = (xnv) kqjVar.b.bV.b();
            databaseActivity.w = (zas) kqjVar.d.b();
            databaseActivity.u = kqjVar.f;
            databaseActivity.v = (rrj) kqjVar.b.dp.b();
        }
    }
}
