package com.google.android.apps.messaging.ui.mediapicker.c2o.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import defpackage.aapv;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LocationContentItem extends MediaContentItem {
    public static final Parcelable.Creator<LocationContentItem> CREATOR = new aapv(10);
    public final MessagePartCoreData a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LocationContentItem(android.net.Uri r3, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L7
            ameb r0 = r4.M()
            goto L9
        L7:
            ameb r0 = defpackage.ameb.LOCATION_CURRENT
        L9:
            java.lang.String r1 = "image/jpeg"
            r2.<init>(r3, r1, r0)
            r2.a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem.<init>(android.net.Uri, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData):void");
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final int d() {
        return 400;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationContentItem) || !this.a.J().equals(((LocationContentItem) obj).a.J())) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final int f() {
        return 800;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.a.J());
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, i);
    }

    public LocationContentItem(Parcel parcel) {
        super(parcel);
        this.a = (MessagePartCoreData) parcel.readParcelable(MessagePartData.class.getClassLoader());
    }
}
