package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.SendMessageResponse;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vzf implements vyx {
    public final RcsMessagingService a;
    public final xnv b;
    public final vzh c;
    public final vza d;
    private final pvy e;
    private final vzn f;
    private final ylg g;
    private final BiFunction h;
    private final anen i;
    private final anen j;
    private final qco k;
    private final vzj l;
    private final vyv m;

    public vzf(pvy pvyVar, RcsMessagingService rcsMessagingService, qco qcoVar, xnv xnvVar, vzn vznVar, vyv vyvVar, ylg ylgVar, BiFunction biFunction, anen anenVar, vzh vzhVar, vza vzaVar, vzj vzjVar, anen anenVar2) {
        this.e = pvyVar;
        this.a = rcsMessagingService;
        this.k = qcoVar;
        this.b = xnvVar;
        this.f = vznVar;
        this.m = vyvVar;
        this.g = ylgVar;
        this.h = biFunction;
        this.i = anenVar;
        this.c = vzhVar;
        this.d = vzaVar;
        this.j = anenVar2;
        this.l = vzjVar;
    }

    private final aozy n(qeg qegVar, aozb aozbVar) {
        aozy createBuilder = qgg.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qgg qggVar = (qgg) apagVar;
        qegVar.getClass();
        qggVar.c = qegVar;
        qggVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qgg qggVar2 = (qgg) createBuilder.b;
        aozbVar.getClass();
        qggVar2.b |= 2;
        qggVar2.d = aozbVar;
        apct j = aotl.j(this.b.f());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgg qggVar3 = (qgg) createBuilder.b;
        j.getClass();
        qggVar3.e = j;
        qggVar3.b |= 4;
        amgu d = this.m.d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgg qggVar4 = (qgg) createBuilder.b;
        d.getClass();
        qggVar4.h = d;
        qggVar4.b |= 32;
        return createBuilder;
    }

    @Override // defpackage.vyx
    public final /* bridge */ /* synthetic */ Intent a(Object obj) {
        qgf qgfVar = (qgf) obj;
        Intent putExtra = new Intent("com.google.android.apps.messaging.messaging_service_send_message_response").putExtra("messaging_service_send_message_response_extra", qgfVar.j.H());
        qgr qgrVar = qgfVar.l;
        if (qgrVar == null) {
            qgrVar = qgr.a;
        }
        return putExtra.putExtra(RcsIntents.EXTRA_TRACE_ID, qgrVar.c);
    }

    @Override // defpackage.vyx
    public final qeg b(Intent intent) {
        return wam.g(MessagingOperationResult.e(intent).a());
    }

    @Override // defpackage.vyx
    public final /* bridge */ /* synthetic */ akul c(Object obj) {
        return this.k.i((qgg) obj);
    }

    @Override // defpackage.vyx
    public final /* bridge */ /* synthetic */ akul d(Object obj) {
        akul ai;
        SendMessageRequest sendMessageRequest = (SendMessageRequest) obj;
        rve a = rve.a(sendMessageRequest.c().h());
        qgr qgrVar = (qgr) this.l.m().fu(sendMessageRequest.h());
        if (((Boolean) ((utz) vzh.a.get()).e()).booleanValue()) {
            this.c.g(qgrVar, a, 4, 15);
        }
        if (!this.a.isConnected()) {
            this.d.c(2);
            ai = this.g.a(this.h, RcsMessagingService.class).f(TimeoutException.class, new vek(this, 17), this.j).h(new way(this, Instant.ofEpochMilli(this.b.a()), sendMessageRequest, 1), this.i);
        } else {
            this.d.c(1);
            ai = aktp.ai(new vze(this, sendMessageRequest, 2), this.i);
        }
        return ai.h(new tul((Object) this, (Object) qgrVar, a, 20), this.j);
    }

    @Override // defpackage.vyx
    public final aozb e(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_send_message_response_extra");
        if (byteArrayExtra != null) {
            return aozb.w(byteArrayExtra);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.vyx
    public final /* synthetic */ aozb f(Object obj) {
        return ((qgf) obj).j;
    }

    @Override // defpackage.vyx
    public final Optional g(Intent intent) {
        return vyi.c(intent);
    }

    @Override // defpackage.vyx
    public final /* bridge */ /* synthetic */ Object h(qeg qegVar, aozb aozbVar) {
        return (qgg) n(qegVar, aozbVar).s();
    }

    @Override // defpackage.vyx
    public final /* bridge */ /* synthetic */ Object i(Object obj, aozb aozbVar) {
        SendMessageResponse sendMessageResponse = (SendMessageResponse) obj;
        aozy n = n(wam.g(sendMessageResponse.a()), aozbVar);
        if (aczx.s()) {
            qga h = wam.h(sendMessageResponse.a());
            if (!n.b.isMutable()) {
                n.u();
            }
            qgg qggVar = (qgg) n.b;
            qgg qggVar2 = qgg.a;
            h.getClass();
            qggVar.g = h;
            qggVar.b |= 16;
        }
        return (qgg) n.s();
    }

    @Override // defpackage.vyx
    public final /* bridge */ /* synthetic */ Object j(qeg qegVar, Intent intent, aozb aozbVar) {
        MessagingOperationResult e = MessagingOperationResult.e(intent);
        aozy n = n(qegVar, aozbVar);
        boolean d = e.d();
        if (!n.b.isMutable()) {
            n.u();
        }
        qgg qggVar = (qgg) n.b;
        qgg qggVar2 = qgg.a;
        qggVar.b |= 8;
        qggVar.f = d;
        if (aczx.s()) {
            qga h = wam.h(e.a());
            if (!n.b.isMutable()) {
                n.u();
            }
            qgg qggVar3 = (qgg) n.b;
            h.getClass();
            qggVar3.g = h;
            qggVar3.b |= 16;
        }
        return (qgg) n.s();
    }

    @Override // defpackage.vyx
    public final /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        qgf qgfVar = (qgf) obj;
        qeh qehVar = qeh.GROUP;
        qei qeiVar = qgfVar.d;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        qeh b = qeh.b(qeiVar.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        boolean equals = qehVar.equals(b);
        int i = 1;
        if (true == equals) {
            i = 2;
        }
        atkm atkmVar = new atkm();
        qei qeiVar2 = qgfVar.d;
        if (qeiVar2 == null) {
            qeiVar2 = qei.a;
        }
        atkmVar.b(vyv.c(qeiVar2));
        atkmVar.c(qgfVar.g);
        atkmVar.d(i);
        Conversation a = atkmVar.a();
        ajqn i2 = Message.i();
        i2.f(qgfVar.f);
        qei qeiVar3 = qgfVar.c;
        if (qeiVar3 == null) {
            qeiVar3 = qei.a;
        }
        i2.i(vyv.c(qeiVar3));
        pvy pvyVar = this.e;
        qej qejVar = qgfVar.i;
        if (qejVar == null) {
            qejVar = qej.a;
        }
        i2.b(ajki.i((ChatMessage) pvyVar.fu(qejVar)));
        apwq apwqVar = qgfVar.h;
        if (apwqVar == null) {
            apwqVar = apwq.a;
        }
        alob alobVar = new alob();
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(apwqVar.b).entrySet()) {
            for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((apws) entry.getValue()).b).entrySet()) {
                arbj arbjVar = new arbj();
                arbjVar.r((String) entry.getKey());
                arbjVar.q((String) entry2.getKey());
                arbjVar.s((String) entry2.getValue());
                alobVar.h(arbjVar.p());
            }
        }
        i2.e(alobVar.g());
        qeh qehVar2 = qeh.UNKNOWN_TYPE;
        qei qeiVar4 = qgfVar.e;
        if (qeiVar4 == null) {
            qeiVar4 = qei.a;
        }
        qeh b2 = qeh.b(qeiVar4.c);
        if (b2 == null) {
            b2 = qehVar2;
        }
        if (!qehVar2.equals(b2)) {
            qei qeiVar5 = qgfVar.e;
            if (qeiVar5 == null) {
                qeiVar5 = qei.a;
            }
            i2.h(vyv.c(qeiVar5));
        }
        anzh j = SendMessageRequest.j();
        j.j(a);
        j.l(i2.a());
        vzn vznVar = this.f;
        qft qftVar = qgfVar.k;
        if (qftVar == null) {
            qftVar = qft.a;
        }
        j.m((MessageClass) vznVar.fu(qftVar));
        vzj vzjVar = this.l;
        qgr qgrVar = qgfVar.l;
        if (qgrVar == null) {
            qgrVar = qgr.a;
        }
        j.p((TraceId) vzjVar.fu(qgrVar));
        j.k(pendingIntent);
        if (((Boolean) vyw.b.e()).booleanValue()) {
            j.o(qgfVar.j);
        }
        return j.i();
    }

    @Override // defpackage.vyx
    public final /* bridge */ /* synthetic */ String l(Object obj) {
        return "RcsMessageId: ".concat(String.valueOf(((qgf) obj).f));
    }

    @Override // defpackage.vyx
    public final String m() {
        return "sendMessage";
    }
}
