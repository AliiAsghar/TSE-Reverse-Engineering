package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qmq extends unp {
    public static final alwo a = alwo.o("BugleContacts");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    private final arwe g;
    private final armf h;
    private final armf i;

    public qmq(arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        this.g = arweVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.h = armfVar6;
        this.i = armfVar7;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        return qno.b();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("BatchDeletedContactsSyncHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        qmr qmrVar = (qmr) apbtVar;
        qmrVar.getClass();
        c = qjh.c(this.g, arpj.a, arwf.a, new qmp(qmrVar, this, unsVar, null));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = qmr.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    public final void j(qmr qmrVar) {
        ((ahqr) this.f.b()).g(qld.g, null, ahqp.ERROR);
        ((ahqr) this.f.b()).g(qld.h, null, ahqp.ERROR);
        if (((oxg) this.h.b()).a() && qmrVar.c == qmrVar.d) {
            ((lgg) this.i.b()).g(new qab(5));
        }
    }
}
