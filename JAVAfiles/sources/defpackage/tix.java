package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tix extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(tja tjaVar) {
        int ordinal;
        if (tjaVar == null) {
            ordinal = 0;
        } else {
            ordinal = tjaVar.ordinal();
        }
        U(new agoi("restore_workflow_files.file_type", 1, Integer.valueOf(ordinal)));
    }

    public final void c(long j) {
        U(new agoi("restore_workflow_files.workflow_execution_id", 1, Long.valueOf(j)));
    }
}
