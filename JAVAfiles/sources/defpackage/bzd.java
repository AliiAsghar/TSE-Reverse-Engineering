package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzd<T> {
    public final bwv a;
    public final boolean b;
    public final caj c;
    public final boolean d;
    public final Object e;
    public boolean f = true;

    public bzd(bwv bwvVar, Object obj, boolean z, caj cajVar, boolean z2) {
        this.a = bwvVar;
        this.b = z;
        this.c = cajVar;
        this.d = z2;
        this.e = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.e;
        if (obj != null) {
            return obj;
        }
        bwp.g("Unexpected form of a provided value");
        throw new armj();
    }
}
