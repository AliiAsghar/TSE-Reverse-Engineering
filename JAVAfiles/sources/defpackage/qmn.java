package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qmn extends unp {
    public static final alwo a = alwo.o("BugleContacts");
    public final qls b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final uie i;
    public final qya j;
    public final hmk k;
    public final hmk l;
    private final arwe m;

    public qmn(arwe arweVar, uie uieVar, qls qlsVar, qya qyaVar, hmk hmkVar, armf armfVar, hmk hmkVar2, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        arweVar.getClass();
        uieVar.getClass();
        qlsVar.getClass();
        qyaVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        this.m = arweVar;
        this.i = uieVar;
        this.b = qlsVar;
        this.j = qyaVar;
        this.l = hmkVar;
        this.c = armfVar;
        this.k = hmkVar2;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
        this.g = armfVar5;
        this.h = armfVar6;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        return qno.b();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("BatchContactsImportHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        qmo qmoVar = (qmo) apbtVar;
        qmoVar.getClass();
        c = qjh.c(this.m, arpj.a, arwf.a, new qmm(qmoVar, this, unsVar, null));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = qmo.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    public final void j(qmo qmoVar) {
        ((mgv) this.d.b()).g(qld.g, ahqp.ERROR);
        ((mgv) this.d.b()).g(qld.h, ahqp.ERROR);
        if (((oxg) this.g.b()).a() && qmoVar.c == qmoVar.d) {
            ((lgg) this.h.b()).g(new qab(3));
        }
    }
}
