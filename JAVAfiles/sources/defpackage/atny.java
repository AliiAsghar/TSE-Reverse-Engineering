package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.DatagramChannel;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atny extends atkj {
    public static final SecureRandom c = new SecureRandom();
    public static volatile boolean d = true;
    public boolean e;

    static {
        new Thread(new atnx()).start();
    }

    public atny(long j) {
        super(DatagramChannel.open(), j);
        this.e = false;
    }

    private final void h(InetSocketAddress inetSocketAddress) {
        InetSocketAddress inetSocketAddress2;
        if (d) {
            try {
                Thread.sleep(2L);
            } catch (InterruptedException unused) {
            }
            if (d) {
                return;
            }
        }
        DatagramChannel datagramChannel = (DatagramChannel) this.b.channel();
        for (int i = 0; i < 1024; i++) {
            try {
                int nextInt = c.nextInt(32767) + 32768;
                if (inetSocketAddress != null) {
                    inetSocketAddress2 = new InetSocketAddress(inetSocketAddress.getAddress(), nextInt);
                } else {
                    inetSocketAddress2 = new InetSocketAddress(nextInt);
                }
                datagramChannel.socket().bind(inetSocketAddress2);
                this.e = true;
                return;
            } catch (SocketException unused2) {
            }
        }
    }

    @Override // defpackage.atkj
    public final void c(SocketAddress socketAddress) {
        if (socketAddress == null || ((InetSocketAddress) socketAddress).getPort() == 0) {
            h((InetSocketAddress) socketAddress);
            if (this.e) {
                return;
            }
        }
        if (socketAddress != null) {
            ((DatagramChannel) this.b.channel()).socket().bind(socketAddress);
            this.e = true;
        }
    }
}
