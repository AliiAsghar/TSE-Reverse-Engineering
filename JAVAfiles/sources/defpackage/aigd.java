package defpackage;

import java.net.ServerSocket;
import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aigd extends aifj implements aipf {
    private final aipl b;

    public aigd(ServerSocket serverSocket) {
        super(serverSocket);
        this.b = aipl.i(aigg.m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aifj
    public final Socket a(Socket socket) {
        return new aigf(socket, aigg.n);
    }

    @Override // defpackage.aifj, java.net.ServerSocket
    public final Socket accept() {
        return (Socket) this.b.b(aigg.ACCEPTING, new aify(this, 3));
    }

    @Override // defpackage.aifj, java.net.ServerSocket, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.c(aigg.CLOSING, new aify(new aifu(this, 4), 4), aigg.CLOSED);
    }

    @Override // defpackage.aipf
    public final void e(aipi aipiVar) {
        this.b.e(aipiVar);
    }
}
