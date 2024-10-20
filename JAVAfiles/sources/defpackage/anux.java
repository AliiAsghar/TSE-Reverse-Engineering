package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class anux implements antu {
    private final /* synthetic */ int a;

    @Override // defpackage.antu
    public final Object a(anme anmeVar) {
        byte[] bArr;
        Object aoccVar;
        byte[] bArr2;
        byte[] bArr3;
        switch (this.a) {
            case 0:
                antf antfVar = (antf) anmeVar;
                anua anuaVar = antfVar.e;
                aozy createBuilder = anxf.a.createBuilder();
                String str = anuaVar.a;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                str.getClass();
                ((anxf) apagVar).b = str;
                aozb aozbVar = anuaVar.c;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                aozbVar.getClass();
                ((anxf) apagVar2).c = aozbVar;
                int i = anuaVar.f;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                ((anxf) createBuilder.b).d = a.am(i);
                int ordinal = anuaVar.d.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                        } else {
                            antr.a.c();
                        }
                    }
                    antr.a(antfVar.a().intValue()).c();
                } else {
                    antr.b(antfVar.a().intValue()).c();
                }
                return new anvd(0);
            case 1:
                return new aoby((anur) anmeVar);
            case 2:
                return aobc.a((anyj) anmeVar);
            case 3:
                return aobd.b((anyk) anmeVar);
            case 4:
                anyo anyoVar = (anyo) anmeVar;
                byte[] y = anyoVar.f.y();
                anyoVar.I().c();
                anyoVar.F().e.equals(anym.c);
                return new aobg(y);
            case 5:
                anyq anyqVar = (anyq) anmeVar;
                if (anme.z(1)) {
                    byte[] c = anyqVar.f.c();
                    byte[] c2 = anyqVar.g.c();
                    if (anyqVar.e.e.equals(anym.c)) {
                        bArr = new byte[]{0};
                    } else {
                        bArr = new byte[0];
                    }
                    return new aobh(c, c2, bArr, 0);
                }
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            case 6:
                anua anuaVar2 = ((antf) anmeVar).e;
                aozy createBuilder2 = anxf.a.createBuilder();
                String str2 = anuaVar2.a;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar3 = createBuilder2.b;
                str2.getClass();
                ((anxf) apagVar3).b = str2;
                aozb aozbVar2 = anuaVar2.c;
                if (!apagVar3.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar4 = createBuilder2.b;
                aozbVar2.getClass();
                ((anxf) apagVar4).c = aozbVar2;
                int i2 = anuaVar2.f;
                if (!apagVar4.isMutable()) {
                    createBuilder2.u();
                }
                ((anxf) createBuilder2.b).d = a.am(i2);
                aobh.c(anuaVar2);
                aobh.b(anuaVar2);
                return new anzq();
            case 7:
                anua anuaVar3 = ((antf) anmeVar).e;
                aozy createBuilder3 = anxf.a.createBuilder();
                String str3 = anuaVar3.a;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar5 = createBuilder3.b;
                str3.getClass();
                ((anxf) apagVar5).b = str3;
                aozb aozbVar3 = anuaVar3.c;
                if (!apagVar5.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar6 = createBuilder3.b;
                aozbVar3.getClass();
                ((anxf) apagVar6).c = aozbVar3;
                int i3 = anuaVar3.f;
                if (!apagVar6.isMutable()) {
                    createBuilder3.u();
                }
                ((anxf) createBuilder3.b).d = a.am(i3);
                return new aobh((annh) anni.b((anxf) createBuilder3.s(), annh.class), aobh.c(anuaVar3), aobh.b(anuaVar3), 1);
            case 8:
                return aobz.a((anza) anmeVar);
            case 9:
                return aocb.b((anzb) anmeVar);
            case 10:
                anzi anziVar = (anzi) anmeVar;
                if (anzw.d()) {
                    if (anzw.d()) {
                        KeyFactory keyFactory = KeyFactory.getInstance("RSA", anzw.c);
                        anzg F = anziVar.F();
                        BigInteger bigInteger = anziVar.e.f;
                        BigInteger bigInteger2 = F.g;
                        Object obj = anziVar.f.a;
                        Object obj2 = anziVar.g.a;
                        Object obj3 = anziVar.h.a;
                        Object obj4 = anziVar.i.a;
                        BigInteger bigInteger3 = (BigInteger) anziVar.j.a;
                        BigInteger bigInteger4 = (BigInteger) obj3;
                        BigInteger bigInteger5 = (BigInteger) obj;
                        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, bigInteger2, bigInteger5, (BigInteger) obj2, bigInteger4, (BigInteger) obj4, bigInteger3, (BigInteger) anziVar.k.a));
                        anze anzeVar = F.i;
                        anze anzeVar2 = F.j;
                        int i4 = F.k;
                        anziVar.I().c();
                        F.h.equals(anzf.c);
                        return new anzq(rSAPrivateCrtKey, anzeVar, anzeVar2, i4);
                    }
                    throw new GeneralSecurityException("RSA SSA PSS using Conscrypt is not supported.");
                }
                KeyFactory keyFactory2 = (KeyFactory) aobo.g.a("RSA");
                BigInteger bigInteger6 = anziVar.e.f;
                BigInteger bigInteger7 = anziVar.F().g;
                Object obj5 = anziVar.f.a;
                Object obj6 = anziVar.g.a;
                Object obj7 = anziVar.h.a;
                Object obj8 = anziVar.i.a;
                BigInteger bigInteger8 = (BigInteger) anziVar.j.a;
                BigInteger bigInteger9 = (BigInteger) obj8;
                BigInteger bigInteger10 = (BigInteger) obj7;
                RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyFactory2.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger6, bigInteger7, (BigInteger) obj5, (BigInteger) obj6, bigInteger10, bigInteger9, bigInteger8, (BigInteger) anziVar.k.a));
                anzg F2 = anziVar.F();
                aobr aobrVar = (aobr) aocd.a.a(F2.i);
                aobr aobrVar2 = (aobr) aocd.a.a(F2.j);
                anziVar.I().c();
                anziVar.F().h.equals(anzf.c);
                return new anzq(rSAPrivateCrtKey2, aobrVar, aobrVar2);
            case 11:
                anzj anzjVar = (anzj) anmeVar;
                ansy ansyVar = aocd.a;
                if (anzw.d()) {
                    if (anzw.d()) {
                        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", anzw.c).generatePublic(new RSAPublicKeySpec(anzjVar.f, anzjVar.e.g));
                        anzg anzgVar = anzjVar.e;
                        anze anzeVar3 = anzgVar.i;
                        anze anzeVar4 = anzgVar.j;
                        int i5 = anzgVar.k;
                        byte[] c3 = anzjVar.g.c();
                        if (anzjVar.e.h.equals(anzf.c)) {
                            bArr3 = anzw.b;
                        } else {
                            bArr3 = anzw.a;
                        }
                        aoccVar = new anzw(rSAPublicKey, anzeVar3, anzeVar4, i5, c3, bArr3);
                    } else {
                        throw new GeneralSecurityException("RSA SSA PSS using Conscrypt is not supported.");
                    }
                } else {
                    RSAPublicKey rSAPublicKey2 = (RSAPublicKey) ((KeyFactory) aobo.g.a("RSA")).generatePublic(new RSAPublicKeySpec(anzjVar.f, anzjVar.e.g));
                    anzg anzgVar2 = anzjVar.e;
                    aobr aobrVar3 = (aobr) aocd.a.a(anzgVar2.i);
                    aobr aobrVar4 = (aobr) aocd.a.a(anzgVar2.j);
                    int i6 = anzgVar2.k;
                    byte[] c4 = anzjVar.g.c();
                    if (anzjVar.e.h.equals(anzf.c)) {
                        bArr2 = aocd.c;
                    } else {
                        bArr2 = aocd.b;
                    }
                    aoccVar = new aocc(rSAPublicKey2, aobrVar3, aobrVar4, i6, c4, bArr2);
                }
                return aoccVar;
            case 12:
                return new aoaq((anzx) anmeVar);
            case 13:
                return new aoay((aoab) anmeVar);
            default:
                anua anuaVar4 = ((antf) anmeVar).e;
                aozy createBuilder4 = anxf.a.createBuilder();
                String str4 = anuaVar4.a;
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                apag apagVar7 = createBuilder4.b;
                str4.getClass();
                ((anxf) apagVar7).b = str4;
                aozb aozbVar4 = anuaVar4.c;
                if (!apagVar7.isMutable()) {
                    createBuilder4.u();
                }
                apag apagVar8 = createBuilder4.b;
                aozbVar4.getClass();
                ((anxf) apagVar8).c = aozbVar4;
                int i7 = anuaVar4.f;
                if (!apagVar8.isMutable()) {
                    createBuilder4.u();
                }
                ((anxf) createBuilder4.b).d = a.am(i7);
                return new aoan((annk) anni.b((anxf) createBuilder4.s(), annk.class));
        }
    }
}
