package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.acdi;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UserPreferredSleepWindow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserPreferredSleepWindow> CREATOR = new acdi(7);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public UserPreferredSleepWindow(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i >= 0 && i <= 23) {
            z = true;
        } else {
            z = false;
        }
        abhg.i(z, "Start hour must be in range [0, 23].");
        if (i2 >= 0 && i2 <= 59) {
            z2 = true;
        } else {
            z2 = false;
        }
        abhg.i(z2, "Start minute must be in range [0, 59].");
        if (i3 >= 0 && i3 <= 23) {
            z3 = true;
        } else {
            z3 = false;
        }
        abhg.i(z3, "End hour must be in range [0, 23].");
        if (i4 >= 0 && i4 <= 59) {
            z4 = true;
        } else {
            z4 = false;
        }
        abhg.i(z4, "End minute must be in range [0, 59].");
        abhg.i(((i + i2) + i3) + i4 > 0, "Parameters can't be all 0.");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPreferredSleepWindow)) {
            return false;
        }
        UserPreferredSleepWindow userPreferredSleepWindow = (UserPreferredSleepWindow) obj;
        if (this.a == userPreferredSleepWindow.a && this.b == userPreferredSleepWindow.b && this.c == userPreferredSleepWindow.c && this.d == userPreferredSleepWindow.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        return "UserPreferredSleepWindow [startHour=" + this.a + ", startMinute=" + this.b + ", endHour=" + this.c + ", endMinute=" + this.d + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        abhg.m(parcel);
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.m(parcel, 2, this.b);
        abhi.m(parcel, 3, this.c);
        abhi.m(parcel, 4, this.d);
        abhi.g(parcel, e);
    }
}
