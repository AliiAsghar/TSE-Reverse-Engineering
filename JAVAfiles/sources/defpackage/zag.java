package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zag {
    public final boolean a;
    public final String b;

    public zag(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zag)) {
            return false;
        }
        zag zagVar = (zag) obj;
        if (this.a == zagVar.a && d.F(this.b, zagVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.v(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ChatBotInfo(isAvailable=" + this.a + ", uri=" + this.b + ")";
    }
}
