package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajuy implements Parcelable {
    public static final Parcelable.Creator<ajuy> CREATOR = new ajuw(2);
    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final long e;
    private final int f;
    private final int g;
    private final Intent h;
    private final Intent i;

    public ajuy(String str, String str2, boolean z, boolean z2, long j, int i, int i2, Intent intent, Intent intent2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = i;
        this.g = i2;
        this.h = intent;
        this.i = intent2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeParcelable(this.h, 0);
        parcel.writeParcelable(this.i, 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeLong(this.e);
    }
}
