package defpackage;

import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kox extends zgv {
    private boolean G = false;

    public kox() {
        u(new ew((ex) this, 8));
    }

    @Override // defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            DiagnosticsActivity diagnosticsActivity = (DiagnosticsActivity) this;
            kqj kqjVar = (kqj) aS();
            diagnosticsActivity.t = (xnv) kqjVar.b.bV.b();
            diagnosticsActivity.w = (zas) kqjVar.d.b();
            diagnosticsActivity.u = kqjVar.f;
            diagnosticsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            diagnosticsActivity.s = krvVar.vt;
            diagnosticsActivity.x = krvVar.hA;
            diagnosticsActivity.y = krvVar.bU;
            diagnosticsActivity.z = kqjVar.h;
            diagnosticsActivity.A = (aksr) krvVar.at.b();
            diagnosticsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) diagnosticsActivity).D = krvVar2.zb;
            ((zgv) diagnosticsActivity).E = krvVar2.zh;
            diagnosticsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
