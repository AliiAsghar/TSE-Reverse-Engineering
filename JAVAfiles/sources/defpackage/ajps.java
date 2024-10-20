package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_MessagingResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajps {
    public int a;
    private int b;
    private byte c;
    private Object d;

    public final MessagingResult a() {
        boolean z = true;
        if (this.c == 3 && this.d != null) {
            AutoValue_MessagingResult autoValue_MessagingResult = new AutoValue_MessagingResult(this.b, this.a, (Duration) this.d);
            int i = autoValue_MessagingResult.a;
            if (i == 0 || i == 1) {
                if (autoValue_MessagingResult.b != 0) {
                    z = false;
                }
                albo.U(z, "ErrorCause should be UNKNOWN");
                albo.U(autoValue_MessagingResult.c.isZero(), "retryAfter should be 0");
            }
            return autoValue_MessagingResult;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" errorCode");
        }
        if ((this.c & 2) == 0) {
            sb.append(" errorCause");
        }
        if (this.d == null) {
            sb.append(" retryAfter");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.a = i;
        this.c = (byte) (this.c | 2);
    }

    public final void c(int i) {
        this.b = i;
        this.c = (byte) (this.c | 1);
    }

    public final void d(Duration duration) {
        if (duration != null) {
            this.d = duration;
            return;
        }
        throw new NullPointerException("Null retryAfter");
    }

    public final adqv e() {
        if (this.c == 3 && this.d != null) {
            return new adqv(this.b, this.a, (Duration) this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" type");
        }
        if ((this.c & 2) == 0) {
            sb.append(" reason");
        }
        if (this.d == null) {
            sb.append(" retryAfter");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(int i) {
        this.a = i;
        this.c = (byte) (this.c | 2);
    }

    public final void g(Duration duration) {
        if (duration != null) {
            this.d = duration;
            return;
        }
        throw new NullPointerException("Null retryAfter");
    }

    public final void h(int i) {
        this.b = i;
        this.c = (byte) (this.c | 1);
    }

    public final void i() {
        this.d = "";
    }

    public final void j() {
        this.c = (byte) 1;
    }

    public final void k() {
        this.b = 1;
    }

    public final void l() {
        if (this.c == 1 && this.d != null && this.a != 0 && this.b != 0) {
            int i = acch.a;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" fileOwner");
        }
        if (this.c == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.a == 0) {
            sb.append(" fileChecks");
        }
        if (this.b == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
