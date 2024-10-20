package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ahrv {
    protected final asja a;

    public ahrv(asja asjaVar) {
        this.a = asjaVar;
    }

    public abstract long a(String str);

    public abstract asja b(Long l);

    public abstract asja c(Long l);

    public abstract boolean d();

    public final asja e() {
        aozy builder = b(null).toBuilder();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        asja asjaVar = (asja) builder.b;
        asjaVar.b |= 2;
        asjaVar.c = -1L;
        return (asja) builder.s();
    }
}
