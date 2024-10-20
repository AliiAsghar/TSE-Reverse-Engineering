package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aiba implements Parcelable {
    public final String A;
    public final String B;
    public final List C;
    public final List D;
    public final List E;
    public final aibc F;
    public final Integer G;
    public final String H;
    public final String I;
    public final String J;
    public final Double K;
    public final aiav L;
    public final List M;
    public final List N;
    public final aiav O;
    public final aiav P;
    public final aiav Q;
    public final aiav R;
    public final aiav S;
    public final aiav T;
    public final aiav U;
    public final aiav V;
    public final List W;
    public final Integer X;
    public final Integer Y;
    public final Integer Z;
    public final String a;
    public final LatLngBounds aa;
    public final Uri ab;
    public final Uri ac;
    public final aiav ad;
    public final ahyt ae;
    public final aiaq af;
    public final aiar ag;
    public final aiad ah;
    public final aiav ai;
    public final aiav aj;
    public final aiav ak;
    public final aiav al;
    public final aiav am;
    public final aiav an;
    public final aiav ao;
    public final aiav ap;
    public final aiav aq;
    public final aiav ar;
    public final aiav as;
    public final List at;
    public final aiaf au;
    public final String b;
    public final String c;
    public final String d;
    public final ahyv e;
    public final List f;
    public final aiax g;
    public final aiav h;
    public final aiao i;
    public final aiav j;
    public final aiav k;
    public final String l;
    public final String m;
    public final Integer n;
    public final String o;
    public final String p;
    public final String q;
    public final LatLng r;
    public final LatLng s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final aiao y;
    public final String z;

    public aiba() {
        throw null;
    }

    public static aiaw a() {
        aiaw aiawVar = new aiaw();
        aiawVar.d(aiav.UNKNOWN);
        aiawVar.e(aiav.UNKNOWN);
        aiawVar.f(aiav.UNKNOWN);
        aiawVar.m(aiav.UNKNOWN);
        aiawVar.o(aiav.UNKNOWN);
        aiawVar.p(aiav.UNKNOWN);
        aiawVar.q(aiav.UNKNOWN);
        aiawVar.u(aiav.UNKNOWN);
        aiawVar.v(aiav.UNKNOWN);
        aiawVar.w(aiav.UNKNOWN);
        aiawVar.x(aiav.UNKNOWN);
        aiawVar.y(aiav.UNKNOWN);
        aiawVar.z(aiav.UNKNOWN);
        aiawVar.l(aiav.UNKNOWN);
        aiawVar.j(aiav.UNKNOWN);
        aiawVar.k(aiav.UNKNOWN);
        aiawVar.r(aiav.UNKNOWN);
        aiawVar.t(aiav.UNKNOWN);
        aiawVar.s(aiav.UNKNOWN);
        aiawVar.g(aiav.UNKNOWN);
        aiawVar.c(aiav.UNKNOWN);
        aiawVar.n(aiav.UNKNOWN);
        aiawVar.h(aiav.UNKNOWN);
        aiawVar.i(aiav.UNKNOWN);
        return aiawVar;
    }

    public final boolean equals(Object obj) {
        aiao aiaoVar;
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        LatLng latLng;
        LatLng latLng2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        aiao aiaoVar2;
        String str11;
        String str12;
        String str13;
        List list;
        List list2;
        List list3;
        aibc aibcVar;
        Integer num2;
        String str14;
        String str15;
        String str16;
        Double d;
        List list4;
        List list5;
        List list6;
        Integer num3;
        Integer num4;
        Integer num5;
        LatLngBounds latLngBounds;
        Uri uri;
        Uri uri2;
        ahyt ahytVar;
        aiaq aiaqVar;
        aiar aiarVar;
        aiad aiadVar;
        List list7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiba) {
            aiba aibaVar = (aiba) obj;
            String str17 = this.a;
            if (str17 != null ? str17.equals(aibaVar.a) : aibaVar.a == null) {
                String str18 = this.b;
                if (str18 != null ? str18.equals(aibaVar.b) : aibaVar.b == null) {
                    String str19 = this.c;
                    if (str19 != null ? str19.equals(aibaVar.c) : aibaVar.c == null) {
                        String str20 = this.d;
                        if (str20 != null ? str20.equals(aibaVar.d) : aibaVar.d == null) {
                            ahyv ahyvVar = this.e;
                            if (ahyvVar != null ? ahyvVar.equals(aibaVar.e) : aibaVar.e == null) {
                                List list8 = this.f;
                                if (list8 != null ? list8.equals(aibaVar.f) : aibaVar.f == null) {
                                    aiax aiaxVar = this.g;
                                    if (aiaxVar != null ? aiaxVar.equals(aibaVar.g) : aibaVar.g == null) {
                                        if (this.h.equals(aibaVar.h) && ((aiaoVar = this.i) != null ? aiaoVar.equals(aibaVar.i) : aibaVar.i == null) && this.j.equals(aibaVar.j) && this.k.equals(aibaVar.k) && ((str = this.l) != null ? str.equals(aibaVar.l) : aibaVar.l == null) && ((str2 = this.m) != null ? str2.equals(aibaVar.m) : aibaVar.m == null) && ((num = this.n) != null ? num.equals(aibaVar.n) : aibaVar.n == null) && ((str3 = this.o) != null ? str3.equals(aibaVar.o) : aibaVar.o == null) && ((str4 = this.p) != null ? str4.equals(aibaVar.p) : aibaVar.p == null) && ((str5 = this.q) != null ? str5.equals(aibaVar.q) : aibaVar.q == null) && ((latLng = this.r) != null ? latLng.equals(aibaVar.r) : aibaVar.r == null) && ((latLng2 = this.s) != null ? latLng2.equals(aibaVar.s) : aibaVar.s == null) && ((str6 = this.t) != null ? str6.equals(aibaVar.t) : aibaVar.t == null) && ((str7 = this.u) != null ? str7.equals(aibaVar.u) : aibaVar.u == null) && ((str8 = this.v) != null ? str8.equals(aibaVar.v) : aibaVar.v == null) && ((str9 = this.w) != null ? str9.equals(aibaVar.w) : aibaVar.w == null) && ((str10 = this.x) != null ? str10.equals(aibaVar.x) : aibaVar.x == null) && ((aiaoVar2 = this.y) != null ? aiaoVar2.equals(aibaVar.y) : aibaVar.y == null) && ((str11 = this.z) != null ? str11.equals(aibaVar.z) : aibaVar.z == null) && ((str12 = this.A) != null ? str12.equals(aibaVar.A) : aibaVar.A == null) && ((str13 = this.B) != null ? str13.equals(aibaVar.B) : aibaVar.B == null) && ((list = this.C) != null ? list.equals(aibaVar.C) : aibaVar.C == null) && ((list2 = this.D) != null ? list2.equals(aibaVar.D) : aibaVar.D == null) && ((list3 = this.E) != null ? list3.equals(aibaVar.E) : aibaVar.E == null) && ((aibcVar = this.F) != null ? aibcVar.equals(aibaVar.F) : aibaVar.F == null) && ((num2 = this.G) != null ? num2.equals(aibaVar.G) : aibaVar.G == null) && ((str14 = this.H) != null ? str14.equals(aibaVar.H) : aibaVar.H == null) && ((str15 = this.I) != null ? str15.equals(aibaVar.I) : aibaVar.I == null) && ((str16 = this.J) != null ? str16.equals(aibaVar.J) : aibaVar.J == null) && ((d = this.K) != null ? d.equals(aibaVar.K) : aibaVar.K == null) && this.L.equals(aibaVar.L) && ((list4 = this.M) != null ? list4.equals(aibaVar.M) : aibaVar.M == null) && ((list5 = this.N) != null ? list5.equals(aibaVar.N) : aibaVar.N == null) && this.O.equals(aibaVar.O) && this.P.equals(aibaVar.P) && this.Q.equals(aibaVar.Q) && this.R.equals(aibaVar.R) && this.S.equals(aibaVar.S) && this.T.equals(aibaVar.T) && this.U.equals(aibaVar.U) && this.V.equals(aibaVar.V) && ((list6 = this.W) != null ? list6.equals(aibaVar.W) : aibaVar.W == null) && ((num3 = this.X) != null ? num3.equals(aibaVar.X) : aibaVar.X == null) && ((num4 = this.Y) != null ? num4.equals(aibaVar.Y) : aibaVar.Y == null) && ((num5 = this.Z) != null ? num5.equals(aibaVar.Z) : aibaVar.Z == null) && ((latLngBounds = this.aa) != null ? latLngBounds.equals(aibaVar.aa) : aibaVar.aa == null) && ((uri = this.ab) != null ? uri.equals(aibaVar.ab) : aibaVar.ab == null) && ((uri2 = this.ac) != null ? uri2.equals(aibaVar.ac) : aibaVar.ac == null) && this.ad.equals(aibaVar.ad) && ((ahytVar = this.ae) != null ? ahytVar.equals(aibaVar.ae) : aibaVar.ae == null) && ((aiaqVar = this.af) != null ? aiaqVar.equals(aibaVar.af) : aibaVar.af == null) && ((aiarVar = this.ag) != null ? aiarVar.equals(aibaVar.ag) : aibaVar.ag == null) && ((aiadVar = this.ah) != null ? aiadVar.equals(aibaVar.ah) : aibaVar.ah == null) && this.ai.equals(aibaVar.ai) && this.aj.equals(aibaVar.aj) && this.ak.equals(aibaVar.ak) && this.al.equals(aibaVar.al) && this.am.equals(aibaVar.am) && this.an.equals(aibaVar.an) && this.ao.equals(aibaVar.ao) && this.ap.equals(aibaVar.ap) && this.aq.equals(aibaVar.aq) && this.ar.equals(aibaVar.ar) && this.as.equals(aibaVar.as) && ((list7 = this.at) != null ? list7.equals(aibaVar.at) : aibaVar.at == null)) {
                                            aiaf aiafVar = this.au;
                                            aiaf aiafVar2 = aibaVar.au;
                                            if (aiafVar != null ? aiafVar.equals(aiafVar2) : aiafVar2 == null) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
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
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32;
        int hashCode33;
        int hashCode34;
        int hashCode35;
        int hashCode36;
        int hashCode37;
        int hashCode38;
        int hashCode39;
        int hashCode40;
        int hashCode41;
        int hashCode42;
        int hashCode43;
        int hashCode44;
        int hashCode45;
        int hashCode46;
        int hashCode47;
        int hashCode48;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        String str4 = this.d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        ahyv ahyvVar = this.e;
        if (ahyvVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = ahyvVar.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        List list = this.f;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i6 = (i5 ^ hashCode6) * 1000003;
        aiax aiaxVar = this.g;
        if (aiaxVar == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = aiaxVar.hashCode();
        }
        int hashCode49 = (((i6 ^ hashCode7) * 1000003) ^ this.h.hashCode()) * 1000003;
        aiao aiaoVar = this.i;
        if (aiaoVar == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = aiaoVar.hashCode();
        }
        int hashCode50 = (((((hashCode49 ^ hashCode8) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003;
        String str5 = this.l;
        if (str5 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str5.hashCode();
        }
        int i7 = (hashCode50 ^ hashCode9) * 1000003;
        String str6 = this.m;
        if (str6 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str6.hashCode();
        }
        int i8 = (i7 ^ hashCode10) * 1000003;
        Integer num = this.n;
        if (num == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = num.hashCode();
        }
        int i9 = (i8 ^ hashCode11) * 1000003;
        String str7 = this.o;
        if (str7 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str7.hashCode();
        }
        int i10 = (i9 ^ hashCode12) * 1000003;
        String str8 = this.p;
        if (str8 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str8.hashCode();
        }
        int i11 = (i10 ^ hashCode13) * 1000003;
        String str9 = this.q;
        if (str9 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str9.hashCode();
        }
        int i12 = (i11 ^ hashCode14) * 1000003;
        LatLng latLng = this.r;
        if (latLng == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = latLng.hashCode();
        }
        int i13 = (i12 ^ hashCode15) * 1000003;
        LatLng latLng2 = this.s;
        if (latLng2 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = latLng2.hashCode();
        }
        int i14 = (i13 ^ hashCode16) * 1000003;
        String str10 = this.t;
        if (str10 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str10.hashCode();
        }
        int i15 = (i14 ^ hashCode17) * 1000003;
        String str11 = this.u;
        if (str11 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str11.hashCode();
        }
        int i16 = (i15 ^ hashCode18) * 1000003;
        String str12 = this.v;
        if (str12 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str12.hashCode();
        }
        int i17 = (i16 ^ hashCode19) * 1000003;
        String str13 = this.w;
        if (str13 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str13.hashCode();
        }
        int i18 = (i17 ^ hashCode20) * 1000003;
        String str14 = this.x;
        if (str14 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str14.hashCode();
        }
        int i19 = (i18 ^ hashCode21) * 1000003;
        aiao aiaoVar2 = this.y;
        if (aiaoVar2 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = aiaoVar2.hashCode();
        }
        int i20 = (i19 ^ hashCode22) * 1000003;
        String str15 = this.z;
        if (str15 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = str15.hashCode();
        }
        int i21 = (i20 ^ hashCode23) * 1000003;
        String str16 = this.A;
        if (str16 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = str16.hashCode();
        }
        int i22 = (i21 ^ hashCode24) * 1000003;
        String str17 = this.B;
        if (str17 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = str17.hashCode();
        }
        int i23 = (i22 ^ hashCode25) * 1000003;
        List list2 = this.C;
        if (list2 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = list2.hashCode();
        }
        int i24 = (i23 ^ hashCode26) * 1000003;
        List list3 = this.D;
        if (list3 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = list3.hashCode();
        }
        int i25 = (i24 ^ hashCode27) * 1000003;
        List list4 = this.E;
        if (list4 == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = list4.hashCode();
        }
        int i26 = (i25 ^ hashCode28) * 1000003;
        aibc aibcVar = this.F;
        if (aibcVar == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = aibcVar.hashCode();
        }
        int i27 = (i26 ^ hashCode29) * 1000003;
        Integer num2 = this.G;
        if (num2 == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = num2.hashCode();
        }
        int i28 = (i27 ^ hashCode30) * 1000003;
        String str18 = this.H;
        if (str18 == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = str18.hashCode();
        }
        int i29 = (i28 ^ hashCode31) * 1000003;
        String str19 = this.I;
        if (str19 == null) {
            hashCode32 = 0;
        } else {
            hashCode32 = str19.hashCode();
        }
        int i30 = (i29 ^ hashCode32) * 1000003;
        String str20 = this.J;
        if (str20 == null) {
            hashCode33 = 0;
        } else {
            hashCode33 = str20.hashCode();
        }
        int i31 = (i30 ^ hashCode33) * 1000003;
        Double d = this.K;
        if (d == null) {
            hashCode34 = 0;
        } else {
            hashCode34 = d.hashCode();
        }
        int hashCode51 = (((i31 ^ hashCode34) * 1000003) ^ this.L.hashCode()) * 1000003;
        List list5 = this.M;
        if (list5 == null) {
            hashCode35 = 0;
        } else {
            hashCode35 = list5.hashCode();
        }
        int i32 = (hashCode51 ^ hashCode35) * 1000003;
        List list6 = this.N;
        if (list6 == null) {
            hashCode36 = 0;
        } else {
            hashCode36 = list6.hashCode();
        }
        int hashCode52 = (((((((((((((((((i32 ^ hashCode36) * 1000003) ^ this.O.hashCode()) * 1000003) ^ this.P.hashCode()) * 1000003) ^ this.Q.hashCode()) * 1000003) ^ this.R.hashCode()) * 1000003) ^ this.S.hashCode()) * 1000003) ^ this.T.hashCode()) * 1000003) ^ this.U.hashCode()) * 1000003) ^ this.V.hashCode()) * 1000003;
        List list7 = this.W;
        if (list7 == null) {
            hashCode37 = 0;
        } else {
            hashCode37 = list7.hashCode();
        }
        int i33 = (hashCode52 ^ hashCode37) * 1000003;
        Integer num3 = this.X;
        if (num3 == null) {
            hashCode38 = 0;
        } else {
            hashCode38 = num3.hashCode();
        }
        int i34 = (i33 ^ hashCode38) * 1000003;
        Integer num4 = this.Y;
        if (num4 == null) {
            hashCode39 = 0;
        } else {
            hashCode39 = num4.hashCode();
        }
        int i35 = (i34 ^ hashCode39) * 1000003;
        Integer num5 = this.Z;
        if (num5 == null) {
            hashCode40 = 0;
        } else {
            hashCode40 = num5.hashCode();
        }
        int i36 = (i35 ^ hashCode40) * 1000003;
        LatLngBounds latLngBounds = this.aa;
        if (latLngBounds == null) {
            hashCode41 = 0;
        } else {
            hashCode41 = latLngBounds.hashCode();
        }
        int i37 = (i36 ^ hashCode41) * 1000003;
        Uri uri = this.ab;
        if (uri == null) {
            hashCode42 = 0;
        } else {
            hashCode42 = uri.hashCode();
        }
        int i38 = (i37 ^ hashCode42) * 1000003;
        Uri uri2 = this.ac;
        if (uri2 == null) {
            hashCode43 = 0;
        } else {
            hashCode43 = uri2.hashCode();
        }
        int hashCode53 = (((i38 ^ hashCode43) * 1000003) ^ this.ad.hashCode()) * 1000003;
        ahyt ahytVar = this.ae;
        if (ahytVar == null) {
            hashCode44 = 0;
        } else {
            hashCode44 = ahytVar.hashCode();
        }
        int i39 = (hashCode53 ^ hashCode44) * 1000003;
        aiaq aiaqVar = this.af;
        if (aiaqVar == null) {
            hashCode45 = 0;
        } else {
            hashCode45 = aiaqVar.hashCode();
        }
        int i40 = (i39 ^ hashCode45) * 1000003;
        aiar aiarVar = this.ag;
        if (aiarVar == null) {
            hashCode46 = 0;
        } else {
            hashCode46 = aiarVar.hashCode();
        }
        int i41 = (i40 ^ hashCode46) * 1000003;
        aiad aiadVar = this.ah;
        if (aiadVar == null) {
            hashCode47 = 0;
        } else {
            hashCode47 = aiadVar.hashCode();
        }
        int hashCode54 = (((((((((((((((((((((((i41 ^ hashCode47) * 1000003) ^ this.ai.hashCode()) * 1000003) ^ this.aj.hashCode()) * 1000003) ^ this.ak.hashCode()) * 1000003) ^ this.al.hashCode()) * 1000003) ^ this.am.hashCode()) * 1000003) ^ this.an.hashCode()) * 1000003) ^ this.ao.hashCode()) * 1000003) ^ this.ap.hashCode()) * 1000003) ^ this.aq.hashCode()) * 1000003) ^ this.ar.hashCode()) * 1000003) ^ this.as.hashCode()) * 1000003;
        List list8 = this.at;
        if (list8 == null) {
            hashCode48 = 0;
        } else {
            hashCode48 = list8.hashCode();
        }
        int i42 = (hashCode54 ^ hashCode48) * 1000003;
        aiaf aiafVar = this.au;
        if (aiafVar != null) {
            i = aiafVar.hashCode();
        }
        return i42 ^ i;
    }

    public final String toString() {
        aiav aiavVar = this.ak;
        aiav aiavVar2 = this.aj;
        aiav aiavVar3 = this.ai;
        aiad aiadVar = this.ah;
        aiar aiarVar = this.ag;
        aiaq aiaqVar = this.af;
        ahyt ahytVar = this.ae;
        aiav aiavVar4 = this.ad;
        Uri uri = this.ac;
        Uri uri2 = this.ab;
        LatLngBounds latLngBounds = this.aa;
        List list = this.W;
        aiav aiavVar5 = this.V;
        aiav aiavVar6 = this.U;
        aiav aiavVar7 = this.T;
        aiav aiavVar8 = this.S;
        aiav aiavVar9 = this.R;
        aiav aiavVar10 = this.Q;
        aiav aiavVar11 = this.P;
        aiav aiavVar12 = this.O;
        List list2 = this.N;
        List list3 = this.M;
        aiav aiavVar13 = this.L;
        aibc aibcVar = this.F;
        List list4 = this.E;
        List list5 = this.D;
        List list6 = this.C;
        aiao aiaoVar = this.y;
        LatLng latLng = this.s;
        LatLng latLng2 = this.r;
        aiav aiavVar14 = this.k;
        aiav aiavVar15 = this.j;
        aiao aiaoVar2 = this.i;
        aiav aiavVar16 = this.h;
        aiax aiaxVar = this.g;
        List list7 = this.f;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(list7);
        String valueOf3 = String.valueOf(aiaxVar);
        String obj = aiavVar16.toString();
        String valueOf4 = String.valueOf(aiaoVar2);
        String obj2 = aiavVar15.toString();
        String obj3 = aiavVar14.toString();
        String valueOf5 = String.valueOf(latLng2);
        String valueOf6 = String.valueOf(latLng);
        String valueOf7 = String.valueOf(aiaoVar);
        String valueOf8 = String.valueOf(list6);
        String valueOf9 = String.valueOf(list5);
        String valueOf10 = String.valueOf(list4);
        String valueOf11 = String.valueOf(aibcVar);
        String obj4 = aiavVar13.toString();
        String valueOf12 = String.valueOf(list3);
        String valueOf13 = String.valueOf(list2);
        String obj5 = aiavVar12.toString();
        String obj6 = aiavVar11.toString();
        String obj7 = aiavVar10.toString();
        String obj8 = aiavVar9.toString();
        String obj9 = aiavVar8.toString();
        String obj10 = aiavVar7.toString();
        String obj11 = aiavVar6.toString();
        String obj12 = aiavVar5.toString();
        String valueOf14 = String.valueOf(list);
        String valueOf15 = String.valueOf(latLngBounds);
        String valueOf16 = String.valueOf(uri2);
        String valueOf17 = String.valueOf(uri);
        String obj13 = aiavVar4.toString();
        String valueOf18 = String.valueOf(ahytVar);
        String valueOf19 = String.valueOf(aiaqVar);
        String valueOf20 = String.valueOf(aiarVar);
        String valueOf21 = String.valueOf(aiadVar);
        String obj14 = aiavVar3.toString();
        String obj15 = aiavVar2.toString();
        String obj16 = aiavVar.toString();
        aiav aiavVar17 = this.al;
        String str = this.A;
        String str2 = this.z;
        String str3 = this.x;
        String str4 = this.w;
        String str5 = this.v;
        String str6 = this.u;
        String str7 = this.t;
        String str8 = this.q;
        String str9 = this.p;
        String str10 = this.o;
        Integer num = this.n;
        String str11 = this.m;
        String str12 = this.l;
        String str13 = this.d;
        String str14 = this.c;
        String str15 = this.b;
        String str16 = this.a;
        aiav aiavVar18 = this.am;
        aiav aiavVar19 = this.an;
        aiav aiavVar20 = this.ao;
        aiav aiavVar21 = this.ap;
        aiav aiavVar22 = this.aq;
        aiav aiavVar23 = this.ar;
        aiav aiavVar24 = this.as;
        List list8 = this.at;
        aiaf aiafVar = this.au;
        String obj17 = aiavVar17.toString();
        String obj18 = aiavVar18.toString();
        String obj19 = aiavVar19.toString();
        String obj20 = aiavVar20.toString();
        String obj21 = aiavVar21.toString();
        String obj22 = aiavVar22.toString();
        String obj23 = aiavVar23.toString();
        String obj24 = aiavVar24.toString();
        String valueOf22 = String.valueOf(list8);
        String valueOf23 = String.valueOf(aiafVar);
        StringBuilder sb = new StringBuilder("Place{address=");
        sb.append(str16);
        sb.append(", formattedAddress=");
        sb.append(str15);
        sb.append(", shortFormattedAddress=");
        sb.append(str14);
        sb.append(", adrFormatAddress=");
        sb.append(str13);
        sb.append(", addressComponents=");
        sb.append(valueOf);
        sb.append(", attributions=");
        sb.append(valueOf2);
        sb.append(", businessStatus=");
        sb.append(valueOf3);
        sb.append(", curbsidePickup=");
        sb.append(obj);
        sb.append(", currentOpeningHours=");
        sb.append(valueOf4);
        sb.append(", delivery=");
        sb.append(obj2);
        sb.append(", dineIn=");
        sb.append(obj3);
        sb.append(", editorialSummary=");
        sb.append(str12);
        sb.append(", editorialSummaryLanguageCode=");
        sb.append(str11);
        sb.append(", iconBackgroundColor=");
        sb.append(num);
        sb.append(", iconUrl=");
        sb.append(str10);
        sb.append(", iconMaskUrl=");
        sb.append(str9);
        sb.append(", id=");
        sb.append(str8);
        sb.append(", latLng=");
        sb.append(valueOf5);
        sb.append(", location=");
        sb.append(valueOf6);
        sb.append(", name=");
        sb.append(str7);
        sb.append(", displayName=");
        sb.append(str6);
        sb.append(", nameLanguageCode=");
        sb.append(str5);
        sb.append(", displayNameLanguageCode=");
        sb.append(str4);
        sb.append(", resourceName=");
        sb.append(str3);
        sb.append(", openingHours=");
        sb.append(valueOf7);
        sb.append(", phoneNumber=");
        sb.append(str2);
        sb.append(", internationalPhoneNumber=");
        sb.append(str);
        Integer num2 = this.Z;
        Integer num3 = this.Y;
        Integer num4 = this.X;
        Double d = this.K;
        String str17 = this.J;
        String str18 = this.I;
        String str19 = this.H;
        Integer num5 = this.G;
        String str20 = this.B;
        sb.append(", nationalPhoneNumber=");
        sb.append(str20);
        sb.append(", photoMetadatas=");
        sb.append(valueOf8);
        sb.append(", reviews=");
        sb.append(valueOf9);
        sb.append(", placeTypes=");
        sb.append(valueOf10);
        sb.append(", plusCode=");
        sb.append(valueOf11);
        sb.append(", priceLevel=");
        sb.append(num5);
        sb.append(", primaryType=");
        sb.append(str19);
        sb.append(", primaryTypeDisplayName=");
        sb.append(str18);
        sb.append(", primaryTypeDisplayNameLanguageCode=");
        sb.append(str17);
        sb.append(", rating=");
        sb.append(d);
        sb.append(", reservable=");
        sb.append(obj4);
        sb.append(", secondaryOpeningHours=");
        sb.append(valueOf12);
        sb.append(", currentSecondaryOpeningHours=");
        sb.append(valueOf13);
        sb.append(", servesBeer=");
        sb.append(obj5);
        sb.append(", servesBreakfast=");
        sb.append(obj6);
        sb.append(", servesBrunch=");
        sb.append(obj7);
        sb.append(", servesDinner=");
        sb.append(obj8);
        sb.append(", servesLunch=");
        sb.append(obj9);
        sb.append(", servesVegetarianFood=");
        sb.append(obj10);
        sb.append(", servesWine=");
        sb.append(obj11);
        sb.append(", takeout=");
        sb.append(obj12);
        sb.append(", types=");
        sb.append(valueOf14);
        sb.append(", userRatingsTotal=");
        sb.append(num4);
        sb.append(", userRatingCount=");
        sb.append(num3);
        sb.append(", utcOffsetMinutes=");
        sb.append(num2);
        sb.append(", viewport=");
        sb.append(valueOf15);
        sb.append(", websiteUri=");
        sb.append(valueOf16);
        sb.append(", googleMapsUri=");
        sb.append(valueOf17);
        sb.append(", wheelchairAccessibleEntrance=");
        sb.append(obj13);
        sb.append(", accessibilityOptions=");
        sb.append(valueOf18);
        sb.append(", parkingOptions=");
        sb.append(valueOf19);
        sb.append(", paymentOptions=");
        sb.append(valueOf20);
        sb.append(", evChargeOptions=");
        sb.append(valueOf21);
        sb.append(", outdoorSeating=");
        sb.append(obj14);
        sb.append(", liveMusic=");
        sb.append(obj15);
        sb.append(", menuForChildren=");
        sb.append(obj16);
        sb.append(", servesCocktails=");
        sb.append(obj17);
        sb.append(", servesDessert=");
        sb.append(obj18);
        sb.append(", servesCoffee=");
        sb.append(obj19);
        sb.append(", goodForChildren=");
        sb.append(obj20);
        sb.append(", allowsDogs=");
        sb.append(obj21);
        sb.append(", restroom=");
        sb.append(obj22);
        sb.append(", goodForGroups=");
        sb.append(obj23);
        sb.append(", goodForWatchingSports=");
        sb.append(obj24);
        sb.append(", subDestinations=");
        sb.append(valueOf22);
        sb.append(", fuelOptions=");
        sb.append(valueOf23);
        sb.append("}");
        return sb.toString();
    }

    public aiba(String str, String str2, String str3, String str4, ahyv ahyvVar, List list, aiax aiaxVar, aiav aiavVar, aiao aiaoVar, aiav aiavVar2, aiav aiavVar3, String str5, String str6, Integer num, String str7, String str8, String str9, LatLng latLng, LatLng latLng2, String str10, String str11, String str12, String str13, String str14, aiao aiaoVar2, String str15, String str16, String str17, List list2, List list3, List list4, aibc aibcVar, Integer num2, String str18, String str19, String str20, Double d, aiav aiavVar4, List list5, List list6, aiav aiavVar5, aiav aiavVar6, aiav aiavVar7, aiav aiavVar8, aiav aiavVar9, aiav aiavVar10, aiav aiavVar11, aiav aiavVar12, List list7, Integer num3, Integer num4, Integer num5, LatLngBounds latLngBounds, Uri uri, Uri uri2, aiav aiavVar13, ahyt ahytVar, aiaq aiaqVar, aiar aiarVar, aiad aiadVar, aiav aiavVar14, aiav aiavVar15, aiav aiavVar16, aiav aiavVar17, aiav aiavVar18, aiav aiavVar19, aiav aiavVar20, aiav aiavVar21, aiav aiavVar22, aiav aiavVar23, aiav aiavVar24, List list8, aiaf aiafVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = ahyvVar;
        this.f = list;
        this.g = aiaxVar;
        if (aiavVar == null) {
            throw new NullPointerException("Null curbsidePickup");
        }
        this.h = aiavVar;
        this.i = aiaoVar;
        if (aiavVar2 != null) {
            this.j = aiavVar2;
            if (aiavVar3 != null) {
                this.k = aiavVar3;
                this.l = str5;
                this.m = str6;
                this.n = num;
                this.o = str7;
                this.p = str8;
                this.q = str9;
                this.r = latLng;
                this.s = latLng2;
                this.t = str10;
                this.u = str11;
                this.v = str12;
                this.w = str13;
                this.x = str14;
                this.y = aiaoVar2;
                this.z = str15;
                this.A = str16;
                this.B = str17;
                this.C = list2;
                this.D = list3;
                this.E = list4;
                this.F = aibcVar;
                this.G = num2;
                this.H = str18;
                this.I = str19;
                this.J = str20;
                this.K = d;
                if (aiavVar4 != null) {
                    this.L = aiavVar4;
                    this.M = list5;
                    this.N = list6;
                    if (aiavVar5 != null) {
                        this.O = aiavVar5;
                        if (aiavVar6 != null) {
                            this.P = aiavVar6;
                            if (aiavVar7 != null) {
                                this.Q = aiavVar7;
                                if (aiavVar8 != null) {
                                    this.R = aiavVar8;
                                    if (aiavVar9 != null) {
                                        this.S = aiavVar9;
                                        if (aiavVar10 != null) {
                                            this.T = aiavVar10;
                                            if (aiavVar11 != null) {
                                                this.U = aiavVar11;
                                                if (aiavVar12 != null) {
                                                    this.V = aiavVar12;
                                                    this.W = list7;
                                                    this.X = num3;
                                                    this.Y = num4;
                                                    this.Z = num5;
                                                    this.aa = latLngBounds;
                                                    this.ab = uri;
                                                    this.ac = uri2;
                                                    if (aiavVar13 != null) {
                                                        this.ad = aiavVar13;
                                                        this.ae = ahytVar;
                                                        this.af = aiaqVar;
                                                        this.ag = aiarVar;
                                                        this.ah = aiadVar;
                                                        if (aiavVar14 != null) {
                                                            this.ai = aiavVar14;
                                                            if (aiavVar15 != null) {
                                                                this.aj = aiavVar15;
                                                                if (aiavVar16 != null) {
                                                                    this.ak = aiavVar16;
                                                                    if (aiavVar17 != null) {
                                                                        this.al = aiavVar17;
                                                                        if (aiavVar18 != null) {
                                                                            this.am = aiavVar18;
                                                                            if (aiavVar19 != null) {
                                                                                this.an = aiavVar19;
                                                                                if (aiavVar20 != null) {
                                                                                    this.ao = aiavVar20;
                                                                                    if (aiavVar21 != null) {
                                                                                        this.ap = aiavVar21;
                                                                                        if (aiavVar22 != null) {
                                                                                            this.aq = aiavVar22;
                                                                                            if (aiavVar23 != null) {
                                                                                                this.ar = aiavVar23;
                                                                                                if (aiavVar24 != null) {
                                                                                                    this.as = aiavVar24;
                                                                                                    this.at = list8;
                                                                                                    this.au = aiafVar;
                                                                                                    return;
                                                                                                }
                                                                                                throw new NullPointerException("Null goodForWatchingSports");
                                                                                            }
                                                                                            throw new NullPointerException("Null goodForGroups");
                                                                                        }
                                                                                        throw new NullPointerException("Null restroom");
                                                                                    }
                                                                                    throw new NullPointerException("Null allowsDogs");
                                                                                }
                                                                                throw new NullPointerException("Null goodForChildren");
                                                                            }
                                                                            throw new NullPointerException("Null servesCoffee");
                                                                        }
                                                                        throw new NullPointerException("Null servesDessert");
                                                                    }
                                                                    throw new NullPointerException("Null servesCocktails");
                                                                }
                                                                throw new NullPointerException("Null menuForChildren");
                                                            }
                                                            throw new NullPointerException("Null liveMusic");
                                                        }
                                                        throw new NullPointerException("Null outdoorSeating");
                                                    }
                                                    throw new NullPointerException("Null wheelchairAccessibleEntrance");
                                                }
                                                throw new NullPointerException("Null takeout");
                                            }
                                            throw new NullPointerException("Null servesWine");
                                        }
                                        throw new NullPointerException("Null servesVegetarianFood");
                                    }
                                    throw new NullPointerException("Null servesLunch");
                                }
                                throw new NullPointerException("Null servesDinner");
                            }
                            throw new NullPointerException("Null servesBrunch");
                        }
                        throw new NullPointerException("Null servesBreakfast");
                    }
                    throw new NullPointerException("Null servesBeer");
                }
                throw new NullPointerException("Null reservable");
            }
            throw new NullPointerException("Null dineIn");
        }
        throw new NullPointerException("Null delivery");
    }
}
