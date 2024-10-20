package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akhb implements akgs {
    private final akgs a;
    private akho b = null;

    public akhb(akgs akgsVar) {
        this.a = akgsVar;
    }

    @Override // defpackage.akgs
    public final void a(Throwable th) {
        aiut.c();
        akho akhoVar = this.b;
        akhm akhmVar = new akhm(th);
        this.b = akhmVar;
        if (!akhmVar.equals(akhoVar)) {
            this.a.a(th);
        }
    }

    @Override // defpackage.akgs
    public final void b(Object obj) {
        aiut.c();
        akho akhoVar = this.b;
        akhn akhnVar = new akhn(obj);
        this.b = akhnVar;
        if (!akhnVar.equals(akhoVar)) {
            this.a.b(obj);
        }
    }
}
