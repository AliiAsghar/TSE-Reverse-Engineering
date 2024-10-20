package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.apache.http.conn.util.InetAddressUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ailn implements ailm {
    private static final alog d;
    public final aiid a;
    public final ailh b;
    public final ailo c;
    private final boolean e;

    static {
        int i = alog.d;
        d = alsx.a;
    }

    public ailn(aiid aiidVar, ailo ailoVar) {
        this.a = aiidVar;
        this.e = ailoVar.b;
        this.b = ailoVar.c;
        this.c = ailoVar;
    }

    static final InetAddress a(InetAddress[] inetAddressArr, boolean z) {
        Class cls;
        for (InetAddress inetAddress : inetAddressArr) {
            if (true != z) {
                cls = Inet4Address.class;
            } else {
                cls = Inet6Address.class;
            }
            if (cls.isInstance(inetAddress)) {
                return inetAddress;
            }
        }
        return null;
    }

    @Override // defpackage.ailm
    public final List b(String str) {
        Object call;
        Object obj;
        algw i;
        ahes ahesVar = new ahes(this, str, 6);
        aiid aiidVar = this.a;
        try {
            if (!(aiidVar instanceof aiih)) {
                advr.q("expected LegacyDnsClientImpl, but using %s", aiidVar.getClass().getName());
                obj = ahesVar.call();
            } else {
                ((aiih) aiidVar).d();
                synchronized (aiih.class) {
                    call = ahesVar.call();
                }
                obj = call;
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                i = alfd.a;
            } else {
                i = algw.i((ailp) Collection.EL.stream(list).filter(new agol(this, 8)).findFirst().orElseGet(new udz(this, list, 19)));
            }
            if (i.f()) {
                return alog.r(i.b());
            }
            return d;
        } catch (Exception e) {
            advr.i(e, "Error resolving DNS in doWithLegacyLock", new Object[0]);
            throw new RuntimeException(e);
        }
    }

    public final arbj c(atng atngVar) {
        arbj arbjVar = new arbj();
        arbjVar.c = atngVar;
        String atmkVar = atngVar.d.toString();
        if (!TextUtils.isEmpty(atmkVar) && atmkVar.endsWith(".")) {
            atmkVar = atmkVar.substring(0, atmkVar.length() - 1);
        }
        try {
            if (InetAddressUtils.isIPv4Address(atmkVar)) {
                arbjVar.a = atmkVar;
            } else {
                arbjVar.b = atmkVar;
                try {
                    InetAddress[] inetAddressArr = (InetAddress[]) ((List) this.a.a(atmkVar).get()).toArray(new InetAddress[0]);
                    InetAddress a = a(inetAddressArr, this.e);
                    if (a == null) {
                        a = a(inetAddressArr, !this.e);
                    }
                    if (a == null) {
                        advr.q("Resolved address empty, skipping SRV record: %s", atngVar);
                        return null;
                    }
                    advr.c("Resolved %s to %s", atmkVar, a);
                    arbjVar.a = a.getHostAddress();
                } catch (ExecutionException e) {
                    if (e.getCause() instanceof UnknownHostException) {
                        throw ((UnknownHostException) e.getCause());
                    }
                    throw new RuntimeException(e.getCause());
                }
            }
            return arbjVar;
        } catch (InterruptedException | UnknownHostException unused) {
            advr.q("Unknown host exception, skipping SRV record: %s", atngVar);
            return null;
        }
    }
}
