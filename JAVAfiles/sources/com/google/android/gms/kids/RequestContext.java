package com.google.android.gms.kids;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acbp;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RequestContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RequestContext> CREATOR = new acbp(5);
    public String a;
    public int b;
    public Uri[] c;

    public RequestContext() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RequestContext) {
            RequestContext requestContext = (RequestContext) obj;
            if (d.B(this.a, requestContext.a) && d.B(Integer.valueOf(this.b), Integer.valueOf(requestContext.b)) && Arrays.equals(this.c, requestContext.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.m(parcel, 2, this.b);
        abhi.H(parcel, 3, this.c, i);
        abhi.g(parcel, e);
    }

    public RequestContext(String str, int i, Uri[] uriArr) {
        this.a = str;
        this.b = i;
        this.c = uriArr;
    }
}
