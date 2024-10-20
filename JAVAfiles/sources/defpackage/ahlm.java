package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahlm {
    public ahln a;
    public ahli b;
    public final ahll c = new ahll();

    public ahlm(ahlp ahlpVar, ahlt ahltVar, armf armfVar) {
        armfVar.getClass();
        alhr D = albo.D(new agud(armfVar, 10));
        ahln ahlnVar = new ahln(new ahlk(this, D, ahlpVar, 1));
        this.a = ahlnVar;
        ahlpVar.a(ahlnVar);
        ahli ahliVar = new ahli(new ahlk(this, D, ahltVar, 0));
        this.b = ahliVar;
        ahltVar.g.add(ahliVar);
    }

    public final void a(ahlj ahljVar) {
        this.c.b.add(ahljVar);
    }

    public final void b(ahlj ahljVar) {
        this.c.b.remove(ahljVar);
    }
}
