package defpackage;

import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcq extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;
    private final apyi f;

    public adcq(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4, apyi apyiVar5) {
        super(armfVar2, new apyv(adcq.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
        this.f = apys.c(apyiVar5);
    }

    /* JADX WARN: Type inference failed for: r12v9, types: [addv, java.lang.Object] */
    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        addz o;
        MessagingResult messagingResult;
        List list = (List) obj;
        SendMessageRequest sendMessageRequest = (SendMessageRequest) list.get(0);
        addi addiVar = (addi) list.get(1);
        addy addyVar = (addy) list.get(2);
        aday adayVar = (aday) list.get(3);
        addp addpVar = (addp) list.get(4);
        acyz acyzVar = adcp.a;
        String h = sendMessageRequest.c().h();
        Conversation b = sendMessageRequest.b();
        String c = addy.c(b);
        advr.c("Using session key for outgoing session: %s", advq.PHONE_NUMBER.c(c));
        synchronized (addyVar.a) {
            advr.c("Looking up session key: %s in  sessions: %s", advq.PHONE_NUMBER.c(c), ((addw) addyVar.c).values());
            adrc adrcVar = (adrc) ((addw) addyVar.c).get(c);
            atkv atkvVar = new atkv((byte[]) null);
            if (adrcVar == null) {
                adrcVar = addyVar.b.createOutgoingSession(adcx.y(b.a()));
                adrcVar.aG(new addx(addyVar, c, adrcVar));
                ((addw) addyVar.c).put(c, adrcVar);
                atkvVar.a = 1;
            } else {
                atkvVar.a = 2;
            }
            atkvVar.p(adrcVar);
            o = atkvVar.o();
        }
        adrc adrcVar2 = o.a;
        advr.l(adcp.c.b("produceSendSessionCreationalOneToOneMessage"), "created new or get existing outgoing session via session store with result: %s", o);
        adcn a = addpVar.a(sendMessageRequest.b(), sendMessageRequest.c(), sendMessageRequest.d(), adrcVar2);
        int i = o.b;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (aczx.s()) {
                        ajps d = MessagingResult.d();
                        d.c(16);
                        messagingResult = d.a();
                    } else {
                        messagingResult = MessagingResult.f;
                    }
                    ajyt f = MessagingOperationResult.f();
                    f.h(messagingResult);
                    f.g(sendMessageRequest.c().h());
                    f.e(sendMessageRequest.b());
                    return albo.bI(f.d());
                }
                advr.d(adcp.c, "Sending message [%s] in existing session [%s]", h, sendMessageRequest.b());
                if (aczr.n()) {
                    return a.r(addiVar.c(sendMessageRequest.b(), sendMessageRequest.c(), Optional.of(sendMessageRequest.d())));
                }
                return a.p(addiVar.a(sendMessageRequest.b(), sendMessageRequest.c(), sendMessageRequest.d()));
            }
            adrcVar2.aG(adayVar.a(adrcVar2));
            adqu a2 = addiVar.a(sendMessageRequest.b(), sendMessageRequest.c(), sendMessageRequest.d());
            if (adwf.v(adrcVar2.y())) {
                adrcVar2.bn();
            }
            if (((Boolean) aczx.a().b.y.a()).booleanValue()) {
                adrcVar2.aS(MessageClass.i(sendMessageRequest.d()));
            } else if (((Boolean) aczx.a().b.w.a()).booleanValue()) {
                adrcVar2.aT(MessageClass.i(sendMessageRequest.d()));
            }
            advr.d(adcp.c, "Sending message [%s] in new session [%s]", h, sendMessageRequest.b());
            a.b.aG(a);
            adrc adrcVar3 = a.b;
            adrcVar3.N = a2;
            adrcVar3.j();
            return a.a;
        }
        throw null;
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.f;
        apyi apyiVar2 = this.e;
        apyi apyiVar3 = this.d;
        return albo.bF(this.b.d(), this.c.d(), apyiVar3.d(), apyiVar2.d(), apyiVar.d());
    }
}
