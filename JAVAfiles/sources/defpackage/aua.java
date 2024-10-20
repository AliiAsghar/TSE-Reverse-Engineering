package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aua implements arh {
    private final avc a;

    public aua(avc avcVar) {
        this.a = avcVar;
    }

    @Override // defpackage.arh
    public final int a() {
        return Math.max(0, this.a.d);
    }

    @Override // defpackage.arh
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.arh
    public final int c() {
        return Math.min(b() - 1, ((aty) aqjn.ac(this.a.p().g())).a());
    }

    @Override // defpackage.arh
    public final boolean d() {
        if (!this.a.p().g().isEmpty()) {
            return true;
        }
        return false;
    }
}
