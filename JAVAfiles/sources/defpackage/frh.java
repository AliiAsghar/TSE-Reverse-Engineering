package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class frh implements etm {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ frh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.etm
    public final void a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                ((fxm) this.a).b((fwo) obj);
                return;
            } else {
                ((apuv) obj).A((Exception) this.a);
                return;
            }
        }
        ((alob) this.a).h((xab) obj);
    }
}
