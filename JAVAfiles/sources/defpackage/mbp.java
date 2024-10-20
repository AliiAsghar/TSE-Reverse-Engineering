package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mbp extends mbr {
    final /* synthetic */ mbs a;
    private final amdy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbp(mbs mbsVar, String str, amdy amdyVar, String str2, long j) {
        super(mbsVar, str, str2, j);
        this.a = mbsVar;
        this.d = amdyVar;
    }

    @Override // defpackage.mbr
    protected final void e(long j) {
        ((mbl) this.a.d.b()).b(this.b, this.d, j);
    }
}
