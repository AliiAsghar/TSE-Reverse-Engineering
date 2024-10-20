package com.google.android.apps.messaging.ui.mediapicker.c2o.gif;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem;
import defpackage.aapv;
import defpackage.ameb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GifContentItem extends VisualContentItem {
    public static final Parcelable.Creator<GifContentItem> CREATOR = new aapv(9);
    public final Uri a;
    public final Uri e;
    public final String f;
    public final String g;
    public final String h;

    public GifContentItem(Uri uri, Uri uri2, Uri uri3, String str, String str2, String str3, int i, int i2) {
        super(uri, "image/gif", ameb.GIF_CHOOSER, i, i2);
        this.a = uri2;
        this.e = uri3;
        this.h = str3;
        this.f = str;
        this.g = str2;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem, com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }

    public GifContentItem(Parcel parcel) {
        super(parcel);
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.e = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        String readString = parcel.readString();
        readString.getClass();
        this.f = readString;
        String readString2 = parcel.readString();
        readString2.getClass();
        this.g = readString2;
        this.h = "";
    }
}
