package defpackage;

import android.app.Notification;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class une {
    public gsf a;
    public Notification b;
    public amdy c;
    public Duration d;
    public Optional e;
    private unv f;
    private int g;
    private int h;
    private long i;
    private gry j;
    private boolean k;
    private byte l;

    public une() {
        throw null;
    }

    public final unf a() {
        unf b = b();
        gsf gsfVar = b.b;
        if (((Boolean) ((utz) unf.a.get()).e()).booleanValue() && gsfVar != null && !gsf.a.equals(gsfVar) && b.c != unv.WORKMANAGER_ONLY && !((Boolean) ((utz) xxy.l.get()).e()).booleanValue()) {
            throw new IllegalArgumentException("constraints only work with work manager, use KeepAliveStrategy.WORKMANAGER_ONLY");
        }
        return b;
    }

    public final unf b() {
        if (this.l == 15 && this.f != null && this.j != null) {
            return new unf(this.a, this.f, this.g, this.h, this.i, this.j, this.b, this.c, this.d, this.k, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" keepAliveStrategy");
        }
        if ((this.l & 1) == 0) {
            sb.append(" maxRowsPerBatch");
        }
        if ((this.l & 2) == 0) {
            sb.append(" maxAttemptsPerItem");
        }
        if ((this.l & 4) == 0) {
            sb.append(" retryDelayMillis");
        }
        if (this.j == null) {
            sb.append(" retryBackoffPolicy");
        }
        if ((this.l & 8) == 0) {
            sb.append(" optInForSchedulerMigration");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(unv unvVar) {
        if (unvVar != null) {
            this.f = unvVar;
            return;
        }
        throw new NullPointerException("Null keepAliveStrategy");
    }

    public final void d(int i) {
        this.h = i;
        this.l = (byte) (this.l | 2);
    }

    public final void e(int i) {
        this.g = i;
        this.l = (byte) (this.l | 1);
    }

    public final void f(boolean z) {
        this.k = z;
        this.l = (byte) (this.l | 8);
    }

    public final void g(gry gryVar) {
        if (gryVar != null) {
            this.j = gryVar;
            return;
        }
        throw new NullPointerException("Null retryBackoffPolicy");
    }

    public final void h(long j) {
        this.i = j;
        this.l = (byte) (this.l | 4);
    }

    public une(byte[] bArr) {
        this.e = Optional.empty();
    }
}
