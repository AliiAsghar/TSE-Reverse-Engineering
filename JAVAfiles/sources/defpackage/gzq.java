package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzq extends gil {
    public gzq(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "DELETE FROM worktag WHERE work_spec_id=?";
    }
}
