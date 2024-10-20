package defpackage;

import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adav extends adqp {
    private final SettableFuture a = SettableFuture.create();
    private final Conversation b;
    private final adrc c;
    private final adqu d;
    private final addj e;

    public adav(addj addjVar, Conversation conversation, adqu adquVar, adrc adrcVar) {
        this.b = conversation;
        this.d = adquVar;
        this.c = adrcVar;
        this.e = addjVar;
    }

    @Override // defpackage.adqp, defpackage.adqy
    public final void a(adqu adquVar, int i) {
        this.c.aP(this);
        MessagingResult a = this.e.apply(this.c.S);
        ajyt f = MessagingOperationResult.f();
        f.h(a);
        f.e(this.b);
        String str = this.d.k;
        str.getClass();
        f.g(str);
        this.a.set(f.d());
        this.c.l();
    }

    @Override // defpackage.adqp, defpackage.adqy
    public final void b(adqu adquVar) {
        this.c.aP(this);
        ajyt f = MessagingOperationResult.f();
        f.h(MessagingResult.d);
        f.e(this.b);
        String str = this.d.k;
        str.getClass();
        f.g(str);
        f.f(false);
        this.a.set(f.d());
        this.c.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ListenableFuture p(adqu adquVar) {
        this.c.aG(this);
        adrc adrcVar = this.c;
        adrcVar.N = adquVar;
        adrcVar.j();
        return this.a;
    }
}
