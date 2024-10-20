package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjg;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GlobalSearchApplication extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GlobalSearchApplication> CREATOR = new abjg(13);
    public final GlobalSearchApplicationInfo a;
    final GlobalSearchAppCorpusFeatures[] b;
    public final boolean c;

    public GlobalSearchApplication(GlobalSearchApplicationInfo globalSearchApplicationInfo, GlobalSearchAppCorpusFeatures[] globalSearchAppCorpusFeaturesArr, boolean z) {
        this.a = globalSearchApplicationInfo;
        this.b = globalSearchAppCorpusFeaturesArr;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GlobalSearchApplication) {
            GlobalSearchApplication globalSearchApplication = (GlobalSearchApplication) obj;
            if (d.B(this.a, globalSearchApplication.a) && d.B(Boolean.valueOf(this.c), Boolean.valueOf(globalSearchApplication.c)) && Arrays.equals(this.b, globalSearchApplication.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.H(parcel, 2, this.b, i);
        abhi.h(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
