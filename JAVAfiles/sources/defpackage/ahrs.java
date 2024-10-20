package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahrs extends ahrv {
    private final boolean b;

    public ahrs(asja asjaVar, boolean z) {
        super(asjaVar);
        this.b = z;
    }

    private final asja f() {
        if (this.b) {
            return this.a;
        }
        return e();
    }

    @Override // defpackage.ahrv
    public final long a(String str) {
        asja f = f();
        if (f.equals(asja.a)) {
            return 1000L;
        }
        return f.c;
    }

    @Override // defpackage.ahrv
    public final asja b(Long l) {
        return this.a;
    }

    @Override // defpackage.ahrv
    public final asja c(Long l) {
        return f();
    }

    @Override // defpackage.ahrv
    public final boolean d() {
        return this.b;
    }
}
