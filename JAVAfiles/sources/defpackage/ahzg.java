package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahzg extends aiah {
    public static final Parcelable.Creator<ahzg> CREATOR = new ahig(10);

    public ahzg(aiag aiagVar, aiam aiamVar, Instant instant) {
        super(aiagVar, aiamVar, instant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeSerializable(this.c);
    }
}
