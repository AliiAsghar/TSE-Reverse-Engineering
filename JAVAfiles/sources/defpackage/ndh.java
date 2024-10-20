package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ndh implements ngo {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ndh(ndi ndiVar, alog alogVar, int i) {
        this.c = i;
        this.b = alogVar;
        this.a = ndiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    @Override // defpackage.ngo
    public final akul c() {
        int i = this.c;
        int i2 = 0;
        if (i != 0) {
            if (i != 1) {
                Object obj = this.b;
                ?? r2 = this.a;
                akrh e = aktp.e("getActiveRecipientsForConversation");
                try {
                    akul h = ndi.g(r2).s().h(new ndd(obj, i2), ((ndi) obj).b);
                    e.b(h);
                    e.close();
                    return h;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            Object obj2 = this.a;
            Object obj3 = this.b;
            akrh e2 = aktp.e("getAllRecipientsById");
            try {
                akul h2 = ndi.h((alog) obj3).s().h(new ndd(obj2, 2), ((ndi) obj2).b);
                e2.b(h2);
                e2.close();
                return h2;
            } catch (Throwable th3) {
                try {
                    e2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        Object obj4 = this.b;
        ?? r22 = this.a;
        akrh e3 = aktp.e("getAllRecipientsForConversation");
        try {
            akul h3 = ((ndi) obj4).i(r22).s().h(new ndd(obj4, i2), ((ndi) obj4).b);
            e3.b(h3);
            e3.close();
            return h3;
        } catch (Throwable th5) {
            try {
                e3.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    @Override // defpackage.ngo
    public final /* synthetic */ Object d() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return ((ndi) this.b).k(ndi.g(this.a).t());
            }
            return ((ndi) this.a).l(ndi.h((alog) this.b).t());
        }
        ?? r0 = this.a;
        ndi ndiVar = (ndi) this.b;
        return ndiVar.k(ndiVar.i(r0).t());
    }

    public ndh(ndi ndiVar, ConversationId conversationId, int i) {
        this.c = i;
        this.a = conversationId;
        this.b = ndiVar;
    }
}
