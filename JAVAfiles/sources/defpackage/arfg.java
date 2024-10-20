package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arfg implements aqvo {
    public final InetSocketAddress b;
    public static final Logger a = Logger.getLogger(arfg.class.getName());
    private static final arhi d = new arhi();
    private static final alhr c = new arff(0);

    public arfg() {
        int i;
        alhr alhrVar = c;
        arhi arhiVar = d;
        String str = System.getenv("GRPC_PROXY_EXP");
        alhrVar.getClass();
        arhiVar.getClass();
        if (str != null) {
            String[] split = str.split(":", 2);
            if (split.length > 1) {
                i = Integer.parseInt(split[1]);
            } else {
                i = 80;
            }
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "overrideProxy", "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
            this.b = new InetSocketAddress(split[0], i);
            return;
        }
        this.b = null;
    }

    public static final aqvn a(InetSocketAddress inetSocketAddress) {
        String str = null;
        try {
            URI uri = new URI("https", null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), null, null, null);
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (proxySelector == null) {
                a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                return null;
            }
            List<Proxy> select = proxySelector.select(uri);
            if (select.size() > 1) {
                a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
            }
            Proxy proxy = select.get(0);
            if (proxy.type() == Proxy.Type.DIRECT) {
                return null;
            }
            InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
            PasswordAuthentication b = arhi.b(inetSocketAddress2.getHostString(), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            if (inetSocketAddress2.isUnresolved()) {
                inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
            }
            atcz atczVar = new atcz();
            atczVar.e(inetSocketAddress);
            atczVar.d(inetSocketAddress2);
            if (b == null) {
                return atczVar.c();
            }
            atczVar.c = b.getUserName();
            if (b.getPassword() != null) {
                str = new String(b.getPassword());
            }
            atczVar.b = str;
            return atczVar.c();
        } catch (URISyntaxException e) {
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
            return null;
        }
    }
}
