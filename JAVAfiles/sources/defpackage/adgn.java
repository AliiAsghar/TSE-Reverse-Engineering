package defpackage;

import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgn extends adgd {
    final /* synthetic */ adgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adgn(adgp adgpVar) {
        super(adgpVar);
        this.b = adgpVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "RetryState";
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final void b() {
        super.b();
        this.b.I(adgc.RESET_FROM_STATE_RETRY);
        advr.l(this.b.i, "Retrying in %ds.", 3L);
        this.b.t(15, TimeUnit.SECONDS.toMillis(3L));
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final void c() {
        super.c();
        this.b.p(15);
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 4) {
            if (i != 15) {
                return super.e(message);
            }
            advr.d(this.b.i, "Triggering registration retry.", new Object[0]);
            adgp adgpVar = this.b;
            adgpVar.w(adgpVar.k);
            return true;
        }
        advr.d(this.b.i, "Triggering registration retry.", new Object[0]);
        adgp adgpVar2 = this.b;
        adgpVar2.w(adgpVar2.t);
        return true;
    }
}
