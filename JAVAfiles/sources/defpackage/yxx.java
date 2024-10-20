package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxx {
    private static final xze e = xze.g("Bugle", "ConversationXmsLatchUpdater");
    public final armf a;
    public final armf b;
    public final xnv c;
    public final anen d;
    private final mho f;
    private final uhj g;
    private final agnq h;

    public yxx(armf armfVar, armf armfVar2, mho mhoVar, uhj uhjVar, agnq agnqVar, xnv xnvVar, anen anenVar) {
        this.a = armfVar;
        this.b = armfVar2;
        this.f = mhoVar;
        this.g = uhjVar;
        this.h = agnqVar;
        this.c = xnvVar;
        this.d = anenVar;
    }

    private final boolean e(boolean z, ConversationIdType conversationIdType) {
        int i;
        String str;
        String str2 = "unlatch from";
        if (conversationIdType.b()) {
            xyo d = e.d();
            d.H("Conversation ID empty, Failed to ");
            if (true == z) {
                str2 = "latch to";
            }
            d.H(str2);
            d.H("xMS.");
            d.q();
            return false;
        }
        smr q = ((rtz) this.b.b()).q(conversationIdType);
        if (q == null) {
            xyo e2 = e.e();
            e2.H("Found conversation is null, failed to ");
            if (true == z) {
                str2 = "latch to";
            }
            e2.H(str2);
            e2.H("xMS.");
            e2.q();
            return false;
        }
        if (q.h() == 0) {
            if (true != z) {
                i = 0;
            } else {
                i = 2;
            }
            int p = q.p();
            if (p != 2) {
                if (p == 0) {
                    p = 0;
                }
                return false;
            }
            if (p != i && ((Boolean) this.h.c("UpdateConversationXmsLatchAction#executeAction", new mrm(this, conversationIdType, i, 7, null))).booleanValue()) {
                xyo c = e.c();
                c.H("Conversation");
                if (true != z) {
                    str = "unlatched from";
                } else {
                    str = "latched to";
                }
                c.H(str);
                c.H("xMS.");
                c.q();
                this.g.d(conversationIdType);
                return true;
            }
            return false;
        }
        e.p("xMS latching disabled for group conversations.");
        return false;
    }

    public final akul a(ConversationIdType conversationIdType) {
        return aktp.ai(new yxs(this, conversationIdType, 4), this.d);
    }

    public final void b(ConversationIdType conversationIdType, amfd amfdVar) {
        aiut.b();
        xyo d = e.d();
        d.H("Attempting to latch the conversation to XMS.");
        d.z("conversationId", conversationIdType);
        d.q();
        if (e(true, conversationIdType)) {
            this.f.v(conversationIdType, amfdVar);
        }
    }

    public final boolean c(ConversationIdType conversationIdType, int i) {
        aiut.b();
        xyo d = e.d();
        d.H("Attempting to unlatch the XMS conversation.");
        d.z("conversationId", conversationIdType);
        d.q();
        boolean e2 = e(false, conversationIdType);
        if (e2) {
            this.f.aD(conversationIdType, i);
        }
        return e2;
    }

    public final akul d(ConversationIdType conversationIdType) {
        return aktp.ai(new yxs(this, conversationIdType, 5), this.d);
    }
}
