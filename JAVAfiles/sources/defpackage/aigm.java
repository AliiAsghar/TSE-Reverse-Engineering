package defpackage;

import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aigm extends ServerSocketFactory {
    final /* synthetic */ ServerSocketFactory a;
    final /* synthetic */ aigp b;

    public aigm(aigp aigpVar, ServerSocketFactory serverSocketFactory) {
        this.a = serverSocketFactory;
        this.b = aigpVar;
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket() {
        return this.b.g(this.a.createServerSocket());
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i) {
        return this.b.g(this.a.createServerSocket(i));
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2) {
        return this.b.g(this.a.createServerSocket(i, i2));
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        return this.b.g(this.a.createServerSocket(i, i2, inetAddress));
    }
}
