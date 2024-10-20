package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ueh implements uce {
    private final /* synthetic */ int a;

    @Override // defpackage.uce
    public final Object a() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            alvi alviVar = uci.a;
            return null;
        }
        throw new IllegalStateException("reentrant lock release callback not set or already completed");
    }
}
