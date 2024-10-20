package com.google.android.apps.messaging.shared.api.messaging.message.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.anfi;
import defpackage.d;
import defpackage.ltv;
import defpackage.rvc;
import defpackage.rve;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CoreBugleMessageId implements BugleMessageId {
    public static final Parcelable.Creator<MessageId> CREATOR = new ltv(11);
    public final MessageIdType a;
    private final long b;
    private final rve c;
    private final rve d;

    public CoreBugleMessageId(MessageIdType messageIdType, long j) {
        d.s(!messageIdType.equals(rvc.a));
        this.a = messageIdType;
        this.b = j;
        rve rveVar = rve.a;
        this.c = rveVar;
        this.d = rveVar;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.MessageId
    public final String a() {
        return this.a.a();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId
    public final long b() {
        return this.b;
    }

    @Override // defpackage.mvb
    public final MessageIdType c() {
        return this.a;
    }

    @Override // defpackage.mvo
    public final rve d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.mvo
    public final rve e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof CoreBugleMessageId) {
            return this.a.equals(((CoreBugleMessageId) obj).a);
        }
        if (obj instanceof CoreBuglePartialMessageId) {
            CoreBuglePartialMessageId coreBuglePartialMessageId = (CoreBuglePartialMessageId) obj;
            if (this.a.equals(coreBuglePartialMessageId.a) && this.b == coreBuglePartialMessageId.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        if (anfi.a("bugle.enable_improve_media_bubble_logs", "bugle")) {
            return this.a.toString();
        }
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
        parcel.writeString(this.c.b);
        parcel.writeString(this.d.b);
    }

    public CoreBugleMessageId(MessageIdType messageIdType, long j, rve rveVar, rve rveVar2) {
        d.s(!messageIdType.equals(rvc.a));
        this.a = messageIdType;
        this.b = j;
        this.c = rveVar;
        this.d = rveVar2;
    }

    public CoreBugleMessageId(String str) {
        this.a = rvc.b(str);
        this.b = -1L;
        rve rveVar = rve.a;
        this.c = rveVar;
        this.d = rveVar;
    }
}
