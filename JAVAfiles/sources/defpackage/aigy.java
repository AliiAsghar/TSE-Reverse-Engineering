package defpackage;

import j$.util.Optional;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aigy {
    public static final acyz a = aczd.a(175047957);
    public final SocketFactory b;
    public final ServerSocketFactory c;
    private final aigp d;
    private final aihm e;

    public aigy(aihm aihmVar, aigp aigpVar) {
        this.e = aihmVar;
        this.d = aigpVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.b = new aigl(aigpVar, socketFactory);
        ServerSocketFactory serverSocketFactory = ServerSocketFactory.getDefault();
        serverSocketFactory.getClass();
        this.c = new aigm(aigpVar, serverSocketFactory);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ServerSocket a(int i) {
        try {
            advr.c("Opening secure server socket at %d", Integer.valueOf(i));
            aigp aigpVar = this.d;
            SSLServerSocketFactory serverSocketFactory = this.e.a().getServerSocketFactory();
            serverSocketFactory.getClass();
            return (SSLServerSocket) new aigo(aigpVar, serverSocketFactory).createServerSocket(i);
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Socket b(KeyStore keyStore, String str) {
        try {
            SSLSocket sSLSocket = (SSLSocket) this.d.j(new aihl(keyStore, str).a().getSocketFactory()).createSocket();
            sSLSocket.setUseClientMode(true);
            int a2 = (int) adac.a();
            if (a2 > 0) {
                sSLSocket.setSoTimeout(a2);
            }
            return sSLSocket;
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }

    public final SSLSocketFactory c() {
        try {
            return this.d.j(this.e.a().getSocketFactory());
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }

    public final aohs d(aihd aihdVar, String str, int i, Optional optional) {
        return new aohs(new aihf() { // from class: aigv
            @Override // defpackage.aihf
            public final Socket a() {
                Socket createSocket = aigy.this.b.createSocket();
                createSocket.setTcpNoDelay(true);
                createSocket.setSoTimeout(660000);
                return createSocket;
            }
        }, aihdVar, str, i, optional);
    }
}
