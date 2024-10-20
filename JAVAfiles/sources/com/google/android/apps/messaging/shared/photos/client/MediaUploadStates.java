package com.google.android.apps.messaging.shared.photos.client;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.afvq;
import defpackage.d;
import defpackage.sdr;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MediaUploadStates implements Parcelable {
    public static final Parcelable.Creator<MediaUploadStates> CREATOR = new sdr(12);
    public final Map a;

    public MediaUploadStates(Map<String, ? extends afvq> map) {
        map.getClass();
        this.a = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MediaUploadStates) && d.F(this.a, ((MediaUploadStates) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MediaUploadStates(states=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Map map = this.a;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }
}
