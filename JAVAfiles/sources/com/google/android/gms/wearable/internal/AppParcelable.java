package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acju;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppParcelable> CREATOR = new acju(20);
    public final String a;
    public final String b;
    public final WebIconParcelable c;
    public final String d;
    public final String e;
    public final Float f;
    public final AppWearDetailsParcelable g;

    public AppParcelable(String str, String str2, WebIconParcelable webIconParcelable, String str3, String str4, Float f, AppWearDetailsParcelable appWearDetailsParcelable) {
        this.a = str;
        this.b = str2;
        this.c = webIconParcelable;
        this.d = str3;
        this.e = str4;
        this.f = f;
        this.g = appWearDetailsParcelable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AppParcelable appParcelable = (AppParcelable) obj;
            if (Objects.equals(this.a, appParcelable.a) && Objects.equals(this.b, appParcelable.b) && Objects.equals(this.c, appParcelable.c) && Objects.equals(this.d, appParcelable.d) && Objects.equals(this.e, appParcelable.e) && Objects.equals(this.f, appParcelable.f) && Objects.equals(this.g, appParcelable.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final String toString() {
        WebIconParcelable webIconParcelable = this.c;
        return "AppParcelable{title='" + this.b + "', developerName='" + this.d + "', formattedPrice='" + this.e + "', starRating=" + this.f + ", wearDetails=" + String.valueOf(this.g) + ", deepLinkUri='" + this.a + "', icon=" + String.valueOf(webIconParcelable) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.q(parcel, 4, this.d, false);
        abhi.q(parcel, 5, this.e, false);
        abhi.w(parcel, 6, this.f);
        abhi.o(parcel, 7, this.g, i, false);
        abhi.g(parcel, e);
    }
}
