package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxk {
    public String a;
    private MessageCoreData b;
    private Uri c;
    private int d;
    private msh e;
    private boolean f;
    private byte g;

    public final yxl a() {
        MessageCoreData messageCoreData;
        Uri uri;
        msh mshVar;
        if (this.g == 3 && (messageCoreData = this.b) != null && (uri = this.c) != null && (mshVar = this.e) != null) {
            return new yxl(messageCoreData, uri, this.d, mshVar, this.a, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" messageCoreData");
        }
        if (this.c == null) {
            sb.append(" messageUri");
        }
        if ((this.g & 1) == 0) {
            sb.append(" subId");
        }
        if (this.e == null) {
            sb.append(" recipient");
        }
        if ((this.g & 2) == 0) {
            sb.append(" isRetry");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.f = z;
        this.g = (byte) (this.g | 2);
    }

    public final void c(MessageCoreData messageCoreData) {
        if (messageCoreData != null) {
            this.b = messageCoreData;
            return;
        }
        throw new NullPointerException("Null messageCoreData");
    }

    public final void d(Uri uri) {
        if (uri != null) {
            this.c = uri;
            return;
        }
        throw new NullPointerException("Null messageUri");
    }

    public final void e(msh mshVar) {
        if (mshVar != null) {
            this.e = mshVar;
            return;
        }
        throw new NullPointerException("Null recipient");
    }

    public final void f(int i) {
        this.d = i;
        this.g = (byte) (this.g | 1);
    }
}
