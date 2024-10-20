package defpackage;

import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adeg implements andy {
    public static final advp a = new advp("SendFileOverMsrpOperationResultProcessor");
    private final ajpw b;
    private final armf c;
    private final anen d;
    private final acof e;
    private final ajtk f;
    private final addk g;

    public adeg(ajpw ajpwVar, ajtk ajtkVar, armf armfVar, anen anenVar, acof acofVar, addk addkVar) {
        this.b = ajpwVar;
        this.f = ajtkVar;
        this.c = armfVar;
        this.d = anenVar;
        this.e = acofVar;
        this.g = addkVar;
    }

    private final void c(MessagingOperationResult messagingOperationResult) {
        if (!this.b.d.G()) {
            aozy createBuilder = wdl.a.createBuilder();
            wbk wbkVar = (wbk) this.f.m().fu(this.b.a);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdl wdlVar = (wdl) createBuilder.b;
            wbkVar.getClass();
            wdlVar.g = wbkVar;
            wdlVar.b |= 16;
            wcq a2 = aniz.a(messagingOperationResult.a());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdl wdlVar2 = (wdl) createBuilder.b;
            a2.getClass();
            wdlVar2.e = a2;
            wdlVar2.b |= 4;
            aozy createBuilder2 = wda.a.createBuilder();
            ajpw ajpwVar = this.b;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ajqg ajqgVar = ajpwVar.b;
            wda wdaVar = (wda) createBuilder2.b;
            String str = ajqgVar.a;
            str.getClass();
            wdaVar.b |= 1;
            wdaVar.c = str;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdl wdlVar3 = (wdl) createBuilder.b;
            wda wdaVar2 = (wda) createBuilder2.s();
            wdaVar2.getClass();
            wdlVar3.f = wdaVar2;
            wdlVar3.b |= 8;
            aozy createBuilder3 = wdu.a.createBuilder();
            String a3 = this.b.c.a();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            wdu wduVar = (wdu) createBuilder3.b;
            wduVar.b |= 1;
            wduVar.c = a3;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdl wdlVar4 = (wdl) createBuilder.b;
            wdu wduVar2 = (wdu) createBuilder3.s();
            wduVar2.getClass();
            wdlVar4.d = wduVar2;
            wdlVar4.b |= 2;
            aozy createBuilder4 = aoyo.a.createBuilder();
            ajpw ajpwVar2 = this.b;
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            aozb aozbVar = ajpwVar2.d;
            aoyo aoyoVar = (aoyo) createBuilder4.b;
            aozbVar.getClass();
            aoyoVar.b = aozbVar;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdl wdlVar5 = (wdl) createBuilder.b;
            aoyo aoyoVar2 = (aoyo) createBuilder4.s();
            aoyoVar2.getClass();
            wdlVar5.c = aoyoVar2;
            wdlVar5.b |= 1;
            wdl wdlVar6 = (wdl) createBuilder.s();
            wcf wcfVar = (wcf) this.c.b();
            albo.bR(arlj.a(wcfVar.a.a(wch.g(), wcfVar.b), wdlVar6), new adnx(wdlVar6, 1), this.d);
            return;
        }
        throw new IllegalStateException("opaqueData is not present");
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        advr.j(th, a, "[%s] Messaging operation failed: %s", this.b.b.a, th.getMessage());
        ajps d = MessagingResult.d();
        d.c(16);
        d.b(7);
        MessagingResult a2 = d.a();
        ajpw ajpwVar = this.b;
        ajyt f = MessagingOperationResult.f();
        f.e(ajpwVar.a);
        f.g(this.b.b.a);
        f.h(a2);
        f.f(false);
        c(f.d());
        if (((Boolean) acof.b.a()).booleanValue()) {
            this.e.d((atok) this.g.fu(this.b.c), this.b.b.a);
        }
    }

    @Override // defpackage.andy
    public final /* synthetic */ void b(Object obj) {
        MessagingOperationResult messagingOperationResult = (MessagingOperationResult) obj;
        messagingOperationResult.getClass();
        String c = messagingOperationResult.c();
        advr.l(a, "[%s] Messaging operation completed, %s", c, messagingOperationResult.a().e());
        c(messagingOperationResult);
        if (((Boolean) acof.b.a()).booleanValue()) {
            this.e.e((atok) this.g.fu(this.b.c), c);
        }
    }
}
