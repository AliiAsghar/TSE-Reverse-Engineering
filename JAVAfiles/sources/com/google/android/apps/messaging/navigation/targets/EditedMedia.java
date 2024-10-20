package com.google.android.apps.messaging.navigation.targets;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d;
import defpackage.ltv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class EditedMedia implements Parcelable {
    public static final Parcelable.Creator<EditedMedia> CREATOR = new ltv(1);
    public final String a;
    public final Uri b;

    public EditedMedia(String str, Uri uri) {
        str.getClass();
        uri.getClass();
        this.a = str;
        this.b = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditedMedia)) {
            return false;
        }
        EditedMedia editedMedia = (EditedMedia) obj;
        if (d.F(this.a, editedMedia.a) && d.F(this.b, editedMedia.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "EditedMedia(contentType=" + this.a + ", uri=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
