package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mkw {
    public Optional a;
    public Optional b;
    public Optional c;
    public Optional d;
    public Optional e;
    public Optional f;
    public int g;
    private MessageIdType h;
    private Optional i;
    private Optional j;
    private boolean k;
    private amlg l;
    private int m;
    private Optional n;
    private boolean o;
    private byte p;

    public mkw() {
        throw null;
    }

    public final mkz a() {
        MessageIdType messageIdType;
        amlg amlgVar;
        if (this.p == 7 && (messageIdType = this.h) != null && (amlgVar = this.l) != null && this.g != 0) {
            return new mkz(messageIdType, this.i, this.j, this.a, this.b, this.c, this.k, amlgVar, this.m, this.n, this.d, this.e, this.o, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == null) {
            sb.append(" messageId");
        }
        if ((this.p & 1) == 0) {
            sb.append(" notified");
        }
        if (this.l == null) {
            sb.append(" reason");
        }
        if (this.g == 0) {
            sb.append(" canFallback");
        }
        if ((this.p & 2) == 0) {
            sb.append(" terminalStatus");
        }
        if ((this.p & 4) == 0) {
            sb.append(" logEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.o = z;
        this.p = (byte) (this.p | 4);
    }

    public final void c(MessageIdType messageIdType) {
        if (messageIdType != null) {
            this.h = messageIdType;
            return;
        }
        throw new NullPointerException("Null messageId");
    }

    public final void d(boolean z) {
        this.k = z;
        this.p = (byte) (this.p | 1);
    }

    public final void e(int i) {
        this.j = Optional.of(Integer.valueOf(i));
    }

    public final void f(rve rveVar) {
        this.i = Optional.of(rveVar);
    }

    public final void g(amlg amlgVar) {
        if (amlgVar != null) {
            this.l = amlgVar;
            return;
        }
        throw new NullPointerException("Null reason");
    }

    public final void h(int i) {
        this.m = i;
        this.p = (byte) (this.p | 2);
    }

    public final void i(Instant instant) {
        this.n = Optional.of(instant);
    }

    public mkw(byte[] bArr) {
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.a = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.n = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
    }
}
