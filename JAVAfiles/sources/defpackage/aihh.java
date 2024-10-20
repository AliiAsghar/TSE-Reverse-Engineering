package defpackage;

import android.text.TextUtils;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aihh implements X509TrustManager {
    private final String a;
    private final String b;

    public aihh(String str) {
        if (TextUtils.isEmpty(str)) {
            advr.q("Expected fingerprint is empty. Will not be able to validate against certificate", new Object[0]);
            this.a = null;
            this.b = null;
            return;
        }
        List c = anna.e(' ').c(str.toUpperCase(Locale.US));
        if (c.size() >= 2) {
            String str2 = (String) c.get(0);
            this.b = str2;
            this.a = (String) c.get(1);
            if (aihj.c(str2)) {
                return;
            }
            throw new SSLException("Unsupported fingerprint type " + str2 + ". Needs to be SHA-1 or SHA-256.");
        }
        throw new SSLException("Unexpected fingerprint format.");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        advr.c("checkClientTrusted for auth type %s", str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        advr.c("checkServerTrusted for auth type %s", str);
        if (x509CertificateArr != null) {
            if (x509CertificateArr.length > 0) {
                if (TextUtils.isEmpty(this.a)) {
                    advr.q("Expected fingerprint has not been set. Skipping validation", new Object[0]);
                    return;
                }
                String a = aihj.a(x509CertificateArr[0], this.b);
                if (!TextUtils.isEmpty(a) && this.a.equalsIgnoreCase(a)) {
                    advr.c("Fingerprint verification has passed", new Object[0]);
                    return;
                }
                throw new CertificateException("Fingerprint mismatch. Expected: " + this.b + " " + this.a + " - read from certificate: " + a);
            }
            throw new IllegalArgumentException("checkServerTrusted: X509Certificate is empty");
        }
        throw new IllegalArgumentException("checkServerTrusted: X509Certificate array is null");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        advr.c("getAcceptIssuers", new Object[0]);
        return null;
    }
}
