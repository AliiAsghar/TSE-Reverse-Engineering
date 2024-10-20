package com.google.android.apps.messaging.shared.api.messaging.conversation;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ltv;
import defpackage.mph;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InvalidConversationId implements ConversationId {
    public static final InvalidConversationId a = new InvalidConversationId();
    public static final Parcelable.Creator<ConversationId> CREATOR = new ltv(2);

    private InvalidConversationId() {
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final mph a() {
        return mph.UNKNOWN;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final String b() {
        return "INVALID MAPI conversation id";
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final byte[] c() {
        throw new UnsupportedOperationException("InvalidConversationId should never be serialized.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        throw new UnsupportedOperationException("InvalidConversationId should never be serialized.");
    }
}
