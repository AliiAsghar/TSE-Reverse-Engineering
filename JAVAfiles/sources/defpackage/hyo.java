package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyo implements hyp {
    final /* synthetic */ hyp a;
    private volatile Object b;

    public hyo(hyp hypVar) {
        this.a = hypVar;
    }

    @Override // defpackage.hyp
    public final Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    Object a = this.a.a();
                    hwr.i(a);
                    this.b = a;
                }
            }
        }
        return this.b;
    }
}
