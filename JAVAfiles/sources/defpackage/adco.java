package defpackage;

import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adco implements adqy {
    private final SettableFuture a = SettableFuture.create();
    private final adrh b;
    private final Message c;
    private final Conversation d;
    private final adqu e;

    public adco(adrh adrhVar, Conversation conversation, Message message, adqu adquVar) {
        this.b = adrhVar;
        this.c = message;
        this.d = conversation;
        this.e = adquVar;
    }

    @Override // defpackage.adqy
    public final void a(adqu adquVar, int i) {
        if (this.e.equals(adquVar)) {
            this.b.w(this);
            MessagingResult messagingResult = MessagingResult.f;
            if (aczx.s()) {
                ajps d = MessagingResult.d();
                int i2 = 15;
                if (i != 9 && i != 1 && i != 4 && i != 11) {
                    i2 = 16;
                }
                d.c(i2);
                messagingResult = d.a();
            }
            SettableFuture settableFuture = this.a;
            ajyt f = MessagingOperationResult.f();
            f.h(messagingResult);
            f.e(this.d);
            f.g(this.c.h());
            settableFuture.set(f.d());
        }
    }

    @Override // defpackage.adqy
    public final void b(adqu adquVar) {
        if (this.e.equals(adquVar)) {
            this.b.w(this);
            SettableFuture settableFuture = this.a;
            ajyt f = MessagingOperationResult.f();
            f.h(MessagingResult.d);
            f.e(this.d);
            f.g(this.c.h());
            settableFuture.set(f.d());
        }
    }

    @Override // defpackage.adqy
    public final void c(adqu adquVar) {
        throw null;
    }

    public final ListenableFuture d() {
        this.b.t(this);
        try {
            adrh adrhVar = this.b;
            adqu adquVar = this.e;
            try {
                if (adquVar.a == adqt.DISPOSITION_NOTIFICATION) {
                    advr.w(2, 3, "Pager message queued with messageid=%s", adquVar.k);
                }
                adrhVar.q.put(adquVar);
            } catch (InterruptedException e) {
                throw new aild("Unable to queue message for sending", e);
            }
        } catch (aild e2) {
            this.a.setException(e2);
        }
        return this.a;
    }
}
