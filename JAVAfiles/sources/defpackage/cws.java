package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cws {
    private final czr a = new czr(cwt.a);

    /* JADX WARN: Multi-variable type inference failed */
    public final cxn a() {
        cxn cxnVar = (cxn) this.a.first();
        e(cxnVar);
        return cxnVar;
    }

    public final void b(cxn cxnVar) {
        if (!cxnVar.am()) {
            csg.c("DepthSortedSet.add called on an unattached node");
        }
        this.a.add(cxnVar);
    }

    public final boolean c(cxn cxnVar) {
        return this.a.contains(cxnVar);
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    public final void e(cxn cxnVar) {
        if (!cxnVar.am()) {
            csg.c("DepthSortedSet.remove called on an unattached node");
        }
        this.a.remove(cxnVar);
    }

    public final String toString() {
        return this.a.toString();
    }
}
