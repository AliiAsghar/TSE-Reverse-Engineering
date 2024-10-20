package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifBrowserActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aaua extends aapj {
    private boolean H = false;

    public aaua() {
        u(new zji(this, 18));
    }

    @Override // defpackage.aapl, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.H) {
            this.H = true;
            GifBrowserActivity gifBrowserActivity = (GifBrowserActivity) this;
            kqj kqjVar = (kqj) aS();
            gifBrowserActivity.t = (xnv) kqjVar.b.bV.b();
            gifBrowserActivity.w = (zas) kqjVar.d.b();
            gifBrowserActivity.u = kqjVar.f;
            gifBrowserActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            gifBrowserActivity.s = krvVar.vt;
            gifBrowserActivity.x = krvVar.hA;
            gifBrowserActivity.y = krvVar.bU;
            gifBrowserActivity.z = kqjVar.h;
            gifBrowserActivity.A = (aksr) krvVar.at.b();
            gifBrowserActivity.B = kqjVar.d;
            gifBrowserActivity.F = (mcm) kqjVar.at.b();
            gifBrowserActivity.G = (xnv) kqjVar.b.bV.b();
        }
    }
}
