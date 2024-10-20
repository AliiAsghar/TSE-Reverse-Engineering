package defpackage;

import java.io.EOFException;
import java.io.PrintStream;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/* compiled from: PG */
/* loaded from: classes.dex */
class atkj {
    protected long a;
    protected SelectionKey b;

    /* JADX INFO: Access modifiers changed from: protected */
    public atkj(SelectableChannel selectableChannel, long j) {
        Selector selector;
        this.a = j;
        try {
            selector = Selector.open();
        } catch (Throwable th) {
            th = th;
            selector = null;
        }
        try {
            selectableChannel.configureBlocking(false);
            this.b = selectableChannel.register(selector, 1);
        } catch (Throwable th2) {
            th = th2;
            if (selector != null) {
                selector.close();
            }
            selectableChannel.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(SelectionKey selectionKey, long j) {
        int selectNow;
        long currentTimeMillis = j - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            selectNow = selectionKey.selector().select(currentTimeMillis);
        } else {
            if (currentTimeMillis == 0) {
                selectNow = selectionKey.selector().selectNow();
            }
            throw new SocketTimeoutException();
        }
        if (selectNow != 0) {
            return;
        }
        throw new SocketTimeoutException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void g(String str, byte[] bArr) {
        if (atmp.a("verbosemsg")) {
            int length = bArr.length;
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(length);
            stringBuffer2.append("b");
            stringBuffer.append(stringBuffer2.toString());
            StringBuffer stringBuffer3 = new StringBuffer(" (");
            stringBuffer3.append(str);
            stringBuffer3.append(")");
            stringBuffer.append(stringBuffer3.toString());
            stringBuffer.append(':');
            int length2 = stringBuffer.toString().length();
            stringBuffer.append('\t');
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    int i2 = (length2 + 8) & (-8);
                    if (i % ((80 - i2) / 3) == 0) {
                        stringBuffer.append('\n');
                        for (int i3 = 0; i3 < i2 / 8; i3++) {
                            stringBuffer.append('\t');
                        }
                    }
                }
                byte b = bArr[i];
                stringBuffer.append(atoj.a[(b & 255) >> 4]);
                stringBuffer.append(atoj.a[b & 15]);
                stringBuffer.append(' ');
            }
            stringBuffer.append('\n');
            printStream.println(stringBuffer.toString());
        }
    }

    private final byte[] h(int i) {
        SocketChannel socketChannel = (SocketChannel) this.b.channel();
        byte[] bArr = new byte[i];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.b.interestOps(1);
        int i2 = 0;
        while (i2 < i) {
            try {
                if (this.b.isReadable()) {
                    long read = socketChannel.read(wrap);
                    if (read >= 0) {
                        i2 += (int) read;
                        if (i2 < i && System.currentTimeMillis() > this.a) {
                            throw new SocketTimeoutException();
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    a(this.b, this.a);
                }
            } finally {
                if (this.b.isValid()) {
                    this.b.interestOps(0);
                }
            }
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.b.selector().close();
        this.b.channel().close();
    }

    public void c(SocketAddress socketAddress) {
        ((SocketChannel) this.b.channel()).socket().bind(socketAddress);
    }

    public final void d(SocketAddress socketAddress) {
        SocketChannel socketChannel = (SocketChannel) this.b.channel();
        if (!socketChannel.connect(socketAddress)) {
            this.b.interestOps(8);
            while (!socketChannel.finishConnect()) {
                try {
                    if (!this.b.isConnectable()) {
                        a(this.b, this.a);
                    }
                } catch (Throwable th) {
                    if (this.b.isValid()) {
                        this.b.interestOps(0);
                    }
                    throw th;
                }
            }
            if (this.b.isValid()) {
                this.b.interestOps(0);
            }
        }
    }

    public final void e(byte[] bArr) {
        boolean isValid;
        SocketChannel socketChannel = (SocketChannel) this.b.channel();
        socketChannel.socket().getLocalSocketAddress();
        socketChannel.socket().getRemoteSocketAddress();
        g("TCP write", bArr);
        int length = bArr.length;
        ByteBuffer[] byteBufferArr = {ByteBuffer.wrap(new byte[]{(byte) (length >>> 8), (byte) (length & 255)}), ByteBuffer.wrap(bArr)};
        this.b.interestOps(4);
        int i = 0;
        while (true) {
            try {
                int length2 = bArr.length + 2;
                if (i < length2) {
                    if (this.b.isWritable()) {
                        long write = socketChannel.write(byteBufferArr);
                        if (write >= 0) {
                            i += (int) write;
                            if (i < length2 && System.currentTimeMillis() > this.a) {
                                throw new SocketTimeoutException();
                            }
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        a(this.b, this.a);
                    }
                } else if (isValid) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (this.b.isValid()) {
                    this.b.interestOps(0);
                }
            }
        }
    }

    public final byte[] f() {
        byte[] h = h(2);
        byte[] h2 = h(((h[0] & 255) << 8) + (h[1] & 255));
        SocketChannel socketChannel = (SocketChannel) this.b.channel();
        socketChannel.socket().getLocalSocketAddress();
        socketChannel.socket().getRemoteSocketAddress();
        g("TCP read", h2);
        return h2;
    }

    public atkj(long j) {
        this(SocketChannel.open(), j);
    }
}
