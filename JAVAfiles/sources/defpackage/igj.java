package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igj extends igw {
    public static final Parcelable.Creator<igj> CREATOR = new fot(20);

    public igj(int i, String str, String str2, String str3, int i2, boolean z, boolean z2, Boolean bool, Boolean bool2, Integer num, BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus participantBlockAndSpamStatus, String str4) {
        super(i, str, str2, str3, i2, z, z2, bool, bool2, num, participantBlockAndSpamStatus, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(hld.i(this.l));
        if (this.a == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.a);
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        if (this.g == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.g.booleanValue() ? 1 : 0);
        }
        if (this.h == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.h.booleanValue() ? 1 : 0);
        }
        if (this.i == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.i.intValue());
        }
        parcel.writeParcelable(this.j, i);
        if (this.k == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.k);
        }
    }
}
