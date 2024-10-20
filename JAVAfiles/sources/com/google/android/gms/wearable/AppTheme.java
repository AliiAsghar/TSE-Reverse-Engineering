package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acju;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppTheme extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AppTheme> CREATOR = new acju(3);
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public AppTheme() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppTheme)) {
            return false;
        }
        AppTheme appTheme = (AppTheme) obj;
        if (this.b == appTheme.b && this.a == appTheme.a && this.c == appTheme.c && this.d == appTheme.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.a) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "AppTheme {dynamicColor =" + this.b + ", colorTheme =" + this.a + ", screenAlignment =" + this.c + ", screenItemsSize =" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int i3 = 1;
        if (i2 == 0) {
            i2 = 1;
        }
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        int i4 = this.b;
        if (i4 == 0) {
            i4 = 1;
        }
        abhi.m(parcel, 2, i4);
        int i5 = this.c;
        if (i5 != 0) {
            i3 = i5;
        }
        int i6 = 3;
        abhi.m(parcel, 3, i3);
        int i7 = this.d;
        if (i7 != 0) {
            i6 = i7;
        }
        abhi.m(parcel, 4, i6);
        abhi.g(parcel, e);
    }

    public AppTheme(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
