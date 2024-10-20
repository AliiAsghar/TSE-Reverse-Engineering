package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmj {
    public final ConversationId a;
    public final String b;
    public final String c;
    public final int d;
    public final Uri e;
    private final boolean f;
    private final Instant g;
    private final mmi h;

    public mmj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        mmi mmiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mmj) {
            mmj mmjVar = (mmj) obj;
            if (this.a.equals(mmjVar.a) && this.b.equals(mmjVar.b) && this.f == mmjVar.f && this.c.equals(mmjVar.c) && this.d == mmjVar.d && ((uri = this.e) != null ? uri.equals(mmjVar.e) : mmjVar.e == null) && ((mmiVar = this.h) != null ? mmiVar.equals(mmjVar.h) : mmjVar.h == null) && this.g.equals(mmjVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        if (true != this.f) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode3 = (((hashCode2 * 1000003) ^ i) * 1000003) ^ this.c.hashCode();
        Uri uri = this.e;
        int i2 = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i3 = ((((hashCode3 * 1000003) ^ this.d) * 1000003) ^ hashCode) * 1000003;
        mmi mmiVar = this.h;
        if (mmiVar != null) {
            i2 = mmiVar.hashCode();
        }
        return ((i3 ^ i2) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        Instant instant = this.g;
        mmi mmiVar = this.h;
        Uri uri = this.e;
        return "DefaultConversationSummary{conversationId=" + String.valueOf(this.a) + ", name=" + this.b + ", isUnread=" + this.f + ", latestMessageSnippet=" + this.c + ", recipientCount=" + this.d + ", conversationAvatarUri=" + String.valueOf(uri) + ", draftSnippet=" + String.valueOf(mmiVar) + ", sortTime=" + String.valueOf(instant) + "}";
    }

    public mmj(ConversationId conversationId, String str, boolean z, String str2, int i, Uri uri, mmi mmiVar, Instant instant) {
        this.a = conversationId;
        this.b = str;
        this.f = z;
        this.c = str2;
        this.d = i;
        this.e = uri;
        this.h = mmiVar;
        this.g = instant;
    }
}
