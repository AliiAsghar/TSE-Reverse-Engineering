package defpackage;

import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anzl {
    static {
        anxq anxqVar = anxq.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        antp.a.b(anyt.a);
        antp.a.a(anyt.b);
        antp.a.b(anyv.a);
        antp.a.a(anyv.b);
        if (anme.z(anyl.f)) {
            antv antvVar = anzo.a;
            antq antqVar = antq.a;
            antqVar.c(anzo.a);
            antqVar.d(anzo.b);
            antqVar.e(anzo.c);
            antqVar.f(anzo.e);
            antqVar.e(anzo.d);
            antqVar.f(anzo.f);
            anto antoVar = anto.a;
            HashMap hashMap = new HashMap();
            hashMap.put("ECDSA_P256", anys.a);
            hashMap.put("ECDSA_P256_IEEE_P1363", anys.d);
            anyf anyfVar = anyf.a;
            hashMap.put("ECDSA_P256_RAW", anme.q(anyg.a, anye.a, anyfVar, anyh.d));
            hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", anys.f);
            hashMap.put("ECDSA_P384", anys.b);
            hashMap.put("ECDSA_P384_IEEE_P1363", anys.e);
            anyf anyfVar2 = anyf.c;
            hashMap.put("ECDSA_P384_SHA512", anme.q(anyg.b, anye.b, anyfVar2, anyh.a));
            anyf anyfVar3 = anyf.b;
            hashMap.put("ECDSA_P384_SHA384", anme.q(anyg.b, anye.b, anyfVar3, anyh.a));
            hashMap.put("ECDSA_P521", anys.c);
            hashMap.put("ECDSA_P521_IEEE_P1363", anys.g);
            antoVar.a(DesugarCollections.unmodifiableMap(hashMap));
            antp.a.a(anyl.a);
            antp.a.a(anyl.b);
            antk.a.a(anyl.d, anyi.class);
            anta.a.c(anyl.e, anyl.f, true);
            anta.a.c(anyl.c, anyl.f, false);
            if (anme.z(anzc.f)) {
                ansy ansyVar = anzs.a;
                antq antqVar2 = antq.a;
                antqVar2.c(anzs.c);
                antqVar2.d(anzs.d);
                antqVar2.e(anzs.e);
                antqVar2.f(anzs.g);
                antqVar2.e(anzs.f);
                antqVar2.f(anzs.h);
                anto antoVar2 = anto.a;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4", anys.h);
                BigInteger bigInteger = anyz.e;
                anyw anywVar = new anyw();
                anywVar.b = anyx.a;
                anywVar.b(3072);
                anywVar.a = anyz.e;
                anywVar.c = anyy.d;
                hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", anywVar.a());
                hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", anys.i);
                hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4", anys.j);
                anyw anywVar2 = new anyw();
                anywVar2.b = anyx.c;
                anywVar2.b(4096);
                anywVar2.a = anyz.e;
                anywVar2.c = anyy.d;
                hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", anywVar2.a());
                antoVar2.a(hashMap2);
                antp.a.a(anzc.a);
                antp.a.a(anzc.b);
                antk.a.a(anzc.d, anyz.class);
                anta.a.c(anzc.e, anzc.f, true);
                anta.a.c(anzc.c, anzc.f, false);
                if (anme.z(anzk.f)) {
                    ansy ansyVar2 = anzv.a;
                    antq antqVar3 = antq.a;
                    antqVar3.c(anzv.c);
                    antqVar3.d(anzv.d);
                    antqVar3.e(anzv.e);
                    antqVar3.f(anzv.g);
                    antqVar3.e(anzv.f);
                    antqVar3.f(anzv.h);
                    anto antoVar3 = anto.a;
                    HashMap hashMap3 = new HashMap();
                    BigInteger bigInteger2 = anzg.e;
                    anzd anzdVar = new anzd();
                    anze anzeVar = anze.a;
                    anzdVar.b = anzeVar;
                    anzdVar.c = anzeVar;
                    anzdVar.c(32);
                    anzdVar.b(3072);
                    anzdVar.a = anzg.e;
                    anzdVar.d = anzf.a;
                    hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4", anzdVar.a());
                    anzd anzdVar2 = new anzd();
                    anze anzeVar2 = anze.a;
                    anzdVar2.b = anzeVar2;
                    anzdVar2.c = anzeVar2;
                    anzdVar2.c(32);
                    anzdVar2.b(3072);
                    anzdVar2.a = anzg.e;
                    anzdVar2.d = anzf.d;
                    hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", anzdVar2.a());
                    hashMap3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", anys.k);
                    anzd anzdVar3 = new anzd();
                    anze anzeVar3 = anze.c;
                    anzdVar3.b = anzeVar3;
                    anzdVar3.c = anzeVar3;
                    anzdVar3.c(64);
                    anzdVar3.b(4096);
                    anzdVar3.a = anzg.e;
                    anzdVar3.d = anzf.a;
                    hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4", anzdVar3.a());
                    anzd anzdVar4 = new anzd();
                    anze anzeVar4 = anze.c;
                    anzdVar4.b = anzeVar4;
                    anzdVar4.c = anzeVar4;
                    anzdVar4.c(64);
                    anzdVar4.b(4096);
                    anzdVar4.a = anzg.e;
                    anzdVar4.d = anzf.d;
                    hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", anzdVar4.a());
                    hashMap3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", anys.l);
                    antoVar3.a(DesugarCollections.unmodifiableMap(hashMap3));
                    antp.a.a(anzk.a);
                    antp.a.a(anzk.b);
                    antk.a.a(anzk.d, anzg.class);
                    anta.a.c(anzk.e, anzk.f, true);
                    anta.a.c(anzk.c, anzk.f, false);
                    if (anqi.a()) {
                        return;
                    }
                    antv antvVar2 = anyp.a;
                    if (anme.z(1)) {
                        ansy ansyVar3 = anzp.a;
                        antq antqVar4 = antq.a;
                        antqVar4.c(anzp.b);
                        antqVar4.d(anzp.c);
                        antqVar4.e(anzp.d);
                        antqVar4.f(anzp.f);
                        antqVar4.e(anzp.e);
                        antqVar4.f(anzp.g);
                        anto antoVar4 = anto.a;
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("ED25519", new anyn(anym.a));
                        hashMap4.put("ED25519_RAW", new anyn(anym.d));
                        hashMap4.put("ED25519WithRawOutput", new anyn(anym.d));
                        antoVar4.a(DesugarCollections.unmodifiableMap(hashMap4));
                        antk.a.a(anyp.e, anyn.class);
                        antm.a.a(anyp.d, anyn.class);
                        antp.a.a(anyp.a);
                        antp.a.a(anyp.b);
                        anta.a.b(anyp.f, true);
                        anta.a.b(anyp.c, false);
                        return;
                    }
                    throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
                }
                throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            }
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
    }
}
