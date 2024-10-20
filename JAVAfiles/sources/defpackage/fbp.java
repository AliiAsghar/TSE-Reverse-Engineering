package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fbp implements etv {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ fbp(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.etv
    public final void a(Object obj) {
        if (this.b != 0) {
            int i = fad.G;
            ((err) obj).u();
            return;
        }
        int i2 = this.a;
        fbw fbwVar = (fbw) obj;
        if (i2 == 1) {
            fbwVar.m = true;
            i2 = 1;
        }
        fbwVar.i = i2;
    }
}
