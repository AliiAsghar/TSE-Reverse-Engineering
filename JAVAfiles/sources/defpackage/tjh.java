package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tjh extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(tjj tjjVar) {
        int ordinal;
        if (tjjVar == null) {
            ordinal = 0;
        } else {
            ordinal = tjjVar.ordinal();
        }
        U(new agoi("restore_workflow_scratch_duplicates.key", 1, Integer.valueOf(ordinal)));
    }
}
