package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtr extends gvf {
    @Override // defpackage.gvf
    public final void c(gkd gkdVar) {
        gkdVar.d();
        try {
            gkdVar.g("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - gur.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            gkdVar.h();
        } finally {
            gkdVar.f();
        }
    }
}
