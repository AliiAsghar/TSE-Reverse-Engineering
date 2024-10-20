package defpackage;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspw extends aspx {
    public static final boolean a;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r0.intValue() >= 9) goto L13;
     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            if (r0 == 0) goto Le
            java.lang.Integer r0 = defpackage.arsd.u(r0)
            goto Lf
        Le:
            r0 = r1
        Lf:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1e
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L1c
            goto L25
        L1c:
            r2 = r3
            goto L25
        L1e:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "getApplicationProtocol"
            r0.getMethod(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L1c
        L25:
            defpackage.aspw.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aspw.<clinit>():void");
    }

    @Override // defpackage.aspx
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (!d.F(applicationProtocol, "")) {
                    return applicationProtocol;
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    @Override // defpackage.aspx
    public final void c(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) aotl.Y(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }
}
