package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxu implements hya {
    private final int a;
    private hxv b;

    public hxu(int i) {
        this.a = i;
    }

    @Override // defpackage.hya
    public final hxz a(int i) {
        if (i == 5) {
            return hxx.a;
        }
        if (this.b == null) {
            this.b = new hxv(this.a);
        }
        return this.b;
    }
}
