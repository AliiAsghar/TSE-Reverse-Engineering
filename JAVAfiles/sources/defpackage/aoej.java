package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.Thing;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoej extends AbstractSafeParcelable {
    public static final Parcelable.Creator<aoej> CREATOR = new ajuw(19);
    public final int a;
    public final Thing[] b;
    public final String[] c;
    public final String[] d;
    public final aoee e;
    public final String f;
    public final String g;

    public aoej(int i, Thing[] thingArr, String[] strArr, String[] strArr2, aoee aoeeVar, String str, String str2) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7) {
            i = 0;
        }
        this.a = i;
        this.b = thingArr;
        this.c = strArr;
        this.d = strArr2;
        this.e = aoeeVar;
        this.f = str;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.H(parcel, 2, this.b, i);
        abhi.F(parcel, 3, this.c);
        abhi.F(parcel, 5, this.d);
        abhi.o(parcel, 6, this.e, i, false);
        abhi.q(parcel, 7, this.f, false);
        abhi.q(parcel, 8, this.g, false);
        abhi.g(parcel, e);
    }
}
