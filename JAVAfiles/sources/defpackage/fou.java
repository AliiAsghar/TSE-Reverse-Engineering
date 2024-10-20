package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fou implements erj {
    public static final Parcelable.Creator<fou> CREATOR = new fot(0);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public fou(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // defpackage.erj
    public final /* synthetic */ eqn a() {
        return null;
    }

    @Override // defpackage.erj
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fou fouVar = (fou) obj;
            if (this.a == fouVar.a && this.b == fouVar.b && this.c == fouVar.c && this.d == fouVar.d && this.e == fouVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int A = a.A(this.a) + 527;
        long j = this.e;
        long j2 = this.d;
        return (((((((A * 31) + a.A(this.b)) * 31) + a.A(this.c)) * 31) + a.A(j2)) * 31) + a.A(j);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
    }

    public fou(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
    }

    @Override // defpackage.erj
    public final /* synthetic */ void b(erg ergVar) {
    }
}
