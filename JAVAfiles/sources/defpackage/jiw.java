package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jiw {
    public final mwj a;
    public final mjq b;
    public final String c;

    public jiw(mwj mwjVar, mjq mjqVar, String str) {
        this.a = mwjVar;
        this.b = mjqVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jiw)) {
            return false;
        }
        jiw jiwVar = (jiw) obj;
        if (d.F(this.a, jiwVar.a) && this.b == jiwVar.b && d.F(this.c, jiwVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        mwj mwjVar = this.a;
        int i = 0;
        if (mwjVar == null) {
            hashCode = 0;
        } else {
            hashCode = mwjVar.hashCode();
        }
        int hashCode2 = (hashCode * 31) + this.b.hashCode();
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode2 * 31) + i;
    }

    public final String toString() {
        return "SimpleMessagePropertiesData(simpleMessagePropertiesProvider=" + this.a + ", bestAvailableTransportFeatureSet=" + this.b + ", draftText=" + this.c + ")";
    }
}
