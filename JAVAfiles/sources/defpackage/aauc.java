package defpackage;

import android.content.Context;
import android.location.LocationManager;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker.LocationAttachmentPickerActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aauc extends aapj {
    private boolean H = false;

    public aauc() {
        u(new zji(this, 19));
    }

    @Override // defpackage.aapl, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.H) {
            this.H = true;
            LocationAttachmentPickerActivity locationAttachmentPickerActivity = (LocationAttachmentPickerActivity) this;
            kqj kqjVar = (kqj) aS();
            locationAttachmentPickerActivity.t = (xnv) kqjVar.b.bV.b();
            locationAttachmentPickerActivity.w = (zas) kqjVar.d.b();
            locationAttachmentPickerActivity.u = kqjVar.f;
            locationAttachmentPickerActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            locationAttachmentPickerActivity.s = krvVar.vt;
            locationAttachmentPickerActivity.x = krvVar.hA;
            locationAttachmentPickerActivity.y = krvVar.bU;
            locationAttachmentPickerActivity.z = kqjVar.h;
            locationAttachmentPickerActivity.A = (aksr) krvVar.at.b();
            locationAttachmentPickerActivity.B = kqjVar.d;
            locationAttachmentPickerActivity.F = (mcm) kqjVar.at.b();
            locationAttachmentPickerActivity.G = (xnv) kqjVar.b.bV.b();
            locationAttachmentPickerActivity.T = (mbl) kqjVar.b.bB.b();
            Context context = (Context) kqjVar.b.n.b();
            LocationManager locationManager = (LocationManager) kqjVar.b.a.fZ.b();
            yjf yjfVar = (yjf) kqjVar.b.bU.b();
            mbl mblVar = (mbl) kqjVar.b.bB.b();
            Optional empty = Optional.empty();
            anen anenVar = (anen) kqjVar.b.m.b();
            krx krxVar = kqjVar.b.a;
            locationAttachmentPickerActivity.U = new aaue(context, locationManager, yjfVar, mblVar, new lek(empty, anenVar, krxVar.ga, kqjVar.aw));
            locationAttachmentPickerActivity.W = (uac) kqjVar.b.ed.b();
            locationAttachmentPickerActivity.V = (trz) kqjVar.b.ee.b();
        }
    }
}
