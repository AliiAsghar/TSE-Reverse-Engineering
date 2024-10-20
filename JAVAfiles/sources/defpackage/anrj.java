package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anrj {
    static {
        anxq anxqVar = anxq.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        antp.a.b(anrl.a);
        antp.a.a(anrl.b);
        antp.a.b(anrn.a);
        antp.a.a(anrn.b);
        annm.a();
        anqn.a();
        if (anqi.a()) {
            return;
        }
        antv antvVar = anqs.a;
        if (anme.z(1)) {
            ansy ansyVar = anrx.a;
            antq antqVar = antq.a;
            antqVar.c(anrx.b);
            antqVar.d(anrx.c);
            antqVar.e(anrx.d);
            antqVar.f(anrx.f);
            antqVar.e(anrx.e);
            antqVar.f(anrx.g);
            anto antoVar = anto.a;
            HashMap hashMap = new HashMap();
            aqxc aqxcVar = new aqxc(null, null);
            aqxcVar.f = anqt.a;
            aqxcVar.a = anqu.c;
            aqxcVar.e = anqv.b;
            aqxcVar.b = anqw.a;
            aoad aoadVar = new aoad((char[]) null);
            aoadVar.i();
            aoadVar.j(16);
            aoadVar.k();
            aoadVar.a = anod.c;
            aqxcVar.k(aoadVar.h());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", aqxcVar.e());
            aqxc aqxcVar2 = new aqxc(null, null);
            aqxcVar2.f = anqt.a;
            aqxcVar2.a = anqu.c;
            aqxcVar2.e = anqv.b;
            aqxcVar2.b = anqw.c;
            aoad aoadVar2 = new aoad((char[]) null);
            aoadVar2.i();
            aoadVar2.j(16);
            aoadVar2.k();
            aoadVar2.a = anod.c;
            aqxcVar2.k(aoadVar2.h());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", aqxcVar2.e());
            aqxc aqxcVar3 = new aqxc(null, null);
            aqxcVar3.f = anqt.a;
            aqxcVar3.a = anqu.c;
            aqxcVar3.e = anqv.a;
            aqxcVar3.b = anqw.a;
            aoad aoadVar3 = new aoad((char[]) null);
            aoadVar3.i();
            aoadVar3.j(16);
            aoadVar3.k();
            aoadVar3.a = anod.c;
            aqxcVar3.k(aoadVar3.h());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", aqxcVar3.e());
            aqxc aqxcVar4 = new aqxc(null, null);
            aqxcVar4.f = anqt.a;
            aqxcVar4.a = anqu.c;
            aqxcVar4.e = anqv.a;
            aqxcVar4.b = anqw.c;
            aoad aoadVar4 = new aoad((char[]) null);
            aoadVar4.i();
            aoadVar4.j(16);
            aoadVar4.k();
            aoadVar4.a = anod.c;
            aqxcVar4.k(aoadVar4.h());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", aqxcVar4.e());
            aqxc aqxcVar5 = new aqxc(null, null);
            aqxcVar5.f = anqt.a;
            aqxcVar5.a = anqu.c;
            aqxcVar5.e = anqv.a;
            aqxcVar5.b = anqw.c;
            aoad aoadVar5 = new aoad((char[]) null);
            aoadVar5.i();
            aoadVar5.j(16);
            aoadVar5.k();
            aoadVar5.a = anod.c;
            aqxcVar5.k(aoadVar5.h());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", aqxcVar5.e());
            aqxc aqxcVar6 = new aqxc(null, null);
            aqxcVar6.f = anqt.a;
            aqxcVar6.a = anqu.c;
            aqxcVar6.e = anqv.b;
            aqxcVar6.b = anqw.a;
            aqxc aqxcVar7 = new aqxc(null, null, null);
            aqxcVar7.g(16);
            aqxcVar7.h(32);
            aqxcVar7.j(16);
            aqxcVar7.i(16);
            aqxcVar7.c = anns.c;
            aqxcVar7.f = annt.c;
            aqxcVar6.k(aqxcVar7.f());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", aqxcVar6.e());
            aqxc aqxcVar8 = new aqxc(null, null);
            aqxcVar8.f = anqt.a;
            aqxcVar8.a = anqu.c;
            aqxcVar8.e = anqv.b;
            aqxcVar8.b = anqw.c;
            aqxc aqxcVar9 = new aqxc(null, null, null);
            aqxcVar9.g(16);
            aqxcVar9.h(32);
            aqxcVar9.j(16);
            aqxcVar9.i(16);
            aqxcVar9.c = anns.c;
            aqxcVar9.f = annt.c;
            aqxcVar8.k(aqxcVar9.f());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", aqxcVar8.e());
            aqxc aqxcVar10 = new aqxc(null, null);
            aqxcVar10.f = anqt.a;
            aqxcVar10.a = anqu.c;
            aqxcVar10.e = anqv.a;
            aqxcVar10.b = anqw.a;
            aqxc aqxcVar11 = new aqxc(null, null, null);
            aqxcVar11.g(16);
            aqxcVar11.h(32);
            aqxcVar11.j(16);
            aqxcVar11.i(16);
            aqxcVar11.c = anns.c;
            aqxcVar11.f = annt.c;
            aqxcVar10.k(aqxcVar11.f());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", aqxcVar10.e());
            aqxc aqxcVar12 = new aqxc(null, null);
            aqxcVar12.f = anqt.a;
            aqxcVar12.a = anqu.c;
            aqxcVar12.e = anqv.a;
            aqxcVar12.b = anqw.c;
            aqxc aqxcVar13 = new aqxc(null, null, null);
            aqxcVar13.g(16);
            aqxcVar13.h(32);
            aqxcVar13.j(16);
            aqxcVar13.i(16);
            aqxcVar13.c = anns.c;
            aqxcVar13.f = annt.c;
            aqxcVar12.k(aqxcVar13.f());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", aqxcVar12.e());
            antoVar.a(DesugarCollections.unmodifiableMap(hashMap));
            antp.a.a(anqs.a);
            antp.a.a(anqs.b);
            antk.a.a(anqs.d, anqx.class);
            anta.a.b(anqs.e, true);
            anta.a.b(anqs.c, false);
            antv antvVar2 = anse.a;
            if (anme.z(1)) {
                ansy ansyVar2 = anrh.a;
                antq antqVar2 = antq.a;
                antqVar2.c(anrh.b);
                antqVar2.d(anrh.c);
                antqVar2.e(anrh.d);
                antqVar2.f(anrh.f);
                antqVar2.e(anrh.e);
                antqVar2.f(anrh.g);
                anto antoVar2 = anto.a;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", new anrf(anrd.f, anrc.a, anra.a, anre.a));
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", new anrf(anrd.f, anrc.a, anra.a, anre.c));
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", new anrf(anrd.f, anrc.a, anra.b, anre.a));
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", new anrf(anrd.f, anrc.a, anra.b, anre.c));
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", new anrf(anrd.f, anrc.a, anra.c, anre.a));
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", new anrf(anrd.f, anrc.a, anra.c, anre.c));
                hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", new anrf(anrd.a, anrc.a, anra.a, anre.a));
                hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", new anrf(anrd.a, anrc.a, anra.a, anre.c));
                hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", new anrf(anrd.a, anrc.a, anra.b, anre.a));
                hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", new anrf(anrd.a, anrc.a, anra.b, anre.c));
                hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", new anrf(anrd.b, anrc.b, anra.a, anre.a));
                hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", new anrf(anrd.b, anrc.b, anra.a, anre.c));
                hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", new anrf(anrd.b, anrc.b, anra.b, anre.a));
                hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", new anrf(anrd.b, anrc.b, anra.b, anre.c));
                hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", new anrf(anrd.c, anrc.c, anra.a, anre.a));
                hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", new anrf(anrd.c, anrc.c, anra.a, anre.c));
                hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", new anrf(anrd.c, anrc.c, anra.b, anre.a));
                hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", new anrf(anrd.c, anrc.c, anra.b, anre.c));
                antoVar2.a(DesugarCollections.unmodifiableMap(hashMap2));
                antp.a.a(anse.a);
                antp.a.a(anse.b);
                antk.a.a(anse.d, anrf.class);
                anta.a.b(anse.e, true);
                anta.a.b(anse.c, false);
                return;
            }
            throw new GeneralSecurityException("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
        }
        throw new GeneralSecurityException("Registering ECIES Hybrid Encryption is not supported in FIPS mode");
    }
}
