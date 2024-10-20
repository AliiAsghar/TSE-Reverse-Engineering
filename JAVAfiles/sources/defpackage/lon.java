package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lon {
    public final ConversationId a;
    public final String b;
    public final alog c;
    public final int d = 3;
    private final boolean e;

    public lon(ConversationId conversationId, String str, alog alogVar, boolean z) {
        this.a = conversationId;
        this.b = str;
        this.c = alogVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lon)) {
            return false;
        }
        lon lonVar = (lon) obj;
        if (!d.F(this.a, lonVar.a) || !d.F(this.b, lonVar.b) || !d.F(this.c, lonVar.c) || this.e != lonVar.e) {
            return false;
        }
        int i = lonVar.d;
        return true;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        a.bm(3);
        return (((hashCode * 31) + a.v(this.e)) * 31) + 3;
    }

    public final String toString() {
        return "ForGroupRename(conversationId=" + this.a + ", groupName=" + this.b + ", participants=" + this.c + ", isRcs=" + this.e + ", contactPickerSource=" + ((Object) Integer.toString(a.M(3))) + ")";
    }
}
