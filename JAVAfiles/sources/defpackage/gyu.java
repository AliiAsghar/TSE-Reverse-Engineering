package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyu extends gil {
    public gyu(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }
}
