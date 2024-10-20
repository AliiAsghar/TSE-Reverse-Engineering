package com.google.android.ims.rcsservice.locationsharing;

import android.os.Parcel;
import com.google.android.ims.rcsservice.events.SessionEvent;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class LocationSharingEvent extends SessionEvent {
    private LocationSharingEvent() {
        super(0, 0L, 0L);
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final void a(Parcel parcel) {
        super.a(parcel);
        parcel.readString();
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    protected final void b(Parcel parcel) {
        parcel.writeString(getClass().getName());
    }

    @Override // com.google.android.ims.rcsservice.events.Event, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString("");
    }
}
