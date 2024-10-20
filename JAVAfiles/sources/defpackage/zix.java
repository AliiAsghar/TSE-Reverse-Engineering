package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SimMessagesActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zix extends zgu {
    private boolean C = false;

    public zix() {
        u(new zfc(this, 16));
    }

    @Override // defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.C) {
            this.C = true;
            SimMessagesActivity simMessagesActivity = (SimMessagesActivity) this;
            kqj kqjVar = (kqj) aS();
            simMessagesActivity.t = (xnv) kqjVar.b.bV.b();
            simMessagesActivity.w = (zas) kqjVar.d.b();
            simMessagesActivity.u = kqjVar.f;
            simMessagesActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            simMessagesActivity.s = krvVar.vt;
            simMessagesActivity.x = krvVar.hA;
            simMessagesActivity.y = krvVar.bU;
            simMessagesActivity.z = kqjVar.h;
            simMessagesActivity.A = (aksr) krvVar.at.b();
            simMessagesActivity.B = kqjVar.d;
        }
    }
}
