package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mun implements Supplier {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mun(agoz agozVar, agmc agmcVar, aglo agloVar, int i) {
        this.d = i;
        this.c = agozVar;
        this.a = agmcVar;
        this.b = agloVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.function.Supplier] */
    /* JADX WARN: Type inference failed for: r0v9, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    @Override // java.util.function.Supplier
    public final Object get() {
        Object obj;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        Object obj2 = this.b;
                        Object obj3 = this.a;
                        try {
                            return ((agmc) obj3).d((agoz) this.c, (aglo) obj2);
                        } catch (Throwable th) {
                            ((alvg) ((alvg) agoz.c.a(Level.SEVERE).g(th)).h("com/google/android/libraries/databaseannotations/support/QueryBase", "notifyPreChangeListeners", 926, "QueryBase.java")).t("got exception invoking preChangeInTransaction on %s", obj3);
                            throw th;
                        }
                    }
                    amgl amglVar = (amgl) amgu.a.createBuilder();
                    amglVar.getClass();
                    akec.aR(((rvf) this.a).f(), amglVar);
                    akec.aS(((yra) this.b).a.n(), amglVar);
                    akec.aU(14, amglVar);
                    akec.aT(6, amglVar);
                    Object obj4 = this.c;
                    if (obj4 != null) {
                        akec.aQ((amxb) obj4, amglVar);
                    }
                    return akec.aN(amglVar);
                }
                ahtn ahtnVar = uuh.a;
                byte[] bArr = (byte[]) this.b.get();
                return new ahtj((ahtn) this.a, (String) this.c, bArr);
            }
            obj = this.c.get();
            ?? r1 = this.b;
            return ((mdy) this.a).m((apbt) obj, r1);
        }
        Object obj5 = this.b;
        return new mzi(miq.UPDATE, this.a, ((lfl) obj5).c, (Instant) this.c, 0);
    }

    public /* synthetic */ mun(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ mun(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
