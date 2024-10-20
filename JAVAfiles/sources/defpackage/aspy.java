package defpackage;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspy implements asqg {
    @Override // defpackage.asqg
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && !d.F(applicationProtocol, "")) {
            return applicationProtocol;
        }
        return null;
    }

    @Override // defpackage.asqg
    public final void b(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            aspx aspxVar = aspx.b;
            sSLParameters.setApplicationProtocols((String[]) aotl.Y(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // defpackage.asqg
    public final boolean c() {
        return aotl.X();
    }

    @Override // defpackage.asqg
    public final boolean d(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }
}
