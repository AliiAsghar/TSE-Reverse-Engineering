package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.AutoValue_Message;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbv extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;
    private final apyi f;
    private final apyi g;

    public adbv(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4, apyi apyiVar5, apyi apyiVar6) {
        super(armfVar2, new apyv(adbv.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
        this.f = apys.c(apyiVar5);
        this.g = apys.c(apyiVar6);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        adcc adccVar = (adcc) list.get(0);
        Conversation conversation = (Conversation) list.get(1);
        Context context = (Context) list.get(2);
        addi addiVar = (addi) list.get(3);
        adqg adqgVar = (adqg) list.get(4);
        TraceId traceId = (TraceId) list.get(5);
        Optional optional = adccVar.a;
        advp advpVar = adbs.a;
        try {
            Message d = addiVar.d(conversation, (adqu) optional.orElseThrow(new zhh(19)));
            if (adqgVar.f(traceId, conversation, d)) {
                Intent intent = new Intent("com.google.android.apps.messaging.shared.messaging.incoming_chat_message_action");
                intent.putExtra(RcsIntents.EXTRA_TRACE_ID, traceId.a());
                advr.d(adbs.a.b("produceIncomingMessageResult"), "sending an intent for incoming message: rcsMessageId{id:%s}", ((AutoValue_Message) d).a);
                advz.b(context, intent, "com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver", advy.RECEIVE_MESSAGE_PRODUCER_MODULE);
            }
            return albo.bI(Optional.of(d));
        } catch (IOException e) {
            throw new IllegalArgumentException("Error converting Instant message to Message", e);
        }
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.g;
        apyi apyiVar2 = this.f;
        apyi apyiVar3 = this.e;
        apyi apyiVar4 = this.d;
        return albo.bF(this.b.d(), this.c.d(), apyiVar4.d(), apyiVar3.d(), apyiVar2.d(), apyiVar.d());
    }
}
