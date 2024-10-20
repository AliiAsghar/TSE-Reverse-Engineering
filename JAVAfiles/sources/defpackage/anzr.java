package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class anzr implements antc {
    private final /* synthetic */ int a;

    public /* synthetic */ anzr(int i) {
        this.a = i;
    }

    @Override // defpackage.antc
    public final anuf a(anme anmeVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            aoab aoabVar = (aoab) anmeVar;
                            antv antvVar = aoam.a;
                            aozy createBuilder = anvt.a.createBuilder();
                            aozb w = aozb.w(aoabVar.f.y());
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            ((anvt) createBuilder.b).e = w;
                            anvv a = aoam.a(aoabVar.e);
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            anvt anvtVar = (anvt) createBuilder.b;
                            a.getClass();
                            anvtVar.d = a;
                            anvtVar.b |= 1;
                            return anua.a("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", ((anvt) createBuilder.s()).toByteString(), 3, anxp.RAW, null);
                        }
                        anzx anzxVar = (anzx) anmeVar;
                        antv antvVar2 = aoal.a;
                        aozy createBuilder2 = anvk.a.createBuilder();
                        aozb w2 = aozb.w(anzxVar.f.y());
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        ((anvk) createBuilder2.b).e = w2;
                        anvm a2 = aoal.a(anzxVar.e);
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        anvk anvkVar = (anvk) createBuilder2.b;
                        a2.getClass();
                        anvkVar.d = a2;
                        anvkVar.b |= 1;
                        return anua.a("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey", ((anvk) createBuilder2.s()).toByteString(), 3, anxp.RAW, null);
                    }
                    anzi anziVar = (anzi) anmeVar;
                    ansy ansyVar = anzv.a;
                    aozy createBuilder3 = anxx.a.createBuilder();
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    ((anxx) createBuilder3.b).c = 0;
                    anxy b = anzv.b(anziVar.e);
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    anxx anxxVar = (anxx) createBuilder3.b;
                    b.getClass();
                    anxxVar.d = b;
                    anxxVar.b |= 1;
                    aozb f = anzv.f(anziVar.f);
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    ((anxx) createBuilder3.b).e = f;
                    aozb f2 = anzv.f(anziVar.g);
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    ((anxx) createBuilder3.b).f = f2;
                    aozb f3 = anzv.f(anziVar.h);
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    ((anxx) createBuilder3.b).g = f3;
                    aozb f4 = anzv.f(anziVar.i);
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    ((anxx) createBuilder3.b).h = f4;
                    aozb f5 = anzv.f(anziVar.j);
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    ((anxx) createBuilder3.b).i = f5;
                    aozb f6 = anzv.f(anziVar.k);
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    ((anxx) createBuilder3.b).j = f6;
                    return anua.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((anxx) createBuilder3.s()).toByteString(), 4, (anxp) anzv.a.a(anziVar.F().h), anziVar.a());
                }
                anzj anzjVar = (anzj) anmeVar;
                return anua.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", anzv.b(anzjVar).toByteString(), 5, (anxp) anzv.a.a(anzjVar.e.h), anzjVar.h);
            }
            anzb anzbVar = (anzb) anmeVar;
            return anua.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", anzs.b(anzbVar).toByteString(), 5, (anxp) anzs.a.a(anzbVar.e.h), anzbVar.h);
        }
        anza anzaVar = (anza) anmeVar;
        ansy ansyVar2 = anzs.a;
        aozy createBuilder4 = anxt.a.createBuilder();
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        ((anxt) createBuilder4.b).c = 0;
        anxu b2 = anzs.b(anzaVar.e);
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        anxt anxtVar = (anxt) createBuilder4.b;
        b2.getClass();
        anxtVar.d = b2;
        anxtVar.b |= 1;
        aozb f7 = anzs.f(anzaVar.f);
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        ((anxt) createBuilder4.b).e = f7;
        aozb f8 = anzs.f(anzaVar.g);
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        ((anxt) createBuilder4.b).f = f8;
        aozb f9 = anzs.f(anzaVar.h);
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        ((anxt) createBuilder4.b).g = f9;
        aozb f10 = anzs.f(anzaVar.i);
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        ((anxt) createBuilder4.b).h = f10;
        aozb f11 = anzs.f(anzaVar.j);
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        ((anxt) createBuilder4.b).i = f11;
        aozb f12 = anzs.f(anzaVar.k);
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        ((anxt) createBuilder4.b).j = f12;
        return anua.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((anxt) createBuilder4.s()).toByteString(), 4, (anxp) anzs.a.a(anzaVar.F().h), anzaVar.a());
    }
}
