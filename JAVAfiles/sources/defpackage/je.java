package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class je implements eer {
    int a;
    final /* synthetic */ jf b;
    private boolean c = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public je(jf jfVar) {
        this.b = jfVar;
    }

    @Override // defpackage.eer
    public final void a() {
        if (this.c) {
            return;
        }
        jf jfVar = this.b;
        jfVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.eer
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    @Override // defpackage.eer
    public final void c() {
        this.c = true;
    }

    public final void d(efu efuVar, int i) {
        this.b.f = efuVar;
        this.a = i;
    }
}
