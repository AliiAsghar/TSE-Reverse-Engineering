package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aigf extends aifn implements aipf {
    private final aipl b;

    public aigf(Socket socket, aiim aiimVar) {
        super(socket);
        this.b = aipl.i(aiimVar);
    }

    @Override // defpackage.aifn
    public final InputStream a(InputStream inputStream) {
        aifr aifrVar = new aifr(inputStream);
        this.b.d(aifrVar, aigh.a);
        return aifrVar;
    }

    @Override // defpackage.aifn
    public final OutputStream b(OutputStream outputStream) {
        aifv aifvVar = new aifv(outputStream);
        this.b.d(aifvVar, aigh.a);
        return aifvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        super.close();
    }

    @Override // defpackage.aifn, java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.b.c(aigg.CLOSING, new aify(new aifu(this, 5), 4), aigg.CLOSED);
    }

    @Override // defpackage.aifn, java.net.Socket
    public final void connect(SocketAddress socketAddress) {
        this.b.c(aigg.CONNECTING, new aify(new aifz(this, socketAddress, 2), 4), aigg.CONNECTED);
    }

    @Override // defpackage.aipf
    public final void e(aipi aipiVar) {
        this.b.e(aipiVar);
    }

    @Override // defpackage.aifn, java.net.Socket
    public final void connect(SocketAddress socketAddress, int i) {
        this.b.c(aigg.CONNECTING, new aify(new aige(this, socketAddress, i, 0), 4), aigg.CONNECTED);
    }
}
