package defpackage;

import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcs extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;
    private final apyi f;

    public adcs(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4, apyi apyiVar5) {
        super(armfVar2, new apyv(adcs.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
        this.f = apys.c(apyiVar5);
    }

    @Override // defpackage.apyn
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        adrh adrhVar;
        List list = (List) obj;
        SendMessageRequest sendMessageRequest = (SendMessageRequest) list.get(0);
        addi addiVar = (addi) list.get(1);
        adov adovVar = (adov) list.get(2);
        addv addvVar = (addv) list.get(3);
        adaw adawVar = (adaw) list.get(4);
        acyz acyzVar = adcp.a;
        Message c = sendMessageRequest.c();
        Conversation b = sendMessageRequest.b();
        MessageClass d = sendMessageRequest.d();
        if (((Boolean) adcp.b.a()).booleanValue()) {
            adrhVar = adcp.a(adovVar);
        } else {
            adrhVar = (adrh) adovVar.a(adrh.class);
            adrhVar.getClass();
        }
        adqu b2 = addiVar.b(b, c, Optional.of(d), sendMessageRequest.g());
        aifc aifcVar = b2.g;
        aifcVar.getClass();
        int i = adrhVar.s.mSwitchoverSize;
        if (aifcVar.a() <= i) {
            advr.d(adcp.c, "Sending SLM message [%s] in pager mode as message content is %s bytes, less than switchOverSize of %s bytes", c.h(), Long.valueOf(aifcVar.a()), Integer.valueOf(i));
            return new adco(adrhVar, b, c, b2).d();
        }
        advr.d(adcp.c, "Sending SLM message [%s] in new SLM session [%s]", c.h(), b);
        return adawVar.a(b, b2, addvVar.createOutgoingSlmSession(adcx.y(b.a()))).p(b2);
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.f;
        apyi apyiVar2 = this.e;
        apyi apyiVar3 = this.d;
        return albo.bF(this.b.d(), this.c.d(), apyiVar3.d(), apyiVar2.d(), apyiVar.d());
    }
}
