package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyx extends gil {
    public gyx(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }
}
