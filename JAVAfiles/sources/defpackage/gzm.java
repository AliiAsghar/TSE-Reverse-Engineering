package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzm extends gil {
    public gzm(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}
