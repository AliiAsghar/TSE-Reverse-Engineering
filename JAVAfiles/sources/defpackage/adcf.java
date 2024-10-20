package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adcf extends ance implements adot {
    private final Conversation a;
    private final /* synthetic */ int b;

    public adcf(Conversation conversation, int i) {
        this.b = i;
        this.a = conversation;
    }

    @Override // defpackage.adot
    public final void a(ador adorVar) {
        if (this.b != 0) {
            adorVar.e(this);
            ajur ajurVar = new ajur(null);
            ajurVar.q(this.a);
            ajurVar.r(MessagingResult.d);
            set(ajurVar.p());
            return;
        }
        adorVar.e(this);
        ajur ajurVar2 = new ajur(null);
        ajurVar2.q(this.a);
        ajurVar2.r(MessagingResult.d);
        set(ajurVar2.p());
    }

    @Override // defpackage.adot
    public final void b(ador adorVar, ados adosVar) {
        MessagingResult messagingResult;
        if (this.b != 0) {
            adorVar.e(this);
            if (aczx.s()) {
                ajps d = MessagingResult.d();
                d.c(16);
                d.b(7);
                messagingResult = d.a();
            } else {
                messagingResult = MessagingResult.f;
            }
            ajur ajurVar = new ajur(null);
            ajurVar.q(this.a);
            ajurVar.r(messagingResult);
            set(ajurVar.p());
            return;
        }
        adorVar.e(this);
        ajur ajurVar2 = new ajur(null);
        ajurVar2.q(this.a);
        ajps d2 = MessagingResult.d();
        d2.c(15);
        ajurVar2.r(d2.a());
        set(ajurVar2.p());
    }

    @Override // defpackage.adot
    public final void d(ador adorVar, int i, String str) {
        if (this.b != 0) {
            adorVar.e(this);
            ajur ajurVar = new ajur(null);
            ajurVar.q(this.a);
            ajurVar.r(adcx.u(i));
            set(ajurVar.p());
            return;
        }
        adorVar.e(this);
        ajur ajurVar2 = new ajur(null);
        ajurVar2.q(this.a);
        ajurVar2.r(adcx.u(i));
        set(ajurVar2.p());
    }

    @Override // defpackage.adot
    public final void e() {
    }

    @Override // defpackage.adot
    public final void f() {
    }
}
