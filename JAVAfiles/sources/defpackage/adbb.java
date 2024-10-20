package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbb {
    private final Context a;
    private final Executor b;
    private final aegu c;
    private final anen d;
    private final aiim e;
    private final aikc f;
    private final adpu g;
    private final addv h;
    private final adov i;
    private final adeo j;
    private final yjr k;
    private final adaz l;
    private final aneo m;
    private final aday n;
    private final adaw o;
    private final aduo p;
    private final adtn q;
    private final adnk r;
    private final addy s;
    private final adcx t;

    public adbb(Context context, Executor executor, aegu aeguVar, anen anenVar, aiim aiimVar, aikc aikcVar, adpu adpuVar, addv addvVar, adov adovVar, adeo adeoVar, yjr yjrVar, adaz adazVar, aneo aneoVar, aday adayVar, adaw adawVar, aduo aduoVar, adtn adtnVar, adnk adnkVar, addy addyVar, adcx adcxVar) {
        this.a = context;
        this.b = executor;
        this.c = aeguVar;
        this.d = anenVar;
        this.e = aiimVar;
        this.f = aikcVar;
        this.g = adpuVar;
        this.h = addvVar;
        this.i = adovVar;
        this.j = adeoVar;
        this.k = yjrVar;
        this.l = adazVar;
        this.m = aneoVar;
        this.n = adayVar;
        this.o = adawVar;
        this.p = aduoVar;
        this.q = adtnVar;
        this.r = adnkVar;
        this.s = addyVar;
        this.t = adcxVar;
    }

    public final ListenableFuture a(AddUserToGroupRequest addUserToGroupRequest) {
        adaq g = g();
        g.b(addUserToGroupRequest);
        return g.a().m.d();
    }

    public final ListenableFuture b(CreateGroupRequest createGroupRequest) {
        adaq g = g();
        g.b(createGroupRequest);
        return g.a().n.d();
    }

    public final ListenableFuture c(RemoveUserFromGroupRequest removeUserFromGroupRequest) {
        adaq g = g();
        g.b(removeUserFromGroupRequest);
        return g.a().o.d();
    }

    public final ListenableFuture d(SendMessageRequest sendMessageRequest) {
        adaq g = g();
        g.b(sendMessageRequest);
        return g.a().d.d();
    }

    public final ListenableFuture e(TriggerGroupNotificationRequest triggerGroupNotificationRequest) {
        adaq g = g();
        g.b(triggerGroupNotificationRequest);
        return g.a().p.d();
    }

    public final ListenableFuture f(UpdateGroupRequest updateGroupRequest) {
        adaq g = g();
        g.b(updateGroupRequest);
        return g.a().q.d();
    }

    public final adaq g() {
        adaq adaqVar = new adaq();
        adaqVar.a = this.a;
        adaqVar.b = this.b;
        adaqVar.c = this.c;
        adaqVar.d = this.d;
        adaqVar.e = this.e;
        aikc aikcVar = this.f;
        aikcVar.getClass();
        adaqVar.f = aikcVar;
        adaqVar.g = this.g;
        adaqVar.h = this.h;
        adov adovVar = this.i;
        adovVar.getClass();
        adaqVar.i = adovVar;
        adaqVar.j = this.j;
        adaqVar.k = this.k;
        adaz adazVar = this.l;
        adazVar.getClass();
        adaqVar.l = adazVar;
        adaqVar.m = this.m;
        adaqVar.n = this.n;
        adaqVar.o = this.o;
        adaqVar.p = this.p;
        adaqVar.q = this.q;
        adaqVar.r = this.r;
        adaqVar.t = this.t;
        addy addyVar = this.s;
        addyVar.getClass();
        adaqVar.s = addyVar;
        return adaqVar;
    }
}
