package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxm {
    public Uri a;
    public String b;
    public String c;
    private Uri d;
    private String e;
    private ConversationIdType f;
    private ConversationId g;
    private MessageIdType h;
    private MessageId i;

    public final MediaViewerItem a() {
        String str;
        Uri uri = this.d;
        if (uri != null && (str = this.e) != null) {
            return new aaxl(uri, this.a, str, this.b, this.c, this.f, this.g, this.h, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" uri");
        }
        if (this.e == null) {
            sb.append(" contentType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null contentType");
    }

    public final void c(Uri uri) {
        if (uri != null) {
            this.d = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }
}
