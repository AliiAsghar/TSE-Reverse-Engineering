package defpackage;

import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aigk extends aigp {
    @Override // defpackage.aigp
    public final ServerSocket a(ServerSocket serverSocket) {
        return serverSocket;
    }

    @Override // defpackage.aigp
    protected final Socket b(Socket socket) {
        return socket;
    }

    @Override // defpackage.aigp
    public final SSLServerSocket c(SSLServerSocket sSLServerSocket) {
        return sSLServerSocket;
    }

    @Override // defpackage.aigp
    public final SSLSocket d(SSLSocket sSLSocket) {
        return sSLSocket;
    }
}
