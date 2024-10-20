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
public final class adbu extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;
    private final apyi f;
    private final apyi g;

    public adbu(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4, apyi apyiVar5, apyi apyiVar6) {
        super(armfVar2, new apyv(adbu.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
        this.f = apys.c(apyiVar5);
        this.g = apys.c(apyiVar6);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        Optional of;
        List list = (List) obj;
        adcc adccVar = (adcc) list.get(0);
        Context context = (Context) list.get(1);
        Optional optional = (Optional) list.get(2);
        adqg adqgVar = (adqg) list.get(3);
        addi addiVar = (addi) list.get(4);
        TraceId traceId = (TraceId) list.get(5);
        Optional optional2 = adccVar.b;
        advp advpVar = adbs.a;
        if (optional2.isEmpty()) {
            of = Optional.empty();
        } else if (optional.isPresent()) {
            of = Optional.empty();
        } else {
            adqu adquVar = ((adrc) adccVar.b.get()).N;
            if (adquVar == null) {
                of = Optional.empty();
            } else {
                Conversation w = adcx.w((adrc) adccVar.b.get());
                try {
                    Message d = addiVar.d(w, adquVar);
                    if (adqgVar.f(traceId, w, d)) {
                        Intent intent = new Intent("com.google.android.apps.messaging.shared.messaging.incoming_chat_message_action");
                        intent.putExtra(RcsIntents.EXTRA_TRACE_ID, traceId.a());
                        advr.d(adbs.a.b("produceHandleInitialMessageResult"), "sending an intent for initial incoming message: rcsMessageId{id:%s}", ((AutoValue_Message) d).a);
                        advz.b(context, intent, "com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver", advy.RECEIVE_MESSAGE_PRODUCER_MODULE);
                    }
                    of = Optional.of(d);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Error converting InstantMessage to Message", e);
                }
            }
        }
        return albo.bI(of);
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
