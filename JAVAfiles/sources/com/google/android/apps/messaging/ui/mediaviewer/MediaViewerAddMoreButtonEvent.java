package com.google.android.apps.messaging.ui.mediaviewer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aapv;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MediaViewerAddMoreButtonEvent extends BaseMediaViewerEvent {
    public static final Parcelable.Creator<MediaViewerAddMoreButtonEvent> CREATOR = new aapv(12);
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();

    public MediaViewerAddMoreButtonEvent() {
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.BaseMediaViewerEvent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public MediaViewerAddMoreButtonEvent(byte[] bArr) {
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.BaseMediaViewerEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
