package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uyn extends unp {
    public final xze a = xze.g("Lighter", "LighterCleanUpHandler");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final anen f;
    public final Optional g;

    public uyn(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, Optional optional, anen anenVar) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.g = optional;
        this.f = anenVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a = unf.a();
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        a.a = gsdVar.a();
        return a.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("LighterCleanUpHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        return ((vco) this.c.b()).g().h(new uvz(this, (uyo) apbtVar, 4), this.f).e(Exception.class, new uyi(3), andi.a);
    }

    @Override // defpackage.unx
    public final apca e() {
        return uyo.a.getParserForType();
    }
}
