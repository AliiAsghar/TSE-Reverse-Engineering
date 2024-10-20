package defpackage;

import j$.util.Objects;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.ServerSocketChannel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aifj extends ServerSocket {
    public final ServerSocket a;

    public aifj(ServerSocket serverSocket) {
        this.a = serverSocket;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Socket a(Socket socket);

    @Override // java.net.ServerSocket
    public Socket accept() {
        return a(this.a.accept());
    }

    @Override // java.net.ServerSocket
    public final void bind(SocketAddress socketAddress) {
        this.a.bind(socketAddress);
    }

    @Override // java.net.ServerSocket, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aifj)) {
            return false;
        }
        if (this != obj && !this.a.equals(((aifj) obj).a)) {
            return false;
        }
        return true;
    }

    @Override // java.net.ServerSocket
    public final ServerSocketChannel getChannel() {
        return this.a.getChannel();
    }

    @Override // java.net.ServerSocket
    public final InetAddress getInetAddress() {
        return this.a.getInetAddress();
    }

    @Override // java.net.ServerSocket
    public final int getLocalPort() {
        return this.a.getLocalPort();
    }

    @Override // java.net.ServerSocket
    public final SocketAddress getLocalSocketAddress() {
        return this.a.getLocalSocketAddress();
    }

    @Override // java.net.ServerSocket
    public final synchronized int getReceiveBufferSize() {
        return this.a.getReceiveBufferSize();
    }

    @Override // java.net.ServerSocket
    public final boolean getReuseAddress() {
        return this.a.getReuseAddress();
    }

    @Override // java.net.ServerSocket
    public final synchronized int getSoTimeout() {
        return this.a.getSoTimeout();
    }

    public final int hashCode() {
        return Objects.hash(aifj.class, this.a);
    }

    @Override // java.net.ServerSocket
    public final boolean isBound() {
        return this.a.isBound();
    }

    @Override // java.net.ServerSocket
    public final boolean isClosed() {
        return this.a.isClosed();
    }

    @Override // java.net.ServerSocket
    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.a.setPerformancePreferences(i, i2, i3);
    }

    @Override // java.net.ServerSocket
    public final synchronized void setReceiveBufferSize(int i) {
        this.a.setReceiveBufferSize(i);
    }

    @Override // java.net.ServerSocket
    public final void setReuseAddress(boolean z) {
        this.a.setReuseAddress(z);
    }

    @Override // java.net.ServerSocket
    public final synchronized void setSoTimeout(int i) {
        this.a.setSoTimeout(i);
    }

    @Override // java.net.ServerSocket
    public final String toString() {
        return String.format("ForwardingServerSocketBase { delegate=%s }", this.a);
    }

    @Override // java.net.ServerSocket
    public final void bind(SocketAddress socketAddress, int i) {
        this.a.bind(socketAddress, i);
    }
}
