package defpackage;

import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kmh extends zgr {
    private boolean n = false;

    public kmh() {
        u(new ew((ex) this, 7));
    }

    @Override // defpackage.zgw
    public final void y() {
        if (!this.n) {
            this.n = true;
            DataDonationActivity dataDonationActivity = (DataDonationActivity) this;
            kqj kqjVar = (kqj) aS();
            dataDonationActivity.t = (xnv) kqjVar.b.bV.b();
            dataDonationActivity.w = (zas) kqjVar.d.b();
            dataDonationActivity.u = kqjVar.f;
            dataDonationActivity.v = (rrj) kqjVar.b.dp.b();
        }
    }
}
