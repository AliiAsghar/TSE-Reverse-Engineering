package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akgb extends akfc implements akfx {
    private final akfx a;

    public akgb() {
        throw null;
    }

    @Override // defpackage.akfd
    public final alpt b() {
        return new altx(this);
    }

    @Override // defpackage.akfx
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.akfx
    public final void d() {
        this.a.d();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akgb) {
            return this.a.equals(((akgb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SingleExternalKey{externalKey=" + this.a.toString() + "}";
    }

    public akgb(akfx akfxVar) {
        this.a = akfxVar;
    }
}
