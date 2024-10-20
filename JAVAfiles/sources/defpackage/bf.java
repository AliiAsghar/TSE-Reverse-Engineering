package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bf implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public bf(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Uri uri;
        Uri uri2;
        Intent intent = null;
        switch (this.a) {
            case 0:
                return new bg(parcel);
            case 1:
                return new be(parcel);
            case 2:
                return new cw(parcel);
            case 3:
                return new db(parcel);
            case 4:
                return new df(parcel);
            case 5:
                Object createFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (createFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) createFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle a = ef.a(mediaDescription.getExtras());
                if (a != null) {
                    a = new Bundle(a);
                }
                if (a != null) {
                    uri = (Uri) a.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    uri = null;
                }
                if (uri != null) {
                    if (a.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && a.size() == 2) {
                        a = null;
                    } else {
                        a.remove("android.support.v4.media.description.MEDIA_URI");
                        a.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    }
                }
                if (uri == null) {
                    uri2 = mediaDescription.getMediaUri();
                } else {
                    uri2 = uri;
                }
                dy dyVar = new dy(mediaId, title, subtitle, description, iconBitmap, iconUri, a, uri2);
                dyVar.a = mediaDescription;
                return dyVar;
            case 6:
                return new dz(parcel);
            case 7:
                return new ea(parcel.readInt(), parcel.readFloat());
            case 8:
                return new ed(parcel);
            case 9:
                return new ee(parcel);
            case 10:
                return new eg(parcel);
            case 11:
                return new ei(parcel);
            case 12:
                return new eh(parcel);
            case 13:
                return new lb(parcel);
            case 14:
                return new my(parcel);
            case 15:
                return new pl(parcel);
            case 16:
                return new pm(parcel);
            case 17:
                parcel.getClass();
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                }
                return new ru(readInt, intent);
            case 18:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new sd((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 19:
                return new egs(parcel);
            default:
                return new eqj(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new bg[i];
            case 1:
                return new be[i];
            case 2:
                return new cw[i];
            case 3:
                return new db[i];
            case 4:
                return new df[i];
            case 5:
                return new dy[i];
            case 6:
                return new dz[i];
            case 7:
                return new ea[i];
            case 8:
                return new ed[i];
            case 9:
                return new ee[i];
            case 10:
                return new eg[i];
            case 11:
                return new ei[i];
            case 12:
                return new eh[i];
            case 13:
                return new lb[i];
            case 14:
                return new my[i];
            case 15:
                return new pl[i];
            case 16:
                return new pm[i];
            case 17:
                return new ru[i];
            case 18:
                return new sd[i];
            case 19:
                return new egs[i];
            default:
                return new eqj[i];
        }
    }
}
