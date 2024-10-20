package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_MessageClass;
import com.google.android.rcs.client.messaging.data.MessageClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajqr {
    private ajqt a;
    private ajqs b;
    private boolean c;
    private boolean d;
    private byte e;

    public final MessageClass a() {
        if (this.e == 3 && this.a != null && this.b != null) {
            return new AutoValue_MessageClass(this.a, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" messageSource");
        }
        if (this.b == null) {
            sb.append(" messagePriority");
        }
        if ((this.e & 1) == 0) {
            sb.append(" interworkingSupported");
        }
        if ((this.e & 2) == 0) {
            sb.append(" dispositionNotificationRequired");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.d = z;
        this.e = (byte) (this.e | 2);
    }

    public final void c(boolean z) {
        this.c = z;
        this.e = (byte) (this.e | 1);
    }

    public final void d(ajqs ajqsVar) {
        if (ajqsVar != null) {
            this.b = ajqsVar;
            return;
        }
        throw new NullPointerException("Null messagePriority");
    }

    public final void e(ajqt ajqtVar) {
        if (ajqtVar != null) {
            this.a = ajqtVar;
            return;
        }
        throw new NullPointerException("Null messageSource");
    }
}
