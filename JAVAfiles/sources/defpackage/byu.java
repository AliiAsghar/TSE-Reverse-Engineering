package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byu<T> extends cai<T> implements Parcelable {
    public static final Parcelable.Creator<byu<Object>> CREATOR = new Parcelable.ClassLoaderCreator<byu<Object>>() { // from class: byu.1
        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final byu createFromParcel(Parcel parcel, ClassLoader classLoader) {
            caj cajVar;
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt != 0) {
                if (readInt != 1) {
                    if (readInt == 2) {
                        cajVar = bzr.a;
                    } else {
                        throw new IllegalStateException(a.cb(readInt, "Unsupported MutableState policy ", " was restored"));
                    }
                } else {
                    cajVar = cav.a;
                }
            } else {
                cajVar = byo.a;
            }
            return new byu(readValue, cajVar);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new byu[i];
        }
    };

    public byu(Object obj, caj cajVar) {
        super(obj, cajVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(a());
        caj cajVar = ((cai) this).a;
        if (d.F(cajVar, byo.a)) {
            i2 = 0;
        } else if (d.F(cajVar, cav.a)) {
            i2 = 1;
        } else if (d.F(cajVar, bzr.a)) {
            i2 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i2);
    }
}
