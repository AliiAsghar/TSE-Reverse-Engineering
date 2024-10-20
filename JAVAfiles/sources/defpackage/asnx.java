package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asnx implements asly {
    private static final int b(asmm asmmVar, int i) {
        String b = asmm.b(asmmVar, "Retry-After");
        if (b == null) {
            return i;
        }
        if (new arus("\\d+").b(b)) {
            return Integer.valueOf(b).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private static final boolean c(IOException iOException, asnh asnhVar, asmh asmhVar, boolean z) {
        asno asnoVar;
        asnj asnjVar;
        if (z) {
            asmk asmkVar = asmhVar.d;
            if (iOException instanceof FileNotFoundException) {
                return false;
            }
        }
        if ((iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        asnd asndVar = asnhVar.h;
        asndVar.getClass();
        int i = asndVar.f;
        if (i == 0) {
            if (asndVar.g != 0 || asndVar.h != 0) {
                i = 0;
            }
            return false;
        }
        if (asndVar.i == null) {
            asmq asmqVar = null;
            if (i <= 1 && asndVar.g <= 1 && asndVar.h <= 0 && (asnjVar = asndVar.c.i) != null) {
                synchronized (asnjVar) {
                    if (asnjVar.j == 0) {
                        if (asmt.s(asnjVar.a.a.h, asndVar.b.h)) {
                            asmqVar = asnjVar.a;
                        }
                    }
                }
            }
            if (asmqVar != null) {
                asndVar.i = asmqVar;
            } else {
                asnn asnnVar = asndVar.d;
                if ((asnnVar == null || !asnnVar.b()) && (asnoVar = asndVar.e) != null && !asnoVar.a()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01ac A[Catch: all -> 0x0245, TryCatch #1 {all -> 0x0245, blocks: (B:20:0x0076, B:23:0x007a, B:27:0x0080, B:29:0x0095, B:31:0x009c, B:32:0x00a3, B:34:0x00a4, B:36:0x00a9, B:37:0x00b7, B:50:0x00d9, B:52:0x00de, B:54:0x00e2, B:57:0x00e7, B:60:0x00ef, B:63:0x01d6, B:65:0x01da, B:70:0x01eb, B:71:0x01f6, B:75:0x00f5, B:79:0x0103, B:80:0x010a, B:81:0x010b, B:83:0x010f, B:86:0x0114, B:88:0x011d, B:90:0x0122, B:92:0x013e, B:94:0x014c, B:97:0x0155, B:100:0x0160, B:102:0x0178, B:108:0x018b, B:112:0x0197, B:114:0x01ac, B:115:0x01bd, B:117:0x01c7, B:118:0x01cc, B:121:0x01a1, B:122:0x01a7, B:149:0x023d, B:150:0x0244, B:139:0x01ff, B:141:0x020a, B:146:0x0218, B:147:0x021b, B:128:0x021d, B:130:0x022a, B:135:0x0237, B:136:0x023c), top: B:19:0x0076, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a1 A[Catch: all -> 0x0245, TryCatch #1 {all -> 0x0245, blocks: (B:20:0x0076, B:23:0x007a, B:27:0x0080, B:29:0x0095, B:31:0x009c, B:32:0x00a3, B:34:0x00a4, B:36:0x00a9, B:37:0x00b7, B:50:0x00d9, B:52:0x00de, B:54:0x00e2, B:57:0x00e7, B:60:0x00ef, B:63:0x01d6, B:65:0x01da, B:70:0x01eb, B:71:0x01f6, B:75:0x00f5, B:79:0x0103, B:80:0x010a, B:81:0x010b, B:83:0x010f, B:86:0x0114, B:88:0x011d, B:90:0x0122, B:92:0x013e, B:94:0x014c, B:97:0x0155, B:100:0x0160, B:102:0x0178, B:108:0x018b, B:112:0x0197, B:114:0x01ac, B:115:0x01bd, B:117:0x01c7, B:118:0x01cc, B:121:0x01a1, B:122:0x01a7, B:149:0x023d, B:150:0x0244, B:139:0x01ff, B:141:0x020a, B:146:0x0218, B:147:0x021b, B:128:0x021d, B:130:0x022a, B:135:0x0237, B:136:0x023c), top: B:19:0x0076, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d6 A[Catch: all -> 0x0245, TryCatch #1 {all -> 0x0245, blocks: (B:20:0x0076, B:23:0x007a, B:27:0x0080, B:29:0x0095, B:31:0x009c, B:32:0x00a3, B:34:0x00a4, B:36:0x00a9, B:37:0x00b7, B:50:0x00d9, B:52:0x00de, B:54:0x00e2, B:57:0x00e7, B:60:0x00ef, B:63:0x01d6, B:65:0x01da, B:70:0x01eb, B:71:0x01f6, B:75:0x00f5, B:79:0x0103, B:80:0x010a, B:81:0x010b, B:83:0x010f, B:86:0x0114, B:88:0x011d, B:90:0x0122, B:92:0x013e, B:94:0x014c, B:97:0x0155, B:100:0x0160, B:102:0x0178, B:108:0x018b, B:112:0x0197, B:114:0x01ac, B:115:0x01bd, B:117:0x01c7, B:118:0x01cc, B:121:0x01a1, B:122:0x01a7, B:149:0x023d, B:150:0x0244, B:139:0x01ff, B:141:0x020a, B:146:0x0218, B:147:0x021b, B:128:0x021d, B:130:0x022a, B:135:0x0237, B:136:0x023c), top: B:19:0x0076, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f7 A[SYNTHETIC] */
    @Override // defpackage.asly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.asmm a(defpackage.asnv r27) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asnx.a(asnv):asmm");
    }
}
