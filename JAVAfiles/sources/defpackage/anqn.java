package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anqn {
    static {
        anxq anxqVar = anxq.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        antp.a.b(anqo.a);
        antp.a.a(anqo.b);
        if (anqi.a()) {
            return;
        }
        antv antvVar = anqk.a;
        if (anme.z(1)) {
            antv antvVar2 = anqq.a;
            antq antqVar = antq.a;
            antqVar.c(anqq.a);
            antqVar.d(anqq.b);
            antqVar.e(anqq.c);
            antqVar.f(anqq.d);
            antp.a.a(anqk.a);
            anto antoVar = anto.a;
            HashMap hashMap = new HashMap();
            hashMap.put("AES256_SIV", anqp.a);
            aqrk aqrkVar = new aqrk(null, null);
            aqrkVar.f(64);
            aqrkVar.b = anql.c;
            hashMap.put("AES256_SIV_RAW", aqrkVar.e());
            antoVar.a(DesugarCollections.unmodifiableMap(hashMap));
            antm.a.a(anqk.c, anqm.class);
            antk.a.a(anqk.d, anqm.class);
            anta.a.b(anqk.b, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
    }
}
