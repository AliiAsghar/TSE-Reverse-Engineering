package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agpf {
    public final String a;
    public final boolean b;
    public final alog c;
    public final alog d;
    public final String e;
    public final alog f;
    public final String g;
    public final alog h;
    public final agpj i;
    public final String j;
    public final String k;
    public final String l;
    public final Boolean m;
    public final alog n;
    public final alor o;
    public final alog p;
    public final boolean q;
    public final agni r;
    public final boolean s;
    public final String t;
    public final alhr u;
    public final String v;
    public final boolean w;

    public agpf() {
        throw null;
    }

    public static final agpe a() {
        agpe agpeVar = new agpe();
        agpeVar.r = agni.a;
        agpeVar.f(false);
        agpeVar.g(false);
        agpeVar.a = "";
        agpeVar.e(false);
        agpeVar.d(new ArrayList());
        agpeVar.h(false);
        agpeVar.m = false;
        return agpeVar;
    }

    public final boolean equals(Object obj) {
        alog alogVar;
        String str;
        String str2;
        agpj agpjVar;
        String str3;
        String str4;
        String str5;
        Boolean bool;
        agni agniVar;
        String str6;
        alhr alhrVar;
        String str7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof agpf) {
            agpf agpfVar = (agpf) obj;
            if (this.a.equals(agpfVar.a) && this.b == agpfVar.b && alzz.at(this.c, agpfVar.c) && ((alogVar = this.d) != null ? alzz.at(alogVar, agpfVar.d) : agpfVar.d == null) && ((str = this.e) != null ? str.equals(agpfVar.e) : agpfVar.e == null) && alzz.at(this.f, agpfVar.f) && ((str2 = this.g) != null ? str2.equals(agpfVar.g) : agpfVar.g == null) && alzz.at(this.h, agpfVar.h) && ((agpjVar = this.i) != null ? agpjVar.equals(agpfVar.i) : agpfVar.i == null) && ((str3 = this.j) != null ? str3.equals(agpfVar.j) : agpfVar.j == null) && ((str4 = this.k) != null ? str4.equals(agpfVar.k) : agpfVar.k == null) && ((str5 = this.l) != null ? str5.equals(agpfVar.l) : agpfVar.l == null) && ((bool = this.m) != null ? bool.equals(agpfVar.m) : agpfVar.m == null) && alzz.at(this.n, agpfVar.n) && alzz.am(this.o, agpfVar.o) && alzz.at(this.p, agpfVar.p) && this.q == agpfVar.q && ((agniVar = this.r) != null ? agniVar.equals(agpfVar.r) : agpfVar.r == null) && this.s == agpfVar.s && ((str6 = this.t) != null ? str6.equals(agpfVar.t) : agpfVar.t == null) && ((alhrVar = this.u) != null ? alhrVar.equals(agpfVar.u) : agpfVar.u == null) && ((str7 = this.v) != null ? str7.equals(agpfVar.v) : agpfVar.v == null) && this.w == agpfVar.w) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int i2;
        int hashCode9;
        int i3;
        int hashCode10;
        int hashCode11;
        int hashCode12 = this.a.hashCode() ^ 1000003;
        int i4 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode13 = (((hashCode12 * 1000003) ^ i) * 1000003) ^ this.c.hashCode();
        alog alogVar = this.d;
        int i5 = 0;
        if (alogVar == null) {
            hashCode = 0;
        } else {
            hashCode = alogVar.hashCode();
        }
        int i6 = ((hashCode13 * 1000003) ^ hashCode) * 1000003;
        String str = this.e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int hashCode14 = (((i6 ^ hashCode2) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str2 = this.g;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode15 = (((hashCode14 ^ hashCode3) * 1000003) ^ this.h.hashCode()) * 1000003;
        agpj agpjVar = this.i;
        if (agpjVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = agpjVar.hashCode();
        }
        int i7 = hashCode15 ^ hashCode4;
        String str3 = this.j;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i8 = i7 * (-721379959);
        String str4 = this.k;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i9 = (((i8 ^ hashCode5) * (-721379959)) ^ hashCode6) * 1000003;
        String str5 = this.l;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i10 = (i9 ^ hashCode7) * 1000003;
        Boolean bool = this.m;
        if (bool == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool.hashCode();
        }
        int hashCode16 = (((((((i10 ^ hashCode8) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003;
        if (true != this.q) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i11 = (hashCode16 ^ i2) * 1000003;
        agni agniVar = this.r;
        if (agniVar == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = agniVar.hashCode();
        }
        int i12 = (i11 ^ hashCode9) * 1000003;
        if (true != this.s) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int i13 = (i12 ^ i3) * 1000003;
        String str6 = this.t;
        if (str6 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str6.hashCode();
        }
        int i14 = (i13 ^ hashCode10) * 1000003;
        alhr alhrVar = this.u;
        if (alhrVar == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = alhrVar.hashCode();
        }
        int i15 = (i14 ^ hashCode11) * 1000003;
        String str7 = this.v;
        if (str7 != null) {
            i5 = str7.hashCode();
        }
        int i16 = (i15 ^ i5) * 1000003;
        if (true == this.w) {
            i4 = 1231;
        }
        return i16 ^ i4;
    }

    public final String toString() {
        alhr alhrVar = this.u;
        agni agniVar = this.r;
        alog alogVar = this.p;
        alor alorVar = this.o;
        alog alogVar2 = this.n;
        agpj agpjVar = this.i;
        alog alogVar3 = this.h;
        alog alogVar4 = this.f;
        alog alogVar5 = this.d;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(alogVar5);
        String valueOf3 = String.valueOf(alogVar4);
        String valueOf4 = String.valueOf(alogVar3);
        String valueOf5 = String.valueOf(agpjVar);
        String valueOf6 = String.valueOf(alogVar2);
        String valueOf7 = String.valueOf(alorVar);
        String valueOf8 = String.valueOf(alogVar);
        String valueOf9 = String.valueOf(agniVar);
        String valueOf10 = String.valueOf(alhrVar);
        StringBuilder sb = new StringBuilder("QueryParameters{table=");
        sb.append(this.a);
        sb.append(", distinct=");
        sb.append(this.b);
        sb.append(", defaultColumns=");
        sb.append(valueOf);
        sb.append(", projection=");
        sb.append(valueOf2);
        sb.append(", index=");
        sb.append(this.e);
        sb.append(", expressions=");
        sb.append(valueOf3);
        sb.append(", staticWhereClause=");
        sb.append(this.g);
        sb.append(", whereClauses=");
        sb.append(valueOf4);
        sb.append(", orderBy=");
        sb.append(valueOf5);
        sb.append(", orderByForUnion=null, groupBy=");
        sb.append(this.j);
        sb.append(", having=null, limit=");
        sb.append(this.k);
        sb.append(", offset=");
        sb.append(this.l);
        sb.append(", disableTableFilters=");
        sb.append(this.m);
        sb.append(", unions=");
        sb.append(valueOf6);
        sb.append(", substitutions=");
        sb.append(valueOf7);
        sb.append(", dynamicJoins=");
        sb.append(valueOf8);
        sb.append(", exemptFromQueryPlanChecking=");
        sb.append(this.q);
        sb.append(", loggingTag=");
        sb.append(valueOf9);
        sb.append(", isEmptyProjection=");
        sb.append(this.s);
        sb.append(", tableAs=");
        sb.append(this.t);
        sb.append(", canonicalSql=");
        sb.append(valueOf10);
        sb.append(", databaseName=");
        sb.append(this.v);
        boolean z = this.w;
        sb.append(", queryForColumnSizes=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public agpf(String str, boolean z, alog alogVar, alog alogVar2, String str2, alog alogVar3, String str3, alog alogVar4, agpj agpjVar, String str4, String str5, String str6, Boolean bool, alog alogVar5, alor alorVar, alog alogVar6, boolean z2, agni agniVar, boolean z3, String str7, alhr alhrVar, String str8, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = alogVar;
        this.d = alogVar2;
        this.e = str2;
        this.f = alogVar3;
        this.g = str3;
        this.h = alogVar4;
        this.i = agpjVar;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = bool;
        this.n = alogVar5;
        this.o = alorVar;
        this.p = alogVar6;
        this.q = z2;
        this.r = agniVar;
        this.s = z3;
        this.t = str7;
        this.u = alhrVar;
        this.v = str8;
        this.w = z4;
    }
}
