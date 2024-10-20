package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class hxo extends hxg {
    private final int a;
    private final int b;

    public hxo(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.hxq
    public final void d(hxp hxpVar) {
        if (hyv.n(this.a, this.b)) {
            hxpVar.g(this.a, this.b);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.a + " and height: " + this.b + ", either provide dimensions in the constructor or call override()");
    }

    @Override // defpackage.hxq
    public final void g(hxp hxpVar) {
    }
}
