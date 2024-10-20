package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kno extends knj {
    private final knp g;

    public kno(kni kniVar, knp knpVar) {
        super(kniVar, "GServices and Phenotype logging");
        this.g = knpVar;
    }

    @Override // defpackage.knj
    public final knk a() {
        this.f.j("GServices keys and values:");
        this.f.j(this.g.a);
        this.f.j("Phenotype keys and values:");
        this.f.j(this.g.b);
        return knk.a;
    }
}
