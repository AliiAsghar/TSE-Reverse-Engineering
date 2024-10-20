package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ryb {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final List o;
    public final List p;
    public static final vcp q = new vcp();
    public static final List a = aqjn.ax(new arsx('A', 'Z'));
    public static final List b = aqjn.B('(', ')', '-', ' ', '*', '#', '@', '_', '.', ',', ':', ',', '/', '+');

    public ryb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, List list2) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = str11;
        this.n = str12;
        this.o = list;
        this.p = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryb)) {
            return false;
        }
        ryb rybVar = (ryb) obj;
        if (d.F(this.c, rybVar.c) && d.F(this.d, rybVar.d) && d.F(this.e, rybVar.e) && d.F(this.f, rybVar.f) && d.F(this.g, rybVar.g) && d.F(this.h, rybVar.h) && d.F(this.i, rybVar.i) && d.F(this.j, rybVar.j) && d.F(this.k, rybVar.k) && d.F(this.l, rybVar.l) && d.F(this.m, rybVar.m) && d.F(this.n, rybVar.n) && d.F(this.o, rybVar.o) && d.F(this.p, rybVar.p)) {
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
        int hashCode11;
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode * 31;
        String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + hashCode3) * 31;
        String str4 = this.f;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str5 = this.g;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str6 = this.h;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        String str7 = this.i;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        String str8 = this.j;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        String str9 = this.k;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        String str10 = this.l;
        if (str10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str10.hashCode();
        }
        int i10 = (i9 + hashCode10) * 31;
        String str11 = this.m;
        if (str11 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str11.hashCode();
        }
        int i11 = (i10 + hashCode11) * 31;
        String str12 = this.n;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return ((((i11 + i) * 31) + this.o.hashCode()) * 31) + this.p.hashCode();
    }

    public final String toString() {
        return "AnonymizedRoamingInvestigationValues(originalNormalizedDestination=" + this.c + ", originalSendDestination=" + this.d + ", updatedNormalizedDestination=" + this.e + ", updatedSendDestination=" + this.f + ", expectedNormalizedDestination=" + this.g + ", expectedSendDestination=" + this.h + ", telephonyCanonicalAddress=" + this.i + ", userInputNumber=" + this.j + ", localeCountryCode=" + this.k + ", deviceCountryCode=" + this.l + ", deviceCountryCodeDeprecated=" + this.m + ", settingsCountryCode=" + this.n + ", simCountryCodes=" + this.o + ", networkCountryCodes=" + this.p + ")";
    }
}
