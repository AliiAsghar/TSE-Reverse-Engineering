package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ant implements arh {
    private final aov a;

    public ant(aov aovVar) {
        this.a = aovVar;
    }

    @Override // defpackage.arh
    public final int a() {
        return Math.max(0, this.a.b());
    }

    @Override // defpackage.arh
    public final int b() {
        return this.a.d().d();
    }

    @Override // defpackage.arh
    public final int c() {
        return Math.min(b() - 1, ((anw) aqjn.ac(this.a.d().i())).a());
    }

    @Override // defpackage.arh
    public final boolean d() {
        if (!this.a.d().i().isEmpty()) {
            return true;
        }
        return false;
    }
}
