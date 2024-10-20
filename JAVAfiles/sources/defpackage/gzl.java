package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzl extends gil {
    public gzl(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
    }
}
