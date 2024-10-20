package defpackage;

import android.content.Context;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiij {
    private static final advp a = new advp("LocalMsrpCertificateManager");
    private String b;
    private KeyStore c;
    private final Context d;
    private boolean e = false;

    public aiij(Context context) {
        this.d = context.getApplicationContext();
    }

    private final X509Certificate c(String str) {
        advr.d(a, "Generating a new certificate.", new Object[0]);
        aihj.d(this.d, str);
        KeyStore e = aihj.e(this.d);
        this.c = e;
        return aihj.b(e);
    }

    private final synchronized void d() {
        String str;
        KeyStore e;
        if (!this.e) {
            advr.d(a, "Creating local MSRP certificate", new Object[0]);
            String c = aczx.c();
            if (aihj.c(c)) {
                if ("SHA-1".equalsIgnoreCase(c)) {
                    str = "SHA1withRSA";
                } else if ("SHA-256".equalsIgnoreCase(c)) {
                    str = "SHA256withRSA";
                } else {
                    str = "";
                }
                try {
                    e = aihj.e(this.d);
                } catch (IOException unused) {
                    advr.l(a, "Generating keystore due to uninitialized keystore file.", new Object[0]);
                    aihj.d(this.d, str);
                    e = aihj.e(this.d);
                }
                X509Certificate b = aihj.b(e);
                b.getClass();
                if (!f(b, c)) {
                    advr.l(a, "Generating new local SSL certificate as the old one has expired", new Object[0]);
                    b = c(str);
                } else if (!b.getSigAlgName().equalsIgnoreCase(str)) {
                    advr.l(a, "Generating new local SSL certificate as signature algorithm changed. old:%s new:%s", b.getSigAlgName(), str);
                    b = c(str);
                } else {
                    this.c = e;
                }
                if (b != null) {
                    String a2 = aihj.a(b, c);
                    a2.getClass();
                    this.b = a2;
                    advr.d(a, "Using fingerprint: %s", a2);
                } else {
                    throw new IllegalStateException("expected non-null certificate");
                }
            } else {
                throw new IllegalArgumentException("Not supported digest algorithm ".concat(String.valueOf(c)));
            }
        } else {
            throw new IllegalStateException("expected to be not initialized");
        }
    }

    private final synchronized void e() {
        if (this.e) {
            return;
        }
        try {
            d();
            this.e = true;
        } catch (IOException e) {
            e = e;
            advr.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        } catch (IllegalStateException e2) {
            advr.j(e2, a, "Illegal state while initialize the certificate provider", new Object[0]);
        } catch (InvalidKeyException e3) {
            e = e3;
            advr.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        } catch (KeyStoreException e4) {
            e = e4;
            advr.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            advr.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        } catch (SignatureException e6) {
            e = e6;
            advr.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        } catch (CertificateException e7) {
            e = e7;
            advr.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        }
    }

    private static boolean f(X509Certificate x509Certificate, String str) {
        advr.d(a, "(%s) certificate valid from: %s to: %s", aihj.a(x509Certificate, str), x509Certificate.getNotBefore().toString(), x509Certificate.getNotAfter().toString());
        try {
            x509Certificate.checkValidity(new Date(agkx.W().longValue()));
            return true;
        } catch (CertificateExpiredException | CertificateNotYetValidException unused) {
            return false;
        }
    }

    public final String a() {
        e();
        return this.b;
    }

    public final KeyStore b() {
        e();
        KeyStore keyStore = this.c;
        if (keyStore != null) {
            return keyStore;
        }
        throw new IllegalStateException("Keystore could not be created.");
    }
}
