package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aaxk extends MediaViewerItem {
    public final Uri a;
    public final Uri b;
    public final String c;
    public final String d;
    public final String e;
    public final ConversationIdType f;
    public final ConversationId g;
    public final MessageIdType h;
    public final MessageId i;

    public aaxk(Uri uri, Uri uri2, String str, String str2, String str3, ConversationIdType conversationIdType, ConversationId conversationId, MessageIdType messageIdType, MessageId messageId) {
        if (uri != null) {
            this.a = uri;
            this.b = uri2;
            if (str != null) {
                this.c = str;
                this.d = str2;
                this.e = str3;
                this.f = conversationIdType;
                this.g = conversationId;
                this.h = messageIdType;
                this.i = messageId;
                return;
            }
            throw new NullPointerException("Null contentType");
        }
        throw new NullPointerException("Null uri");
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final Uri a() {
        return this.b;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final Uri b() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final MessageId c() {
        return this.i;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final ConversationId d() {
        return this.g;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final ConversationIdType e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        String str;
        String str2;
        ConversationIdType conversationIdType;
        ConversationId conversationId;
        MessageIdType messageIdType;
        MessageId messageId;
        if (obj == this) {
            return true;
        }
        if (obj instanceof MediaViewerItem) {
            MediaViewerItem mediaViewerItem = (MediaViewerItem) obj;
            if (this.a.equals(mediaViewerItem.b()) && ((uri = this.b) != null ? uri.equals(mediaViewerItem.a()) : mediaViewerItem.a() == null) && this.c.equals(mediaViewerItem.g()) && ((str = this.d) != null ? str.equals(mediaViewerItem.i()) : mediaViewerItem.i() == null) && ((str2 = this.e) != null ? str2.equals(mediaViewerItem.h()) : mediaViewerItem.h() == null) && ((conversationIdType = this.f) != null ? conversationIdType.equals(mediaViewerItem.e()) : mediaViewerItem.e() == null) && ((conversationId = this.g) != null ? conversationId.equals(mediaViewerItem.d()) : mediaViewerItem.d() == null) && ((messageIdType = this.h) != null ? messageIdType.equals(mediaViewerItem.f()) : mediaViewerItem.f() == null) && ((messageId = this.i) != null ? messageId.equals(mediaViewerItem.c()) : mediaViewerItem.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final MessageIdType f() {
        return this.h;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final String g() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final String h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7 = this.a.hashCode() ^ 1000003;
        Uri uri = this.b;
        int i = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int hashCode8 = ((((hashCode7 * 1000003) ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = (hashCode8 ^ hashCode2) * 1000003;
        String str2 = this.e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode3) * 1000003;
        ConversationIdType conversationIdType = this.f;
        if (conversationIdType == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = conversationIdType.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        ConversationId conversationId = this.g;
        if (conversationId == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = conversationId.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        MessageIdType messageIdType = this.h;
        if (messageIdType == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = messageIdType.hashCode();
        }
        int i6 = (i5 ^ hashCode6) * 1000003;
        MessageId messageId = this.i;
        if (messageId != null) {
            i = messageId.hashCode();
        }
        return i6 ^ i;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem
    public final String i() {
        return this.d;
    }

    public final String toString() {
        MessageId messageId = this.i;
        MessageIdType messageIdType = this.h;
        ConversationId conversationId = this.g;
        ConversationIdType conversationIdType = this.f;
        Uri uri = this.b;
        return "MediaViewerItem{uri=" + this.a.toString() + ", originalUri=" + String.valueOf(uri) + ", contentType=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", legacyConversationId=" + String.valueOf(conversationIdType) + ", conversationId=" + String.valueOf(conversationId) + ", legacyMessageId=" + String.valueOf(messageIdType) + ", messageId=" + String.valueOf(messageId) + "}";
    }
}
