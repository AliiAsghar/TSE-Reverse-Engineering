package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoai {
    static {
        anxq anxqVar = anxq.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        antp.a.b(aoak.a);
        antp.a.a(aoak.b);
        if (anqi.a()) {
            return;
        }
        antv antvVar = anzy.a;
        if (anme.z(1)) {
            antv antvVar2 = aoal.a;
            antq antqVar = antq.a;
            antqVar.c(aoal.a);
            antqVar.d(aoal.b);
            antqVar.e(aoal.c);
            antqVar.f(aoal.d);
            anto antoVar = anto.a;
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_CTR_HMAC_SHA256_4KB", aoah.a);
            hashMap.put("AES128_CTR_HMAC_SHA256_1MB", aoah.b);
            hashMap.put("AES256_CTR_HMAC_SHA256_4KB", aoah.c);
            hashMap.put("AES256_CTR_HMAC_SHA256_1MB", aoah.d);
            antoVar.a(DesugarCollections.unmodifiableMap(hashMap));
            antk.a.a(anzy.b, aoaa.class);
            antp.a.a(anzy.a);
            anta.a.b(anzy.c, true);
            antv antvVar3 = aoac.a;
            if (anme.z(1)) {
                antv antvVar4 = aoam.a;
                antq antqVar2 = antq.a;
                antqVar2.c(aoam.a);
                antqVar2.d(aoam.b);
                antqVar2.e(aoam.c);
                antqVar2.f(aoam.d);
                anto antoVar2 = anto.a;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_GCM_HKDF_4KB", aoah.e);
                hashMap2.put("AES128_GCM_HKDF_1MB", aoah.f);
                hashMap2.put("AES256_GCM_HKDF_4KB", aoah.g);
                hashMap2.put("AES256_GCM_HKDF_1MB", aoah.h);
                antoVar2.a(DesugarCollections.unmodifiableMap(hashMap2));
                antm.a.a(aoac.d, aoaf.class);
                antk.a.a(aoac.c, aoaf.class);
                antp.a.a(aoac.a);
                anta.a.b(aoac.b, true);
                return;
            }
            throw new GeneralSecurityException("Registering AES-GCM HKDF Streaming AEAD is not supported in FIPS mode");
        }
        throw new GeneralSecurityException("Registering AES CTR HMAC Streaming AEAD is not supported in FIPS mode");
    }
}
