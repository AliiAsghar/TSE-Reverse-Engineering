package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem;
import defpackage.aapv;
import defpackage.ameb;
import defpackage.ampy;
import defpackage.aozs;
import defpackage.apag;
import defpackage.apba;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CameraContentItem extends VisualContentItem {
    public static final Parcelable.Creator<CameraContentItem> CREATOR = new aapv(5);
    public final ampy a;
    public final long e;
    public final long f;

    public CameraContentItem(Uri uri, String str, int i, int i2, long j, ameb amebVar, long j2, ampy ampyVar) {
        super(uri, str, amebVar, i, i2);
        this.e = j;
        this.f = j2;
        this.a = ampyVar;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final long g() {
        return this.f;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem, com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        byte[] byteArray = this.a.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }

    public CameraContentItem(Parcel parcel) {
        super(parcel);
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            this.a = (ampy) apag.parseFrom(ampy.a, bArr, aozs.a());
        } catch (apba e) {
            throw new IllegalArgumentException("Unable to parse CameraCaptureInformation", e);
        }
    }
}
