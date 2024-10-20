package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcd extends adqp {
    final /* synthetic */ adce a;

    public adcd(adce adceVar) {
        this.a = adceVar;
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void j() {
        this.a.a.aP(this);
        ajur ajurVar = new ajur(null);
        ajurVar.q(this.a.b);
        ajurVar.r(MessagingResult.d);
        this.a.set(ajurVar.p());
    }
}
