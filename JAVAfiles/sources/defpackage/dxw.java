package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxw extends ehg {
    public static final Parcelable.Creator<dxw> CREATOR = new og(4);
    public SparseArray a;

    public dxw(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.a = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.a.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // defpackage.ehg, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.a;
        if (sparseArray != null) {
            i2 = sparseArray.size();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        int[] iArr = new int[i2];
        Parcelable[] parcelableArr = new Parcelable[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = this.a.keyAt(i3);
            parcelableArr[i3] = (Parcelable) this.a.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }

    public dxw(Parcelable parcelable) {
        super(parcelable);
    }
}
