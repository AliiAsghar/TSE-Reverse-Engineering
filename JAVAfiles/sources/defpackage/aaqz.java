package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CategoryCustomizationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aaqz extends aapj {
    private boolean H = false;

    public aaqz() {
        u(new zji(this, 16));
    }

    @Override // defpackage.aapl, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.H) {
            this.H = true;
            CategoryCustomizationActivity categoryCustomizationActivity = (CategoryCustomizationActivity) this;
            kqj kqjVar = (kqj) aS();
            categoryCustomizationActivity.t = (xnv) kqjVar.b.bV.b();
            categoryCustomizationActivity.w = (zas) kqjVar.d.b();
            categoryCustomizationActivity.u = kqjVar.f;
            categoryCustomizationActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            categoryCustomizationActivity.s = krvVar.vt;
            categoryCustomizationActivity.x = krvVar.hA;
            categoryCustomizationActivity.y = krvVar.bU;
            categoryCustomizationActivity.z = kqjVar.h;
            categoryCustomizationActivity.A = (aksr) krvVar.at.b();
            categoryCustomizationActivity.B = kqjVar.d;
            categoryCustomizationActivity.F = (mcm) kqjVar.at.b();
            categoryCustomizationActivity.G = (xnv) kqjVar.b.bV.b();
        }
    }
}
