package com.google.protobuf.contrib.android;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aozl;
import defpackage.aozs;
import defpackage.apba;
import defpackage.apbt;
import defpackage.apdi;
import defpackage.apdj;
import defpackage.d;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ProtoParsers$InternalDontUse<T extends apbt> implements apdj<T> {
    public static final Parcelable.Creator<ProtoParsers$InternalDontUse<?>> CREATOR = new apdi(0);
    private volatile byte[] a;
    private volatile apbt b;

    public ProtoParsers$InternalDontUse(byte[] bArr, apbt apbtVar) {
        boolean z = true;
        if (bArr == null && apbtVar == null) {
            z = false;
        }
        d.t(z, "Must have a message or bytes");
        this.a = bArr;
        this.b = apbtVar;
    }

    @Override // defpackage.apdj
    public final apbt a(apbt apbtVar, aozs aozsVar) {
        try {
            return b(apbtVar, aozsVar);
        } catch (apba e) {
            throw new IllegalStateException(e);
        }
    }

    public final apbt b(apbt apbtVar, aozs aozsVar) {
        if (this.b == null) {
            this.b = apbtVar.toBuilder().h(this.a, aozsVar).s();
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            byte[] bArr = new byte[this.b.getSerializedSize()];
            try {
                this.b.writeTo(aozl.ag(bArr));
                this.a = bArr;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }
}
