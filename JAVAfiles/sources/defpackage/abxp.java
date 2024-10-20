package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abxp implements abxq {
    final /* synthetic */ abxr a;
    private final /* synthetic */ int b;

    public abxp(abxr abxrVar, int i) {
        this.b = i;
        this.a = abxrVar;
    }

    @Override // defpackage.abxq
    public final int a() {
        if (this.b != 0) {
            return 4;
        }
        return 5;
    }

    @Override // defpackage.abxq
    public final void b() {
        if (this.b != 0) {
            this.a.a.j();
        } else {
            this.a.a.h();
        }
    }
}
