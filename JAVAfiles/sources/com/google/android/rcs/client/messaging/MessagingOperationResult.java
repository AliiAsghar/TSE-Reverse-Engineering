package com.google.android.rcs.client.messaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.ajog;
import defpackage.ajyt;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class MessagingOperationResult implements Parcelable {
    public static final Parcelable.Creator<MessagingOperationResult> CREATOR = new ajog(17);

    public static MessagingOperationResult e(Intent intent) {
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("MESSAGING_OPERATION_RESULT");
            if (byteArrayExtra != null) {
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
                obtain.setDataPosition(0);
                try {
                    try {
                        return CREATOR.createFromParcel(obtain);
                    } catch (IllegalStateException | NoSuchElementException e) {
                        throw new IllegalArgumentException("Error unmarshalling the MessagingOperationResult", e);
                    }
                } finally {
                    obtain.recycle();
                }
            }
            throw new IllegalArgumentException("Intent extra is missing MESSAGING_OPERATION_RESULT key");
        } catch (ClassCastException e2) {
            throw new IllegalArgumentException("Wrong value type from the intent extra key MESSAGING_OPERATION_RESULT", e2);
        }
    }

    public static ajyt f() {
        ajyt ajytVar = new ajyt();
        ajytVar.f(false);
        return ajytVar;
    }

    public abstract MessagingResult a();

    public abstract com.google.android.rcs.client.messaging.data.Conversation b();

    public abstract String c();

    public abstract boolean d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, a(), i, false);
        abhi.o(parcel, 2, b(), i, false);
        abhi.q(parcel, 3, c(), false);
        abhi.h(parcel, 4, d());
        abhi.g(parcel, e);
    }
}
