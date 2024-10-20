package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kaz {
    private final MessageId a;
    private final Uri b;

    public kaz(MessageId messageId, Uri uri) {
        this.a = messageId;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kaz)) {
            return false;
        }
        kaz kazVar = (kaz) obj;
        if (d.F(this.a, kazVar.a) && d.F(this.b, kazVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CacheKey(messageId=" + this.a + ", uri=" + this.b + ")";
    }
}
