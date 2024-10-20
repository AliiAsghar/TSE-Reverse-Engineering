package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arfr implements arfu {
    final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public arfr(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.arfu
    public final void a(arga argaVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                argaVar.a.g(this.a);
                return;
            } else {
                argaVar.a.k(this.a);
                return;
            }
        }
        argaVar.a.l(this.a);
    }
}
