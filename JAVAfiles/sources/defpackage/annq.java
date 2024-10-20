package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class annq implements antu {
    private final /* synthetic */ int a;

    @Override // defpackage.antu
    public final Object a(anme anmeVar) {
        byte[] c;
        byte[] bArr;
        byte[] c2;
        byte[] c3;
        int i;
        aobi aobiVar;
        ansk anskVar;
        switch (this.a) {
            case 0:
                return aobl.c((annp) anmeVar);
            case 1:
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
                int i2 = anuaVar.f;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                ((anxf) createBuilder.b).d = a.am(i2);
                anxp anxpVar = anuaVar.d;
                int ordinal = anxpVar.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(anxpVar))));
                            }
                        } else {
                            c = antr.a.c();
                        }
                    }
                    c = antr.a(antfVar.a().intValue()).c();
                } else {
                    c = antr.b(antfVar.a().intValue()).c();
                }
                return new anqd(c, 0);
            case 2:
                annv annvVar = (annv) anmeVar;
                int i3 = aoav.a;
                if (anme.z(1)) {
                    annz annzVar = annvVar.e;
                    byte[] y = annvVar.h.y();
                    int i4 = annvVar.e.f;
                    annvVar.f.c();
                    return new aoav(y, i4);
                }
                throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
            case 3:
                anoa anoaVar = (anoa) anmeVar;
                anoe anoeVar = anoaVar.e;
                return new aoaz(anoaVar.h.y(), anoaVar.f);
            case 4:
                anof anofVar = (anof) anmeVar;
                byte[] y2 = anofVar.h.y();
                anofVar.f.c();
                return new anqh(y2);
            case 5:
                anoj anojVar = (anoj) anmeVar;
                antv antvVar = anok.a;
                if (anpu.d()) {
                    byte[] y3 = anojVar.h.y();
                    anojVar.f.c();
                    return new anpu(y3);
                }
                byte[] y4 = anojVar.h.y();
                anojVar.f.c();
                return new anqd(y4, 4, (char[]) null);
            case 6:
                anoq anoqVar = (anoq) anmeVar;
                String str2 = anoqVar.e.e;
                antv antvVar2 = anon.a;
                annd.a(str2).a(str2);
                return anqd.c(anoqVar.f);
            case 7:
                anou anouVar = (anou) anmeVar;
                anox anoxVar = anouVar.e;
                String str3 = anoxVar.f;
                anme anmeVar2 = anoxVar.g;
                anmw anmwVar = anop.a;
                annd.a(str3).a(str3);
                int i5 = anoo.a;
                try {
                    byte[] p = anme.p(anmeVar2);
                    aozs aozsVar = aozs.a;
                    apcc apccVar = apcc.a;
                    new anoo((anxg) apag.parseFrom(anxg.a, p, aozs.a));
                    return anqd.c(anouVar.f);
                } catch (apba e) {
                    throw new GeneralSecurityException(e);
                }
            case 8:
                anpf anpfVar = (anpf) anmeVar;
                anpi anpiVar = anpfVar.e;
                byte[] y5 = anpfVar.h.y();
                aocj aocjVar = anpfVar.f;
                anpi anpiVar2 = anpfVar.e;
                return new anqd(y5, aocjVar, 2);
            case 9:
                anpj anpjVar = (anpj) anmeVar;
                antv antvVar3 = anpk.a;
                if (anqd.d()) {
                    byte[] y6 = anpjVar.h.y();
                    anpjVar.f.c();
                    return new anqd(y6, 3, (byte[]) null);
                }
                byte[] y7 = anpjVar.h.y();
                anpjVar.f.c();
                return new anqd(y7, 5, (short[]) null);
            case 10:
                anqj anqjVar = (anqj) anmeVar;
                anqk.a(anqjVar.e);
                return aobb.a(anqjVar);
            case 11:
                antf antfVar2 = (antf) anmeVar;
                anua anuaVar2 = antfVar2.e;
                aozy createBuilder2 = anxf.a.createBuilder();
                String str4 = anuaVar2.a;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar3 = createBuilder2.b;
                str4.getClass();
                ((anxf) apagVar3).b = str4;
                aozb aozbVar2 = anuaVar2.c;
                if (!apagVar3.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar4 = createBuilder2.b;
                aozbVar2.getClass();
                ((anxf) apagVar4).c = aozbVar2;
                int i6 = anuaVar2.f;
                if (!apagVar4.isMutable()) {
                    createBuilder2.u();
                }
                ((anxf) createBuilder2.b).d = a.am(i6);
                anxp anxpVar2 = anuaVar2.d;
                int ordinal2 = anxpVar2.ordinal();
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            if (ordinal2 != 4) {
                                throw new GeneralSecurityException(hht.i(anxpVar2, "unknown output prefix type "));
                            }
                        } else {
                            antr.a.c();
                        }
                    }
                    antr.a(antfVar2.a().intValue()).c();
                } else {
                    antr.b(antfVar2.a().intValue()).c();
                }
                return new anqr();
            case 12:
                anqy anqyVar = (anqy) anmeVar;
                ECPrivateKey z = aode.z((aobi) aobf.a.a(anqyVar.F().f), anme.w((BigInteger) anqyVar.g.a));
                byte[] bArr2 = new byte[0];
                if (anqyVar.F().j != null) {
                    bArr2 = anqyVar.F().j.c();
                }
                return new aobe(z, bArr2, aobf.b(anqyVar.F().g), (aobk) aobf.b.a(anqyVar.F().h), anrw.a(anqyVar.F()), anqyVar.I().c());
            case 13:
                anqz anqzVar = (anqz) anmeVar;
                ECPublicKey C = aode.C((aobi) aobf.a.a(anqzVar.e.f), anqzVar.f.getAffineX().toByteArray(), anqzVar.f.getAffineY().toByteArray());
                aocj aocjVar2 = anqzVar.e.j;
                byte[] bArr3 = new byte[0];
                if (aocjVar2 != null) {
                    bArr = aocjVar2.c();
                } else {
                    bArr = bArr3;
                }
                return new aobf(C, bArr, aobf.b(anqzVar.e.g), (aobk) aobf.b.a(anqzVar.e.h), anrw.a(anqzVar.e), anqzVar.h.c());
            case 14:
                antf antfVar3 = (antf) anmeVar;
                anua anuaVar3 = antfVar3.e;
                aozy createBuilder3 = anxf.a.createBuilder();
                String str5 = anuaVar3.a;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar5 = createBuilder3.b;
                str5.getClass();
                ((anxf) apagVar5).b = str5;
                aozb aozbVar3 = anuaVar3.c;
                if (!apagVar5.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar6 = createBuilder3.b;
                aozbVar3.getClass();
                ((anxf) apagVar6).c = aozbVar3;
                int i7 = anuaVar3.f;
                if (!apagVar6.isMutable()) {
                    createBuilder3.u();
                }
                ((anxf) createBuilder3.b).d = a.am(i7);
                anmu anmuVar = (anmu) anni.b((anxf) createBuilder3.s(), anmu.class);
                anxp anxpVar3 = anuaVar3.d;
                int ordinal3 = anxpVar3.ordinal();
                if (ordinal3 != 1) {
                    if (ordinal3 != 2) {
                        if (ordinal3 != 3) {
                            if (ordinal3 != 4) {
                                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(anxpVar3))));
                            }
                        } else {
                            c2 = antr.a.c();
                        }
                    }
                    c2 = antr.a(antfVar3.a().intValue()).c();
                } else {
                    c2 = antr.b(antfVar3.a().intValue()).c();
                }
                return new ansg(anmuVar, c2);
            case 15:
                antf antfVar4 = (antf) anmeVar;
                anua anuaVar4 = antfVar4.e;
                aozy createBuilder4 = anxf.a.createBuilder();
                String str6 = anuaVar4.a;
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                apag apagVar7 = createBuilder4.b;
                str6.getClass();
                ((anxf) apagVar7).b = str6;
                aozb aozbVar4 = anuaVar4.c;
                if (!apagVar7.isMutable()) {
                    createBuilder4.u();
                }
                apag apagVar8 = createBuilder4.b;
                aozbVar4.getClass();
                ((anxf) apagVar8).c = aozbVar4;
                int i8 = anuaVar4.f;
                if (!apagVar8.isMutable()) {
                    createBuilder4.u();
                }
                ((anxf) createBuilder4.b).d = a.am(i8);
                anmv anmvVar = (anmv) anni.b((anxf) createBuilder4.s(), anmv.class);
                anxp anxpVar4 = anuaVar4.d;
                int ordinal4 = anxpVar4.ordinal();
                if (ordinal4 != 1) {
                    if (ordinal4 != 2) {
                        if (ordinal4 != 3) {
                            if (ordinal4 != 4) {
                                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(anxpVar4))));
                            }
                        } else {
                            c3 = antr.a.c();
                        }
                    }
                    c3 = antr.a(antfVar4.a().intValue()).c();
                } else {
                    c3 = antr.b(antfVar4.a().intValue()).c();
                }
                return new ansh(anmvVar, c3);
            case 16:
                anrg anrgVar = (anrg) anmeVar;
                anrf F = anrgVar.F();
                anrd anrdVar = F.e;
                anrc anrcVar = F.f;
                anra anraVar = F.g;
                ansc c4 = ansb.c(anrdVar);
                ahmn d = ansb.d(anrcVar);
                anry b = ansb.b(anraVar);
                if (anrdVar.equals(anrd.f)) {
                    i = 32;
                } else if (anrdVar.equals(anrd.a)) {
                    i = 65;
                } else if (anrdVar.equals(anrd.b)) {
                    i = 97;
                } else if (anrdVar.equals(anrd.c)) {
                    i = 133;
                } else {
                    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                }
                int i9 = i;
                anrd anrdVar2 = anrgVar.F().e;
                if (anrdVar2.equals(anrd.f)) {
                    byte[] y8 = anrgVar.f.y();
                    anskVar = new ansk(y8, aode.e(y8), 0);
                } else {
                    if (!anrdVar2.equals(anrd.a) && !anrdVar2.equals(anrd.b) && !anrdVar2.equals(anrd.c)) {
                        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                    }
                    byte[] y9 = anrgVar.f.y();
                    byte[] c5 = anrgVar.e.f.c();
                    if (anrdVar2.equals(anrd.a)) {
                        aobiVar = aobi.NIST_P256;
                    } else if (anrdVar2.equals(anrd.b)) {
                        aobiVar = aobi.NIST_P384;
                    } else if (anrdVar2.equals(anrd.c)) {
                        aobiVar = aobi.NIST_P521;
                    } else {
                        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                    }
                    ECPublicKey B = aode.B(aobiVar, aobk.UNCOMPRESSED, c5);
                    ECPrivateKey z2 = aode.z(aobiVar, y9);
                    aode.H(B, z2);
                    ansx.f(B.getW(), z2.getParams().getCurve());
                    anskVar = new ansk(y9, c5, 1, null);
                }
                return new ansa(anskVar, c4, d, b, i9, anrgVar.I());
            case 17:
                anri anriVar = (anri) anmeVar;
                anrf anrfVar = anriVar.e;
                aocj aocjVar3 = anriVar.f;
                anrd anrdVar3 = anrfVar.e;
                anrc anrcVar2 = anrfVar.f;
                anra anraVar2 = anrfVar.g;
                return new ansb(aocjVar3, ansb.c(anrdVar3), ansb.d(anrcVar2), ansb.b(anraVar2), anriVar.g);
            case 18:
                anum.a(((anul) anmeVar).e);
                return new anvb();
            case 19:
                anul anulVar = (anul) anmeVar;
                anum.a(anulVar.e);
                return new aoby(anulVar);
            default:
                return new anvb((char[]) null);
        }
    }
}
