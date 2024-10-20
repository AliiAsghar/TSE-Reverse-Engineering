package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import com.google.android.apps.messaging.datadonation.redact.RedactedSpan;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmj implements Comparable<kmj>, Parcelable {
    public static final Parcelable.Creator<kmj> CREATOR = new imp(10);
    public final long a;
    public final Spanned b;
    public Spanned c;
    kky d;
    public boolean e;

    public kmj(kkr kkrVar) {
        Spanned spanned = kkrVar.c;
        this.b = spanned;
        this.c = spanned;
        this.a = kkrVar.d;
        this.d = null;
        this.e = true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(kmj kmjVar) {
        return Long.compare(kmjVar.a, this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RedactedSpan.c(parcel, this.b);
        RedactedSpan.c(parcel, this.c);
        parcel.writeLong(this.a);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        kky kkyVar = this.d;
        if (kkyVar == null) {
            parcel.writeIntArray(new int[]{0, 0, 0});
        } else {
            parcel.writeIntArray(new int[]{kkyVar.a, kkyVar.b, kkyVar.c});
        }
    }

    public kmj(Parcel parcel) {
        kky kkyVar;
        this.b = RedactedSpan.a(parcel);
        this.c = RedactedSpan.a(parcel);
        this.a = parcel.readLong();
        int i = 0;
        this.e = parcel.readByte() != 0;
        int[] iArr = new int[3];
        parcel.readIntArray(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        if (i2 != 0) {
            i = i2;
        } else if (i3 == 0) {
            if (i4 == 0) {
                kkyVar = null;
                this.d = kkyVar;
            }
            i3 = 0;
        }
        kkyVar = new kky(i, i3, i4);
        this.d = kkyVar;
    }
}
