package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vcq {
    public static final utz a = uuh.m(uuh.b, "tachyon_phone_host_and_port", "instantmessaging-pa-us.googleapis.com:443");
    public final String b;

    public vcq(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof vcq) && d.F(this.b, ((vcq) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ChannelConfiguration(url=" + this.b + ")";
    }
}
