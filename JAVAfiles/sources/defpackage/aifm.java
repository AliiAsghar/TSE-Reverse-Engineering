package defpackage;

import j$.util.Map;
import j$.util.Objects;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aifm extends SSLSocket {
    public final SSLSocket a;
    private final Map d = new HashMap();
    public final Map b = new HashMap();
    public final Map c = new HashMap();

    public aifm(SSLSocket sSLSocket) {
        this.a = sSLSocket;
    }

    public abstract InputStream a(InputStream inputStream);

    @Override // javax.net.ssl.SSLSocket
    public final void addHandshakeCompletedListener(final HandshakeCompletedListener handshakeCompletedListener) {
        boolean z;
        if (handshakeCompletedListener != null) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "expected listener to be non-null");
        removeHandshakeCompletedListener(handshakeCompletedListener);
        this.d.put(handshakeCompletedListener, new HandshakeCompletedListener() { // from class: aifl
            @Override // javax.net.ssl.HandshakeCompletedListener
            public final void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
                handshakeCompletedListener.handshakeCompleted(new HandshakeCompletedEvent(aifm.this, handshakeCompletedEvent.getSession()));
            }
        });
        this.a.addHandshakeCompletedListener((HandshakeCompletedListener) this.d.get(handshakeCompletedListener));
    }

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
        if (!(obj instanceof aifm)) {
            return false;
        }
        if (this != obj && !this.a.equals(((aifm) obj).a)) {
            return false;
        }
        return true;
    }

    @Override // java.net.Socket
    public final SocketChannel getChannel() {
        return this.a.getChannel();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getEnableSessionCreation() {
        return this.a.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledCipherSuites() {
        return this.a.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledProtocols() {
        return this.a.getEnabledProtocols();
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLSession getHandshakeSession() {
        SSLSession handshakeSession;
        handshakeSession = this.a.getHandshakeSession();
        return handshakeSession;
    }

    @Override // java.net.Socket
    public final InetAddress getInetAddress() {
        return this.a.getInetAddress();
    }

    @Override // java.net.Socket
    public InputStream getInputStream() {
        return (InputStream) Map.EL.computeIfAbsent(this.b, this.a.getInputStream(), new agoq(this, 6));
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

    @Override // javax.net.ssl.SSLSocket
    public final boolean getNeedClientAuth() {
        return this.a.getNeedClientAuth();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() {
        return this.a.getOOBInline();
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() {
        return (OutputStream) Map.EL.computeIfAbsent(this.c, this.a.getOutputStream(), new agoq(this, 7));
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

    @Override // javax.net.ssl.SSLSocket
    public final SSLParameters getSSLParameters() {
        return this.a.getSSLParameters();
    }

    @Override // java.net.Socket
    public final synchronized int getSendBufferSize() {
        return this.a.getSendBufferSize();
    }

    @Override // javax.net.ssl.SSLSocket
    public SSLSession getSession() {
        return this.a.getSession();
    }

    @Override // java.net.Socket
    public final int getSoLinger() {
        return this.a.getSoLinger();
    }

    @Override // java.net.Socket
    public final synchronized int getSoTimeout() {
        return this.a.getSoTimeout();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedProtocols() {
        return this.a.getSupportedProtocols();
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() {
        return this.a.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public final int getTrafficClass() {
        return this.a.getTrafficClass();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getUseClientMode() {
        return this.a.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getWantClientAuth() {
        return this.a.getWantClientAuth();
    }

    public final int hashCode() {
        return Objects.hash(aifm.class, this.a);
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

    @Override // javax.net.ssl.SSLSocket
    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        boolean z;
        if (handshakeCompletedListener != null) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "expected listener to be non-null");
        HandshakeCompletedListener handshakeCompletedListener2 = (HandshakeCompletedListener) this.d.remove(handshakeCompletedListener);
        if (handshakeCompletedListener2 != null) {
            this.a.removeHandshakeCompletedListener(handshakeCompletedListener2);
        }
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i) {
        this.a.sendUrgentData(i);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnableSessionCreation(boolean z) {
        this.a.setEnableSessionCreation(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledCipherSuites(String[] strArr) {
        this.a.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledProtocols(String[] strArr) {
        this.a.setEnabledProtocols(strArr);
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z) {
        this.a.setKeepAlive(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setNeedClientAuth(boolean z) {
        this.a.setNeedClientAuth(z);
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

    @Override // javax.net.ssl.SSLSocket
    public final void setSSLParameters(SSLParameters sSLParameters) {
        this.a.setSSLParameters(sSLParameters);
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

    @Override // javax.net.ssl.SSLSocket
    public final void setUseClientMode(boolean z) {
        this.a.setUseClientMode(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setWantClientAuth(boolean z) {
        this.a.setWantClientAuth(z);
    }

    @Override // java.net.Socket
    public final void shutdownInput() {
        this.a.shutdownInput();
    }

    @Override // java.net.Socket
    public final void shutdownOutput() {
        this.a.shutdownOutput();
    }

    @Override // javax.net.ssl.SSLSocket
    public void startHandshake() {
        this.a.startHandshake();
    }

    @Override // javax.net.ssl.SSLSocket, java.net.Socket
    public final String toString() {
        return String.format("ForwardingSSLSocketBase { delegate=%s }", this.a);
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) {
        this.a.connect(socketAddress, i);
    }
}
