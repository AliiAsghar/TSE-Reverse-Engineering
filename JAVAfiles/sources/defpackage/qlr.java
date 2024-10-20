package defpackage;

import android.net.Uri;
import j$.time.Instant;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qlr {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final int m;
    public final String n;
    public final Uri o;
    public final Uri p;
    public final Integer q;
    public final String r;
    public final String s;
    public final Instant t;
    public final Collection u;

    public qlr(long j, long j2, String str, String str2, String str3, String str4, long j3, String str5, String str6, String str7, String str8, String str9, int i, String str10, Uri uri, Uri uri2, Integer num, String str11, String str12, Instant instant, Collection collection) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = j3;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = i;
        this.n = str10;
        this.o = uri;
        this.p = uri2;
        this.q = num;
        this.r = str11;
        this.s = str12;
        this.t = instant;
        this.u = collection;
        if (!((str7 != null) ^ (str9 != null))) {
            throw new IllegalArgumentException("Contact is missing a destination");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlr)) {
            return false;
        }
        qlr qlrVar = (qlr) obj;
        if (this.a == qlrVar.a && this.b == qlrVar.b && d.F(this.c, qlrVar.c) && d.F(this.d, qlrVar.d) && d.F(this.e, qlrVar.e) && d.F(this.f, qlrVar.f) && this.g == qlrVar.g && d.F(this.h, qlrVar.h) && d.F(this.i, qlrVar.i) && d.F(this.j, qlrVar.j) && d.F(this.k, qlrVar.k) && d.F(this.l, qlrVar.l) && this.m == qlrVar.m && d.F(this.n, qlrVar.n) && d.F(this.o, qlrVar.o) && d.F(this.p, qlrVar.p) && d.F(this.q, qlrVar.q) && d.F(this.r, qlrVar.r) && d.F(this.s, qlrVar.s) && d.F(this.t, qlrVar.t) && d.F(this.u, qlrVar.u)) {
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
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int A = (((((((((a.A(this.a) * 31) + a.A(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        String str = this.h;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int A2 = ((((A * 31) + a.A(this.g)) * 31) + hashCode) * 31;
        String str2 = this.i;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (A2 + hashCode2) * 31;
        String str3 = this.j;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str4 = this.k;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str5 = this.l;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i5 = (((i4 + hashCode5) * 31) + this.m) * 31;
        String str6 = this.n;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        Uri uri = this.o;
        if (uri == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = uri.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        Uri uri2 = this.p;
        if (uri2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = uri2.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        Integer num = this.q;
        if (num == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        String str7 = this.r;
        if (str7 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str7.hashCode();
        }
        int i10 = (i9 + hashCode10) * 31;
        String str8 = this.s;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return ((((i10 + i) * 31) + this.t.hashCode()) * 31) + this.u.hashCode();
    }

    public final String toString() {
        return "Cp2Contact(_id=" + this.a + ", contactId=" + this.b + ", lookupKey=" + this.c + ", displayName=" + this.d + ", sortKey=" + this.e + ", phonebookLabel=" + this.f + ", phonebookBucket=" + this.g + ", givenName=" + this.h + ", familyName=" + this.i + ", number=" + this.j + ", normalizedNumber=" + this.k + ", emailAddress=" + this.l + ", contactType=" + this.m + ", contactTypeLabel=" + this.n + ", photo=" + this.o + ", photoThumbnail=" + this.p + ", photoFileId=" + this.q + ", birthday=" + this.r + ", anniversary=" + this.s + ", lastUpdatedTimestamp=" + this.t + ", thirdPartyServices=" + this.u + ")";
    }
}
