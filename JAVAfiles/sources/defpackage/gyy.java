package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyy extends gil {
    public gyy(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
