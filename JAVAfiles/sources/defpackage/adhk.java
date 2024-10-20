package defpackage;

import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhk extends adhd {
    final /* synthetic */ adhw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adhk(adhw adhwVar) {
        super(adhwVar);
        this.b = adhwVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "ReconfigurationRequiredState";
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 4) {
            if (i != 17) {
                if (i != 7) {
                    if (i != 8) {
                        return super.e(message);
                    }
                    this.b.N(message.obj);
                    adhw adhwVar = this.b;
                    adhwVar.w(adhwVar.S);
                    return true;
                }
                if (((Boolean) adhw.g.a()).booleanValue() && this.b.E.a() > 0) {
                    advr.d(this.b.m, "Wait for backoff timer before starting registration.", new Object[0]);
                    adhw adhwVar2 = this.b;
                    adhwVar2.w(adhwVar2.ag);
                } else {
                    adhw adhwVar3 = this.b;
                    adhwVar3.w(adhwVar3.T);
                }
            } else {
                this.b.N(acok.SIM_REMOVED);
                adhw adhwVar4 = this.b;
                adhwVar4.w(adhwVar4.af);
            }
        }
        return true;
    }
}
