package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aasp extends aapj {
    private boolean H = false;

    public aasp() {
        u(new zji(this, 17));
    }

    @Override // defpackage.aapl, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.H) {
            this.H = true;
            GalleryBrowserActivity galleryBrowserActivity = (GalleryBrowserActivity) this;
            kqj kqjVar = (kqj) aS();
            galleryBrowserActivity.t = (xnv) kqjVar.b.bV.b();
            galleryBrowserActivity.w = (zas) kqjVar.d.b();
            galleryBrowserActivity.u = kqjVar.f;
            galleryBrowserActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            galleryBrowserActivity.s = krvVar.vt;
            galleryBrowserActivity.x = krvVar.hA;
            galleryBrowserActivity.y = krvVar.bU;
            galleryBrowserActivity.z = kqjVar.h;
            galleryBrowserActivity.A = (aksr) krvVar.at.b();
            galleryBrowserActivity.B = kqjVar.d;
            galleryBrowserActivity.F = (mcm) kqjVar.at.b();
            galleryBrowserActivity.G = (xnv) kqjVar.b.bV.b();
        }
    }
}
