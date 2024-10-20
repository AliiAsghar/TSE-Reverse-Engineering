package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yog {

    @aoor(a = "v")
    private final String a = "1";

    @aoor(a = "i")
    private final String b;

    @aoor(a = "u")
    private final String c;

    @aoor(a = "s")
    private final String d;

    @aoor(a = "r")
    private final String e;

    @aoor(a = "d")
    private final String f;

    @aoor(a = "m")
    private final yoh g;

    public yog(String str, String str2, String str3, String str4, String str5, yoh yohVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = yohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yog)) {
            return false;
        }
        yog yogVar = (yog) obj;
        if (d.F(this.a, yogVar.a) && d.F(this.b, yogVar.b) && d.F(this.c, yogVar.c) && d.F(this.d, yogVar.d) && d.F(this.e, yogVar.e) && d.F(this.f, yogVar.f) && d.F(this.g, yogVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((((hashCode2 * 31) + hashCode) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "CarrierSpamReport(version=" + this.a + ", conversationUuid=" + this.b + ", userAgent=" + this.c + ", senderDestination=" + this.d + ", reporterDestination=" + this.e + ", disposition=" + this.f + ", message=" + this.g + ")";
    }
}
