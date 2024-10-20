package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agqo implements Parcelable, hne {
    public static final Parcelable.Creator<agqo> CREATOR = new aftg(18);
    public final String b;

    public agqo(Parcel parcel) {
        this.b = parcel.readString();
    }

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        if (obj instanceof agqo) {
            return this.b.equals(((agqo) obj).b);
        }
        return false;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ProvidedFifeUrl{baseUrl='" + this.b + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }

    public agqo(String str) {
        if (aiqg.a(str)) {
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("baseUrl is not a fife Url: ".concat(String.valueOf(str)));
    }
}
