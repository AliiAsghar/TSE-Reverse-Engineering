package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uyj extends unp {
    public final xze a = xze.g("Lighter", "LighterAccountSwitchHandler");
    public final Optional b;
    public final Optional c;
    public final armf d;
    public final armf e;
    public final anen f;
    public final anen g;
    private final agxw h;

    public uyj(armf armfVar, armf armfVar2, agxw agxwVar, armf armfVar3, armf armfVar4, anen anenVar, anen anenVar2) {
        this.b = (Optional) ((apxx) armfVar).a;
        this.c = (Optional) armfVar2.b();
        this.h = agxwVar;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = anenVar;
        this.g = anenVar2;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("LighterAccountSwitchHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        uyk uykVar = (uyk) apbtVar;
        if (this.b.isEmpty()) {
            D.q("LighterAccounts is missing");
            return aktp.ag(upm.d());
        }
        this.a.l("Starting task to switch lighter account");
        return akul.g(this.h.k(uykVar.b)).h(new uyi(2), this.f).f(ajzn.class, new uwa(this, 4), this.f).i(new uwa(this, 5), this.f);
    }

    @Override // defpackage.unx
    public final apca e() {
        return uyk.a.getParserForType();
    }
}
