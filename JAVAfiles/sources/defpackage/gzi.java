package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzi extends gil {
    public gzi(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
    }
}
