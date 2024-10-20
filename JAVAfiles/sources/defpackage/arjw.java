package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arjw {
    public static final arjw a;
    private static final arju[] f;
    final boolean b = true;
    public final String[] c;
    public final String[] d;
    public final boolean e;

    static {
        arju[] arjuVarArr = {arju.TLS_AES_128_GCM_SHA256, arju.TLS_AES_256_GCM_SHA384, arju.TLS_CHACHA20_POLY1305_SHA256, arju.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, arju.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, arju.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, arju.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, arju.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, arju.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, arju.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, arju.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, arju.TLS_RSA_WITH_AES_128_GCM_SHA256, arju.TLS_RSA_WITH_AES_256_GCM_SHA384, arju.TLS_RSA_WITH_AES_128_CBC_SHA, arju.TLS_RSA_WITH_AES_256_CBC_SHA, arju.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f = arjuVarArr;
        arjv arjvVar = new arjv();
        arjvVar.a(arjuVarArr);
        arjvVar.c(arkf.TLS_1_3, arkf.TLS_1_2);
        arjvVar.b();
        arjw arjwVar = new arjw(arjvVar);
        a = arjwVar;
        arjv arjvVar2 = new arjv(arjwVar);
        arjvVar2.c(arkf.TLS_1_3, arkf.TLS_1_2, arkf.TLS_1_1, arkf.TLS_1_0);
        arjvVar2.b();
    }

    public arjw(arjv arjvVar) {
        this.c = (String[]) arjvVar.b;
        this.d = (String[]) arjvVar.c;
        this.e = arjvVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof arjw)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        arjw arjwVar = (arjw) obj;
        boolean z = arjwVar.b;
        if (!Arrays.equals(this.c, arjwVar.c) || !Arrays.equals(this.d, arjwVar.d) || this.e != arjwVar.e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.c) + 527) * 31) + Arrays.hashCode(this.d)) * 31) + (!this.e ? 1 : 0);
    }

    public final String toString() {
        List a2;
        arju a3;
        String obj;
        arkf arkfVar;
        String[] strArr = this.c;
        int i = 0;
        if (strArr == null) {
            a2 = null;
        } else {
            arju[] arjuVarArr = new arju[strArr.length];
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                arju arjuVar = arju.TLS_RSA_WITH_NULL_MD5;
                if (str.startsWith("SSL_")) {
                    a3 = arju.a("TLS_".concat(String.valueOf(str.substring(4))));
                } else {
                    a3 = arju.a(str);
                }
                arjuVarArr[i2] = a3;
                i2++;
            }
            a2 = arkg.a(arjuVarArr);
        }
        if (a2 == null) {
            obj = "[use default]";
        } else {
            obj = a2.toString();
        }
        arkf[] arkfVarArr = new arkf[this.d.length];
        while (true) {
            String[] strArr3 = this.d;
            if (i < strArr3.length) {
                String str2 = strArr3[i];
                arkf arkfVar2 = arkf.TLS_1_3;
                if ("TLSv1.3".equals(str2)) {
                    arkfVar = arkf.TLS_1_3;
                } else if ("TLSv1.2".equals(str2)) {
                    arkfVar = arkf.TLS_1_2;
                } else if ("TLSv1.1".equals(str2)) {
                    arkfVar = arkf.TLS_1_1;
                } else if ("TLSv1".equals(str2)) {
                    arkfVar = arkf.TLS_1_0;
                } else if ("SSLv3".equals(str2)) {
                    arkfVar = arkf.SSL_3_0;
                } else {
                    throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str2)));
                }
                arkfVarArr[i] = arkfVar;
                i++;
            } else {
                return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + String.valueOf(arkg.a(arkfVarArr)) + ", supportsTlsExtensions=" + this.e + ")";
            }
        }
    }
}
