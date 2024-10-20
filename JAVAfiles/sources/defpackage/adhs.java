package defpackage;

import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhs extends adhd {
    final /* synthetic */ adhw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adhs(adhw adhwVar) {
        super(adhwVar);
        this.b = adhwVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "StoppedState";
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        if (message.what != 7) {
            return super.e(message);
        }
        adhw adhwVar = this.b;
        if (adhwVar.B != acok.FCM_TICKLE_KEEP_ALIVE) {
            if (((Boolean) adhw.g.a()).booleanValue() && this.b.E.a() > 0) {
                advr.d(this.b.m, "Wait for backoff timer before starting registration.", new Object[0]);
                adhw adhwVar2 = this.b;
                adhwVar2.w(adhwVar2.ag);
            } else {
                adhw adhwVar3 = this.b;
                adhwVar3.w(adhwVar3.T);
            }
            return true;
        }
        adhwVar.w(adhwVar.T);
        return true;
    }
}
