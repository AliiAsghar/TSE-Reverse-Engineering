package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imu implements myr {
    private final String a;

    public imu() {
        throw null;
    }

    @Override // defpackage.myr
    public final /* synthetic */ alog a() {
        int i = alog.d;
        return alsx.a;
    }

    @Override // defpackage.myr
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof imu) {
            return this.a.equals(((imu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // defpackage.myr, defpackage.mym
    public final /* synthetic */ String j() {
        return "text/plain";
    }

    public final String toString() {
        return "ContactTextContent{text=" + this.a + "}";
    }

    public imu(String str) {
        this.a = str;
    }
}
