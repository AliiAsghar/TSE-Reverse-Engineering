package defpackage;

import java.net.Socket;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aigx implements aihf {
    public final /* synthetic */ aigy a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aigx(aigy aigyVar, Object obj, Object obj2, int i) {
        this.d = i;
        this.a = aigyVar;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [aihn, java.lang.Object] */
    @Override // defpackage.aihf
    public final Socket a() {
        int a;
        if (this.d != 0) {
            SSLSocket sSLSocket = (SSLSocket) this.a.c().createSocket();
            sSLSocket.setUseClientMode(true);
            if (adaa.a() > 0 && (a = (int) adac.a()) > 0) {
                sSLSocket.setSoTimeout(a);
            }
            Object obj = this.b;
            String str = (String) obj;
            if (albo.ah(str)) {
                advr.q("Invalid host, cannot setup host verification!", new Object[0]);
            } else if (anbj.b(str)) {
                advr.c("Skipping host verification for IP address: %s", obj);
            } else {
                if (((Boolean) aigy.a.a()).booleanValue()) {
                    advr.c("Enabling SNI.", new Object[0]);
                    SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                    if (sSLParameters == null) {
                        sSLParameters = new SSLParameters();
                    }
                    sSLParameters.setServerNames(Arrays.asList(new SNIHostName(str)));
                    sSLSocket.setSSLParameters(sSLParameters);
                }
                ?? r4 = this.c;
                advr.c("Setting up host for verification: %s", obj);
                sSLSocket.addHandshakeCompletedListener(new aiho(str, r4));
            }
            return sSLSocket;
        }
        return this.a.b((KeyStore) this.b, (String) this.c);
    }
}
