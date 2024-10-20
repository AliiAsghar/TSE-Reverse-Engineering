package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_Message;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajqn {
    public alob a;
    public alog b;
    private String c;
    private RcsDestinationId d;
    private alob e;
    private alog f;
    private Optional g;
    private Optional h;
    private Optional i;
    private Optional j;

    public ajqn() {
        throw null;
    }

    public final Message a() {
        RcsDestinationId rcsDestinationId;
        alob alobVar = this.e;
        if (alobVar != null) {
            this.f = alobVar.g();
        } else if (this.f == null) {
            int i = alog.d;
            this.f = alsx.a;
        }
        alob alobVar2 = this.a;
        if (alobVar2 != null) {
            this.b = alobVar2.g();
        } else if (this.b == null) {
            int i2 = alog.d;
            this.b = alsx.a;
        }
        String str = this.c;
        if (str != null && (rcsDestinationId = this.d) != null) {
            return new AutoValue_Message(str, rcsDestinationId, this.f, this.g, this.h, this.b, this.i, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" id");
        }
        if (this.d == null) {
            sb.append(" sender");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(Message.MessageContent messageContent) {
        if (this.e == null) {
            if (this.f == null) {
                this.e = new alob();
            } else {
                alob alobVar = new alob();
                this.e = alobVar;
                alobVar.j(this.f);
                this.f = null;
            }
        }
        this.e.h(messageContent);
    }

    public final void c(alog alogVar) {
        if (alogVar != null) {
            if (this.e == null) {
                this.f = alogVar;
                return;
            }
            throw new IllegalStateException("Cannot set contents after calling contentsBuilder()");
        }
        throw new NullPointerException("Null contents");
    }

    public final void d(alpt alptVar) {
        this.j = Optional.of(alptVar);
    }

    public final void e(alog alogVar) {
        if (alogVar != null) {
            if (this.a == null) {
                this.b = alogVar;
                return;
            }
            throw new IllegalStateException("Cannot set extensionHeaders after calling extensionHeadersBuilder()");
        }
        throw new NullPointerException("Null extensionHeaders");
    }

    public final void f(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void g(boolean z) {
        this.i = Optional.of(Boolean.valueOf(z));
    }

    public final void h(RcsDestinationId rcsDestinationId) {
        this.h = Optional.of(rcsDestinationId);
    }

    public final void i(RcsDestinationId rcsDestinationId) {
        if (rcsDestinationId != null) {
            this.d = rcsDestinationId;
            return;
        }
        throw new NullPointerException("Null sender");
    }

    public final void j(Instant instant) {
        this.g = Optional.of(instant);
    }

    public ajqn(byte[] bArr) {
        this.g = Optional.empty();
        this.h = Optional.empty();
        this.i = Optional.empty();
        this.j = Optional.empty();
    }
}
