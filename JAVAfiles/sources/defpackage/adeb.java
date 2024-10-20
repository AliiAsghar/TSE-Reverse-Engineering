package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adeb implements andy {
    public final alwo a = alwo.o(advo.a);
    private final Context b;
    private final armf c;
    private final anen d;
    private final ajtk e;
    private final /* synthetic */ int f;
    private final Object g;
    private final aniz h;

    public adeb(AddUserToGroupRequest addUserToGroupRequest, Context context, ajtk ajtkVar, aniz anizVar, armf armfVar, anen anenVar, int i) {
        this.f = i;
        this.g = addUserToGroupRequest;
        this.b = context;
        this.e = ajtkVar;
        this.h = anizVar;
        this.c = armfVar;
        this.d = anenVar;
    }

    private final void c(GroupOperationResult groupOperationResult) {
        if (((CreateGroupRequest) this.g).c().isPresent()) {
            Conversation b = groupOperationResult.b();
            MessagingResult a = groupOperationResult.a();
            aozy createBuilder = wbl.a.createBuilder();
            wbk wbkVar = (wbk) this.e.m().fu(b);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbl wblVar = (wbl) createBuilder.b;
            wbkVar.getClass();
            wblVar.e = wbkVar;
            wblVar.b |= 8;
            wcq b2 = aniz.b(a);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbl wblVar2 = (wbl) createBuilder.b;
            b2.getClass();
            wblVar2.d = b2;
            wblVar2.b |= 4;
            aozy createBuilder2 = aoyo.a.createBuilder();
            Object obj = ((CreateGroupRequest) this.g).c().get();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((aoyo) createBuilder2.b).b = (aozb) obj;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbl wblVar3 = (wbl) createBuilder.b;
            aoyo aoyoVar = (aoyo) createBuilder2.s();
            aoyoVar.getClass();
            wblVar3.c = aoyoVar;
            wblVar3.b |= 1;
            wbl wblVar4 = (wbl) createBuilder.s();
            wbk wbkVar2 = wblVar4.e;
            if (wbkVar2 == null) {
                wbkVar2 = wbk.a;
            }
            wcy wcyVar = wbkVar2.e;
            if (wcyVar == null) {
                wcyVar = wcy.a;
            }
            armf armfVar = this.c;
            String str = wcyVar.c;
            wcf wcfVar = (wcf) armfVar.b();
            albo.bR(arlj.a(wcfVar.a.a(wch.b(), wcfVar.b), wblVar4), new vbr(this, str, 5), this.d);
            return;
        }
        d(groupOperationResult);
    }

    private final void d(GroupOperationResult groupOperationResult) {
        Conversation b = groupOperationResult.b();
        Intent intent = new Intent();
        try {
            GroupOperationResult.d(intent, groupOperationResult);
            adtw.c(this.b, intent);
            ((CreateGroupRequest) this.g).a().send(this.b, groupOperationResult.a().b(), intent);
        } catch (PendingIntent.CanceledException e) {
            ((alwl) ((alwl) ((alwl) this.a.i()).g(e)).h("com/google/android/ims/messaging/v2/CreateGroupOperationResultProcessor", "sendIntent", 130, "CreateGroupOperationResultProcessor.java")).t("[%s] Callback intent canceled", b);
        }
    }

    private final void e(GroupOperationResult groupOperationResult) {
        if (((AddUserToGroupRequest) this.g).d().isPresent()) {
            Conversation b = groupOperationResult.b();
            MessagingResult a = groupOperationResult.a();
            aozy createBuilder = wbe.a.createBuilder();
            wbk wbkVar = (wbk) this.e.m().fu(b);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbe wbeVar = (wbe) createBuilder.b;
            wbkVar.getClass();
            wbeVar.e = wbkVar;
            wbeVar.b |= 8;
            wcq b2 = aniz.b(a);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbe wbeVar2 = (wbe) createBuilder.b;
            b2.getClass();
            wbeVar2.d = b2;
            wbeVar2.b |= 4;
            aozy createBuilder2 = aoyo.a.createBuilder();
            Object obj = ((AddUserToGroupRequest) this.g).d().get();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((aoyo) createBuilder2.b).b = (aozb) obj;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbe wbeVar3 = (wbe) createBuilder.b;
            aoyo aoyoVar = (aoyo) createBuilder2.s();
            aoyoVar.getClass();
            wbeVar3.c = aoyoVar;
            wbeVar3.b |= 1;
            wbe wbeVar4 = (wbe) createBuilder.s();
            wbk wbkVar2 = wbeVar4.e;
            if (wbkVar2 == null) {
                wbkVar2 = wbk.a;
            }
            wcy wcyVar = wbkVar2.e;
            if (wcyVar == null) {
                wcyVar = wcy.a;
            }
            armf armfVar = this.c;
            String str = wcyVar.c;
            wcf wcfVar = (wcf) armfVar.b();
            albo.bR(arlj.a(wcfVar.a.a(wch.a(), wcfVar.b), wbeVar4), new vbr(this, str, 4), this.d);
            return;
        }
        f(groupOperationResult);
    }

    private final void f(GroupOperationResult groupOperationResult) {
        Conversation b = groupOperationResult.b();
        Intent intent = new Intent();
        try {
            GroupOperationResult.d(intent, groupOperationResult);
            adtw.c(this.b, intent);
            ((AddUserToGroupRequest) this.g).a().send(this.b, groupOperationResult.a().b(), intent);
        } catch (PendingIntent.CanceledException e) {
            ((alwl) ((alwl) ((alwl) this.a.i()).g(e)).h("com/google/android/ims/messaging/v2/AddUserToGroupOperationResultProcessor", "sendIntent", 135, "AddUserToGroupOperationResultProcessor.java")).t("[%s] Callback intent canceled", b);
        }
    }

    private final void g(GroupOperationResult groupOperationResult) {
        if (((RemoveUserFromGroupRequest) this.g).d().isPresent()) {
            Conversation b = groupOperationResult.b();
            MessagingResult a = groupOperationResult.a();
            aozy createBuilder = wdb.a.createBuilder();
            wbk wbkVar = (wbk) this.e.m().fu(b);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdb wdbVar = (wdb) createBuilder.b;
            wbkVar.getClass();
            wdbVar.e = wbkVar;
            wdbVar.b |= 8;
            wcq b2 = aniz.b(a);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdb wdbVar2 = (wdb) createBuilder.b;
            b2.getClass();
            wdbVar2.d = b2;
            wdbVar2.b |= 4;
            aozy createBuilder2 = aoyo.a.createBuilder();
            Object obj = ((RemoveUserFromGroupRequest) this.g).d().get();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((aoyo) createBuilder2.b).b = (aozb) obj;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdb wdbVar3 = (wdb) createBuilder.b;
            aoyo aoyoVar = (aoyo) createBuilder2.s();
            aoyoVar.getClass();
            wdbVar3.c = aoyoVar;
            wdbVar3.b |= 1;
            wdb wdbVar4 = (wdb) createBuilder.s();
            wbk wbkVar2 = wdbVar4.e;
            if (wbkVar2 == null) {
                wbkVar2 = wbk.a;
            }
            wcy wcyVar = wbkVar2.e;
            if (wcyVar == null) {
                wcyVar = wcy.a;
            }
            armf armfVar = this.c;
            String str = wcyVar.c;
            wcf wcfVar = (wcf) armfVar.b();
            albo.bR(arlj.a(wcfVar.a.a(wch.e(), wcfVar.b), wdbVar4), new vbr(this, str, 6), this.d);
            return;
        }
        h(groupOperationResult);
    }

    private final void h(GroupOperationResult groupOperationResult) {
        Conversation b = groupOperationResult.b();
        Intent intent = new Intent();
        try {
            GroupOperationResult.d(intent, groupOperationResult);
            adtw.c(this.b, intent);
            ((RemoveUserFromGroupRequest) this.g).a().send(this.b, groupOperationResult.a().b(), intent);
        } catch (PendingIntent.CanceledException e) {
            ((alwl) ((alwl) ((alwl) this.a.i()).g(e)).h("com/google/android/ims/messaging/v2/RemoveUserFromGroupOperationResultProcessor", "sendIntent", 123, "RemoveUserFromGroupOperationResultProcessor.java")).t("[%s] Callback intent canceled", b);
        }
    }

    private final void i(GroupOperationResult groupOperationResult) {
        if (((TriggerGroupNotificationRequest) this.g).c().isPresent()) {
            Conversation b = groupOperationResult.b();
            MessagingResult a = groupOperationResult.a();
            aozy createBuilder = wdv.a.createBuilder();
            wbk wbkVar = (wbk) this.e.m().fu(b);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdv wdvVar = (wdv) createBuilder.b;
            wbkVar.getClass();
            wdvVar.e = wbkVar;
            wdvVar.b |= 8;
            wcq b2 = aniz.b(a);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdv wdvVar2 = (wdv) createBuilder.b;
            b2.getClass();
            wdvVar2.d = b2;
            wdvVar2.b |= 4;
            aozy createBuilder2 = aoyo.a.createBuilder();
            Object obj = ((TriggerGroupNotificationRequest) this.g).c().get();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((aoyo) createBuilder2.b).b = (aozb) obj;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdv wdvVar3 = (wdv) createBuilder.b;
            aoyo aoyoVar = (aoyo) createBuilder2.s();
            aoyoVar.getClass();
            wdvVar3.c = aoyoVar;
            wdvVar3.b |= 1;
            wdv wdvVar4 = (wdv) createBuilder.s();
            wbk wbkVar2 = wdvVar4.e;
            if (wbkVar2 == null) {
                wbkVar2 = wbk.a;
            }
            wcy wcyVar = wbkVar2.e;
            if (wcyVar == null) {
                wcyVar = wcy.a;
            }
            armf armfVar = this.c;
            String str = wcyVar.c;
            wcf wcfVar = (wcf) armfVar.b();
            albo.bR(arlj.a(wcfVar.a.a(wch.i(), wcfVar.b), wdvVar4), new vbr(this, str, 8), this.d);
            return;
        }
        j(groupOperationResult);
    }

    private final void j(GroupOperationResult groupOperationResult) {
        Conversation b = groupOperationResult.b();
        Intent intent = new Intent();
        try {
            GroupOperationResult.d(intent, groupOperationResult);
            adtw.c(this.b, intent);
            ((TriggerGroupNotificationRequest) this.g).a().send(this.b, groupOperationResult.a().b(), intent);
        } catch (PendingIntent.CanceledException e) {
            ((alwl) ((alwl) ((alwl) this.a.i()).g(e)).h("com/google/android/ims/messaging/v2/TriggerGroupNotificationOperationResultProcessor", "sendIntent", 123, "TriggerGroupNotificationOperationResultProcessor.java")).t("[%s] Callback intent canceled", b);
        }
    }

    private final void k(GroupOperationResult groupOperationResult) {
        if (((UpdateGroupRequest) this.g).c().isPresent()) {
            Conversation b = groupOperationResult.b();
            MessagingResult a = groupOperationResult.a();
            aozy createBuilder = wdz.a.createBuilder();
            wbk wbkVar = (wbk) this.e.m().fu(b);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdz wdzVar = (wdz) createBuilder.b;
            wbkVar.getClass();
            wdzVar.e = wbkVar;
            wdzVar.b |= 8;
            wcq b2 = aniz.b(a);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdz wdzVar2 = (wdz) createBuilder.b;
            b2.getClass();
            wdzVar2.d = b2;
            wdzVar2.b |= 4;
            aozy createBuilder2 = aoyo.a.createBuilder();
            Object obj = ((UpdateGroupRequest) this.g).c().get();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((aoyo) createBuilder2.b).b = (aozb) obj;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdz wdzVar3 = (wdz) createBuilder.b;
            aoyo aoyoVar = (aoyo) createBuilder2.s();
            aoyoVar.getClass();
            wdzVar3.c = aoyoVar;
            wdzVar3.b |= 1;
            wdz wdzVar4 = (wdz) createBuilder.s();
            wbk wbkVar2 = wdzVar4.e;
            if (wbkVar2 == null) {
                wbkVar2 = wbk.a;
            }
            wcy wcyVar = wbkVar2.e;
            if (wcyVar == null) {
                wcyVar = wcy.a;
            }
            armf armfVar = this.c;
            String str = wcyVar.c;
            wcf wcfVar = (wcf) armfVar.b();
            albo.bR(arlj.a(wcfVar.a.a(wch.j(), wcfVar.b), wdzVar4), new vbr(this, str, 9), this.d);
            return;
        }
        l(groupOperationResult);
    }

    private final void l(GroupOperationResult groupOperationResult) {
        Conversation b = groupOperationResult.b();
        Intent intent = new Intent();
        try {
            GroupOperationResult.d(intent, groupOperationResult);
            adtw.c(this.b, intent);
            ((UpdateGroupRequest) this.g).a().send(this.b, groupOperationResult.a().b(), intent);
        } catch (PendingIntent.CanceledException e) {
            ((alwl) ((alwl) ((alwl) this.a.i()).g(e)).h("com/google/android/ims/messaging/v2/UpdateGroupOperationResultProcessor", "sendIntent", 123, "UpdateGroupOperationResultProcessor.java")).t("[%s] Callback intent canceled", b);
        }
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        Conversation b = ((UpdateGroupRequest) this.g).b();
                        ((alwl) ((alwl) ((alwl) this.a.i()).g(th)).h("com/google/android/ims/messaging/v2/UpdateGroupOperationResultProcessor", "onFailure", 74, "UpdateGroupOperationResultProcessor.java")).D("[%s] Group operation failed: %s", b.b(), th.getMessage());
                        ajps d = MessagingResult.d();
                        d.c(16);
                        d.b(7);
                        MessagingResult a = d.a();
                        ajur ajurVar = new ajur(null);
                        ajurVar.r(a);
                        ajurVar.q(b);
                        k(ajurVar.p());
                        return;
                    }
                    Conversation b2 = ((TriggerGroupNotificationRequest) this.g).b();
                    ((alwl) ((alwl) ((alwl) this.a.i()).g(th)).h("com/google/android/ims/messaging/v2/TriggerGroupNotificationOperationResultProcessor", "onFailure", 74, "TriggerGroupNotificationOperationResultProcessor.java")).D("[%s] Group operation failed: %s", b2.b(), th.getMessage());
                    ajps d2 = MessagingResult.d();
                    d2.c(16);
                    d2.b(7);
                    MessagingResult a2 = d2.a();
                    ajur ajurVar2 = new ajur(null);
                    ajurVar2.r(a2);
                    ajurVar2.q(b2);
                    i(ajurVar2.p());
                    return;
                }
                Conversation b3 = ((RemoveUserFromGroupRequest) this.g).b();
                ((alwl) ((alwl) ((alwl) this.a.i()).g(th)).h("com/google/android/ims/messaging/v2/RemoveUserFromGroupOperationResultProcessor", "onFailure", 74, "RemoveUserFromGroupOperationResultProcessor.java")).D("[%s] Group operation failed: %s", b3.b(), th.getMessage());
                ajps d3 = MessagingResult.d();
                d3.c(16);
                d3.b(7);
                MessagingResult a3 = d3.a();
                ajur ajurVar3 = new ajur(null);
                ajurVar3.r(a3);
                ajurVar3.q(b3);
                g(ajurVar3.p());
                return;
            }
            ((alwl) ((alwl) ((alwl) this.a.i()).g(th)).h("com/google/android/ims/messaging/v2/AddUserToGroupOperationResultProcessor", "onFailure", 74, "AddUserToGroupOperationResultProcessor.java")).D("[%s] Group operation failed: %s", ((AddUserToGroupRequest) this.g).b().b(), th.getMessage());
            ajps d4 = MessagingResult.d();
            d4.c(16);
            d4.b(7);
            MessagingResult a4 = d4.a();
            ajur ajurVar4 = new ajur(null);
            ajurVar4.r(a4);
            ajurVar4.q(((AddUserToGroupRequest) this.g).b());
            e(ajurVar4.p());
            return;
        }
        ((alwl) ((alwl) ((alwl) this.a.i()).g(th)).h("com/google/android/ims/messaging/v2/CreateGroupOperationResultProcessor", "onFailure", 73, "CreateGroupOperationResultProcessor.java")).D("[%s] Group operation failed: %s", ((CreateGroupRequest) this.g).d(), th.getMessage());
        atkm atkmVar = new atkm();
        atkmVar.c(((CreateGroupRequest) this.g).d());
        atkmVar.d(2);
        atkv atkvVar = new atkv((byte[]) null);
        atkvVar.j("");
        atkvVar.k(2);
        atkmVar.b(atkvVar.i());
        Conversation a5 = atkmVar.a();
        ajps d5 = MessagingResult.d();
        d5.c(16);
        d5.b(7);
        MessagingResult a6 = d5.a();
        ajur ajurVar5 = new ajur(null);
        ajurVar5.q(a5);
        ajurVar5.r(a6);
        c(ajurVar5.p());
    }

    @Override // defpackage.andy
    public final /* synthetic */ void b(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        GroupOperationResult groupOperationResult = (GroupOperationResult) obj;
                        groupOperationResult.getClass();
                        ((alwl) ((alwl) this.a.g()).h("com/google/android/ims/messaging/v2/UpdateGroupOperationResultProcessor", "onSuccess", 64, "UpdateGroupOperationResultProcessor.java")).B("[%s] Group operation completed, result: %d", groupOperationResult.b(), groupOperationResult.a().b());
                        k(groupOperationResult);
                        return;
                    }
                    GroupOperationResult groupOperationResult2 = (GroupOperationResult) obj;
                    groupOperationResult2.getClass();
                    ((alwl) ((alwl) this.a.g()).h("com/google/android/ims/messaging/v2/TriggerGroupNotificationOperationResultProcessor", "onSuccess", 64, "TriggerGroupNotificationOperationResultProcessor.java")).B("[%s] Group operation completed, result: %d", groupOperationResult2.b(), groupOperationResult2.a().b());
                    i(groupOperationResult2);
                    return;
                }
                GroupOperationResult groupOperationResult3 = (GroupOperationResult) obj;
                groupOperationResult3.getClass();
                ((alwl) ((alwl) this.a.g()).h("com/google/android/ims/messaging/v2/RemoveUserFromGroupOperationResultProcessor", "onSuccess", 63, "RemoveUserFromGroupOperationResultProcessor.java")).B("[%s] Group operation completed, result: %s", groupOperationResult3.b(), groupOperationResult3.a().b());
                g(groupOperationResult3);
                return;
            }
            GroupOperationResult groupOperationResult4 = (GroupOperationResult) obj;
            groupOperationResult4.getClass();
            ((alwl) ((alwl) this.a.g()).h("com/google/android/ims/messaging/v2/AddUserToGroupOperationResultProcessor", "onSuccess", 64, "AddUserToGroupOperationResultProcessor.java")).B("[%s] Group operation completed, result: %s", groupOperationResult4.b(), groupOperationResult4.a().b());
            e(groupOperationResult4);
            return;
        }
        GroupOperationResult groupOperationResult5 = (GroupOperationResult) obj;
        groupOperationResult5.getClass();
        ((alwl) ((alwl) this.a.g()).h("com/google/android/ims/messaging/v2/CreateGroupOperationResultProcessor", "onSuccess", 64, "CreateGroupOperationResultProcessor.java")).B("[%s] Group operation completed, result: %s", groupOperationResult5.b(), groupOperationResult5.a().b());
        c(groupOperationResult5);
    }

    public adeb(CreateGroupRequest createGroupRequest, Context context, ajtk ajtkVar, aniz anizVar, armf armfVar, anen anenVar, int i) {
        this.f = i;
        this.g = createGroupRequest;
        this.b = context;
        this.e = ajtkVar;
        this.h = anizVar;
        this.c = armfVar;
        this.d = anenVar;
    }

    public adeb(RemoveUserFromGroupRequest removeUserFromGroupRequest, Context context, ajtk ajtkVar, aniz anizVar, armf armfVar, anen anenVar, int i) {
        this.f = i;
        this.g = removeUserFromGroupRequest;
        this.b = context;
        this.e = ajtkVar;
        this.h = anizVar;
        this.c = armfVar;
        this.d = anenVar;
    }

    public adeb(TriggerGroupNotificationRequest triggerGroupNotificationRequest, Context context, ajtk ajtkVar, aniz anizVar, armf armfVar, anen anenVar, int i) {
        this.f = i;
        this.g = triggerGroupNotificationRequest;
        this.b = context;
        this.e = ajtkVar;
        this.h = anizVar;
        this.c = armfVar;
        this.d = anenVar;
    }

    public adeb(UpdateGroupRequest updateGroupRequest, Context context, ajtk ajtkVar, aniz anizVar, armf armfVar, anen anenVar, int i) {
        this.f = i;
        this.g = updateGroupRequest;
        this.b = context;
        this.e = ajtkVar;
        this.h = anizVar;
        this.c = armfVar;
        this.d = anenVar;
    }
}
