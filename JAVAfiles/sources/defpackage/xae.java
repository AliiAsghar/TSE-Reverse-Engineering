package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xae {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/sms/ThreadInfoCache");
    private final uj b = new uj();
    private final uj c = new uj();
    private final HashSet d = new HashSet();
    private final armf e;
    private final armf f;
    private final armf g;

    public xae(armf armfVar, armf armfVar2, armf armfVar3) {
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
    }

    public final synchronized xaz a(wxs wxsVar, long j, String str) {
        xaz xazVar = (xaz) this.c.d(j);
        if (xazVar == null || xazVar.b.isEmpty()) {
            xazVar = ((wzs) this.f.b()).w(wxsVar, j, str);
            if (!xazVar.b.isEmpty()) {
                this.c.h(j, xazVar);
            }
        }
        if (xazVar.b.isEmpty()) {
            alvw i = a.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/sms/ThreadInfoCache", "getThreadData", 204, "ThreadInfoCache.java")).s("Use unknown sender since thread couldn't find any recipients. threadId: %s", j);
            return new xaz(j, alog.r(((msk) this.g.b()).n("ʼUNKNOWN_SENDER!ʼ")), false);
        }
        return xazVar;
    }

    public final synchronized void b() {
        alvw g = a.g();
        g.X(alwp.a, "Bugle");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/sms/ThreadInfoCache", "clear", 59, "ThreadInfoCache.java")).q("Cleared ThreadInfoCache");
        this.b.g();
        this.c.g();
        this.d.clear();
    }

    public final synchronized boolean c(ConversationIdType conversationIdType) {
        return this.d.contains(conversationIdType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final synchronized ConversationIdType d(long j, int i, xjn xjnVar, String str, tqc tqcVar, boolean z) {
        int i2;
        ConversationIdType conversationIdType;
        ?? r1;
        ConversationIdType conversationIdType2 = ruy.a;
        uj ujVar = this.b;
        int b = vp.b(ujVar.b, ujVar.d, j);
        if (b >= 0 && (r1 = ujVar.c[b]) != uk.a) {
            conversationIdType2 = r1;
        }
        ConversationIdType conversationIdType3 = conversationIdType2;
        if (!conversationIdType3.b()) {
            alvw d = a.d();
            d.X(alwp.a, "Bugle");
            ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/sms/ThreadInfoCache", "getOrCreateConversation", 92, "ThreadInfoCache.java")).A("Getting existing conversation (a mapping from the thread id to the conversation id already exists). threadId: %s, conversationId: %s", j, conversationIdType3);
            return conversationIdType3;
        }
        xaz a2 = a(wxr.c, j, str);
        long j2 = a2.a;
        String str2 = a2.e;
        ArrayList J = ((rtz) this.e.b()).J(a2, i);
        if (xjnVar != null) {
            rtz rtzVar = (rtz) this.e.b();
            ruu b2 = ruv.b(xjnVar);
            b2.s(new xhv(j2));
            b2.j(J);
            b2.c = Optional.ofNullable(a2.c);
            b2.e(true);
            b2.f(false);
            b2.m(Optional.ofNullable(str2));
            b2.n(Optional.ofNullable(a2.d));
            conversationIdType = rtzVar.j(b2.a(), z).a;
            if (!conversationIdType.b() && (xjnVar.a.d() || a2.g)) {
                this.d.add(conversationIdType);
            }
        } else {
            if (z) {
                i2 = 0;
            } else {
                i2 = a2.f;
            }
            rtz rtzVar2 = (rtz) this.e.b();
            ruu a3 = ruv.a();
            a3.s(new xhv(j2));
            a3.b(tqcVar);
            a3.j(J);
            a3.g(i2);
            a3.c = Optional.ofNullable(a2.c);
            a3.e(true);
            a3.f(false);
            a3.m(Optional.ofNullable(str2));
            a3.n(Optional.ofNullable(a2.d));
            conversationIdType = rtzVar2.j(a3.a(), z).a;
            if (!conversationIdType.b() && (tqcVar.d() || a2.g)) {
                this.d.add(conversationIdType);
            }
        }
        if (!conversationIdType.b()) {
            this.b.h(j2, conversationIdType);
            alvw d2 = a.d();
            d2.X(alwp.a, "Bugle");
            ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/sms/ThreadInfoCache", "getOrCreateConversation", 169, "ThreadInfoCache.java")).A("Conversation created successfully. threadId: %s, conversationId: %s", j2, conversationIdType);
            return conversationIdType;
        }
        alvw d3 = a.d();
        d3.X(alwp.a, "Bugle");
        ((alvg) ((alvg) d3).h("com/google/android/apps/messaging/shared/sms/ThreadInfoCache", "getOrCreateConversation", 175, "ThreadInfoCache.java")).A("Failed to create conversation. Returning null conversation id. threadId: %s, conversationId: %s", j2, conversationIdType);
        return ruy.a;
    }
}
