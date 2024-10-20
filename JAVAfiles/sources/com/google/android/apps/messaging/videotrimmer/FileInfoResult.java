package com.google.android.apps.messaging.videotrimmer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aapv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FileInfoResult implements Parcelable {
    public static final Parcelable.Creator<FileInfoResult> CREATOR = new aapv(18);
    public final String a;
    public final long b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ FileInfoResult(android.os.Parcel r3, defpackage.arrj r4) {
        /*
            r2 = this;
            java.lang.String r4 = r3.readString()
            r4.getClass()
            long r0 = r3.readLong()
            r2.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.videotrimmer.FileInfoResult.<init>(android.os.Parcel, arrj):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
    }

    public FileInfoResult(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }
}
