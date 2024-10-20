package defpackage;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class acmo {
    public String a;
    public final List b = new CopyOnWriteArrayList();

    private final InetAddress h() {
        boolean z;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "ipAddress in ImsNetworkAccess should not be null");
        String str = this.a;
        str.getClass();
        return anbj.a(str);
    }

    public abstract String a();

    public abstract String b();

    public final void c(InetAddress inetAddress) {
        this.b.add(inetAddress);
    }

    public final synchronized void d() {
        advr.c("Resetting local IP and DNS server IP addresses", new Object[0]);
        this.a = null;
        this.b.clear();
    }

    public final synchronized void e(String str) {
        advr.c("Setting ip address as %s, isIPv6:%b", advq.IP_ADDRESS.c(str), Boolean.valueOf(g()));
        this.a = str;
    }

    public final synchronized boolean f() {
        if (this.a == null) {
            return false;
        }
        return h() instanceof Inet4Address;
    }

    public final synchronized boolean g() {
        if (this.a == null) {
            return false;
        }
        return h() instanceof Inet6Address;
    }

    public final String toString() {
        return "Type: " + b() + ", IP: " + advq.IP_ADDRESS.c(this.a) + ", DNS: " + this.b.toString() + ", isIPv6:" + g();
    }
}
