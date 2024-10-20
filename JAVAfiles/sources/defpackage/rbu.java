package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rbu {
    public final Uri a;
    public final Context b;
    public final MessageIdType c;
    public final ConversationIdType d;
    public final boolean e;
    public final rut f;
    public final MessageCoreData g;
    public final long h;
    public final ParticipantsTable.BindData i;
    public final boolean j;
    private final int k;

    public rbu() {
        throw null;
    }

    public static rbu a(Uri uri, Context context, MessageIdType messageIdType, String str, boolean z, rut rutVar, MessageCoreData messageCoreData, int i, long j, ParticipantsTable.BindData bindData, boolean z2) {
        return new rbu(uri, context, messageIdType, ruy.b(str), z, rutVar, messageCoreData, i, j, bindData, z2);
    }

    public final ConversationIdType b() {
        rut rutVar = this.f;
        if (rutVar == null) {
            return ruy.a;
        }
        return rutVar.a;
    }

    public final boolean equals(Object obj) {
        rut rutVar;
        MessageCoreData messageCoreData;
        ParticipantsTable.BindData bindData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rbu) {
            rbu rbuVar = (rbu) obj;
            Uri uri = this.a;
            if (uri != null ? uri.equals(rbuVar.a) : rbuVar.a == null) {
                if (this.b.equals(rbuVar.b) && this.c.equals(rbuVar.c) && this.d.equals(rbuVar.d) && this.e == rbuVar.e && ((rutVar = this.f) != null ? rutVar.equals(rbuVar.f) : rbuVar.f == null) && ((messageCoreData = this.g) != null ? messageCoreData.equals(rbuVar.g) : rbuVar.g == null) && this.k == rbuVar.k && this.h == rbuVar.h && ((bindData = this.i) != null ? bindData.equals(rbuVar.i) : rbuVar.i == null) && this.j == rbuVar.j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        Uri uri = this.a;
        int i2 = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int hashCode4 = ((((((hashCode ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        int i3 = 1237;
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i4 = ((hashCode4 * 1000003) ^ i) * 1000003;
        rut rutVar = this.f;
        if (rutVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = rutVar.hashCode();
        }
        int i5 = (i4 ^ hashCode2) * 1000003;
        MessageCoreData messageCoreData = this.g;
        if (messageCoreData == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = messageCoreData.hashCode();
        }
        int i6 = (((i5 ^ hashCode3) * 1000003) ^ this.k) * 1000003;
        long j = this.h;
        int i7 = (i6 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        ParticipantsTable.BindData bindData = this.i;
        if (bindData != null) {
            i2 = bindData.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        if (true == this.j) {
            i3 = 1231;
        }
        return i8 ^ i3;
    }

    public final String toString() {
        ParticipantsTable.BindData bindData = this.i;
        MessageCoreData messageCoreData = this.g;
        rut rutVar = this.f;
        ConversationIdType conversationIdType = this.d;
        MessageIdType messageIdType = this.c;
        Context context = this.b;
        return "ResultValues{mmsUri=" + String.valueOf(this.a) + ", context=" + context.toString() + ", messageId=" + messageIdType.toString() + ", notificationConversationId=" + conversationIdType.toString() + ", isMessageInFocusedConversation=" + this.e + ", createConversationResult=" + String.valueOf(rutVar) + ", message=" + String.valueOf(messageCoreData) + ", subId=" + this.k + ", timestamp=" + this.h + ", senderData=" + String.valueOf(bindData) + ", isAllowedByParents=" + this.j + "}";
    }

    public rbu(Uri uri, Context context, MessageIdType messageIdType, ConversationIdType conversationIdType, boolean z, rut rutVar, MessageCoreData messageCoreData, int i, long j, ParticipantsTable.BindData bindData, boolean z2) {
        this.a = uri;
        this.b = context;
        this.c = messageIdType;
        this.d = conversationIdType;
        this.e = z;
        this.f = rutVar;
        this.g = messageCoreData;
        this.k = i;
        this.h = j;
        this.i = bindData;
        this.j = z2;
    }
}
