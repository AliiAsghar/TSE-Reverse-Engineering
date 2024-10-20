package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyv extends gil {
    public gyv(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
    }
}
