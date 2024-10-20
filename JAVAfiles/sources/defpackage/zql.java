package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zql extends zrz {
    public static final Parcelable.Creator<zql> CREATOR = new sdr(16);

    public zql(MessageCoreData messageCoreData, int i, long j, MessageUsageStatisticsData messageUsageStatisticsData) {
        super(messageCoreData, i, j, messageUsageStatisticsData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
