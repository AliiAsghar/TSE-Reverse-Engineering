package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrj {
    private final int a;
    private final int b;

    public adrj() {
        throw null;
    }

    public final alog a(boolean z) {
        String str;
        if (!c()) {
            return alog.r("+g.oma.sip-im");
        }
        if (d()) {
            if (z) {
                str = "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.msg";
            } else {
                str = "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.largemsg";
            }
        } else {
            str = "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session";
        }
        return alog.p(adwf.D(null, null, alog.r(str)));
    }

    public final alog b() {
        return a(false);
    }

    public final boolean c() {
        if (this.a == 1) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (aczf.F() && this.b == 2) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adrj) {
            adrj adrjVar = (adrj) obj;
            if (this.a == adrjVar.a && this.b == adrjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.bm(i);
        return i ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "InstantMessagingTech{messagingTech=" + this.a + ", messagingMethod=" + adom.x(this.b) + "}";
    }

    public adrj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
