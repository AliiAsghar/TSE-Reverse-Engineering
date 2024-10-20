package defpackage;

import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcv extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;

    public adcv(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4) {
        super(armfVar2, new apyv(adcv.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
    }

    @Override // defpackage.apyn
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        SendMessageRequest sendMessageRequest = (SendMessageRequest) obj;
        acyz acyzVar = adcp.a;
        if (aczf.F() && ajqw.MESSAGING_METHOD_SLM.equals(sendMessageRequest.g())) {
            apyi apyiVar = this.e;
            advr.l(adcp.c, "sending SLM Message, messageId: %s", sendMessageRequest.c().h());
            return apyiVar.d();
        }
        if (MessageClass.h(sendMessageRequest.d())) {
            apyi apyiVar2 = this.c;
            advr.l(adcp.c, "sending 1:1 message in new session, messageId: %s, sessionId: %s", sendMessageRequest.c().h(), sendMessageRequest.b().b());
            return apyiVar2.d();
        }
        apyi apyiVar3 = this.d;
        advr.l(adcp.c, "sending 1:1 message in existing session, messageId: %s, sessionId: %s", sendMessageRequest.c().h(), sendMessageRequest.b().b());
        return apyiVar3.d();
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
