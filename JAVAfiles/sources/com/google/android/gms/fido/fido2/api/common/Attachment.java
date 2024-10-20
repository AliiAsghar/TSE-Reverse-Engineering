package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abxj;
import defpackage.abyz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum Attachment implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<Attachment> CREATOR = new abxj(15);
    public final String c;

    Attachment(String str) {
        this.c = str;
    }

    public static Attachment a(String str) {
        for (Attachment attachment : values()) {
            if (str.equals(attachment.c)) {
                return attachment;
            }
        }
        throw new abyz(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
    }
}
