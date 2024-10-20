package defpackage;

import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class psv {
    private final alpt a;

    public psv() {
        throw null;
    }

    public static psv a(ptz ptzVar) {
        return b((alpt) Collection.EL.stream(ptzVar.b).map(new prj(9)).collect(alls.b));
    }

    public static psv b(Iterable iterable) {
        return new psv(alpt.n(iterable));
    }

    public static psv c() {
        int i = alog.d;
        return b(alsx.a);
    }

    public final boolean d(String str) {
        return Collection.EL.stream(this.a).anyMatch(new ncc(str, 5));
    }

    public final boolean e() {
        return this.a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof psv) {
            return this.a.equals(((psv) obj).a);
        }
        return false;
    }

    public final boolean f() {
        if (!g() && !h()) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        return d("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im");
    }

    public final boolean h() {
        return d("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final boolean i() {
        return d("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush");
    }

    public final boolean j() {
        return d("+g.gsma.rcs.msgrevoke");
    }

    public final boolean k() {
        if (d("video") && d("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel")) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "RcsCapabilities{capabilityTags=" + this.a.toString() + "}";
    }

    public psv(alpt alptVar) {
        if (alptVar == null) {
            throw new NullPointerException("Null capabilityTags");
        }
        this.a = alptVar;
    }
}
