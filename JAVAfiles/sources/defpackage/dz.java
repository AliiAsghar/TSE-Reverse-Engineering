package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dz implements Parcelable {
    public static final Parcelable.Creator<dz> CREATOR;
    static final tm a;
    final Bundle b;

    static {
        tm tmVar = new tm();
        a = tmVar;
        tmVar.put("android.media.metadata.TITLE", 1);
        tmVar.put("android.media.metadata.ARTIST", 1);
        tmVar.put("android.media.metadata.DURATION", 0);
        tmVar.put("android.media.metadata.ALBUM", 1);
        tmVar.put("android.media.metadata.AUTHOR", 1);
        tmVar.put("android.media.metadata.WRITER", 1);
        tmVar.put("android.media.metadata.COMPOSER", 1);
        tmVar.put("android.media.metadata.COMPILATION", 1);
        tmVar.put("android.media.metadata.DATE", 1);
        tmVar.put("android.media.metadata.YEAR", 0);
        tmVar.put("android.media.metadata.GENRE", 1);
        tmVar.put("android.media.metadata.TRACK_NUMBER", 0);
        tmVar.put("android.media.metadata.NUM_TRACKS", 0);
        tmVar.put("android.media.metadata.DISC_NUMBER", 0);
        tmVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        tmVar.put("android.media.metadata.ART", 2);
        tmVar.put("android.media.metadata.ART_URI", 1);
        tmVar.put("android.media.metadata.ALBUM_ART", 2);
        tmVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        tmVar.put("android.media.metadata.USER_RATING", 3);
        tmVar.put("android.media.metadata.RATING", 3);
        tmVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        tmVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        tmVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        tmVar.put("android.media.metadata.DISPLAY_ICON", 2);
        tmVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        tmVar.put("android.media.metadata.MEDIA_ID", 1);
        tmVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        tmVar.put("android.media.metadata.MEDIA_URI", 1);
        tmVar.put("android.media.metadata.ADVERTISEMENT", 0);
        tmVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new bf(6);
    }

    public dz(Parcel parcel) {
        this.b = parcel.readBundle(ef.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }
}
