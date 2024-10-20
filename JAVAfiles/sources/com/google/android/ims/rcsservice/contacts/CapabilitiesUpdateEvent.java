package com.google.android.ims.rcsservice.contacts;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.events.Event;
import defpackage.advq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CapabilitiesUpdateEvent extends Event {
    public String a;
    public ImsCapabilities b;
    private long c;

    public CapabilitiesUpdateEvent(long j, String str, ImsCapabilities imsCapabilities) {
        super(30013, j, 0L);
        if (str != null && !TextUtils.isEmpty(str)) {
            this.j = j;
            this.a = str;
            this.c = -1L;
            this.b = imsCapabilities;
            return;
        }
        throw new IllegalArgumentException("remoteUserId must not be null");
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final void a(Parcel parcel) {
        super.a(parcel);
        this.c = parcel.readLong();
        String readString = parcel.readString();
        if (readString != null) {
            this.a = readString;
            this.b = (ImsCapabilities) parcel.readParcelable(ImsCapabilities.class.getClassLoader());
            return;
        }
        throw new IllegalArgumentException("Remote User ID null.");
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    protected final void b(Parcel parcel) {
        parcel.writeString(getClass().getName());
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final String toString() {
        return "JibeEventCapabilitiesUpdate [numberId " + this.c + " number " + advq.USER_ID.c(this.a) + " capabilities " + String.valueOf(this.b) + "]";
    }

    @Override // com.google.android.ims.rcsservice.events.Event, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.c);
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, 0);
    }

    public CapabilitiesUpdateEvent(Parcel parcel) {
        super(parcel);
    }

    public CapabilitiesUpdateEvent(String str, ImsCapabilities imsCapabilities) {
        this(0L, str, imsCapabilities);
    }
}
