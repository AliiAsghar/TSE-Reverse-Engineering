package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajrt {
    public final aozb a;
    public final ContentType b;

    public ajrt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajrt) {
            ajrt ajrtVar = (ajrt) obj;
            if (this.a.equals(ajrtVar.a) && this.b.equals(ajrtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ContentType contentType = this.b;
        return "Content{content=" + String.valueOf(this.a) + ", contentType=" + String.valueOf(contentType) + "}";
    }

    public ajrt(aozb aozbVar, ContentType contentType) {
        this.a = aozbVar;
        this.b = contentType;
    }
}
