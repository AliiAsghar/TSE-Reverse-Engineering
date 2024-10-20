package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxi {
    private MessageCoreData a;
    private Uri b;
    private int c;
    private alog d;
    private boolean e;
    private byte f;

    public final yxj a() {
        MessageCoreData messageCoreData;
        Uri uri;
        alog alogVar;
        if (this.f == 3 && (messageCoreData = this.a) != null && (uri = this.b) != null && (alogVar = this.d) != null) {
            return new yxj(messageCoreData, uri, this.c, alogVar, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" messageCoreData");
        }
        if (this.b == null) {
            sb.append(" messageUri");
        }
        if ((this.f & 1) == 0) {
            sb.append(" subId");
        }
        if (this.d == null) {
            sb.append(" recipients");
        }
        if ((this.f & 2) == 0) {
            sb.append(" isRetry");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.e = z;
        this.f = (byte) (this.f | 2);
    }

    public final void c(MessageCoreData messageCoreData) {
        if (messageCoreData != null) {
            this.a = messageCoreData;
            return;
        }
        throw new NullPointerException("Null messageCoreData");
    }

    public final void d(Uri uri) {
        if (uri != null) {
            this.b = uri;
            return;
        }
        throw new NullPointerException("Null messageUri");
    }

    public final void e(alog alogVar) {
        if (alogVar != null) {
            this.d = alogVar;
            return;
        }
        throw new NullPointerException("Null recipients");
    }

    public final void f(int i) {
        this.c = i;
        this.f = (byte) (this.f | 1);
    }
}
