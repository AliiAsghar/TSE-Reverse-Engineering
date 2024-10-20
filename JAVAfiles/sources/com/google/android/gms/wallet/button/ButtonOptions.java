package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.acjq;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ButtonOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new acjq(12);
    int a;
    int b;
    int c;
    String d;

    private ButtonOptions() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            if (d.B(Integer.valueOf(this.a), Integer.valueOf(buttonOptions.a)) && d.B(Integer.valueOf(this.b), Integer.valueOf(buttonOptions.b)) && d.B(Integer.valueOf(this.c), Integer.valueOf(buttonOptions.c)) && d.B(this.d, buttonOptions.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.m(parcel, 2, this.b);
        abhi.m(parcel, 3, this.c);
        abhi.q(parcel, 4, this.d, false);
        abhi.g(parcel, e);
    }

    public ButtonOptions(int i, int i2, int i3, String str) {
        Integer.valueOf(i).getClass();
        this.a = i;
        Integer.valueOf(i2).getClass();
        this.b = i2;
        Integer.valueOf(i3).getClass();
        this.c = i3;
        abhg.m(str);
        this.d = str;
    }
}
