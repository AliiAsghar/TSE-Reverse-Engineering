package com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.afcp;
import defpackage.afcq;
import defpackage.afsx;
import defpackage.afwv;
import defpackage.d;
import defpackage.imp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RichLocation implements afcq {
    private static final afsx f;
    public final String a;
    public final double b;
    public final double c;
    public final afsx d;
    public final Uri e;
    private final afcp g;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface Source extends afcp<RichLocation> {

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static final class LocationPicker implements Source {
            public static final LocationPicker a = new LocationPicker();
            public static final Parcelable.Creator<LocationPicker> CREATOR = new imp(7);

            private LocationPicker() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    static {
        afsx H = afwv.H("application/vnd.gsma.rcspushlocation+xml");
        H.getClass();
        f = H;
    }

    public /* synthetic */ RichLocation(String str, double d, double d2) {
        Source.LocationPicker locationPicker = Source.LocationPicker.a;
        this.a = str;
        this.b = d;
        this.c = d2;
        this.g = locationPicker;
        this.d = f;
        Uri uri = Uri.EMPTY;
        uri.getClass();
        this.e = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichLocation)) {
            return false;
        }
        RichLocation richLocation = (RichLocation) obj;
        if (d.F(this.a, richLocation.a) && Double.compare(this.b, richLocation.b) == 0 && Double.compare(this.c, richLocation.c) == 0 && d.F(this.g, richLocation.g)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afcq
    public final afcp fh() {
        return this.g;
    }

    @Override // defpackage.afcs
    public final Object fi() {
        return this.a;
    }

    @Override // defpackage.afcq
    public final /* synthetic */ String fj() {
        return toString();
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + d.aI(this.b)) * 31) + d.aI(this.c)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "RichLocation(locationUrl=" + this.a + ", latitude=" + this.b + ", longitude=" + this.c + ", source=" + this.g + ")";
    }
}
