package defpackage;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aigl extends SocketFactory {
    final /* synthetic */ SocketFactory a;
    final /* synthetic */ aigp b;

    public aigl(aigp aigpVar, SocketFactory socketFactory) {
        this.a = socketFactory;
        this.b = aigpVar;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return this.b.i(this.a.createSocket());
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return this.b.i(this.a.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return this.b.i(this.a.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return this.b.i(this.a.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return this.b.i(this.a.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
