package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzj extends gil {
    public gzj(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
    }
}
