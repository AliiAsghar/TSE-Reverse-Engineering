package defpackage;

import j$.util.Map;
import j$.util.Objects;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aifn extends Socket {
    public final Socket a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();

    public aifn(Socket socket) {
        socket.getClass();
        this.a = socket;
    }

    public abstract InputStream a(InputStream inputStream);

    public abstract OutputStream b(OutputStream outputStream);

    @Override // java.net.Socket
    public final void bind(SocketAddress socketAddress) {
        this.a.bind(socketAddress);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.a.close();
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) {
        this.a.connect(socketAddress);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aifn)) {
            return false;
        }
        if (this != obj && !this.a.equals(((aifn) obj).a)) {
            return false;
        }
        return true;
    }

    @Override // java.net.Socket
    public final SocketChannel getChannel() {
        return this.a.getChannel();
    }

    @Override // java.net.Socket
    public final InetAddress getInetAddress() {
        return this.a.getInetAddress();
    }

    @Override // java.net.Socket
    public final InputStream getInputStream() {
        return (InputStream) Map.EL.computeIfAbsent(this.b, this.a.getInputStream(), new agoq(this, 9));
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() {
        return this.a.getKeepAlive();
    }

    @Override // java.net.Socket
    public final InetAddress getLocalAddress() {
        return this.a.getLocalAddress();
    }

    @Override // java.net.Socket
    public final int getLocalPort() {
        return this.a.getLocalPort();
    }

    @Override // java.net.Socket
    public final SocketAddress getLocalSocketAddress() {
        return this.a.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() {
        return this.a.getOOBInline();
    }

    @Override // java.net.Socket
    public final OutputStream getOutputStream() {
        return (OutputStream) Map.EL.computeIfAbsent(this.c, this.a.getOutputStream(), new agoq(this, 8));
    }

    @Override // java.net.Socket
    public final int getPort() {
        return this.a.getPort();
    }

    @Override // java.net.Socket
    public final synchronized int getReceiveBufferSize() {
        return this.a.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public final SocketAddress getRemoteSocketAddress() {
        return this.a.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() {
        return this.a.getReuseAddress();
    }

    @Override // java.net.Socket
    public final synchronized int getSendBufferSize() {
        return this.a.getSendBufferSize();
    }

    @Override // java.net.Socket
    public final int getSoLinger() {
        return this.a.getSoLinger();
    }

    @Override // java.net.Socket
    public final synchronized int getSoTimeout() {
        return this.a.getSoTimeout();
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() {
        return this.a.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public final int getTrafficClass() {
        return this.a.getTrafficClass();
    }

    public final int hashCode() {
        return Objects.hash(aifn.class, this.a);
    }

    @Override // java.net.Socket
    public final boolean isBound() {
        return this.a.isBound();
    }

    @Override // java.net.Socket
    public final boolean isClosed() {
        return this.a.isClosed();
    }

    @Override // java.net.Socket
    public final boolean isConnected() {
        return this.a.isConnected();
    }

    @Override // java.net.Socket
    public final boolean isInputShutdown() {
        return this.a.isInputShutdown();
    }

    @Override // java.net.Socket
    public final boolean isOutputShutdown() {
        return this.a.isOutputShutdown();
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i) {
        this.a.sendUrgentData(i);
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z) {
        this.a.setKeepAlive(z);
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z) {
        this.a.setOOBInline(z);
    }

    @Override // java.net.Socket
    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.a.setPerformancePreferences(i, i2, i3);
    }

    @Override // java.net.Socket
    public final synchronized void setReceiveBufferSize(int i) {
        this.a.setReceiveBufferSize(i);
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z) {
        this.a.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public final synchronized void setSendBufferSize(int i) {
        this.a.setSendBufferSize(i);
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z, int i) {
        this.a.setSoLinger(z, i);
    }

    @Override // java.net.Socket
    public final synchronized void setSoTimeout(int i) {
        this.a.setSoTimeout(i);
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z) {
        this.a.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int i) {
        this.a.setTrafficClass(i);
    }

    @Override // java.net.Socket
    public final void shutdownInput() {
        this.a.shutdownInput();
    }

    @Override // java.net.Socket
    public final void shutdownOutput() {
        this.a.shutdownOutput();
    }

    @Override // java.net.Socket
    public final String toString() {
        return String.format("ForwardingSocketBase { delegate=%s }", this.a);
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) {
        this.a.connect(socketAddress, i);
    }
}
