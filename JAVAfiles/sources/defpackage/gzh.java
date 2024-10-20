package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzh extends gil {
    public gzh(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "UPDATE workspec SET state=? WHERE id=?";
    }
}
