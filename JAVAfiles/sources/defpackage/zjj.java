package defpackage;

import com.google.android.apps.messaging.ui.appsettings.VmtSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zjj extends lzf {
    private boolean G = false;

    public zjj() {
        u(new zji(this, 0));
    }

    @Override // defpackage.lzi, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            VmtSettingsActivity vmtSettingsActivity = (VmtSettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            vmtSettingsActivity.t = (xnv) kqjVar.b.bV.b();
            vmtSettingsActivity.w = (zas) kqjVar.d.b();
            vmtSettingsActivity.u = kqjVar.f;
            vmtSettingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            vmtSettingsActivity.s = krvVar.vt;
            vmtSettingsActivity.x = krvVar.hA;
            vmtSettingsActivity.y = krvVar.bU;
            vmtSettingsActivity.z = kqjVar.h;
            vmtSettingsActivity.A = (aksr) krvVar.at.b();
            vmtSettingsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) vmtSettingsActivity).D = krvVar2.zb;
            ((zgv) vmtSettingsActivity).E = krvVar2.zh;
            vmtSettingsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
