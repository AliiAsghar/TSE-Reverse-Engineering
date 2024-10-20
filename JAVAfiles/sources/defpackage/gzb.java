package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzb extends gil {
    public gzb(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "UPDATE workspec SET stop_reason=? WHERE id=?";
    }
}
