package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arvx {
    public final Throwable b;
    public final arvb c;

    public arvx(Throwable th, boolean z) {
        this.b = th;
        this.c = new arvb(z, arvf.a);
    }

    public final boolean a() {
        return this.c.a(false, true);
    }

    public final String toString() {
        return arwi.a(this) + "[" + this.b + "]";
    }

    public /* synthetic */ arvx(Throwable th) {
        this(th, false);
    }
}
