package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qlu {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final String l;
    public final String m;
    public final String n;
    public final Integer o;
    public final long p;

    public qlu(long j, long j2, String str, String str2, String str3, long j3, String str4, String str5, String str6, String str7, int i, String str8, String str9, String str10, Integer num, long j4) {
        str2.getClass();
        str4.getClass();
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = i;
        this.l = str8;
        this.m = str9;
        this.n = str10;
        this.o = num;
        this.p = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlu)) {
            return false;
        }
        qlu qluVar = (qlu) obj;
        if (this.a == qluVar.a && this.b == qluVar.b && d.F(this.c, qluVar.c) && d.F(this.d, qluVar.d) && d.F(this.e, qluVar.e) && this.f == qluVar.f && d.F(this.g, qluVar.g) && d.F(this.h, qluVar.h) && d.F(this.i, qluVar.i) && d.F(this.j, qluVar.j) && this.k == qluVar.k && d.F(this.l, qluVar.l) && d.F(this.m, qluVar.m) && d.F(this.n, qluVar.n) && d.F(this.o, qluVar.o) && this.p == qluVar.p) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int A = (((((((((((a.A(this.a) * 31) + a.A(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a.A(this.f)) * 31) + this.g.hashCode();
        String str = this.h;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((A * 31) + hashCode) * 31;
        String str2 = this.i;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.j;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (((i3 + hashCode3) * 31) + this.k) * 31;
        String str4 = this.l;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.m;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.n;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Integer num = this.o;
        if (num != null) {
            i = num.hashCode();
        }
        return ((i7 + i) * 31) + a.A(this.p);
    }

    public final String toString() {
        return "RawContact(_id=" + this.a + ", contactId=" + this.b + ", lookupKey=" + this.c + ", sortKey=" + this.d + ", phonebookLabel=" + this.e + ", phonebookBucket=" + this.f + ", displayName=" + this.g + ", number=" + this.h + ", normalizedNumber=" + this.i + ", emailAddress=" + this.j + ", contactType=" + this.k + ", contactTypeLabel=" + this.l + ", photoUri=" + this.m + ", photoThumbnailUri=" + this.n + ", photoFileId=" + this.o + ", lastUpdatedTimestamp=" + this.p + ")";
    }
}
