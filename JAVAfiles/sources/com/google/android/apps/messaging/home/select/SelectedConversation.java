package com.google.android.apps.messaging.home.select;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.imp;
import defpackage.mmy;
import defpackage.ruy;
import defpackage.rvc;
import defpackage.tqc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SelectedConversation implements Parcelable {
    public static final Parcelable.Creator<SelectedConversation> CREATOR = new imp(13);

    @Deprecated
    public final ConversationIdType a;
    public final ConversationId b;
    public final MessageIdType c;
    public final long d;
    public final long e;
    public final tqc f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final boolean n;
    public final int o;
    public final int p;
    public String q;
    public String r;
    public boolean s;
    public mmy t;
    public boolean u;

    public SelectedConversation(ConversationIdType conversationIdType, ConversationId conversationId, MessageIdType messageIdType, long j, long j2, tqc tqcVar, int i, boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3, boolean z4, int i2, String str5, int i3, String str6, boolean z5, int i4, mmy mmyVar, boolean z6) {
        this.a = conversationIdType;
        this.b = conversationId;
        this.c = messageIdType;
        this.d = j;
        this.e = j2;
        this.f = tqcVar;
        this.g = i;
        this.h = z;
        this.i = z2;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = z3;
        this.o = i2;
        this.r = str5;
        this.p = i3;
        this.q = str6;
        this.s = z5;
        this.t = mmyVar;
        this.u = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.a());
        parcel.writeString(this.c.a());
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeString(this.f.name());
        parcel.writeInt(this.g);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.o);
        parcel.writeParcelable(this.b, i);
    }

    public SelectedConversation(Parcel parcel) {
        ConversationIdType b = ruy.b(parcel.readString());
        this.a = b;
        this.c = rvc.b(parcel.readString());
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        String readString = parcel.readString();
        readString.getClass();
        this.f = tqc.c(readString);
        this.g = parcel.readInt();
        this.h = parcel.readByte() != 0;
        this.i = parcel.readByte() != 0;
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readByte() != 0;
        this.o = parcel.readInt();
        this.p = -1;
        this.b = parcel.dataAvail() > 0 ? (ConversationId) parcel.readParcelable(getClass().getClassLoader()) : new BugleConversationId(b);
    }
}
