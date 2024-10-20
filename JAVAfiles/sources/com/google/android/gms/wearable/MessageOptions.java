package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acju;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MessageOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MessageOptions> CREATOR = new acju(9);
    public final int a;

    public MessageOptions(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MessageOptions) || this.a != ((MessageOptions) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public final String toString() {
        return "MessageOptions[ priority=" + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, i2);
        abhi.g(parcel, e);
    }
}
