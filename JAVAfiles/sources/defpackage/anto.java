package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anto {
    public static final anto a = new anto();
    private final Map b = new HashMap();

    public final synchronized void a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            b((String) entry.getKey(), (anme) entry.getValue());
        }
    }

    public final synchronized void b(String str, anme anmeVar) {
        if (this.b.containsKey(str)) {
            if (((anme) this.b.get(str)).equals(anmeVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.b.get(str)) + "), cannot insert " + String.valueOf(anmeVar));
        }
        this.b.put(str, anmeVar);
    }

    public final synchronized anme c() {
        if (this.b.containsKey("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM")) {
        } else {
            throw new GeneralSecurityException("Name ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM does not exist");
        }
        return (anme) this.b.get("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM");
    }
}
