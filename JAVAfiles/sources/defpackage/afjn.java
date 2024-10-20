package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afjn {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/core/data/usage/EntityUsageProcessor");
    public final arwe b;
    public final anca c;
    public final afjs d;
    public final afjy e;
    private final afke f;
    private final arml g;
    private final addp h;

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    public afjn(addp addpVar, arwe arweVar, afjy afjyVar, anca ancaVar, afke afkeVar, afka afkaVar) {
        this.h = addpVar;
        this.b = arweVar;
        this.e = afjyVar;
        this.c = ancaVar;
        this.f = afkeVar;
        aeys aeysVar = aeys.o;
        anca ancaVar2 = (anca) addpVar.b.b();
        ancaVar2.getClass();
        afke afkeVar2 = (afke) addpVar.a.b();
        afkeVar2.getClass();
        this.d = new afjs(ancaVar2, afkeVar2, afkaVar, aeysVar);
        this.g = armd.a(new afjm(this, 0));
        armd.a(new afjm(this, 2));
    }

    public final arwl a() {
        return (arwl) this.g.a();
    }

    public final asai b(afiu afiuVar) {
        return (asai) this.f.d("EntityUsageProcessor#observeFrecency", new aenj(this, afiuVar, 14));
    }

    public final ascv c(afiu afiuVar) {
        afiuVar.getClass();
        return (ascv) this.f.d("EntityUsageProcessor#observeFrecency", new aenj(this, afiuVar, 15));
    }

    public final boolean d() {
        return a().A();
    }
}
