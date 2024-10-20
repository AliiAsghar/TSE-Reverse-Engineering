package defpackage;

import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfn {
    public final alog a;
    public final alog b;
    public final Network c;
    public final NetworkCapabilities d;
    private final String e;

    public adfn() {
        throw null;
    }

    public final boolean a() {
        return this.d.hasTransport(1);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adfn) {
            adfn adfnVar = (adfn) obj;
            if (alzz.at(this.a, adfnVar.a) && alzz.at(this.b, adfnVar.b) && this.c.equals(adfnVar.c) && this.d.equals(adfnVar.d) && this.e.equals(adfnVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        NetworkCapabilities networkCapabilities = this.d;
        Network network = this.c;
        alog alogVar = this.b;
        return "NetworkInterface{ipAddresses=" + String.valueOf(this.a) + ", dnsServers=" + String.valueOf(alogVar) + ", network=" + String.valueOf(network) + ", networkCapabilities=" + String.valueOf(networkCapabilities) + ", interfaceName=" + this.e + "}";
    }

    public adfn(alog alogVar, alog alogVar2, Network network, NetworkCapabilities networkCapabilities, String str) {
        this.a = alogVar;
        this.b = alogVar2;
        this.c = network;
        this.d = networkCapabilities;
        this.e = str;
    }
}
