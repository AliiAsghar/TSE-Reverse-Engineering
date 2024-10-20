package defpackage;

import j$.util.Optional;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiha implements aihe {
    private final aihf a;
    private final aihd b;
    private final String c;
    private final int d;
    private final Optional e;

    public aiha(aihf aihfVar, aihd aihdVar, String str, int i, Optional optional) {
        this.a = aihfVar;
        this.b = aihdVar;
        this.c = str;
        this.d = i;
        this.e = optional;
    }

    @Override // defpackage.aihe
    public final Optional a() {
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, aigq] */
    @Override // defpackage.aihe
    public final Socket b() {
        String str;
        InetSocketAddress inetSocketAddress;
        Socket a = this.a.a();
        boolean z = a instanceof SSLSocket;
        Socket h = aigp.h(a);
        String str2 = this.c;
        if (true != z) {
            str = null;
        } else {
            str = str2;
        }
        InetAddress a2 = this.b.a(h, str);
        int i = this.d;
        if (a2 != null) {
            inetSocketAddress = new InetSocketAddress(a2, i);
        } else {
            inetSocketAddress = new InetSocketAddress(str2, i);
        }
        advr.d(advr.b, "Connecting %s to %s", a.getClass().getName(), advq.IP_ADDRESS.c(inetSocketAddress));
        a.connect(inetSocketAddress, 15000);
        if (this.e.isPresent()) {
            advr.d(advr.b, "Socket [isBound = %s, isConnected = %s, isClosed = %s, localAddress = %s, remoteAddress = %s]", Boolean.valueOf(a.isBound()), Boolean.valueOf(a.isConnected()), Boolean.valueOf(a.isClosed()), advq.IP_ADDRESS.c(a.getLocalSocketAddress()), advq.IP_ADDRESS.c(a.getRemoteSocketAddress()));
            try {
                this.e.get().b(aigp.h(a));
            } catch (IOException e) {
                if (aczf.x()) {
                    advr.t(e, advr.b, "[SR] Failed to setup dedicated bearer, falling back to default bearer.", new Object[0]);
                } else {
                    advr.t(e, advr.b, "[SR] Failed to setup dedicated bearer, fallback disabled.", new Object[0]);
                    throw e;
                }
            }
        }
        return a;
    }
}
