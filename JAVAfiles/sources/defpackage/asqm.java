package defpackage;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asqm implements HostnameVerifier {
    public static final asqm a = new asqm();

    private asqm() {
    }

    public static final List a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return arnv.a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && d.F(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return arnv.a;
        }
    }

    public static final boolean b(String str, X509Certificate x509Certificate) {
        String str2;
        if (asmt.r(str)) {
            String ak = aotl.ak(str);
            List a2 = a(x509Certificate, 7);
            if (a2.isEmpty()) {
                return false;
            }
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                if (d.F(ak, aotl.ak((String) it.next()))) {
                }
            }
            return false;
        }
        String d = d(str);
        List<String> a3 = a(x509Certificate, 2);
        if (a3.isEmpty()) {
            return false;
        }
        for (String str3 : a3) {
            if (d.length() != 0 && !arsd.z(d, ".", false) && !d.endsWith("..") && str3 != null && str3.length() != 0 && !arsd.z(str3, ".", false) && !str3.endsWith("..")) {
                if (!d.endsWith(".")) {
                    str2 = d.concat(".");
                } else {
                    str2 = d;
                }
                if (!str3.endsWith(".")) {
                    str3 = str3.concat(".");
                }
                String d2 = d(str3);
                if (!arsd.O(d2, "*")) {
                    if (d.F(str2, d2)) {
                    }
                } else if (arsd.z(d2, "*.", false) && arsd.S(d2, '*', 1, 4) == -1 && str2.length() >= d2.length() && !d.F("*.", d2)) {
                    String substring = d2.substring(1);
                    substring.getClass();
                    if (str2.endsWith(substring)) {
                        int length = str2.length() - substring.length();
                        if (length > 0 && arsd.U(str2, '.', length - 1, 4) != -1) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
        return true;
    }

    private static final boolean c(String str) {
        long j;
        char c;
        int length = str.length();
        if (length >= 0) {
            if (length <= str.length()) {
                long j2 = 0;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    char charAt = str.charAt(i);
                    if (charAt >= 128) {
                        if (charAt < 2048) {
                            j = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            if (i2 < length) {
                                c = str.charAt(i2);
                            } else {
                                c = 0;
                            }
                            if (charAt <= 56319 && c >= 56320 && c <= 57343) {
                                j2 += 4;
                                i += 2;
                            }
                        } else {
                            j = 3;
                        }
                        j2 += j;
                        i = i2;
                    }
                    j2++;
                    i = i2;
                }
                if (str.length() != ((int) j2)) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException("endIndex > string.length: " + length + " > " + str.length());
        }
        throw new IllegalArgumentException(a.cb(length, "endIndex < beginIndex: ", " < 0"));
    }

    private static final String d(String str) {
        if (c(str)) {
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            return lowerCase;
        }
        return str;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        str.getClass();
        sSLSession.getClass();
        if (c(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
            } catch (SSLException unused) {
                return false;
            }
        }
        return b(str, (X509Certificate) certificate);
    }
}
