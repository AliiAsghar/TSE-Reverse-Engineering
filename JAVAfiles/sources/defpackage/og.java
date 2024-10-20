package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class og implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public og(int i) {
        this.a = i;
    }

    public static final ehg a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return ehg.c;
        }
        throw new IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new oh(parcel, null);
            case 1:
                return new cf(parcel, null);
            case 2:
                return new pb(parcel, null);
            case 3:
                return new qa(parcel, null);
            case 4:
                return new dxw(parcel, null);
            case 5:
                return a(parcel, null);
            case 6:
                return new gnl(parcel, null);
            default:
                return new gol(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new oh[i];
            case 1:
                return new cf[i];
            case 2:
                return new pb[i];
            case 3:
                return new qa[i];
            case 4:
                return new dxw[i];
            case 5:
                return new ehg[i];
            case 6:
                return new gnl[i];
            default:
                return new gol[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new oh(parcel, classLoader);
            case 1:
                return new cf(parcel, classLoader);
            case 2:
                return new pb(parcel, classLoader);
            case 3:
                return new qa(parcel, classLoader);
            case 4:
                return new dxw(parcel, classLoader);
            case 5:
                return a(parcel, classLoader);
            case 6:
                return new gnl(parcel, classLoader);
            default:
                return new gol(parcel, classLoader);
        }
    }
}
