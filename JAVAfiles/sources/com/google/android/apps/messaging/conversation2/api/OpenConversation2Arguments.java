package com.google.android.apps.messaging.conversation2.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import defpackage.a;
import defpackage.d;
import defpackage.imp;
import defpackage.miv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OpenConversation2Arguments implements Parcelable {
    public static final Parcelable.Creator<OpenConversation2Arguments> CREATOR = new imp(6);
    public final ConversationId a;
    public final MessageId b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final miv f;
    private final Boolean g;

    public OpenConversation2Arguments(ConversationId conversationId, MessageId messageId, String str, Boolean bool, boolean z, boolean z2, miv mivVar) {
        conversationId.getClass();
        mivVar.getClass();
        this.a = conversationId;
        this.b = messageId;
        this.c = str;
        this.g = bool;
        this.d = z;
        this.e = z2;
        this.f = mivVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenConversation2Arguments)) {
            return false;
        }
        OpenConversation2Arguments openConversation2Arguments = (OpenConversation2Arguments) obj;
        if (d.F(this.a, openConversation2Arguments.a) && d.F(this.b, openConversation2Arguments.b) && d.F(this.c, openConversation2Arguments.c) && d.F(this.g, openConversation2Arguments.g) && this.d == openConversation2Arguments.d && this.e == openConversation2Arguments.e && this.f == openConversation2Arguments.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        MessageId messageId = this.b;
        int i = 0;
        if (messageId == null) {
            hashCode = 0;
        } else {
            hashCode = messageId.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str = this.c;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool = this.g;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((((((i3 + i) * 31) + a.v(this.d)) * 31) + a.v(this.e)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "OpenConversation2Arguments(conversationId=" + this.a + ", messageId=" + this.b + ", searchQuery=" + this.c + ", canNavigateBack=" + this.g + ", renderAddPeople=" + this.d + ", isBubbleActivity=" + this.e + ", conversationOpenMode=" + this.f + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        Boolean bool = this.g;
        if (bool == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ OpenConversation2Arguments(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r9, com.google.android.apps.messaging.shared.api.messaging.MessageId r10, java.lang.String r11, java.lang.Boolean r12, boolean r13, boolean r14, defpackage.miv r15, int r16, defpackage.arrj r17) {
        /*
            r8 = this;
            r0 = r16 & 64
            if (r0 == 0) goto L7
            miv r0 = defpackage.miv.FOR_DISPLAY
            goto L8
        L7:
            r0 = r15
        L8:
            r1 = r16 & 32
            r2 = r16 & 16
            r3 = r16 & 8
            r4 = r16 & 4
            r5 = r16 & 2
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L18
            r1 = r6
            goto L19
        L18:
            r1 = r7
        L19:
            if (r2 == 0) goto L1c
            goto L1d
        L1c:
            r6 = r7
        L1d:
            r1 = r1 & r14
            r2 = r6 & r13
            r6 = 0
            if (r3 == 0) goto L25
            r3 = r6
            goto L26
        L25:
            r3 = r12
        L26:
            if (r4 == 0) goto L2a
            r4 = r6
            goto L2b
        L2a:
            r4 = r11
        L2b:
            if (r5 == 0) goto L2e
            goto L2f
        L2e:
            r6 = r10
        L2f:
            r10 = r8
            r11 = r9
            r12 = r6
            r13 = r4
            r14 = r3
            r15 = r2
            r16 = r1
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments.<init>(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.String, java.lang.Boolean, boolean, boolean, miv, int, arrj):void");
    }
}
