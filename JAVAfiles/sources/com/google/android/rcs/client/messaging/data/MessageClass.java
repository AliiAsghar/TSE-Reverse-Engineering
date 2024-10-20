package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.acyy;
import defpackage.acyz;
import defpackage.ajgk;
import defpackage.ajqp;
import defpackage.ajqr;
import defpackage.ajqs;
import defpackage.ajqt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class MessageClass implements Parcelable {
    public static final acyz a = acyy.b("include_disposition_notification_required");
    public static final Parcelable.Creator<MessageClass> CREATOR = new ajqp(2);

    public static ajqr e() {
        ajqr ajqrVar = new ajqr();
        ajqrVar.e(ajqt.UNKNOWN_MESSAGE_SOURCE);
        ajqrVar.d(ajqs.UNKNOWN_MESSAGE_PRIORITY);
        ajqrVar.c(true);
        ajqrVar.b(true);
        return ajqrVar;
    }

    public static boolean f(MessageClass messageClass) {
        if (messageClass.b() != ajqt.CONTROL) {
            return false;
        }
        if (messageClass.a() != ajqs.HIGH && messageClass.a() != ajqs.NORMAL) {
            return false;
        }
        return true;
    }

    public static boolean g(MessageClass messageClass) {
        if (messageClass.b() == ajqt.CONTROL && messageClass.a() == ajqs.LOW) {
            return false;
        }
        return true;
    }

    public static boolean h(MessageClass messageClass) {
        if (messageClass.b() != ajqt.USER) {
            return false;
        }
        if (messageClass.a() != ajqs.HIGH && messageClass.a() != ajqs.NORMAL) {
            return false;
        }
        return true;
    }

    public static boolean i(MessageClass messageClass) {
        if ((messageClass.a().equals(ajqs.HIGH) || messageClass.a().equals(ajqs.NORMAL)) && !messageClass.d()) {
            return true;
        }
        return false;
    }

    public abstract ajqs a();

    public abstract ajqt b();

    public abstract boolean c();

    public abstract boolean d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        ajgk.C(parcel, 1, b());
        ajgk.C(parcel, 2, a());
        abhi.h(parcel, 3, d());
        if (((Boolean) a.a()).booleanValue()) {
            abhi.h(parcel, 4, c());
        }
        abhi.g(parcel, e);
    }
}
