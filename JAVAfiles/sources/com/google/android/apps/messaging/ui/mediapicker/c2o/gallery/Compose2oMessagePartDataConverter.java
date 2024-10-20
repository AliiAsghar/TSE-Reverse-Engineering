package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.audio.AudioContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MessagePartDataConverter;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.file.FileContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;
import defpackage.aapv;
import defpackage.gh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Compose2oMessagePartDataConverter implements MessagePartDataConverter {
    public static final Parcelable.Creator<Compose2oMessagePartDataConverter> CREATOR = new aapv(6);

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MessagePartDataConverter
    public final MediaContentItem a(MessagePartCoreData messagePartCoreData) {
        Uri v = messagePartCoreData.v();
        if (v == null) {
            return null;
        }
        if (messagePartCoreData.J() != null) {
            return new LocationContentItem(v, messagePartCoreData);
        }
        if (gh.e(messagePartCoreData.U())) {
            return new AudioContentItem(v, messagePartCoreData.k());
        }
        if (messagePartCoreData.bf()) {
            String U = messagePartCoreData.U();
            U.getClass();
            int c = messagePartCoreData.c();
            int b = messagePartCoreData.b();
            String W = messagePartCoreData.W();
            W.getClass();
            return new ExpressiveStickerContentItem(v, U, c, b, W, messagePartCoreData.M());
        }
        if (messagePartCoreData.bg()) {
            String U2 = messagePartCoreData.U();
            U2.getClass();
            String X = messagePartCoreData.X();
            X.getClass();
            return new FileContentItem(v, U2, X, messagePartCoreData.p());
        }
        if (messagePartCoreData.bh()) {
            return new GifContentItem(v, v, v, "", "", "", messagePartCoreData.c(), messagePartCoreData.b());
        }
        String U3 = messagePartCoreData.U();
        U3.getClass();
        return new GalleryContentItem(v, U3, messagePartCoreData.c(), messagePartCoreData.b(), messagePartCoreData.k(), messagePartCoreData.M(), messagePartCoreData.m(), messagePartCoreData.H());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
