package defpackage;

import android.content.Context;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adey {
    public static final acyz a = aczd.a(158761105);
    public static final String[] b = {"8.8.8.8", "8.8.4.4"};
    public static final String[] c = {"2001:4860:4860:0:0:0:0:8888", "2001:4860:4860:0:0:0:0:8844"};
    public boolean d;
    public final acmo e;
    public final Context f;
    public Network g;
    public String h;
    public final acnx i;
    public final advp j;
    public final int k;
    public final int l;
    public final int m;

    public adey(Context context, int i, acmo acmoVar, advp advpVar, acnx acnxVar) {
        int i2;
        this.e = acmoVar;
        this.k = i;
        this.j = new advp(advpVar.a + "ImsNetworkInterface[" + adcx.q(i) + "]");
        this.i = acnxVar;
        this.f = context;
        int i3 = i + (-1);
        if (i3 != 0) {
            i2 = 1;
            if (i3 != 1) {
                if (i3 != 4) {
                    i2 = 8;
                } else {
                    i2 = 17;
                }
            }
        } else {
            i2 = 0;
        }
        this.l = i2;
        this.m = i3;
    }

    public static boolean g(NetworkCapabilities networkCapabilities) {
        if (!networkCapabilities.hasCapability(12) && !networkCapabilities.hasCapability(8) && networkCapabilities.hasCapability(15)) {
            return false;
        }
        return true;
    }

    public final int a() {
        if (i()) {
            return 4;
        }
        if (j()) {
            return 6;
        }
        return 0;
    }

    public final ailh b(adju adjuVar) {
        String str;
        if (this.k == 1) {
            str = adjuVar.a;
        } else {
            str = adjuVar.d;
        }
        if ("SIPoUDP".equals(str)) {
            advr.d(this.j, "TransportProtocol SIP_OVER_UDP", new Object[0]);
            return ailh.UDP;
        }
        if ("SIPoTLS".equals(str)) {
            advr.d(this.j, "TransportProtocol SIP_OVER_TLS", new Object[0]);
            return ailh.TLS;
        }
        advr.d(this.j, "TransportProtocol SIP_OVER_TCP", new Object[0]);
        return ailh.TCP;
    }

    public final apit c() {
        if (h()) {
            return apit.NETWORK_INTERFACE_AVAILABILITY_AVAILABLE;
        }
        return apit.NETWORK_INTERFACE_AVAILABILITY_UNAVAILABLE;
    }

    public final String d() {
        return adcx.q(this.k);
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.b.iterator();
        while (it.hasNext()) {
            arrayList.add(((InetAddress) it.next()).getHostAddress());
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof adey)) {
            return TextUtils.equals(this.h, ((adey) obj).h);
        }
        return false;
    }

    public final void f(LinkProperties linkProperties) {
        ArrayList arrayList = new ArrayList();
        this.d = false;
        try {
            arrayList.addAll(linkProperties.getDnsServers());
        } catch (NoSuchMethodException unused) {
            advr.h(this.j, "Can't retrieve DNS address.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            advr.l(this.j, "Using Google DNS server.", new Object[0]);
            String[] strArr = new String[0];
            if (i()) {
                strArr = b;
            } else if (j()) {
                strArr = c;
            }
            for (String str : strArr) {
                try {
                    arrayList.add(InetAddress.getByName(str));
                } catch (UnknownHostException unused2) {
                    advr.h(this.j, "Invalid nameserver %s", str);
                }
            }
        } else {
            this.d = true;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InetAddress inetAddress = (InetAddress) arrayList.get(i);
            if (inetAddress instanceof Inet4Address) {
                this.e.c(inetAddress);
            }
        }
        if (j()) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                InetAddress inetAddress2 = (InetAddress) arrayList.get(i2);
                if (inetAddress2 instanceof Inet6Address) {
                    this.e.c(inetAddress2);
                }
            }
        }
    }

    public final boolean h() {
        adwp k = k();
        Network network = this.g;
        if (network == null) {
            advr.l(this.j, "Network isn't available because network object is null", new Object[0]);
            return false;
        }
        if (this.e.a == null) {
            advr.l(this.j, "Network isn't available because ip address is null", new Object[0]);
            return false;
        }
        try {
            if (agkx.T() && aczx.z()) {
                NetworkCapabilities c2 = k.c(network);
                advr.l(this.j, "network capabilities for network[%s]: %s", network, c2);
                if (aczx.r()) {
                    if (c2 == null || !c2.hasCapability(12) || !c2.hasCapability(16) || !c2.hasCapability(21)) {
                        return false;
                    }
                    return true;
                }
                if (c2 == null || !c2.hasCapability(12) || !c2.hasCapability(16)) {
                    return false;
                }
                return true;
            }
            NetworkInfo e = k.e(network);
            advr.l(this.j, "network info for network[%s]: %s", network, e);
            if (e == null || !e.isConnected() || e.getType() != this.l) {
                return false;
            }
            return true;
        } catch (adwk e2) {
            advr.t(e2, this.j, "Can't get network capabilities, missing permissions.", new Object[0]);
            return false;
        }
    }

    public final int hashCode() {
        String str = this.h;
        str.getClass();
        return str.hashCode();
    }

    public final boolean i() {
        return this.e.f();
    }

    public final boolean j() {
        return this.e.g();
    }

    public final adwp k() {
        return adwp.f(this.f);
    }

    public final String toString() {
        acmo acmoVar = this.e;
        return "Name: " + this.h + ", Network access: " + acmoVar.toString();
    }
}
