package defpackage;

import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aifk extends aigp {
    private final aigp a;

    public aifk() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigp
    public final ServerSocket a(ServerSocket serverSocket) {
        return e().a(serverSocket);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigp
    public final Socket b(Socket socket) {
        return e().b(socket);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigp
    public final SSLServerSocket c(SSLServerSocket sSLServerSocket) {
        return e().c(sSLServerSocket);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigp
    public final SSLSocket d(SSLSocket sSLSocket) {
        return e().d(sSLSocket);
    }

    protected final aigp e() {
        if (aczx.v()) {
            return this.a;
        }
        return aigp.c;
    }

    public aifk(aigp aigpVar) {
        this.a = aigpVar;
    }
}
