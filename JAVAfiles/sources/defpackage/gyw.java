package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyw extends gil {
    public gyw(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
    }
}
