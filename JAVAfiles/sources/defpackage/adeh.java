package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.SendMessageRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adeh implements andy {
    public final alwo a = alwo.o(advo.a);
    private final SendMessageRequest b;
    private final Context c;
    private final armf d;
    private final anen e;
    private final acof f;
    private final ajtk g;
    private final addk h;
    private final ajtj i;
    private final aniz j;

    public adeh(SendMessageRequest sendMessageRequest, Context context, ajtk ajtkVar, aniz anizVar, armf armfVar, anen anenVar, acof acofVar, addk addkVar, ajtj ajtjVar) {
        this.b = sendMessageRequest;
        this.c = context;
        this.g = ajtkVar;
        this.j = anizVar;
        this.d = armfVar;
        this.e = anenVar;
        this.f = acofVar;
        this.h = addkVar;
        this.i = ajtjVar;
    }

    private final void c(MessagingOperationResult messagingOperationResult) {
        wcq b;
        if (this.b.i().isPresent()) {
            aozy createBuilder = wdp.a.createBuilder();
            wbk wbkVar = (wbk) this.g.m().fu(this.b.b());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdp wdpVar = (wdp) createBuilder.b;
            wbkVar.getClass();
            wdpVar.g = wbkVar;
            wdpVar.b |= 16;
            if (this.b.g().equals(ajqw.MESSAGING_METHOD_SLM)) {
                b = aniz.a(messagingOperationResult.a());
            } else {
                b = aniz.b(messagingOperationResult.a());
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdp wdpVar2 = (wdp) createBuilder.b;
            b.getClass();
            wdpVar2.e = b;
            wdpVar2.b |= 4;
            aozy createBuilder2 = wda.a.createBuilder();
            String h = this.b.c().h();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            wda wdaVar = (wda) createBuilder2.b;
            wdaVar.b |= 1;
            wdaVar.c = h;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdp wdpVar3 = (wdp) createBuilder.b;
            wda wdaVar2 = (wda) createBuilder2.s();
            wdaVar2.getClass();
            wdpVar3.f = wdaVar2;
            wdpVar3.b |= 8;
            boolean d = messagingOperationResult.d();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdp wdpVar4 = (wdp) createBuilder.b;
            wdpVar4.b |= 32;
            wdpVar4.h = d;
            aozy createBuilder3 = wdu.a.createBuilder();
            String a = this.b.h().a();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            wdu wduVar = (wdu) createBuilder3.b;
            wduVar.b |= 1;
            wduVar.c = a;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdp wdpVar5 = (wdp) createBuilder.b;
            wdu wduVar2 = (wdu) createBuilder3.s();
            wduVar2.getClass();
            wdpVar5.d = wduVar2;
            wdpVar5.b |= 2;
            aozy createBuilder4 = aoyo.a.createBuilder();
            Object obj = this.b.i().get();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            ((aoyo) createBuilder4.b).b = (aozb) obj;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdp wdpVar6 = (wdp) createBuilder.b;
            aoyo aoyoVar = (aoyo) createBuilder4.s();
            aoyoVar.getClass();
            wdpVar6.c = aoyoVar;
            wdpVar6.b |= 1;
            wco wcoVar = (wco) this.i.m().fu(this.b.g());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdp wdpVar7 = (wdp) createBuilder.b;
            wdpVar7.i = wcoVar.d;
            wdpVar7.b |= 64;
            wdp wdpVar8 = (wdp) createBuilder.s();
            wcf wcfVar = (wcf) this.d.b();
            albo.bR(arlj.a(wcfVar.a.a(wch.h(), wcfVar.b), wdpVar8), new vbr(this, wdpVar8, 7, null), this.e);
            return;
        }
        d(messagingOperationResult);
    }

    private final void d(MessagingOperationResult messagingOperationResult) {
        Intent intent = new Intent();
        try {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.containsKey("MESSAGING_OPERATION_RESULT")) {
                throw new IllegalArgumentException("Intent extra already contains MESSAGING_OPERATION_RESULT key");
            }
            Parcel obtain = Parcel.obtain();
            messagingOperationResult.writeToParcel(obtain, 0);
            intent.putExtra("MESSAGING_OPERATION_RESULT", obtain.marshall());
            obtain.recycle();
            adtw.c(this.c, intent);
            this.b.a().send(this.c, messagingOperationResult.a().b(), intent);
        } catch (PendingIntent.CanceledException e) {
            ((alwl) ((alwl) ((alwl) this.a.i()).g(e)).h("com/google/android/ims/messaging/v2/SendMessageOperationResultProcessor", "sendIntent", 151, "SendMessageOperationResultProcessor.java")).t("[%s] Callback intent canceled", messagingOperationResult.c());
        }
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        ((alwl) ((alwl) ((alwl) this.a.i()).g(th)).h("com/google/android/ims/messaging/v2/SendMessageOperationResultProcessor", "onFailure", 93, "SendMessageOperationResultProcessor.java")).D("[%s] Messaging operation failed: %s", this.b.c().h(), th.getMessage());
        ajps d = MessagingResult.d();
        d.c(16);
        d.b(7);
        MessagingResult a = d.a();
        ajyt f = MessagingOperationResult.f();
        f.e(this.b.b());
        f.g(this.b.c().h());
        f.h(a);
        f.f(false);
        c(f.d());
        if (((Boolean) acof.b.a()).booleanValue()) {
            this.f.d((atok) this.h.fu(this.b.h()), this.b.c().h());
        }
    }

    @Override // defpackage.andy
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        MessagingOperationResult messagingOperationResult = (MessagingOperationResult) obj;
        messagingOperationResult.getClass();
        String c = messagingOperationResult.c();
        ((alwl) ((alwl) this.a.g()).h("com/google/android/ims/messaging/v2/SendMessageOperationResultProcessor", "onSuccess", 80, "SendMessageOperationResultProcessor.java")).D("[%s] Messaging operation completed, %s", c, messagingOperationResult.a().e());
        c(messagingOperationResult);
        if (((Boolean) acof.b.a()).booleanValue()) {
            this.f.e((atok) this.h.fu(this.b.h()), c);
        }
    }
}
