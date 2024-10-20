package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzk extends gil {
    public gzk(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "UPDATE workspec SET output=? WHERE id=?";
    }
}
