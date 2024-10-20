package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qry implements qrt {
    private final alor a;

    public qry() {
        throw null;
    }

    public static qry b() {
        return new ryh(null).a();
    }

    @Override // defpackage.qrt
    public final String a(String str) {
        return (String) this.a.get(str);
    }

    public final boolean c(String str) {
        return this.a.containsKey(str);
    }

    public final boolean d() {
        if (!c("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im") && !c("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp")) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        return c("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qry) {
            return alzz.am(this.a, ((qry) obj).a);
        }
        return false;
    }

    public final boolean f() {
        return c("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RcsCapabilities{capabilities=" + String.valueOf(this.a) + "}";
    }

    public qry(alor alorVar) {
        this.a = alorVar;
    }
}
