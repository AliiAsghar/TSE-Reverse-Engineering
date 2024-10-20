package com.google.android.apps.messaging.ui.mediaviewer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aapv;
import defpackage.aawz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class MediaViewerButton implements Parcelable {
    public static final Parcelable.Creator<MediaViewerButton> CREATOR = new aapv(13);

    public static aawz e() {
        aawz aawzVar = new aawz();
        aawzVar.e(-1);
        aawzVar.b(-1);
        aawzVar.d(-1);
        aawzVar.c(new BaseMediaViewerEvent());
        return aawzVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract BaseMediaViewerEvent d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(c());
        parcel.writeInt(a());
        parcel.writeInt(b());
        parcel.writeParcelable(d(), 0);
    }
}
