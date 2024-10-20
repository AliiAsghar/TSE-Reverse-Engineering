package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anuw {
    static {
        anxq anxqVar = anxq.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        antp.a.b(anuy.a);
        antp.a.a(anuy.b);
        antp.a.b(anuq.a);
        if (anme.z(anus.f)) {
            ansy ansyVar = anvc.a;
            antq antqVar = antq.a;
            antqVar.c(anvc.c);
            antqVar.d(anvc.d);
            antqVar.e(anvc.e);
            antqVar.f(anvc.f);
            antp.a.a(anus.a);
            antp.a.a(anus.b);
            anto antoVar = anto.a;
            HashMap hashMap = new HashMap();
            hashMap.put("HMAC_SHA256_128BITTAG", anuz.a);
            aoad aoadVar = new aoad((byte[]) null);
            aoadVar.f(32);
            aoadVar.g(16);
            aoadVar.b = anuu.d;
            aoadVar.a = anut.c;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", aoadVar.e());
            aoad aoadVar2 = new aoad((byte[]) null);
            aoadVar2.f(32);
            aoadVar2.g(32);
            aoadVar2.b = anuu.a;
            aoadVar2.a = anut.c;
            hashMap.put("HMAC_SHA256_256BITTAG", aoadVar2.e());
            aoad aoadVar3 = new aoad((byte[]) null);
            aoadVar3.f(32);
            aoadVar3.g(32);
            aoadVar3.b = anuu.d;
            aoadVar3.a = anut.c;
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", aoadVar3.e());
            aoad aoadVar4 = new aoad((byte[]) null);
            aoadVar4.f(64);
            aoadVar4.g(16);
            aoadVar4.b = anuu.a;
            aoadVar4.a = anut.e;
            hashMap.put("HMAC_SHA512_128BITTAG", aoadVar4.e());
            aoad aoadVar5 = new aoad((byte[]) null);
            aoadVar5.f(64);
            aoadVar5.g(16);
            aoadVar5.b = anuu.d;
            aoadVar5.a = anut.e;
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", aoadVar5.e());
            aoad aoadVar6 = new aoad((byte[]) null);
            aoadVar6.f(64);
            aoadVar6.g(32);
            aoadVar6.b = anuu.a;
            aoadVar6.a = anut.e;
            hashMap.put("HMAC_SHA512_256BITTAG", aoadVar6.e());
            aoad aoadVar7 = new aoad((byte[]) null);
            aoadVar7.f(64);
            aoadVar7.g(32);
            aoadVar7.b = anuu.d;
            aoadVar7.a = anut.e;
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", aoadVar7.e());
            hashMap.put("HMAC_SHA512_512BITTAG", anuz.b);
            aoad aoadVar8 = new aoad((byte[]) null);
            aoadVar8.f(64);
            aoadVar8.g(64);
            aoadVar8.b = anuu.d;
            aoadVar8.a = anut.e;
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", aoadVar8.e());
            antoVar.a(DesugarCollections.unmodifiableMap(hashMap));
            antk.a.a(anus.e, anuv.class);
            antm.a.a(anus.d, anuv.class);
            anta.a.c(anus.c, anus.f, true);
            if (anqi.a()) {
                return;
            }
            antj antjVar = anum.a;
            if (anme.z(1)) {
                antv antvVar = anva.a;
                antq antqVar2 = antq.a;
                antqVar2.c(anva.a);
                antqVar2.d(anva.b);
                antqVar2.e(anva.c);
                antqVar2.f(anva.d);
                antk.a.a(anum.a, anuo.class);
                antp.a.a(anum.b);
                antp.a.a(anum.c);
                anto antoVar2 = anto.a;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES_CMAC", anuz.c);
                hashMap2.put("AES256_CMAC", anuz.c);
                arbj arbjVar = new arbj((char[]) null);
                arbjVar.e(32);
                arbjVar.f(16);
                arbjVar.a = anun.d;
                hashMap2.put("AES256_CMAC_RAW", arbjVar.d());
                antoVar2.a(DesugarCollections.unmodifiableMap(hashMap2));
                anta.a.b(anum.d, true);
                return;
            }
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
