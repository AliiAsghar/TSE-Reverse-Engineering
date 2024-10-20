package defpackage;

import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhr extends adhd {
    final /* synthetic */ adhw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adhr(adhw adhwVar) {
        super(adhwVar);
        this.b = adhwVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "SimRemovedState";
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final void b() {
        super.b();
        if (this.b.R.getAndSet(false)) {
            this.b.q(16);
        }
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 7) {
            if (i != 8) {
                if (i != 16) {
                    return super.e(message);
                }
                adhw adhwVar = this.b;
                adhwVar.w(adhwVar.U);
                return true;
            }
            acok acokVar = (acok) message.obj;
            this.b.N(acokVar);
            if (acokVar.equals(acok.FCM_TICKLE_KEEP_ALIVE)) {
                advr.d(this.b.m, "Ignore FCM Tickle.", new Object[0]);
            } else {
                adhw adhwVar2 = this.b;
                adhwVar2.w(adhwVar2.S);
            }
        } else if (this.b.B.equals(acok.FCM_TICKLE_KEEP_ALIVE)) {
            advr.d(this.b.m, "Ignore FCM Tickle.", new Object[0]);
        } else {
            adhw adhwVar3 = this.b;
            adhwVar3.w(adhwVar3.T);
        }
        return true;
    }
}
