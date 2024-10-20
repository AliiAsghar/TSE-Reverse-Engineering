package defpackage;

import j$.util.Optional;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aihg extends aigp {
    static final acyz a = acyy.b("enable_cipher_list_modification");
    private final acnx b;
    private final Optional e;

    public aihg(Optional optional, acnx acnxVar) {
        this.e = optional;
        this.b = acnxVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, acyz] */
    private final String[] e(String[] strArr) {
        alob alobVar = new alob();
        HashSet hashSet = new HashSet(anna.e(',').i().d().c((CharSequence) adac.c().a.d.a()));
        for (String str : strArr) {
            if (!hashSet.contains(str)) {
                alobVar.h(str);
            } else {
                hashSet.remove(str);
            }
        }
        if (!hashSet.isEmpty()) {
            aozy createBuilder = apjg.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            apjg apjgVar = (apjg) apagVar;
            apjgVar.m = 11;
            apjgVar.b |= 2048;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            apjg apjgVar2 = (apjg) apagVar2;
            apjgVar2.c = 4;
            apjgVar2.b |= 1;
            apje apjeVar = apje.SOCKET_FAILURE_TLS_HANDSHAKE_FAILED;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            apjg apjgVar3 = (apjg) createBuilder.b;
            apjgVar3.e = apjeVar.j;
            apjgVar3.b |= 4;
            this.b.j((apjg) createBuilder.s());
            throw new IllegalStateException("Cipher to be disabled missing from default cipher list.");
        }
        return (String[]) alobVar.g().toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigp
    public final SSLServerSocket c(SSLServerSocket sSLServerSocket) {
        SSLParameters sSLParameters;
        if (((Boolean) a.a()).booleanValue()) {
            String[] e = e(sSLServerSocket.getEnabledCipherSuites());
            sSLParameters = sSLServerSocket.getSSLParameters();
            if (sSLParameters == null) {
                sSLParameters = new SSLParameters();
            }
            sSLParameters.setCipherSuites(e);
            sSLServerSocket.setSSLParameters(sSLParameters);
        }
        return sSLServerSocket;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigp
    public final SSLSocket d(SSLSocket sSLSocket) {
        if (((Boolean) a.a()).booleanValue()) {
            String[] e = e(sSLSocket.getEnabledCipherSuites());
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (sSLParameters == null) {
                sSLParameters = new SSLParameters();
            }
            sSLParameters.setCipherSuites(e);
            sSLSocket.setSSLParameters(sSLParameters);
        }
        return sSLSocket;
    }

    @Override // defpackage.aigp
    protected final Optional f() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigp
    public final ServerSocket a(ServerSocket serverSocket) {
        return serverSocket;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigp
    public final Socket b(Socket socket) {
        return socket;
    }
}
