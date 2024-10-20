package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbn extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;
    private final apyi f;
    private final apyi g;
    private final apyi h;
    private final apyi i;

    public adbn(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4, apyi apyiVar5, apyi apyiVar6, apyi apyiVar7, apyi apyiVar8) {
        super(armfVar2, new apyv(adbn.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
        this.f = apys.c(apyiVar5);
        this.g = apys.c(apyiVar6);
        this.h = apys.c(apyiVar7);
        this.i = apys.c(apyiVar8);
    }

    @Override // defpackage.apyn
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        Context context = (Context) list.get(0);
        Conversation conversation = (Conversation) list.get(1);
        apyh apyhVar = (apyh) list.get(2);
        Optional optional = (Optional) list.get(3);
        Optional optional2 = (Optional) list.get(4);
        adqg adqgVar = (adqg) list.get(5);
        apyh apyhVar2 = (apyh) list.get(6);
        TraceId traceId = (TraceId) list.get(7);
        adcx.e(apyhVar);
        if (optional2.isPresent()) {
            optional = Optional.empty();
        } else if (!optional.isEmpty()) {
            if (((Boolean) adbf.b.a()).booleanValue()) {
                adcx.e(apyhVar2);
            } else if (adqgVar.f(traceId, conversation, (Message) optional.get())) {
                Intent intent = new Intent("com.google.android.apps.messaging.shared.messaging.incoming_chat_message_action");
                intent.putExtra(RcsIntents.EXTRA_TRACE_ID, traceId.a());
                advz.b(context, intent, "com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver", advy.RECEIVE_MESSAGE_PRODUCER_MODULE2);
            }
        }
        return albo.bI(optional);
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.d;
        apyi apyiVar2 = this.c;
        ListenableFuture d = this.b.d();
        ListenableFuture d2 = apyiVar2.d();
        ListenableFuture a = apys.a(apyiVar.d());
        apyi apyiVar3 = this.h;
        apyi apyiVar4 = this.g;
        return albo.bF(d, d2, a, this.e.d(), this.f.d(), apyiVar4.d(), apys.a(apyiVar3.d()), this.i.d());
    }
}
