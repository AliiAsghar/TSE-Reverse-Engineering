package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class annm {
    static {
        anxq anxqVar = anxq.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        antp.a.b(anno.a);
        antp.a.a(anno.b);
        anuw.a();
        if (anme.z(annr.e)) {
            antv antvVar = anpn.a;
            antq antqVar = antq.a;
            antqVar.c(anpn.a);
            antqVar.d(anpn.b);
            antqVar.e(anpn.c);
            antqVar.f(anpn.d);
            antp.a.a(annr.a);
            anto antoVar = anto.a;
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_CTR_HMAC_SHA256", anpe.e);
            aqxc aqxcVar = new aqxc(null, null, null);
            aqxcVar.g(16);
            aqxcVar.h(32);
            aqxcVar.j(16);
            aqxcVar.i(16);
            aqxcVar.c = anns.c;
            aqxcVar.f = annt.c;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", aqxcVar.f());
            hashMap.put("AES256_CTR_HMAC_SHA256", anpe.f);
            aqxc aqxcVar2 = new aqxc(null, null, null);
            aqxcVar2.g(32);
            aqxcVar2.h(32);
            aqxcVar2.j(32);
            aqxcVar2.i(16);
            aqxcVar2.c = anns.c;
            aqxcVar2.f = annt.c;
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", aqxcVar2.f());
            antoVar.a(DesugarCollections.unmodifiableMap(hashMap));
            antm.a.a(annr.c, annu.class);
            antk.a.a(annr.d, annu.class);
            anta.a.c(annr.b, annr.e, true);
            if (anme.z(anoc.e)) {
                antv antvVar2 = anpr.a;
                antq antqVar2 = antq.a;
                antqVar2.c(anpr.a);
                antqVar2.d(anpr.b);
                antqVar2.e(anpr.c);
                antqVar2.f(anpr.d);
                antp.a.a(anoc.a);
                anto antoVar2 = anto.a;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_GCM", anpe.a);
                aoad aoadVar = new aoad((char[]) null);
                aoadVar.i();
                aoadVar.j(16);
                aoadVar.k();
                aoadVar.a = anod.c;
                hashMap2.put("AES128_GCM_RAW", aoadVar.h());
                hashMap2.put("AES256_GCM", anpe.b);
                aoad aoadVar2 = new aoad((char[]) null);
                aoadVar2.i();
                aoadVar2.j(32);
                aoadVar2.k();
                aoadVar2.a = anod.c;
                hashMap2.put("AES256_GCM_RAW", aoadVar2.h());
                antoVar2.a(DesugarCollections.unmodifiableMap(hashMap2));
                antm.a.a(anoc.c, anoe.class);
                antk.a.a(anoc.d, anoe.class);
                anta.a.c(anoc.b, anoc.e, true);
                if (anqi.a()) {
                    return;
                }
                antv antvVar3 = annx.a;
                if (anme.z(1)) {
                    antv antvVar4 = anpo.a;
                    antq antqVar3 = antq.a;
                    antqVar3.c(anpo.a);
                    antqVar3.d(anpo.b);
                    antqVar3.e(anpo.c);
                    antqVar3.f(anpo.d);
                    antp.a.a(annx.a);
                    anto antoVar3 = anto.a;
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("AES128_EAX", anpe.c);
                    aoad aoadVar3 = new aoad((byte[]) null, (byte[]) null);
                    aoadVar3.m(16);
                    aoadVar3.n(16);
                    aoadVar3.o();
                    aoadVar3.a = anny.c;
                    hashMap3.put("AES128_EAX_RAW", aoadVar3.l());
                    hashMap3.put("AES256_EAX", anpe.d);
                    aoad aoadVar4 = new aoad((byte[]) null, (byte[]) null);
                    aoadVar4.m(16);
                    aoadVar4.n(32);
                    aoadVar4.o();
                    aoadVar4.a = anny.c;
                    hashMap3.put("AES256_EAX_RAW", aoadVar4.l());
                    antoVar3.a(DesugarCollections.unmodifiableMap(hashMap3));
                    antk.a.a(annx.c, annz.class);
                    anta.a.b(annx.b, true);
                    antv antvVar5 = anog.a;
                    if (anme.z(1)) {
                        antv antvVar6 = anps.a;
                        antq antqVar4 = antq.a;
                        antqVar4.c(anps.a);
                        antqVar4.d(anps.b);
                        antqVar4.e(anps.c);
                        antqVar4.f(anps.d);
                        if (anog.a()) {
                            antp.a.a(anog.a);
                            anto antoVar4 = anto.a;
                            HashMap hashMap4 = new HashMap();
                            aqrk aqrkVar = new aqrk((char[]) null);
                            aqrkVar.i(16);
                            aqrkVar.b = anoh.a;
                            hashMap4.put("AES128_GCM_SIV", aqrkVar.h());
                            aqrk aqrkVar2 = new aqrk((char[]) null);
                            aqrkVar2.i(16);
                            aqrkVar2.b = anoh.c;
                            hashMap4.put("AES128_GCM_SIV_RAW", aqrkVar2.h());
                            aqrk aqrkVar3 = new aqrk((char[]) null);
                            aqrkVar3.i(32);
                            aqrkVar3.b = anoh.a;
                            hashMap4.put("AES256_GCM_SIV", aqrkVar3.h());
                            aqrk aqrkVar4 = new aqrk((char[]) null);
                            aqrkVar4.i(32);
                            aqrkVar4.b = anoh.c;
                            hashMap4.put("AES256_GCM_SIV_RAW", aqrkVar4.h());
                            antoVar4.a(DesugarCollections.unmodifiableMap(hashMap4));
                            antm.a.a(anog.c, anoi.class);
                            antk.a.a(anog.b, anoi.class);
                            anta.a.b(anog.d, true);
                        }
                        antv antvVar7 = anok.a;
                        if (anme.z(1)) {
                            antv antvVar8 = anpv.a;
                            antq antqVar5 = antq.a;
                            antqVar5.c(anpv.a);
                            antqVar5.d(anpv.b);
                            antqVar5.e(anpv.c);
                            antqVar5.f(anpv.d);
                            antp.a.a(anok.a);
                            antk.a.a(anok.b, anom.class);
                            anto antoVar5 = anto.a;
                            HashMap hashMap5 = new HashMap();
                            hashMap5.put("CHACHA20_POLY1305", new anom(anol.a));
                            hashMap5.put("CHACHA20_POLY1305_RAW", new anom(anol.c));
                            antoVar5.a(DesugarCollections.unmodifiableMap(hashMap5));
                            anta.a.b(anok.c, true);
                            antv antvVar9 = anon.a;
                            if (anme.z(1)) {
                                antv antvVar10 = anot.a;
                                antq antqVar6 = antq.a;
                                antqVar6.c(anot.a);
                                antqVar6.d(anot.b);
                                antqVar6.e(anot.c);
                                antqVar6.f(anot.d);
                                antp.a.a(anon.a);
                                antk.a.a(anon.c, anos.class);
                                anta.a.b(anon.b, true);
                                anmw anmwVar = anop.a;
                                if (anme.z(1)) {
                                    antv antvVar11 = anpc.a;
                                    antq antqVar7 = antq.a;
                                    antqVar7.c(anpc.a);
                                    antqVar7.d(anpc.b);
                                    antqVar7.e(anpc.c);
                                    antqVar7.f(anpc.d);
                                    antk.a.a(anop.b, anox.class);
                                    antp.a.a(anop.c);
                                    anta.a.b(anop.a, true);
                                    antv antvVar12 = anpk.a;
                                    if (anme.z(1)) {
                                        antv antvVar13 = anqf.a;
                                        antq antqVar8 = antq.a;
                                        antqVar8.c(anqf.a);
                                        antqVar8.d(anqf.b);
                                        antqVar8.e(anqf.c);
                                        antqVar8.f(anqf.d);
                                        antp.a.a(anpk.a);
                                        anto antoVar6 = anto.a;
                                        HashMap hashMap6 = new HashMap();
                                        hashMap6.put("XCHACHA20_POLY1305", new anpm(anpl.a));
                                        hashMap6.put("XCHACHA20_POLY1305_RAW", new anpm(anpl.c));
                                        antoVar6.a(DesugarCollections.unmodifiableMap(hashMap6));
                                        antk.a.a(anpk.d, anpm.class);
                                        antm.a.a(anpk.c, anpm.class);
                                        anta.a.b(anpk.b, true);
                                        antv antvVar14 = anqe.a;
                                        antq antqVar9 = antq.a;
                                        antqVar9.c(anqe.a);
                                        antqVar9.d(anqe.b);
                                        antqVar9.e(anqe.c);
                                        antqVar9.f(anqe.d);
                                        anto antoVar7 = anto.a;
                                        HashMap hashMap7 = new HashMap();
                                        hashMap7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", anpe.g);
                                        antoVar7.a(DesugarCollections.unmodifiableMap(hashMap7));
                                        antp.a.a(anpg.b);
                                        antk.a.a(anpg.a, anpi.class);
                                        return;
                                    }
                                    throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
                                }
                                throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
                            }
                            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
                        }
                        throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
                    }
                    throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
                }
                throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
            }
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
