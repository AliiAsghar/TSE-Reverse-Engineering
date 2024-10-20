package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tjq extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(tpz tpzVar) {
        int ordinal;
        if (tpzVar == null) {
            ordinal = 0;
        } else {
            ordinal = tpzVar.ordinal();
        }
        U(new agoi("restore_workflow_scratch_suffix.which_database", 1, Integer.valueOf(ordinal)));
    }
}
