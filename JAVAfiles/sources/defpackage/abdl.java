package defpackage;

import com.google.android.apps.messaging.wearable.WearableSetDefaultSmsAppActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abdl extends zgr {
    private boolean n = false;

    public abdl() {
        u(new aazn(this, 3));
    }

    @Override // defpackage.zgw
    public final void y() {
        if (!this.n) {
            this.n = true;
            WearableSetDefaultSmsAppActivity wearableSetDefaultSmsAppActivity = (WearableSetDefaultSmsAppActivity) this;
            kqj kqjVar = (kqj) aS();
            wearableSetDefaultSmsAppActivity.t = (xnv) kqjVar.b.bV.b();
            wearableSetDefaultSmsAppActivity.w = (zas) kqjVar.d.b();
            wearableSetDefaultSmsAppActivity.u = kqjVar.f;
            wearableSetDefaultSmsAppActivity.v = (rrj) kqjVar.b.dp.b();
            wearableSetDefaultSmsAppActivity.n = apxv.a(kqjVar.b.gD);
            krv krvVar = kqjVar.b;
            wearableSetDefaultSmsAppActivity.o = krvVar.yJ;
            wearableSetDefaultSmsAppActivity.p = krvVar.si;
            wearableSetDefaultSmsAppActivity.q = krvVar.n;
            wearableSetDefaultSmsAppActivity.r = krvVar.aM;
        }
    }
}
