package defpackage;

import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adct extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;

    public adct(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4) {
        super(armfVar2, new apyv(adct.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        MessagingResult a;
        List list = (List) obj;
        SendMessageRequest sendMessageRequest = (SendMessageRequest) list.get(0);
        addt addtVar = (addt) list.get(1);
        addi addiVar = (addi) list.get(2);
        addp addpVar = (addp) list.get(3);
        Optional optional = addtVar.a;
        acyz acyzVar = adcp.a;
        if (optional.isPresent()) {
            Object obj2 = addtVar.a.get();
            adqu a2 = addiVar.a(sendMessageRequest.b(), sendMessageRequest.c(), sendMessageRequest.d());
            advr.l(adcp.c, "send message in group session, messageId: %s, sessionId: %s", sendMessageRequest.c().h(), sendMessageRequest.b().b());
            return addpVar.a(sendMessageRequest.b(), sendMessageRequest.c(), sendMessageRequest.d(), (adrc) obj2).p(a2);
        }
        if (!MessageClass.g(sendMessageRequest.d())) {
            if (aczx.s()) {
                ajps d = MessagingResult.d();
                d.c(16);
                d.b(6);
                a = d.a();
            } else {
                ajps d2 = MessagingResult.d();
                d2.c(15);
                d2.b(0);
                a = d2.a();
            }
            ajyt f = MessagingOperationResult.f();
            f.e(sendMessageRequest.b());
            f.f(false);
            f.g(sendMessageRequest.c().h());
            f.h(a);
            return albo.bI(f.d());
        }
        ajyt f2 = MessagingOperationResult.f();
        f2.e(sendMessageRequest.b());
        f2.g(sendMessageRequest.c().h());
        f2.h(adcx.v(addtVar));
        return albo.bI(f2.d());
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.e;
        apyi apyiVar2 = this.d;
        return albo.bF(this.b.d(), this.c.d(), apyiVar2.d(), apyiVar.d());
    }
}
