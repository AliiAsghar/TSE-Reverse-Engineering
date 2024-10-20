package defpackage;

import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcu extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;

    public adcu(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3) {
        super(armfVar2, new apyv(adcu.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
    }

    @Override // defpackage.apyn
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        SendMessageRequest sendMessageRequest = (SendMessageRequest) obj;
        acyz acyzVar = adcp.a;
        if (sendMessageRequest.b().c() == 2) {
            ListenableFuture d = this.d.d();
            advr.l(adcp.c, "sending message in group conversation, messageId: %s, conversationId: %s", sendMessageRequest.c().h(), sendMessageRequest.b().b());
            return d;
        }
        ListenableFuture d2 = this.c.d();
        advr.l(adcp.c, "sending message in 1:1 conversation, messageId: %s, conversationId: %s", sendMessageRequest.c().h(), sendMessageRequest.b().b());
        return d2;
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
