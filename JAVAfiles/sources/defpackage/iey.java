package defpackage;

import com.google.android.apps.messaging.block.ui.list.BlockedParticipantsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class iey extends zgu {
    private boolean C = false;

    public iey() {
        u(new ew((ex) this, 4));
    }

    @Override // defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.C) {
            this.C = true;
            BlockedParticipantsActivity blockedParticipantsActivity = (BlockedParticipantsActivity) this;
            kqj kqjVar = (kqj) aS();
            blockedParticipantsActivity.t = (xnv) kqjVar.b.bV.b();
            blockedParticipantsActivity.w = (zas) kqjVar.d.b();
            blockedParticipantsActivity.u = kqjVar.f;
            blockedParticipantsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            blockedParticipantsActivity.s = krvVar.vt;
            blockedParticipantsActivity.x = krvVar.hA;
            blockedParticipantsActivity.y = krvVar.bU;
            blockedParticipantsActivity.z = kqjVar.h;
            blockedParticipantsActivity.A = (aksr) krvVar.at.b();
            blockedParticipantsActivity.B = kqjVar.d;
        }
    }
}
