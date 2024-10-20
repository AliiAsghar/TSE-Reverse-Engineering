package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asoy extends asmv {
    final /* synthetic */ aspc d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asoy(String str, aspc aspcVar, int i) {
        super(str);
        this.d = aspcVar;
        this.e = i;
    }

    @Override // defpackage.asmv
    public final long a() {
        synchronized (this.d) {
            this.d.w.remove(Integer.valueOf(this.e));
        }
        return -1L;
    }
}
