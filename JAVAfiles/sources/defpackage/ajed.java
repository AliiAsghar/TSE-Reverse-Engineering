package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajed implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public ajed(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        if (i == 0) {
            return new ajee(parcel, (ClassLoader) null);
        }
        if (i == 1) {
            return new ajdl(parcel, null);
        }
        if (i == 2) {
            return new ajep(parcel, null);
        }
        if (i != 3) {
            return i != 4 ? new ajno(parcel, null) : new ajlz(parcel, null);
        }
        return new ajht(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return new ajno[i];
                        }
                        return new ajlz[i];
                    }
                    return new ajht[i];
                }
                return new ajep[i];
            }
            return new ajdl[i];
        }
        return new ajee[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int i = this.a;
        if (i == 0) {
            return new ajee(parcel, classLoader);
        }
        if (i == 1) {
            return new ajdl(parcel, classLoader);
        }
        if (i == 2) {
            return new ajep(parcel, classLoader);
        }
        if (i != 3) {
            return i != 4 ? new ajno(parcel, classLoader) : new ajlz(parcel, classLoader);
        }
        return new ajht(parcel, classLoader);
    }
}
