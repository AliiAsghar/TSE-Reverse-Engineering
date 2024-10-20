package com.google.android.ims.rcsservice.locationsharing;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.ims.util.Content;
import defpackage.adsv;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LocationInformation implements Parcelable {
    public static final Parcelable.Creator<LocationInformation> CREATOR = new adsv(7);
    public String a;
    public String b;
    public double c;
    public double d;
    public double e;
    public long f;
    public Content g;

    public LocationInformation() {
        this.a = "";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationInformation)) {
            return false;
        }
        LocationInformation locationInformation = (LocationInformation) obj;
        if (!TextUtils.equals(locationInformation.a, this.a) || this.d != locationInformation.d || this.c != locationInformation.c || this.e != locationInformation.e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 13;
        } else {
            hashCode = str.hashCode();
        }
        int i = (int) this.d;
        return ((hashCode ^ i) ^ ((int) this.c)) ^ ((int) this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.e);
        parcel.writeLong(this.f);
        parcel.writeParcelable(this.g, 0);
    }

    public LocationInformation(Location location, Content content) {
        this.a = "";
        this.d = location.getLatitude();
        this.c = location.getLongitude();
        this.e = location.getAccuracy();
        this.g = content;
        this.f = System.currentTimeMillis() + 18000000;
    }

    public LocationInformation(Parcel parcel) {
        this.a = "";
        String readString = parcel.readString();
        if (readString != null) {
            this.a = readString;
        }
        this.b = parcel.readString();
        this.c = parcel.readDouble();
        this.d = parcel.readDouble();
        this.e = parcel.readDouble();
        this.f = parcel.readLong();
        this.g = (Content) parcel.readParcelable(getClass().getClassLoader());
    }
}
