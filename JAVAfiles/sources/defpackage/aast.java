package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aast implements Parcelable {
    public static final Parcelable.Creator<aast> CREATOR = new aapv(7);
    public final String a;
    public final int b;
    public final int c;
    public final ampy d;
    public final long e;

    public aast() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aast) {
            aast aastVar = (aast) obj;
            if (this.a.equals(aastVar.a) && this.b == aastVar.b && this.c == aastVar.c && this.d.equals(aastVar.d) && this.e == aastVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
        long j = this.e;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "MiniCameraCapture{contentType=" + this.a + ", width=" + this.b + ", height=" + this.c + ", cameraCaptureInformation=" + this.d.toString() + ", modifiedTimestamp=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeParcelable(new ProtoParsers$InternalDontUse(null, this.d), 0);
        parcel.writeLong(this.e);
    }

    public aast(String str, int i, int i2, ampy ampyVar, long j) {
        if (str == null) {
            throw new NullPointerException("Null contentType");
        }
        this.a = str;
        this.b = i;
        this.c = i2;
        if (ampyVar != null) {
            this.d = ampyVar;
            this.e = j;
            return;
        }
        throw new NullPointerException("Null cameraCaptureInformation");
    }
}
