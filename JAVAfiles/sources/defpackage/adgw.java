package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgw extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int b = 0;
    private static final int[] c = {0, 1, 4};
    public final ahjj a;
    private final advp d;
    private NetworkCapabilities e;
    private adfn f;
    private final Executor g;
    private boolean h = false;
    private final adwp i;

    public adgw(Executor executor, ahjj ahjjVar, adwp adwpVar, advp advpVar) {
        this.g = executor;
        this.a = ahjjVar;
        this.i = adwpVar;
        this.d = advpVar;
    }

    private final Optional b(Network network, NetworkCapabilities networkCapabilities, LinkProperties linkProperties) {
        Object obj;
        String interfaceName = linkProperties.getInterfaceName();
        if (interfaceName == null) {
            advr.r(this.d, "Null interface name in LinkProperties", new Object[0]);
            return Optional.empty();
        }
        if (!linkProperties.getLinkAddresses().isEmpty()) {
            if (network != null) {
                if (networkCapabilities != null) {
                    alog n = alog.n((List) Collection.EL.stream(linkProperties.getLinkAddresses()).map(new addg(19)).collect(Collectors.toList()));
                    alog n2 = alog.n(linkProperties.getDnsServers());
                    if (n != null && n2 != null) {
                        adfn adfnVar = new adfn(n, n2, network, networkCapabilities, interfaceName);
                        advp advpVar = this.d;
                        if (!((Boolean) aczf.o().a.ak.a()).booleanValue()) {
                            obj = alog.r("link property logging not enabled");
                        } else {
                            obj = (List) Collection.EL.stream(linkProperties.getRoutes()).map(new addg(18)).collect(Collectors.toList());
                        }
                        advr.l(advpVar, "buildNetworkInterface for Network:%s, ip routes:[%s], other debug properties: NetworkInterface: %s, LinkProperties: %s", network, obj, advq.GENERIC.c(adfnVar), advq.GENERIC.c(linkProperties));
                        return Optional.of(adfnVar);
                    }
                    StringBuilder sb = new StringBuilder();
                    if (n == null) {
                        sb.append(" ipAddresses");
                    }
                    if (n2 == null) {
                        sb.append(" dnsServers");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                throw new NullPointerException("Null networkCapabilities");
            }
            throw new NullPointerException("Null network");
        }
        advr.r(this.d, "LinkProperties(%s) has an empty IP address.", interfaceName);
        return Optional.empty();
    }

    public final void a(adfn adfnVar) {
        adfn adfnVar2 = this.f;
        this.f = adfnVar;
        if (adfnVar2 != null) {
            NetworkCapabilities networkCapabilities = adfnVar.d;
            int[] iArr = c;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= 3) {
                    break;
                }
                int i2 = iArr[i];
                if (adfnVar2.d.hasTransport(i2) && !networkCapabilities.hasTransport(i2)) {
                    advr.d(this.d, "Default transport changed to %d.", Integer.valueOf(i2));
                    advr.l(this.d, "Transport type has changed. Send disconnection to the previous transport.", new Object[0]);
                    Executor executor = this.g;
                    ahjj ahjjVar = this.a;
                    ahjjVar.getClass();
                    executor.execute(new adha(ahjjVar, 1));
                    break;
                }
                i++;
            }
        }
        this.g.execute(new acaj(this, adfnVar, 16));
        this.h = false;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        advr.r(this.d, "Network:%s", network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        LinkProperties linkProperties;
        advr.d(this.d, "Network:%s NetworkCapabilities:%s", network, networkCapabilities);
        if (!networkCapabilities.hasCapability(16)) {
            advr.r(this.d, "Network interface is not validated.", new Object[0]);
            return;
        }
        this.e = networkCapabilities;
        try {
            linkProperties = this.i.a(network);
        } catch (adwk e) {
            advr.j(e, this.d, "Failed to get LinkProperties.", new Object[0]);
            linkProperties = null;
        }
        if (linkProperties != null) {
            Optional b2 = b(network, networkCapabilities, linkProperties);
            if (b2.isPresent()) {
                a((adfn) b2.get());
                return;
            }
        }
        advr.d(this.d, "Waiting for LinkProperties.", new Object[0]);
        this.h = true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        NetworkCapabilities networkCapabilities = this.e;
        if (networkCapabilities == null) {
            advr.r(this.d, "onCapabilitiesChanged() is not called. Ignore onLinkPropertiesChanged().", new Object[0]);
            return;
        }
        advr.d(this.d, "Network:%s LinkProperties:%s", network, advq.GENERIC.c(linkProperties));
        if (this.h) {
            b(network, networkCapabilities, linkProperties).ifPresent(new adgr(this, 3));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        advr.r(this.d, "Network is lost:%s", network);
        ahjj ahjjVar = this.a;
        ahjjVar.getClass();
        this.g.execute(new adha(ahjjVar, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        advr.r(this.d, "NetworkRequest failure.", new Object[0]);
        ahjj ahjjVar = this.a;
        ahjjVar.getClass();
        this.g.execute(new acbq(ahjjVar, 20));
    }
}
