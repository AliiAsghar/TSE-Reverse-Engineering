package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qw extends qs {
    public final int a;
    public final int b;

    public qw(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.qs
    public int p(oo ooVar) {
        return f(this.b, q(ooVar));
    }

    public int q(oo ooVar) {
        return this.a;
    }
}
