package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.abhg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field field : b().values()) {
            if (c(field)) {
                if (!fastJsonResponse.c(field) || !d.B(a(field), fastJsonResponse.a(field))) {
                    return false;
                }
            } else if (fastJsonResponse.c(field)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field field : b().values()) {
            if (c(field)) {
                Object a = a(field);
                abhg.m(a);
                i = (i * 31) + a.hashCode();
            }
        }
        return i;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public void e() {
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public void f() {
    }
}
