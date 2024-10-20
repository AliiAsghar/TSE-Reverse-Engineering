package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzg extends gil {
    public gzg(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "DELETE FROM workspec WHERE id=?";
    }
}
