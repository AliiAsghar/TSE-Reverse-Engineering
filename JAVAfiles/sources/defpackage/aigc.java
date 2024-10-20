package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketAddress;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aigc extends aifm implements aipf {
    private final aipl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aigc(SSLSocket sSLSocket) {
        super(sSLSocket);
        aiim aiimVar = aigg.o;
        this.d = aipl.i(aiimVar);
    }

    private final boolean f() {
        return g(aigg.AUTHENTICATING);
    }

    private final boolean g(aigg aiggVar) {
        if (!this.d.a.a.contains(aiggVar)) {
            this.d.g(aiggVar);
            return true;
        }
        return false;
    }

    @Override // defpackage.aifm
    public final InputStream a(InputStream inputStream) {
        aifr aifrVar = new aifr(inputStream);
        this.d.d(aifrVar, aigh.a);
        return new aiga(this, aifrVar);
    }

    @Override // defpackage.aifm
    public final OutputStream b(OutputStream outputStream) {
        aifv aifvVar = new aifv(outputStream);
        this.d.d(aifvVar, aigh.a);
        return new aigb(this, aifvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        super.close();
    }

    @Override // defpackage.aifm, java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d.c(aigg.CLOSING, new aify(new aifu(this, 2), 4), aigg.CLOSED);
    }

    @Override // defpackage.aifm, java.net.Socket
    public final void connect(SocketAddress socketAddress) {
        this.d.c(aigg.CONNECTING, new aify(new aifz(this, socketAddress, 0), 4), aigg.CONNECTED);
    }

    public final synchronized void d() {
        if (f()) {
            startHandshake();
        }
    }

    @Override // defpackage.aipf
    public final void e(aipi aipiVar) {
        this.d.e(aipiVar);
    }

    @Override // defpackage.aifm, java.net.Socket
    public final InputStream getInputStream() {
        d();
        return (InputStream) this.d.a(new aify(this, 2));
    }

    @Override // defpackage.aifm, java.net.Socket
    public final OutputStream getOutputStream() {
        d();
        return (OutputStream) this.d.a(new aify(this, 0));
    }

    @Override // defpackage.aifm, javax.net.ssl.SSLSocket
    public final SSLSession getSession() {
        try {
            d();
        } catch (IOException unused) {
        }
        return this.a.getSession();
    }

    @Override // defpackage.aifm, javax.net.ssl.SSLSocket
    public final void startHandshake() {
        f();
        this.d.a(new aify(new aifu(this, 3), 4));
        g(aigg.AUTHENTICATED);
    }

    @Override // defpackage.aifm, java.net.Socket
    public final void connect(SocketAddress socketAddress, int i) {
        this.d.c(aigg.CONNECTING, new aify(new aige(this, socketAddress, i, 1), 4), aigg.CONNECTED);
    }
}
