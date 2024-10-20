package com.google.android.apps.messaging.label.data.classification;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.imp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum SuperSortLabel implements Parcelable {
    UNKNOWN(0),
    PERSONAL(1),
    TRANSACTION(2),
    PROMOTION(3),
    UPDATE(4),
    OTP(5),
    ALL(6),
    BUSINESS_UPDATE(7);

    public static final Parcelable.Creator<SuperSortLabel> CREATOR = new imp(14);
    public final int i;

    SuperSortLabel(int i) {
        this.i = i;
    }

    public static SuperSortLabel a(int i) {
        for (SuperSortLabel superSortLabel : values()) {
            if (superSortLabel.i == i) {
                return superSortLabel;
            }
        }
        return UNKNOWN;
    }

    public final boolean b() {
        if (this != UNKNOWN && this != ALL) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.i);
    }
}
