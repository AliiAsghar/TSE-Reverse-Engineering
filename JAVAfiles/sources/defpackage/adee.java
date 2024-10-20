package defpackage;

import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adee extends wck {
    private static final alwo a = alwo.o(advo.a);
    private final anen b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final adei k;
    private final adec l;
    private final adea m;
    private final adef n;
    private final adek o;
    private final adej p;
    private final afxz q;

    public adee(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, adei adeiVar, afxz afxzVar, adec adecVar, adea adeaVar, adef adefVar, adek adekVar, adej adejVar, anen anenVar, armf armfVar8) {
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
        this.j = armfVar7;
        this.k = adeiVar;
        this.q = afxzVar;
        this.l = adecVar;
        this.m = adeaVar;
        this.n = adefVar;
        this.o = adekVar;
        this.p = adejVar;
        this.b = anenVar;
        this.c = armfVar8;
    }

    private static StatusException j(RuntimeException runtimeException) {
        return Status.e.d(runtimeException).withDescription((String) Optional.ofNullable(runtimeException.getMessage()).orElse("")).asException();
    }

    @Override // defpackage.wck
    public final void b(wbg wbgVar, arlq arlqVar) {
        wbk wbkVar = wbgVar.d;
        if (wbkVar == null) {
            wbkVar = wbk.a;
        }
        wcy wcyVar = wbkVar.e;
        if (wcyVar == null) {
            wcyVar = wcy.a;
        }
        String str = wcyVar.c;
        ((alwl) ((alwl) a.g()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "addUserToGroup", 227, "MessagingEngineServerImpl.java")).t("[%s] Adding user to group", str);
        try {
            AddUserToGroupRequest d = ((ajso) this.g.b()).apply(wbgVar);
            ListenableFuture a2 = ((adbb) this.c.b()).a(d);
            arlqVar.c(wbh.a);
            arlqVar.a();
            albo.bR(a2, this.m.a(d), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "addUserToGroup", 244, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "addUserToGroup");
            arlqVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "addUserToGroup", 244, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "addUserToGroup");
            arlqVar.b(j(e));
        } catch (Throwable th) {
            ((alwl) ((alwl) ((alwl) a.i()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "addUserToGroup", 248, "MessagingEngineServerImpl.java")).D("[%s] %s: Error while processing request", str, "addUserToGroup");
            arlqVar.b(th);
        }
    }

    @Override // defpackage.wck
    public final void c(wbn wbnVar, arlq arlqVar) {
        wcy wcyVar = wbnVar.d;
        if (wcyVar == null) {
            wcyVar = wcy.a;
        }
        String str = wcyVar.c;
        ((alwl) ((alwl) a.g()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "createGroup", 194, "MessagingEngineServerImpl.java")).B("[%s] Create group, number of participants: %s", str, wbnVar.f.size());
        try {
            CreateGroupRequest a2 = ((ajtl) this.f.b()).apply(wbnVar);
            ListenableFuture b = ((adbb) this.c.b()).b(a2);
            arlqVar.c(wbo.a);
            arlqVar.a();
            albo.bR(b, this.l.a(a2), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "createGroup", 212, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "createGroup");
            arlqVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "createGroup", 212, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "createGroup");
            arlqVar.b(j(e));
        } catch (Throwable th) {
            ((alwl) ((alwl) ((alwl) a.i()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "createGroup", 216, "MessagingEngineServerImpl.java")).D("[%s] %s:  Error while processing request", str, "createGroup");
            arlqVar.b(th);
        }
    }

    @Override // defpackage.wck
    public final void d(wdd wddVar, arlq arlqVar) {
        wbk wbkVar = wddVar.d;
        if (wbkVar == null) {
            wbkVar = wbk.a;
        }
        wcy wcyVar = wbkVar.e;
        if (wcyVar == null) {
            wcyVar = wcy.a;
        }
        String str = wcyVar.c;
        ((alwl) ((alwl) a.g()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "removeUserFromGroup", 260, "MessagingEngineServerImpl.java")).t("[%s] Removing user from group", str);
        try {
            RemoveUserFromGroupRequest a2 = ((ajtt) this.h.b()).apply(wddVar);
            ListenableFuture c = ((adbb) this.c.b()).c(a2);
            arlqVar.c(wde.a);
            arlqVar.a();
            albo.bR(c, this.n.a(a2), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "removeUserFromGroup", 277, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "removeUserFromGroup");
            arlqVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "removeUserFromGroup", 277, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "removeUserFromGroup");
            arlqVar.b(j(e));
        } catch (Throwable th) {
            ((alwl) ((alwl) ((alwl) a.i()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "removeUserFromGroup", 281, "MessagingEngineServerImpl.java")).D("[%s] %s: Error while processing request", str, "removeUserFromGroup");
            arlqVar.b(th);
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24, types: [armf, java.lang.Object] */
    @Override // defpackage.wck
    public final void e(wdn wdnVar, arlq arlqVar) {
        wbs wbsVar = wdnVar.f;
        if (wbsVar == null) {
            wbsVar = wbs.b;
        }
        wda wdaVar = wbsVar.d;
        if (wdaVar == null) {
            wdaVar = wda.a;
        }
        String str = wdaVar.c;
        wbk wbkVar = wdnVar.e;
        if (wbkVar == null) {
            wbkVar = wbk.a;
        }
        wcy wcyVar = wbkVar.e;
        if (wcyVar == null) {
            wcyVar = wcy.a;
        }
        String str2 = wcyVar.c;
        ((alwl) ((alwl) a.g()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendFile", 156, "MessagingEngineServerImpl.java")).D("[%s, %s] sendFile", str2, str);
        try {
            ajpw a2 = ((ajtu) this.e.b()).apply(wdnVar);
            adaq g = ((adbb) this.c.b()).g();
            g.b(a2);
            ListenableFuture d = g.a().l.d();
            arlqVar.c(wdo.a);
            arlqVar.a();
            afxz afxzVar = this.q;
            ajtk ajtkVar = (ajtk) afxzVar.a.b();
            albo.bR(d, new adeg(a2, ajtkVar, afxzVar.c, (anen) afxzVar.d.b(), (acof) afxzVar.f.b(), (addk) afxzVar.e.b()), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendFile", 173, "MessagingEngineServerImpl.java")).J("[%s, %s] %s: Ignoring invalid data", str2, str, "sendFile");
            arlqVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendFile", 173, "MessagingEngineServerImpl.java")).J("[%s, %s] %s: Ignoring invalid data", str2, str, "sendFile");
            arlqVar.b(j(e));
        } catch (Throwable th) {
            ((alwl) ((alwl) ((alwl) a.i()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendFile", 177, "MessagingEngineServerImpl.java")).J("[%s, %s] %s: Error while processing request", str2, str, "sendFile");
            arlqVar.b(th);
        }
    }

    @Override // defpackage.wck
    public final void f(wdr wdrVar, arlq arlqVar) {
        wca wcaVar = wdrVar.f;
        if (wcaVar == null) {
            wcaVar = wca.b;
        }
        wda wdaVar = wcaVar.d;
        if (wdaVar == null) {
            wdaVar = wda.a;
        }
        String str = wdaVar.c;
        wbk wbkVar = wdrVar.e;
        if (wbkVar == null) {
            wbkVar = wbk.a;
        }
        wcy wcyVar = wbkVar.e;
        if (wcyVar == null) {
            wcyVar = wcy.a;
        }
        String str2 = wcyVar.c;
        ((alwl) ((alwl) a.g()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendMessage", 123, "MessagingEngineServerImpl.java")).D("[%s, %s] sendMessage", str2, str);
        try {
            SendMessageRequest a2 = ((ajtv) this.d.b()).apply(wdrVar);
            ListenableFuture d = ((adbb) this.c.b()).d(a2);
            arlqVar.c(wds.a);
            arlqVar.a();
            albo.bR(d, this.k.a(a2), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendMessage", 140, "MessagingEngineServerImpl.java")).J("[%s, %s] %s: Ignoring invalid data", str2, str, "sendMessage");
            arlqVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendMessage", 140, "MessagingEngineServerImpl.java")).J("[%s, %s] %s: Ignoring invalid data", str2, str, "sendMessage");
            arlqVar.b(j(e));
        } catch (Throwable th) {
            ((alwl) ((alwl) ((alwl) a.i()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendMessage", 144, "MessagingEngineServerImpl.java")).J("[%s, %s] %s: Error while processing request", str2, str, "sendMessage");
            arlqVar.b(th);
        }
    }

    @Override // defpackage.wck
    public final void g(wdx wdxVar, arlq arlqVar) {
        wbk wbkVar = wdxVar.d;
        if (wbkVar == null) {
            wbkVar = wbk.a;
        }
        wcy wcyVar = wbkVar.e;
        if (wcyVar == null) {
            wcyVar = wcy.a;
        }
        String str = wcyVar.c;
        ((alwl) ((alwl) a.g()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "triggerGroupNotification", 325, "MessagingEngineServerImpl.java")).t("[%s] Triggering group update", str);
        try {
            TriggerGroupNotificationRequest a2 = ((ajtw) this.j.b()).apply(wdxVar);
            ListenableFuture e = ((adbb) this.c.b()).e(a2);
            arlqVar.c(wdy.a);
            arlqVar.a();
            albo.bR(e, this.p.a(a2), this.b);
        } catch (IllegalArgumentException e2) {
            e = e2;
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "triggerGroupNotification", 344, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "triggerGroupNotification");
            arlqVar.b(j(e));
        } catch (IllegalStateException e3) {
            e = e3;
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "triggerGroupNotification", 344, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "triggerGroupNotification");
            arlqVar.b(j(e));
        } catch (Throwable th) {
            ((alwl) ((alwl) ((alwl) a.i()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "triggerGroupNotification", 348, "MessagingEngineServerImpl.java")).D("[%s] %s: Error while processing request", str, "triggerGroupNotification");
            arlqVar.b(th);
        }
    }

    @Override // defpackage.wck
    public final void h(web webVar, arlq arlqVar) {
        wbk wbkVar = webVar.d;
        if (wbkVar == null) {
            wbkVar = wbk.a;
        }
        wcy wcyVar = wbkVar.e;
        if (wcyVar == null) {
            wcyVar = wcy.a;
        }
        String str = wcyVar.c;
        ((alwl) ((alwl) a.g()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "updateGroup", 292, "MessagingEngineServerImpl.java")).t("[%s] Updating group", str);
        try {
            UpdateGroupRequest a2 = ((ajtx) this.i.b()).apply(webVar);
            ListenableFuture f = ((adbb) this.c.b()).f(a2);
            arlqVar.c(wec.a);
            arlqVar.a();
            albo.bR(f, this.o.a(a2), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "updateGroup", 309, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "updateGroup");
            arlqVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "updateGroup", 309, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "updateGroup");
            arlqVar.b(j(e));
        } catch (Throwable th) {
            ((alwl) ((alwl) ((alwl) a.i()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "updateGroup", 313, "MessagingEngineServerImpl.java")).D("[%s] %s: Error while processing request", str, "updateGroup");
            arlqVar.b(th);
        }
    }

    @Override // defpackage.wck
    public final void i() {
        throw new IllegalStateException("Not implemented anymore!");
    }
}
