package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akna implements Parcelable {
    public static final Parcelable.Creator<akna> CREATOR = new ajuw(8);
    public final int a;
    public final List b;
    public boolean c;
    private final String d;

    public akna(int i, List list, String str, boolean z) {
        this.a = i;
        this.b = list;
        this.d = str;
        this.c = z;
    }

    public static akna a(Intent intent) {
        return new akna(1, alog.r(intent));
    }

    public static akna b() {
        int i = alog.d;
        return new akna(4, alsx.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeString(this.d);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public akna(int i, List list) {
        this(i, list, null, false);
    }
}
