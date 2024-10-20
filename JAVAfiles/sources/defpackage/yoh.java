package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yoh {

    @aoor(a = "p")
    private final String a;

    @aoor(a = "t")
    private final String b;

    @aoor(a = "c")
    private final String c;

    public yoh(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoh)) {
            return false;
        }
        yoh yohVar = (yoh) obj;
        if (d.F(this.a, yohVar.a) && d.F(this.b, yohVar.b) && d.F(this.c, yohVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CarrierSpamReportMessage(protocol=" + this.a + ", messageReceiptTimestampUtc=" + this.b + ", messageText=" + this.c + ")";
    }
}
