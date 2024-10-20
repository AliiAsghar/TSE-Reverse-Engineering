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
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new abzo(7);
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final byte[] d;
    public final List e;
    public final ChannelIdValue f;
    public final String g;

    public SignRequestParams(Integer num, Double d, Uri uri, byte[] bArr, List list, ChannelIdValue channelIdValue, String str) {
        boolean z;
        this.a = num;
        this.b = d;
        this.c = uri;
        this.d = bArr;
        this.e = list;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RegisteredKey registeredKey = (RegisteredKey) it.next();
                if (registeredKey.b == null && uri == null) {
                    z = false;
                } else {
                    z = true;
                }
                d.t(z, "registered key has null appId and no request appId is provided");
                String str2 = registeredKey.c;
                d.t(true, "register request has null challenge and no default challenge isprovided");
                String str3 = registeredKey.b;
                if (str3 != null) {
                    hashSet.add(Uri.parse(str3));
                }
            }
        }
        d.t(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (d.B(this.a, signRequestParams.a) && d.B(this.b, signRequestParams.b) && d.B(this.c, signRequestParams.c) && Arrays.equals(this.d, signRequestParams.d) && this.e.containsAll(signRequestParams.e) && signRequestParams.e.containsAll(this.e) && d.B(this.f, signRequestParams.f) && d.B(this.g, signRequestParams.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.e, this.f, this.g, Integer.valueOf(Arrays.hashCode(this.d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int e = abhi.e(parcel);
        abhi.A(parcel, 2, num);
        abhi.v(parcel, 3, this.b);
        abhi.o(parcel, 4, this.c, i, false);
        abhi.j(parcel, 5, this.d, false);
        abhi.r(parcel, 6, this.e, false);
        abhi.o(parcel, 7, this.f, i, false);
        abhi.q(parcel, 8, this.g, false);
        abhi.g(parcel, e);
    }
}
