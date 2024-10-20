package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arpb implements arph {
    private final arqr a;
    private final arph b;

    public arpb(arph arphVar, arqr arqrVar) {
        this.a = arqrVar;
        this.b = arphVar instanceof arpb ? ((arpb) arphVar).b : arphVar;
    }

    public final arpg a(arpg arpgVar) {
        return (arpg) this.a.a(arpgVar);
    }

    public final boolean b(arph arphVar) {
        arphVar.getClass();
        if (arphVar != this && this.b != arphVar) {
            return false;
        }
        return true;
    }

    public arpb() {
        this(arpf.k, arua.e);
    }
}
