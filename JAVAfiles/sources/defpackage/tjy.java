package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tjy extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b() {
        U(new agoi("restore_workflow_scratch_timestamps.timestamp_in_seconds", 7, 0L));
    }

    public final void c(tpz tpzVar) {
        int ordinal;
        if (tpzVar == null) {
            ordinal = 0;
        } else {
            ordinal = tpzVar.ordinal();
        }
        U(new agoi("restore_workflow_scratch_timestamps.which_database", 1, Integer.valueOf(ordinal)));
    }
}
