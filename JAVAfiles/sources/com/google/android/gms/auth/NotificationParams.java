package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abkq;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NotificationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NotificationParams> CREATOR = new abkq(6);
    public final String a;
    public final String b;
    public final boolean c;

    public NotificationParams(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NotificationParams) {
            NotificationParams notificationParams = (NotificationParams) obj;
            if (TextUtils.equals(this.a, notificationParams.a) && TextUtils.equals(this.b, notificationParams.b) && this.c == notificationParams.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        return "title=" + this.a + ", text=" + this.b + ", suppressNotification=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.h(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
