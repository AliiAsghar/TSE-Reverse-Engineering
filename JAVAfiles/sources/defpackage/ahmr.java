package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahmr {
    public final String a;
    public final boolean b;
    public final asjt c;
    public final ashu d;
    public final String e;
    public final Long f;
    public final boolean g;
    public final ahkz h;
    public final int i;

    public ahmr() {
        throw null;
    }

    public static ahmq a() {
        ahmq ahmqVar = new ahmq();
        ahmqVar.c(false);
        ahmqVar.d(false);
        ahmqVar.b(0);
        return ahmqVar;
    }

    public final boolean equals(Object obj) {
        ashu ashuVar;
        String str;
        Long l;
        ahkz ahkzVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahmr) {
            ahmr ahmrVar = (ahmr) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(ahmrVar.a) : ahmrVar.a == null) {
                if (this.b == ahmrVar.b && this.c.equals(ahmrVar.c) && ((ashuVar = this.d) != null ? ashuVar.equals(ahmrVar.d) : ahmrVar.d == null) && ((str = this.e) != null ? str.equals(ahmrVar.e) : ahmrVar.e == null) && ((l = this.f) != null ? l.equals(ahmrVar.f) : ahmrVar.f == null) && this.g == ahmrVar.g && ((ahkzVar = this.h) != null ? ahkzVar.equals(ahmrVar.h) : ahmrVar.h == null) && this.i == ahmrVar.i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.a;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode5 = ((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.c.hashCode();
        ashu ashuVar = this.d;
        if (ashuVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = ashuVar.hashCode();
        }
        int i4 = ((hashCode5 * 1000003) ^ hashCode2) * 1000003;
        String str2 = this.e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        Long l = this.f;
        if (l == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        if (true == this.g) {
            i3 = 1231;
        }
        int i7 = (i6 ^ i3) * 1000003;
        ahkz ahkzVar = this.h;
        if (ahkzVar != null) {
            i2 = ahkzVar.hashCode();
        }
        return ((i7 ^ i2) * 1000003) ^ this.i;
    }

    public final String toString() {
        ahkz ahkzVar = this.h;
        ashu ashuVar = this.d;
        return "Metric{customEventName=" + this.a + ", isEventNameConstant=" + this.b + ", metric=" + String.valueOf(this.c) + ", metricExtension=" + String.valueOf(ashuVar) + ", accountableComponentName=" + this.e + ", sampleRatePermille=" + this.f + ", isUnsampled=" + this.g + ", debugLogsTime=" + String.valueOf(ahkzVar) + ", debugLogsSize=" + this.i + "}";
    }

    public ahmr(String str, boolean z, asjt asjtVar, ashu ashuVar, String str2, Long l, boolean z2, ahkz ahkzVar, int i) {
        this.a = str;
        this.b = z;
        this.c = asjtVar;
        this.d = ashuVar;
        this.e = str2;
        this.f = l;
        this.g = z2;
        this.h = ahkzVar;
        this.i = i;
    }
}
