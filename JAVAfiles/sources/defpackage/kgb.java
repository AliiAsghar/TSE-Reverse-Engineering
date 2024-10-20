package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgb {
    public volatile int a;
    private final armf b;

    public kgb(armf armfVar) {
        armfVar.getClass();
        this.b = armfVar;
    }

    public final void a() {
        this.a++;
    }

    public final boolean b() {
        if (this.a > ((Number) this.b.b()).longValue()) {
            return true;
        }
        return false;
    }
}
