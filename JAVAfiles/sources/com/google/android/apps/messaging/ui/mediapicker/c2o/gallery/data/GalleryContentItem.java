package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem;
import defpackage.aapv;
import defpackage.ameb;
import defpackage.gh;
import defpackage.tqj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GalleryContentItem extends VisualContentItem {
    public static final Parcelable.Creator<GalleryContentItem> CREATOR = new aapv(8);
    public final long a;
    public final long e;
    public final tqj f;

    public GalleryContentItem(Uri uri, String str, int i, int i2, long j, ameb amebVar, long j2) {
        this(uri, true == gh.w(str) ? "application/txt" : str, i, i2, j, amebVar, j2, tqj.STANDARD);
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final long g() {
        return this.e;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem, com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.a);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f.ordinal());
    }

    public GalleryContentItem(Uri uri, String str, int i, int i2, long j, ameb amebVar, long j2, tqj tqjVar) {
        super(uri, str, amebVar, i, i2);
        this.a = j;
        this.e = j2;
        this.f = tqjVar;
    }

    public GalleryContentItem(Uri uri, String str, int i, int i2, ameb amebVar, long j) {
        this(uri, true == gh.w(str) ? "application/txt" : str, i, i2, -1L, amebVar, j);
    }

    public GalleryContentItem(Parcel parcel) {
        super(parcel);
        this.a = parcel.readLong();
        this.e = parcel.readLong();
        this.f = tqj.values()[parcel.readInt()];
    }
}
