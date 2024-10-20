package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahzr extends aiba {
    public static final Parcelable.Creator<ahzr> CREATOR = new ahzq();

    public ahzr(String str, String str2, String str3, String str4, ahyv ahyvVar, List list, aiax aiaxVar, aiav aiavVar, aiao aiaoVar, aiav aiavVar2, aiav aiavVar3, String str5, String str6, Integer num, String str7, String str8, String str9, LatLng latLng, LatLng latLng2, String str10, String str11, String str12, String str13, String str14, aiao aiaoVar2, String str15, String str16, String str17, List list2, List list3, List list4, aibc aibcVar, Integer num2, String str18, String str19, String str20, Double d, aiav aiavVar4, List list5, List list6, aiav aiavVar5, aiav aiavVar6, aiav aiavVar7, aiav aiavVar8, aiav aiavVar9, aiav aiavVar10, aiav aiavVar11, aiav aiavVar12, List list7, Integer num3, Integer num4, Integer num5, LatLngBounds latLngBounds, Uri uri, Uri uri2, aiav aiavVar13, ahyt ahytVar, aiaq aiaqVar, aiar aiarVar, aiad aiadVar, aiav aiavVar14, aiav aiavVar15, aiav aiavVar16, aiav aiavVar17, aiav aiavVar18, aiav aiavVar19, aiav aiavVar20, aiav aiavVar21, aiav aiavVar22, aiav aiavVar23, aiav aiavVar24, List list8, aiaf aiafVar) {
        super(str, str2, str3, str4, ahyvVar, list, aiaxVar, aiavVar, aiaoVar, aiavVar2, aiavVar3, str5, str6, num, str7, str8, str9, latLng, latLng2, str10, str11, str12, str13, str14, aiaoVar2, str15, str16, str17, list2, list3, list4, aibcVar, num2, str18, str19, str20, d, aiavVar4, list5, list6, aiavVar5, aiavVar6, aiavVar7, aiavVar8, aiavVar9, aiavVar10, aiavVar11, aiavVar12, list7, num3, num4, num5, latLngBounds, uri, uri2, aiavVar13, ahytVar, aiaqVar, aiarVar, aiadVar, aiavVar14, aiavVar15, aiavVar16, aiavVar17, aiavVar18, aiavVar19, aiavVar20, aiavVar21, aiavVar22, aiavVar23, aiavVar24, list8, aiafVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.a);
        }
        if (this.b == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.b);
        }
        if (this.c == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.c);
        }
        if (this.d == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.d);
        }
        parcel.writeParcelable(this.e, i);
        parcel.writeList(this.f);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.j, i);
        parcel.writeParcelable(this.k, i);
        if (this.l == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.l);
        }
        if (this.m == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.m);
        }
        if (this.n == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.n.intValue());
        }
        if (this.o == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.o);
        }
        if (this.p == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.p);
        }
        if (this.q == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.q);
        }
        parcel.writeParcelable(this.r, i);
        parcel.writeParcelable(this.s, i);
        if (this.t == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.t);
        }
        if (this.u == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.u);
        }
        if (this.v == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.v);
        }
        if (this.w == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.w);
        }
        if (this.x == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.x);
        }
        parcel.writeParcelable(this.y, i);
        if (this.z == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.z);
        }
        if (this.A == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.A);
        }
        if (this.B == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.B);
        }
        parcel.writeList(this.C);
        parcel.writeList(this.D);
        parcel.writeList(this.E);
        parcel.writeParcelable(this.F, i);
        if (this.G == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.G.intValue());
        }
        if (this.H == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.H);
        }
        if (this.I == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.I);
        }
        if (this.J == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.J);
        }
        if (this.K == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(this.K.doubleValue());
        }
        parcel.writeParcelable(this.L, i);
        parcel.writeList(this.M);
        parcel.writeList(this.N);
        parcel.writeParcelable(this.O, i);
        parcel.writeParcelable(this.P, i);
        parcel.writeParcelable(this.Q, i);
        parcel.writeParcelable(this.R, i);
        parcel.writeParcelable(this.S, i);
        parcel.writeParcelable(this.T, i);
        parcel.writeParcelable(this.U, i);
        parcel.writeParcelable(this.V, i);
        parcel.writeList(this.W);
        if (this.X == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.X.intValue());
        }
        if (this.Y == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.Y.intValue());
        }
        if (this.Z == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.Z.intValue());
        }
        parcel.writeParcelable(this.aa, i);
        parcel.writeParcelable(this.ab, i);
        parcel.writeParcelable(this.ac, i);
        parcel.writeParcelable(this.ad, i);
        parcel.writeParcelable(this.ae, i);
        parcel.writeParcelable(this.af, i);
        parcel.writeParcelable(this.ag, i);
        parcel.writeParcelable(this.ah, i);
        parcel.writeParcelable(this.ai, i);
        parcel.writeParcelable(this.aj, i);
        parcel.writeParcelable(this.ak, i);
        parcel.writeParcelable(this.al, i);
        parcel.writeParcelable(this.am, i);
        parcel.writeParcelable(this.an, i);
        parcel.writeParcelable(this.ao, i);
        parcel.writeParcelable(this.ap, i);
        parcel.writeParcelable(this.aq, i);
        parcel.writeParcelable(this.ar, i);
        parcel.writeParcelable(this.as, i);
        parcel.writeList(this.at);
        parcel.writeParcelable(this.au, i);
    }
}
