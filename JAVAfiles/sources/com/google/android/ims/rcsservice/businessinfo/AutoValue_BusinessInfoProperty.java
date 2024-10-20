package com.google.android.ims.rcsservice.businessinfo;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class AutoValue_BusinessInfoProperty extends C$AutoValue_BusinessInfoProperty {
    public static final Parcelable.Creator<AutoValue_BusinessInfoProperty> CREATOR = new Parcelable.Creator<AutoValue_BusinessInfoProperty>() { // from class: com.google.android.ims.rcsservice.businessinfo.AutoValue_BusinessInfoProperty.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BusinessInfoProperty createFromParcel(Parcel parcel) {
            return new AutoValue_BusinessInfoProperty(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BusinessInfoProperty[] newArray(int i) {
            return new AutoValue_BusinessInfoProperty[i];
        }
    };

    public AutoValue_BusinessInfoProperty(int i, String str, String str2, String str3, int i2) {
        super(i, str, str2, str3, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(getPropertyType());
        parcel.writeString(getValue());
        if (getHeader() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getHeader());
        }
        if (getSubHeader() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getSubHeader());
        }
        parcel.writeInt(getImportance());
    }
}
