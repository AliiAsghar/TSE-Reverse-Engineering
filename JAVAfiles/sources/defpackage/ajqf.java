package defpackage;

import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajqf {
    public final ContentType a;
    public final Uri b;

    public ajqf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajqf) {
            ajqf ajqfVar = (ajqf) obj;
            if (this.a.equals(ajqfVar.a) && this.b.equals(ajqfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "FileMessageContent {contentType=" + advq.GENERIC.c(this.a) + ", contentUri=" + advq.URI.c(this.b);
    }

    public ajqf(ContentType contentType, Uri uri) {
        this.a = contentType;
        this.b = uri;
    }
}
