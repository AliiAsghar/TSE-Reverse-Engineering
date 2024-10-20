package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.ajpv;
import defpackage.ajqv;
import defpackage.ajqz;
import defpackage.aozb;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class FileTransferInformation implements Parcelable, ajqz {
    public static final Parcelable.Creator<FileTransferInformation> CREATOR = new ajpv(13);

    public abstract FileInformation a();

    public abstract Optional b();

    public abstract Optional c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ajqz
    public final void gU(ajqv ajqvVar) {
        ajqvVar.d(this);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, a(), i, false);
        if (c().isPresent()) {
            abhi.o(parcel, 2, c().get(), i, false);
        }
        if (b().isPresent()) {
            abhi.j(parcel, 3, ((aozb) b().get()).H(), false);
        }
        abhi.g(parcel, e);
    }
}
