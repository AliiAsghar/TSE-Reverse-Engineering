package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aizc implements Parcelable {
    public static final Parcelable.Creator<aizc> CREATOR = new ahzu(19);
    public final String a;
    public final apri b;
    public final aprx c;
    public final String d;
    public final long e;
    public final alog f;
    private final String g;

    public aizc(String str, String str2, long j, aprx aprxVar, apri apriVar, String str3, alog alogVar) {
        this.a = str;
        this.g = str2;
        this.e = j;
        this.d = str3;
        this.f = alogVar;
        this.b = apriVar;
        this.c = aprxVar;
    }

    public final aiyt a() {
        int i;
        if (true != aizr.j(this.b)) {
            i = 2;
        } else {
            i = 3;
        }
        return new aiyt(this.a, this.g, b(), i);
    }

    public final String b() {
        aprx aprxVar = this.c;
        if (aprxVar != null) {
            return aprxVar.b;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.g);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeStringList(this.f);
        aowt.g(parcel, this.b);
        aowt.g(parcel, this.c);
    }

    public aizc(Parcel parcel) {
        this.a = parcel.readString();
        this.g = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readLong();
        int i = alog.d;
        alog alogVar = alsx.a;
        this.f = alogVar;
        parcel.readStringList(alogVar);
        apri apriVar = apri.a;
        aozs aozsVar = aozs.a;
        apcc apccVar = apcc.a;
        this.b = (apri) aowt.b(parcel, apriVar, aozs.a);
        this.c = (aprx) aowt.b(parcel, aprx.a, aozs.a);
    }
}
