package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpg extends foz {
    public static final Parcelable.Creator<fpg> CREATOR = new fot(9);
    public final long a;
    public final long b;

    public fpg(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long d(euf eufVar, long j) {
        long j2 = eufVar.j();
        if ((128 & j2) != 0) {
            return 8589934591L & ((((j2 & 1) << 32) | eufVar.r()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.foz
    public final String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.a + ", playbackPositionUs= " + this.b + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
