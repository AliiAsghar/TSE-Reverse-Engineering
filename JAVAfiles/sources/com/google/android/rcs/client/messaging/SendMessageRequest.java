package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.TraceId;
import defpackage.abhi;
import defpackage.aczf;
import defpackage.ajgk;
import defpackage.ajpe;
import defpackage.ajpv;
import defpackage.ajpx;
import defpackage.ajqw;
import defpackage.anzh;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class SendMessageRequest implements Parcelable, ajpe {
    public static final Parcelable.Creator<SendMessageRequest> CREATOR = new ajpv(2);

    public static anzh j() {
        anzh anzhVar = new anzh((byte[]) null, (char[]) null);
        anzhVar.m(MessageClass.e().a());
        anzhVar.p(TraceId.b().l());
        anzhVar.n(ajqw.MESSAGING_METHOD_UNKNOWN);
        return anzhVar;
    }

    public abstract PendingIntent a();

    public abstract com.google.android.rcs.client.messaging.data.Conversation b();

    public abstract Message c();

    public abstract MessageClass d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ajpe
    public final boolean e() {
        return MessageClass.i(d());
    }

    @Override // defpackage.ajpe
    public final boolean f() {
        if (b().c() == 2) {
            return MessageClass.g(d());
        }
        return MessageClass.h(d());
    }

    public abstract ajqw g();

    public abstract TraceId h();

    public abstract Optional i();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.E(parcel, a());
        abhi.o(parcel, 2, b(), i, false);
        abhi.o(parcel, 3, c(), i, false);
        abhi.o(parcel, 4, d(), i, false);
        abhi.o(parcel, 5, h(), i, false);
        i().ifPresent(new ajpx(parcel, 1));
        if (aczf.F()) {
            ajgk.C(parcel, 7, g());
        }
        abhi.g(parcel, e);
    }
}
