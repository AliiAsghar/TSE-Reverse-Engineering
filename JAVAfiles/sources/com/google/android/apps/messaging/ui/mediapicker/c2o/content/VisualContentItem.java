package com.google.android.apps.messaging.ui.mediapicker.c2o.content;

import android.net.Uri;
import android.os.Parcel;
import defpackage.ameb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class VisualContentItem extends MediaContentItem {
    private final int a;
    private final int e;

    /* JADX INFO: Access modifiers changed from: protected */
    public VisualContentItem(Uri uri, String str, ameb amebVar, int i, int i2) {
        super(uri, str, amebVar);
        this.a = i;
        this.e = i2;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final int d() {
        int i = this.e;
        if (i > 0) {
            return i;
        }
        return -1;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final int f() {
        int i = this.a;
        if (i > 0) {
            return i;
        }
        return -1;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public VisualContentItem(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.e = parcel.readInt();
    }
}
