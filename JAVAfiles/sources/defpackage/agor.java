package defpackage;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agor implements Supplier {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ agor(agmc agmcVar, agoz agozVar, aglo agloVar, List list, int i) {
        this.e = i;
        this.a = agmcVar;
        this.b = agozVar;
        this.c = agloVar;
        this.d = list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.e != 0) {
            ((vui) this.c).l((smr) this.a, null, (UUID) this.d, null, !((vuk) this.b).f);
            return aktp.ag(upm.d());
        }
        ?? r0 = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.a;
        try {
            ((agmc) obj3).e((agoz) obj2, (aglo) obj, alzz.aO(r0));
            return null;
        } catch (Throwable th) {
            ((alvg) ((alvg) agoz.c.a(Level.SEVERE).g(th)).h("com/google/android/libraries/databaseannotations/support/QueryBase", "notifyPost", 968, "QueryBase.java")).t("got exception invoking onChangeInTransactionWithObject on %s", obj3);
            throw th;
        }
    }

    public /* synthetic */ agor(vui vuiVar, smr smrVar, UUID uuid, vuk vukVar, int i) {
        this.e = i;
        this.c = vuiVar;
        this.a = smrVar;
        this.d = uuid;
        this.b = vukVar;
    }
}
