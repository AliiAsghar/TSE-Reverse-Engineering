package defpackage;

import android.util.LruCache;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qov implements qos, xzh {
    static final utz a = uuh.f(uuh.b, "conversation_thread_id_cache_expiry_ms", TimeUnit.SECONDS.toNanos(10));
    private static final Object b = new Object();
    private final qos c;
    private final xnv d;
    private final alhr e = albo.D(new msu(13));

    public qov(qos qosVar, xnv xnvVar) {
        this.c = qosVar;
        this.d = xnvVar;
    }

    private final xhv c(ConversationIdType conversationIdType) {
        synchronized (b) {
            aboh abohVar = (aboh) ((LruCache) this.e.get()).get(conversationIdType);
            if (abohVar != null && this.d.b() <= abohVar.a) {
                return (xhv) abohVar.b;
            }
            return null;
        }
    }

    private final void d(ConversationIdType conversationIdType, xhv xhvVar) {
        if (xhvVar.c()) {
            synchronized (b) {
                ((LruCache) this.e.get()).put(conversationIdType, new aboh(this.d.b() + ((Long) a.e()).longValue(), xhvVar));
            }
        }
    }

    @Override // defpackage.qos
    public final xhv a(ConversationIdType conversationIdType) {
        xhv c = c(conversationIdType);
        if (c != null) {
            return c;
        }
        xhv a2 = this.c.a(conversationIdType);
        d(conversationIdType, a2);
        return a2;
    }

    @Override // defpackage.qos
    public final xhv b(smr smrVar) {
        xhv c = c(smrVar.x());
        if (c != null) {
            return c;
        }
        xhv b2 = this.c.b(smrVar);
        d(smrVar.x(), b2);
        return b2;
    }

    @Override // defpackage.xzh
    public final void l(int i) {
        synchronized (b) {
            ((LruCache) this.e.get()).evictAll();
        }
    }
}
