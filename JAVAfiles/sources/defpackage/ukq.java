package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ukq {
    public static final xze a = xze.g("BugleDataModel", "WorkerDatabaseOperations");
    private static final String e;
    public final xnv b;
    public final agnq c;
    public final agpr d;

    static {
        String[] strArr = srm.a;
        upt uptVar = srm.d;
        e = "NOT EXISTS (SELECT other._id FROM generic_worker_queue AS other WHERE other.in_flight = 1  AND " + uptVar.i.toString() + " = other.worker_type AND " + uptVar.c.toString() + " = other.item_table_type AND " + uptVar.f.toString() + " = other.item_id)";
    }

    public ukq(xnv xnvVar, agnq agnqVar) {
        srk srkVar = new srk();
        srkVar.aj("clearInflightUpdater");
        srkVar.c(false);
        srkVar.d(new uid(14));
        this.d = srkVar.a();
        this.b = xnvVar;
        this.c = agnqVar;
    }

    public final srl a(int i) {
        agpl agplVar;
        if (((Boolean) utw.R.e()).booleanValue()) {
            agplVar = new agpl(e);
        } else {
            agplVar = new agpl("1");
        }
        srl srlVar = new srl();
        srlVar.d(false);
        srlVar.h(i);
        srlVar.W(agplVar);
        return srlVar;
    }

    public final void b() {
        xyl.h();
        if (((Boolean) utw.R.e()).booleanValue()) {
            srh srhVar = new srh();
            srhVar.f("dedupeGenericWorkerQueue");
            srhVar.b(new uid(13));
            int d = srhVar.d();
            if (d > 0) {
                a.l(a.bV(d, "Deduped work items "));
            }
        }
    }
}
