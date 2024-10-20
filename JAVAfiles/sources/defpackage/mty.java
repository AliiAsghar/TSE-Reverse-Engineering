package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mty implements miz {
    private static final mje c = new mur(1);
    public final wsn a;
    public final MessagesTable.BindData b;
    private final armf d;
    private final ConversationId e;
    private final arml f;
    private final arml g = armd.b(3, new lhb(this, 20));
    private final arml h = armd.b(3, new mtx(this, 2));
    private final arml i = armd.b(3, new mtx(this, 3));
    private final arml j = armd.b(3, new mtx(this, 0));
    private final arml k = armd.b(3, new mtx(this, 1));
    private final mje l = c;
    private final int m = 2;
    private final int n = 1;

    public mty(myj myjVar, armf armfVar, ConversationId conversationId, wsn wsnVar) {
        this.d = armfVar;
        this.e = conversationId;
        this.a = wsnVar;
        this.b = wsnVar.a;
        this.f = armd.b(3, new quz(myjVar, this, 1, null));
        int i = alog.d;
        alsx.a.getClass();
    }

    @Override // defpackage.miz
    public final miy a() {
        Object a = this.j.a();
        a.getClass();
        return (miy) a;
    }

    @Override // defpackage.miz
    public final /* bridge */ /* synthetic */ MessageId b() {
        Object a = this.g.a();
        a.getClass();
        return (CoreBugleMessageId) a;
    }

    @Override // defpackage.miz
    public final mje c() {
        return this.l;
    }

    @Override // defpackage.miz
    public final ConversationId d() {
        return this.e;
    }

    @Override // defpackage.miz
    public final /* bridge */ /* synthetic */ mym e() {
        Object a = this.f.a();
        a.getClass();
        return (mym) a;
    }

    @Override // defpackage.miz
    public final /* bridge */ /* synthetic */ nbe f() {
        return null;
    }

    @Override // defpackage.miz
    public final /* bridge */ /* synthetic */ akul g() {
        throw new UnsupportedOperationException("This is not supported for scheduled messages");
    }

    @Override // defpackage.miz
    public final Instant h() {
        Object a = this.h.a();
        a.getClass();
        return (Instant) a;
    }

    @Override // defpackage.miz
    public final Instant i() {
        Object a = this.i.a();
        a.getClass();
        return (Instant) a;
    }

    @Override // defpackage.miz
    public final Long j() {
        long x = this.b.x();
        if (x == 0) {
            return null;
        }
        return Long.valueOf(x);
    }

    @Override // defpackage.miz
    public final String k() {
        if (((Boolean) this.d.b()).booleanValue()) {
            wsn wsnVar = this.a;
            wsnVar.ao(125, "caption");
            return wsnVar.c;
        }
        return null;
    }

    @Override // defpackage.miz
    public final String l() {
        Object a = this.k.a();
        a.getClass();
        return (String) a;
    }

    @Override // defpackage.miz
    public final boolean m() {
        return false;
    }

    @Override // defpackage.miz
    public final boolean n() {
        return false;
    }

    @Override // defpackage.miz
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.miz
    public final boolean p() {
        return false;
    }

    @Override // defpackage.miz
    public final /* synthetic */ nbv q() {
        return null;
    }

    @Override // defpackage.miz
    public final int r() {
        return this.m;
    }

    @Override // defpackage.miz
    public final int s() {
        return this.n;
    }

    @Override // defpackage.miz
    public final /* synthetic */ ndk t() {
        return null;
    }

    @Override // defpackage.miz
    public final /* synthetic */ qdq u() {
        return null;
    }

    public final Instant v() {
        ScheduledSendTable.BindData bindData = this.a.d;
        bindData.ao(3, "scheduled_time");
        Instant instant = bindData.d;
        instant.getClass();
        return instant;
    }
}
