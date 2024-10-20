package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.rcsservice.ims.ImsEvent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcn extends adqp {
    public final SettableFuture a = SettableFuture.create();
    public final adrc b;
    private final Conversation c;
    private final Message d;
    private final MessageClass e;
    private final adpk f;
    private final Context g;
    private final addj h;

    public adcn(Context context, addj addjVar, Conversation conversation, Message message, MessageClass messageClass, adrc adrcVar) {
        this.c = conversation;
        this.d = message;
        this.e = messageClass;
        this.b = adrcVar;
        this.g = context;
        this.h = addjVar;
        this.f = adrcVar.a;
    }

    @Override // defpackage.adqp, defpackage.adqy
    public final void a(adqu adquVar, int i) {
        MessagingResult u;
        this.b.aP(this);
        if (aczx.s()) {
            u = this.h.apply(this.b.S);
        } else if (!adpk.INITIAL.equals(this.f)) {
            u = MessagingResult.g;
        } else {
            aijw aijwVar = this.b.l;
            if (aijwVar == null) {
                u = MessagingResult.g;
            } else {
                aioo aiooVar = aijwVar.q;
                if (aiooVar == null) {
                    advr.r(adcp.c, "SIP response missing from SipDialogPath for message [%s]", this.d.h());
                    u = MessagingResult.g;
                } else if (aiooVar.y() < 400) {
                    u = MessagingResult.g;
                } else {
                    u = adcx.u(aiooVar.y());
                }
            }
        }
        SettableFuture settableFuture = this.a;
        ajyt f = MessagingOperationResult.f();
        f.h(u);
        f.e(this.c);
        f.g(this.d.h());
        settableFuture.set(f.d());
    }

    @Override // defpackage.adqp, defpackage.adqy
    public final void b(adqu adquVar) {
        this.b.aP(this);
        ajyt f = MessagingOperationResult.f();
        f.h(MessagingResult.d);
        f.e(this.c);
        f.g(this.d.h());
        f.f(false);
        this.a.set(f.d());
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void g(int i, String str) {
        if (i == 404) {
            adrc adrcVar = this.b;
            if (!adrcVar.F) {
                anjs anjsVar = new anjs((char[]) null, (byte[]) null);
                anjsVar.a = 30014;
                anjsVar.e = adrcVar.z();
                ImsEvent i2 = anjsVar.i();
                Intent intent = new Intent(RcsIntents.ACTION_NEW_EVENT);
                intent.putExtra(RcsIntents.EXTRA_EVENT, i2);
                advz.a(this.g, intent, advy.SEND_MESSAGE_PRODUCER_MODULE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ListenableFuture p(adqu adquVar) {
        this.b.aG(this);
        try {
            this.b.aQ(adquVar);
            return this.a;
        } catch (adqx e) {
            this.b.aP(this);
            this.a.setException(e);
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, acyz] */
    public final ListenableFuture r(ajpz ajpzVar) {
        boolean z;
        aibf aibfVar;
        Object obj;
        ListenableFuture bI;
        this.b.aG(this);
        try {
            if (this.e.b() == ajqt.USER) {
                z = true;
            } else {
                z = false;
            }
            aibfVar = new aibf();
            aibfVar.f(true);
            aibfVar.c = ajpzVar;
            aibfVar.f(z);
        } catch (InterruptedException unused) {
            advr.r(adcp.c, "[%s] Interrupted while waiting for message send", this.d.h());
        } catch (ExecutionException e) {
            this.b.aP(this);
            this.a.setException(e);
        }
        if (aibfVar.b == 1 && (obj = aibfVar.c) != null) {
            adrr adrrVar = new adrr(aibfVar.a, (ajpz) obj);
            adrc adrcVar = this.b;
            if (!adrcVar.bb()) {
                advr.h(adrc.C, "Unable to send message: %s, %d", adrcVar.a.toString(), Integer.valueOf(adrcVar.n));
                bI = albo.bH(new adqx());
            } else {
                ajpz ajpzVar2 = adrrVar.b;
                asmg asmgVar = new asmg(ajpzVar2);
                Optional optional = ((adfq) adrcVar.T).b().g;
                if (aczr.n() && optional.isPresent()) {
                    String str = "NS" + ((int) (Math.random() * 100.0d));
                    asmgVar.z(str, (String) aczr.a().a.d.a());
                    asmgVar.y(str, "P-Access-Network-Info", (String) optional.get());
                }
                String str2 = ((ajqb) ajpzVar2.c("Message-ID").get()).c;
                adqu adquVar = new adqu(adqt.CPIM_MESSAGE);
                adquVar.b = adrcVar.y();
                adquVar.c = adrcVar.l.g;
                adquVar.k = str2;
                adquVar.f("message/cpim", asmgVar.u());
                adquVar.r = adrrVar.a;
                advr.w(13, 3, "Queueing message for sending %s with messageid=%s", adquVar, adquVar.k);
                adrcVar.L.add(adquVar);
                bI = albo.bI(new adrs(Optional.empty()));
            }
            bI.get();
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        if (aibfVar.b == 0) {
            sb.append(" requiresFailureReport");
        }
        if (aibfVar.c == null) {
            sb.append(" message");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
