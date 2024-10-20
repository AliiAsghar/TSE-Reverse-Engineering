package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.abzo;
import defpackage.d;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new abzo(4);
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final List d;
    public final List e;
    public final ChannelIdValue f;
    public final String g;

    public RegisterRequestParams(Integer num, Double d, Uri uri, List list, List list2, ChannelIdValue channelIdValue, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        this.a = num;
        this.b = d;
        this.c = uri;
        if (list != null && !list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "empty list of register requests is provided");
        this.d = list;
        this.e = list2;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it.next();
            if (uri == null && registerRequest.c == null) {
                z3 = false;
            } else {
                z3 = true;
            }
            d.t(z3, "register request has null appId and no request appId is provided");
            String str2 = registerRequest.c;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            if (uri == null && registeredKey.b == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            d.t(z2, "registered key has null appId and no request appId is provided");
            String str3 = registeredKey.b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        d.t(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.g = str;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        if (d.B(this.a, registerRequestParams.a) && d.B(this.b, registerRequestParams.b) && d.B(this.c, registerRequestParams.c) && d.B(this.d, registerRequestParams.d) && ((((list = this.e) == null && registerRequestParams.e == null) || (list != null && (list2 = registerRequestParams.e) != null && list.containsAll(list2) && registerRequestParams.e.containsAll(this.e))) && d.B(this.f, registerRequestParams.f) && d.B(this.g, registerRequestParams.g))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.d, this.e, this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int e = abhi.e(parcel);
        abhi.A(parcel, 2, num);
        abhi.v(parcel, 3, this.b);
        abhi.o(parcel, 4, this.c, i, false);
        abhi.r(parcel, 5, this.d, false);
        abhi.r(parcel, 6, this.e, false);
        abhi.o(parcel, 7, this.f, i, false);
        abhi.q(parcel, 8, this.g, false);
        abhi.g(parcel, e);
    }
}
