package defpackage;

import android.text.TextUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aijd {
    IP4("IP4"),
    IP6("IP6");

    private final String d;

    aijd(String str) {
        this.d = str;
    }

    public static aijd a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (anbj.b(str)) {
                try {
                    InetAddress byName = InetAddress.getByName(str);
                    if (byName instanceof Inet6Address) {
                        return IP6;
                    }
                    if (byName instanceof Inet4Address) {
                        return IP4;
                    }
                    throw new aijn("Unsupported address type: ".concat(String.valueOf(String.valueOf(byName))));
                } catch (UnknownHostException unused) {
                    throw new IllegalStateException("Expected valid IP address here!");
                }
            }
            throw new aijn("Not an IP address: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("IpAddress must not be null");
    }

    public static aijd b(String str) {
        aijd aijdVar = IP6;
        if (aijdVar.d.equals(str)) {
            return aijdVar;
        }
        return IP4;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
