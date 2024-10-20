package defpackage;

import j$.util.Optional;
import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aigp {
    public static final aigp c = new aigk();
    public static final Optional d = Optional.empty();

    public static Socket h(Socket socket) {
        if (socket instanceof aifn) {
            return h(((aifn) socket).a);
        }
        if (socket instanceof aifm) {
            return h(((aifm) socket).a);
        }
        return socket;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract ServerSocket a(ServerSocket serverSocket);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Socket b(Socket socket);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract SSLServerSocket c(SSLServerSocket sSLServerSocket);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract SSLSocket d(SSLSocket sSLSocket);

    protected Optional f() {
        return d;
    }

    public final ServerSocket g(ServerSocket serverSocket) {
        serverSocket.getClass();
        Optional f = f();
        if (f.isPresent()) {
            serverSocket = ((aigp) f.get()).g(serverSocket);
        }
        if (serverSocket instanceof SSLServerSocket) {
            return c((SSLServerSocket) serverSocket);
        }
        return a(serverSocket);
    }

    public final Socket i(Socket socket) {
        socket.getClass();
        Optional f = f();
        if (f.isPresent()) {
            socket = ((aigp) f.get()).i(socket);
        }
        if (socket instanceof SSLSocket) {
            return d((SSLSocket) socket);
        }
        return b(socket);
    }

    public final SSLSocketFactory j(SSLSocketFactory sSLSocketFactory) {
        sSLSocketFactory.getClass();
        return new aign(this, sSLSocketFactory);
    }
}
