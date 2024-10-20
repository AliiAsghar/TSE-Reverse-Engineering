package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vyu extends wcg {
    public static final alwo a = alwo.p();
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final anen k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final vzt o;
    public final vzo p;

    public vyu(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, vzt vztVar, vzo vzoVar, armf armfVar10, armf armfVar11, armf armfVar12, anen anenVar) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = armfVar6;
        this.h = armfVar7;
        this.i = armfVar8;
        this.j = armfVar9;
        this.o = vztVar;
        this.p = vzoVar;
        this.l = armfVar10;
        this.m = armfVar11;
        this.n = armfVar12;
        this.k = anenVar;
    }

    public static StatusException b(IllegalArgumentException illegalArgumentException) {
        return Status.e.d(illegalArgumentException).withDescription((String) Optional.ofNullable(illegalArgumentException.getMessage()).orElse("")).asException();
    }

    private final void m(String str, arlq arlqVar, Supplier supplier) {
        Object obj;
        try {
            obj = supplier.get();
            qiu.h(((akul) obj).h(new vuu(arlqVar, 17), this.k).e(IllegalArgumentException.class, new vqv(str, arlqVar, 5), this.k).e(Throwable.class, new vqv(str, arlqVar, 6), this.k));
        } catch (IllegalArgumentException e) {
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/apps/messaging/shared/rcs/messaging/MessagingEngineNotificationServerImpl", "processRequestAsync", 295, "MessagingEngineNotificationServerImpl.java")).t("[%s] Ignoring invalid data", str);
            arlqVar.b(b(e));
        } catch (Throwable th) {
            ((alwl) ((alwl) ((alwl) a.i()).g(th)).h("com/google/android/apps/messaging/shared/rcs/messaging/MessagingEngineNotificationServerImpl", "processRequestAsync", 298, "MessagingEngineNotificationServerImpl.java")).t("[%s] Error while processing request", str);
            arlqVar.b(th);
        }
    }

    @Override // defpackage.wcg
    public final void c(wbe wbeVar, arlq arlqVar) {
        m("addUserToGroup", arlqVar, new udz(this, wbeVar, 7));
    }

    @Override // defpackage.wcg
    public final void d(wbl wblVar, arlq arlqVar) {
        m("createGroup", arlqVar, new udz(this, wblVar, 9));
    }

    @Override // defpackage.wcg
    public final void e(wct wctVar, arlq arlqVar) {
        m("receiveGroupNotification", arlqVar, new udz(this, wctVar, 4));
    }

    @Override // defpackage.wcg
    public final void f(wcv wcvVar, arlq arlqVar) {
        m("receiveMessageNotification", arlqVar, new udz(this, wcvVar, 12));
    }

    @Override // defpackage.wcg
    public final void g(wdb wdbVar, arlq arlqVar) {
        m("removeUserFromGroup", arlqVar, new udz(this, wdbVar, 10));
    }

    @Override // defpackage.wcg
    public final void h(wdh wdhVar, arlq arlqVar) {
        m("revokeMessage", arlqVar, new udz(this, wdhVar, 5));
    }

    @Override // defpackage.wcg
    public final void i(wdl wdlVar, arlq arlqVar) {
        m("sendSlmFile", arlqVar, new udz(this, wdlVar, 3));
    }

    @Override // defpackage.wcg
    public final void j(wdp wdpVar, arlq arlqVar) {
        m("sendMessage", arlqVar, new udz(this, wdpVar, 6));
    }

    @Override // defpackage.wcg
    public final void k(wdv wdvVar, arlq arlqVar) {
        m("triggerGroupNotification", arlqVar, new udz(this, wdvVar, 8));
    }

    @Override // defpackage.wcg
    public final void l(wdz wdzVar, arlq arlqVar) {
        m("updateGroup", arlqVar, new udz(this, wdzVar, 11));
    }
}
