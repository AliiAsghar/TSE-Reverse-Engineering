package com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.alhr;
import defpackage.arrj;
import defpackage.myl;
import defpackage.rha;
import defpackage.rvc;
import defpackage.utz;
import defpackage.uuh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RbmSuggestionData implements SuggestionData {
    public final ConversationSuggestion b;
    public final MessageIdType c;
    private final myl d;
    public static final alhr a = uuh.x(223258190, "use_bugle_message_id_in_rbm_suggestion_data");
    public static final Parcelable.Creator<RbmSuggestionData> CREATOR = new rha(13);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ RbmSuggestionData(android.os.Parcel r3, defpackage.arrj r4) {
        /*
            r2 = this;
            android.os.Parcelable$Creator<com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion> r4 = com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion.CREATOR
            java.lang.Object r4 = r4.createFromParcel(r3)
            r4.getClass()
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion r4 = (com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion) r4
            java.lang.String r3 = r3.readString()
            alhr r0 = com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData.a
            java.lang.Object r0 = r0.get()
            utz r0 = (defpackage.utz) r0
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L2c
            java.lang.String r0 = "noMessageIdSentinel"
            boolean r0 = defpackage.d.F(r0, r3)
            if (r0 == 0) goto L2d
        L2c:
            r3 = r1
        L2d:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r3 = defpackage.rvc.b(r3)
            r2.<init>(r4, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData.<init>(android.os.Parcel, arrj):void");
    }

    @Override // defpackage.mqz
    public final String a() {
        return this.b.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT);
    }

    @Override // defpackage.mqz
    public final String b() {
        throw new UnsupportedOperationException("Not used");
    }

    @Override // defpackage.mqz
    public final String c() {
        String a2 = r().a();
        a2.getClass();
        return a2;
    }

    @Override // defpackage.mqz
    public final String d() {
        return this.b.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.mqz
    public final boolean e() {
        if (this.b.getSuggestionType() == 0) {
            return true;
        }
        return false;
    }

    public final String f() {
        String rcsMessageId = this.b.getRcsMessageId();
        if (rcsMessageId != null) {
            return rcsMessageId;
        }
        throw new IllegalStateException("missing rcsMessageId");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData
    public final MessageIdType r() {
        if (((Boolean) ((utz) a.get()).e()).booleanValue()) {
            MessageIdType messageIdType = this.c;
            if (!messageIdType.b()) {
                return messageIdType;
            }
        }
        return rvc.b(this.b.getTargetRcsMessageId());
    }

    public final String toString() {
        myl mylVar = this.d;
        if (mylVar != null) {
            ConversationSuggestion conversationSuggestion = this.b;
            return mylVar.b() + " " + mylVar.c() + " " + conversationSuggestion;
        }
        String conversationSuggestion2 = this.b.toString();
        conversationSuggestion2.getClass();
        return conversationSuggestion2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.b.writeToParcel(parcel, i);
        if (((Boolean) ((utz) a.get()).e()).booleanValue()) {
            parcel.writeString(this.c.a());
        } else {
            parcel.writeString("noMessageIdSentinel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RbmSuggestionData(ConversationSuggestion conversationSuggestion, MessageIdType messageIdType) {
        this(conversationSuggestion, messageIdType, null, 4, null);
        conversationSuggestion.getClass();
        messageIdType.getClass();
    }

    public RbmSuggestionData(ConversationSuggestion conversationSuggestion, MessageIdType messageIdType, myl mylVar) {
        conversationSuggestion.getClass();
        messageIdType.getClass();
        this.b = conversationSuggestion;
        this.c = messageIdType;
        this.d = mylVar;
    }

    public /* synthetic */ RbmSuggestionData(ConversationSuggestion conversationSuggestion, MessageIdType messageIdType, myl mylVar, int i, arrj arrjVar) {
        this(conversationSuggestion, messageIdType, (i & 4) != 0 ? null : mylVar);
    }
}
