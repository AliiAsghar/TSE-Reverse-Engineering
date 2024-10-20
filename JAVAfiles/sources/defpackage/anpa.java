package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class anpa implements antc {
    private final /* synthetic */ int a;

    public /* synthetic */ anpa(int i) {
        this.a = i;
    }

    @Override // defpackage.antc
    public final anuf a(anme anmeVar) {
        switch (this.a) {
            case 0:
                anou anouVar = (anou) anmeVar;
                antv antvVar = anpc.a;
                aozy createBuilder = anxn.a.createBuilder();
                anxo b = anpc.b(anouVar.e);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                anxn anxnVar = (anxn) createBuilder.b;
                b.getClass();
                anxnVar.d = b;
                anxnVar.b |= 1;
                return anua.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((anxn) createBuilder.s()).toByteString(), 6, anpc.c(anouVar.e.e), anouVar.g);
            case 1:
                anoq anoqVar = (anoq) anmeVar;
                antv antvVar2 = anot.a;
                aozy createBuilder2 = anxl.a.createBuilder();
                aozy createBuilder3 = anxm.a.createBuilder();
                String str = anoqVar.e.e;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                anxm anxmVar = (anxm) createBuilder3.b;
                str.getClass();
                anxmVar.b = str;
                anxm anxmVar2 = (anxm) createBuilder3.s();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                anxl anxlVar = (anxl) createBuilder2.b;
                anxmVar2.getClass();
                anxlVar.d = anxmVar2;
                anxlVar.b |= 1;
                return anua.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((anxl) createBuilder2.s()).toByteString(), 6, anot.b(anoqVar.e.f), anoqVar.g);
            case 2:
                annp annpVar = (annp) anmeVar;
                antv antvVar3 = anpn.a;
                aozy createBuilder4 = anvi.a.createBuilder();
                aozy createBuilder5 = anvn.a.createBuilder();
                aozy createBuilder6 = anvp.a.createBuilder();
                int i = annpVar.e.g;
                if (!createBuilder6.b.isMutable()) {
                    createBuilder6.u();
                }
                ((anvp) createBuilder6.b).b = i;
                anvp anvpVar = (anvp) createBuilder6.s();
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                anvn anvnVar = (anvn) createBuilder5.b;
                anvpVar.getClass();
                anvnVar.d = anvpVar;
                anvnVar.b |= 1;
                aozb w = aozb.w(annpVar.h.y());
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                ((anvn) createBuilder5.b).e = w;
                anvn anvnVar2 = (anvn) createBuilder5.s();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                anvi anviVar = (anvi) createBuilder4.b;
                anvnVar2.getClass();
                anviVar.d = anvnVar2;
                anviVar.b |= 1;
                aozy createBuilder7 = anwv.a.createBuilder();
                anwx c = anpn.c(annpVar.e);
                if (!createBuilder7.b.isMutable()) {
                    createBuilder7.u();
                }
                anwv anwvVar = (anwv) createBuilder7.b;
                c.getClass();
                anwvVar.d = c;
                anwvVar.b |= 1;
                aozb w2 = aozb.w(annpVar.i.y());
                if (!createBuilder7.b.isMutable()) {
                    createBuilder7.u();
                }
                ((anwv) createBuilder7.b).e = w2;
                anwv anwvVar2 = (anwv) createBuilder7.s();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                anvi anviVar2 = (anvi) createBuilder4.b;
                anwvVar2.getClass();
                anviVar2.e = anwvVar2;
                anviVar2.b |= 2;
                return anua.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((anvi) createBuilder4.s()).toByteString(), 3, anpn.d(annpVar.e.i), annpVar.g);
            case 3:
                annv annvVar = (annv) anmeVar;
                antv antvVar4 = anpo.a;
                aozy createBuilder8 = anvq.a.createBuilder();
                anvs b2 = anpo.b(annvVar.e);
                if (!createBuilder8.b.isMutable()) {
                    createBuilder8.u();
                }
                anvq anvqVar = (anvq) createBuilder8.b;
                b2.getClass();
                anvqVar.d = b2;
                anvqVar.b |= 1;
                aozb w3 = aozb.w(annvVar.h.y());
                if (!createBuilder8.b.isMutable()) {
                    createBuilder8.u();
                }
                ((anvq) createBuilder8.b).e = w3;
                return anua.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((anvq) createBuilder8.s()).toByteString(), 3, anpo.c(annvVar.e.h), annvVar.g);
            case 4:
                anoa anoaVar = (anoa) anmeVar;
                anpr.c(anoaVar.e);
                aozy createBuilder9 = anvw.a.createBuilder();
                aozb w4 = aozb.w(anoaVar.h.y());
                if (!createBuilder9.b.isMutable()) {
                    createBuilder9.u();
                }
                ((anvw) createBuilder9.b).c = w4;
                return anua.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((anvw) createBuilder9.s()).toByteString(), 3, anpr.b(anoaVar.e.h), anoaVar.g);
            case 5:
                anof anofVar = (anof) anmeVar;
                antv antvVar5 = anps.a;
                aozy createBuilder10 = anvy.a.createBuilder();
                aozb w5 = aozb.w(anofVar.h.y());
                if (!createBuilder10.b.isMutable()) {
                    createBuilder10.u();
                }
                ((anvy) createBuilder10.b).c = w5;
                return anua.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((anvy) createBuilder10.s()).toByteString(), 3, anps.b(anofVar.e.f), anofVar.g);
            case 6:
                anoj anojVar = (anoj) anmeVar;
                antv antvVar6 = anpv.a;
                aozy createBuilder11 = anwc.a.createBuilder();
                aozb w6 = aozb.w(anojVar.h.y());
                if (!createBuilder11.b.isMutable()) {
                    createBuilder11.u();
                }
                ((anwc) createBuilder11.b).c = w6;
                return anua.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((anwc) createBuilder11.s()).toByteString(), 3, anpv.b(anojVar.e.e), anojVar.g);
            case 7:
                anpf anpfVar = (anpf) anmeVar;
                antv antvVar7 = anqe.a;
                aozy createBuilder12 = anxz.a.createBuilder();
                aozb w7 = aozb.w(anpfVar.h.y());
                if (!createBuilder12.b.isMutable()) {
                    createBuilder12.u();
                }
                ((anxz) createBuilder12.b).e = w7;
                aozy createBuilder13 = anyb.a.createBuilder();
                int i2 = anpfVar.e.f;
                if (!createBuilder13.b.isMutable()) {
                    createBuilder13.u();
                }
                ((anyb) createBuilder13.b).b = i2;
                anyb anybVar = (anyb) createBuilder13.s();
                if (!createBuilder12.b.isMutable()) {
                    createBuilder12.u();
                }
                anxz anxzVar = (anxz) createBuilder12.b;
                anybVar.getClass();
                anxzVar.d = anybVar;
                anxzVar.b |= 1;
                return anua.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((anxz) createBuilder12.s()).toByteString(), 3, anqe.b(anpfVar.e.e), anpfVar.g);
            case 8:
                anpj anpjVar = (anpj) anmeVar;
                antv antvVar8 = anqf.a;
                aozy createBuilder14 = anyc.a.createBuilder();
                aozb w8 = aozb.w(anpjVar.h.y());
                if (!createBuilder14.b.isMutable()) {
                    createBuilder14.u();
                }
                ((anyc) createBuilder14.b).c = w8;
                return anua.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((anyc) createBuilder14.s()).toByteString(), 3, anqf.b(anpjVar.e.e), anpjVar.g);
            case 9:
                anqj anqjVar = (anqj) anmeVar;
                antv antvVar9 = anqq.a;
                aozy createBuilder15 = anwa.a.createBuilder();
                aozb w9 = aozb.w(anqjVar.h.y());
                if (!createBuilder15.b.isMutable()) {
                    createBuilder15.u();
                }
                ((anwa) createBuilder15.b).c = w9;
                return anua.a("type.googleapis.com/google.crypto.tink.AesSivKey", ((anwa) createBuilder15.s()).toByteString(), 3, anqq.b(anqjVar.e.f), anqjVar.g);
            case 10:
                anri anriVar = (anri) anmeVar;
                return anua.a("type.googleapis.com/google.crypto.tink.HpkePublicKey", anrh.c(anriVar).toByteString(), 5, (anxp) anrh.a.a(anriVar.e.h), anriVar.h);
            case 11:
                anrg anrgVar = (anrg) anmeVar;
                ansy ansyVar = anrh.a;
                aozy createBuilder16 = anxd.a.createBuilder();
                if (!createBuilder16.b.isMutable()) {
                    createBuilder16.u();
                }
                ((anxd) createBuilder16.b).c = 0;
                anxe c2 = anrh.c(anrgVar.e);
                if (!createBuilder16.b.isMutable()) {
                    createBuilder16.u();
                }
                anxd anxdVar = (anxd) createBuilder16.b;
                c2.getClass();
                anxdVar.d = c2;
                anxdVar.b |= 1;
                aozb w10 = aozb.w(anrgVar.f.y());
                if (!createBuilder16.b.isMutable()) {
                    createBuilder16.u();
                }
                ((anxd) createBuilder16.b).e = w10;
                return anua.a("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((anxd) createBuilder16.s()).toByteString(), 4, (anxp) anrh.a.a(anrgVar.F().h), anrgVar.a());
            case 12:
                anqz anqzVar = (anqz) anmeVar;
                return anua.a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", anrx.d(anqzVar).toByteString(), 5, (anxp) anrx.a.a(anqzVar.e.i), anqzVar.i);
            case 13:
                anqy anqyVar = (anqy) anmeVar;
                ansy ansyVar2 = anrx.a;
                aozy createBuilder17 = anwm.a.createBuilder();
                if (!createBuilder17.b.isMutable()) {
                    createBuilder17.u();
                }
                ((anwm) createBuilder17.b).c = 0;
                anwn d = anrx.d(anqyVar.e);
                if (!createBuilder17.b.isMutable()) {
                    createBuilder17.u();
                }
                anwm anwmVar = (anwm) createBuilder17.b;
                d.getClass();
                anwmVar.d = d;
                anwmVar.b |= 1;
                if (anqyVar.F().f.equals(anqt.d)) {
                    aozb w11 = aozb.w(anqyVar.f.y());
                    if (!createBuilder17.b.isMutable()) {
                        createBuilder17.u();
                    }
                    ((anwm) createBuilder17.b).e = w11;
                } else {
                    aozb w12 = aozb.w(anme.x((BigInteger) anqyVar.g.a, anrx.a(anqyVar.F().f)));
                    if (!createBuilder17.b.isMutable()) {
                        createBuilder17.u();
                    }
                    ((anwm) createBuilder17.b).e = w12;
                }
                return anua.a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((anwm) createBuilder17.s()).toByteString(), 4, (anxp) anrx.a.a(anqyVar.F().i), anqyVar.a());
            case 14:
                return ((antf) anmeVar).e;
            case 15:
                anul anulVar = (anul) anmeVar;
                antv antvVar10 = anva.a;
                aozy createBuilder18 = anvf.a.createBuilder();
                anvh b3 = anva.b(anulVar.e);
                if (!createBuilder18.b.isMutable()) {
                    createBuilder18.u();
                }
                anvf anvfVar = (anvf) createBuilder18.b;
                b3.getClass();
                anvfVar.e = b3;
                anvfVar.b |= 1;
                aozb w13 = aozb.w(anulVar.h.y());
                if (!createBuilder18.b.isMutable()) {
                    createBuilder18.u();
                }
                ((anvf) createBuilder18.b).d = w13;
                return anua.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((anvf) createBuilder18.s()).toByteString(), 3, anva.c(anulVar.e.g), anulVar.g);
            case 16:
                anur anurVar = (anur) anmeVar;
                ansy ansyVar3 = anvc.a;
                aozy createBuilder19 = anwv.a.createBuilder();
                anwx a = anvc.a(anurVar.e);
                if (!createBuilder19.b.isMutable()) {
                    createBuilder19.u();
                }
                anwv anwvVar3 = (anwv) createBuilder19.b;
                a.getClass();
                anwvVar3.d = a;
                anwvVar3.b |= 1;
                aozb w14 = aozb.w(anurVar.h.y());
                if (!createBuilder19.b.isMutable()) {
                    createBuilder19.u();
                }
                ((anwv) createBuilder19.b).e = w14;
                return anua.a("type.googleapis.com/google.crypto.tink.HmacKey", ((anwv) createBuilder19.s()).toByteString(), 3, (anxp) anvc.a.a(anurVar.e.g), anurVar.g);
            case 17:
                anyk anykVar = (anyk) anmeVar;
                return anua.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", anzo.c(anykVar).toByteString(), 5, anzo.d(anykVar.e.h), anykVar.h);
            case 18:
                anyj anyjVar = (anyj) anmeVar;
                antv antvVar11 = anzo.a;
                int a2 = anzo.a(anyjVar.F().f);
                aozy createBuilder20 = anwh.a.createBuilder();
                anwi c3 = anzo.c(anyjVar.e);
                if (!createBuilder20.b.isMutable()) {
                    createBuilder20.u();
                }
                anwh anwhVar = (anwh) createBuilder20.b;
                c3.getClass();
                anwhVar.d = c3;
                anwhVar.b |= 1;
                aozb w15 = aozb.w(anme.x((BigInteger) anyjVar.f.a, a2));
                if (!createBuilder20.b.isMutable()) {
                    createBuilder20.u();
                }
                ((anwh) createBuilder20.b).e = w15;
                return anua.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((anwh) createBuilder20.s()).toByteString(), 4, anzo.d(anyjVar.F().h), anyjVar.a());
            case 19:
                anyq anyqVar = (anyq) anmeVar;
                return anua.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", anzp.a(anyqVar).toByteString(), 5, (anxp) anzp.a.a(anyqVar.e.e), anyqVar.h);
            default:
                anyo anyoVar = (anyo) anmeVar;
                ansy ansyVar4 = anzp.a;
                aozy createBuilder21 = anwq.a.createBuilder();
                anwr a3 = anzp.a(anyoVar.e);
                if (!createBuilder21.b.isMutable()) {
                    createBuilder21.u();
                }
                anwq anwqVar = (anwq) createBuilder21.b;
                a3.getClass();
                anwqVar.e = a3;
                anwqVar.b |= 1;
                aozb w16 = aozb.w(anyoVar.f.y());
                if (!createBuilder21.b.isMutable()) {
                    createBuilder21.u();
                }
                ((anwq) createBuilder21.b).d = w16;
                return anua.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((anwq) createBuilder21.s()).toByteString(), 4, (anxp) anzp.a.a(anyoVar.F().e), anyoVar.a());
        }
    }
}
