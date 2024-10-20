package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikk {
    public ConversationIdType a;
    public String b;
    public String c;
    public String d;
    public Optional e;
    public String f;
    public String g;
    private tqc h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private long o;
    private int p;
    private boolean q;
    private xhv r;
    private boolean s;
    private qpd t;
    private boolean u;
    private mmy v;
    private Optional w;
    private short x;

    public ikk() {
        throw null;
    }

    public final ikl a() {
        tqc tqcVar;
        ConversationIdType conversationIdType;
        xhv xhvVar;
        qpd qpdVar;
        mmy mmyVar;
        if (this.x == 2047 && (tqcVar = this.h) != null && (conversationIdType = this.a) != null && (xhvVar = this.r) != null && (qpdVar = this.t) != null && (mmyVar = this.v) != null) {
            return new ikl(tqcVar, conversationIdType, this.i, this.j, this.k, this.l, this.m, this.b, this.c, this.d, this.n, this.e, this.o, this.p, this.q, this.f, this.g, xhvVar, this.s, qpdVar, this.u, mmyVar, this.w);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == null) {
            sb.append(" archiveStatus");
        }
        if (this.a == null) {
            sb.append(" conversationId");
        }
        if ((this.x & 1) == 0) {
            sb.append(" conversationType");
        }
        if ((this.x & 2) == 0) {
            sb.append(" shouldEncryptDrafts");
        }
        if ((this.x & 4) == 0) {
            sb.append(" hasRbmBotRecipient");
        }
        if ((this.x & 8) == 0) {
            sb.append(" includeEmailAddress");
        }
        if ((this.x & 16) == 0) {
            sb.append(" joinState");
        }
        if ((this.x & 32) == 0) {
            sb.append(" nameIsAutomatic");
        }
        if ((this.x & 64) == 0) {
            sb.append(" rcsSessionId");
        }
        if ((this.x & 128) == 0) {
            sb.append(" sendMode");
        }
        if ((this.x & 256) == 0) {
            sb.append(" isValid");
        }
        if (this.r == null) {
            sb.append(" smsThreadId");
        }
        if ((this.x & 512) == 0) {
            sb.append(" awaitingReverseSync");
        }
        if (this.t == null) {
            sb.append(" errorState");
        }
        if ((this.x & 1024) == 0) {
            sb.append(" hasBeenE2ee");
        }
        if (this.v == null) {
            sb.append(" conversationParentalApprovalStatus");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(tqc tqcVar) {
        if (tqcVar != null) {
            this.h = tqcVar;
            return;
        }
        throw new NullPointerException("Null archiveStatus");
    }

    public final void c(boolean z) {
        this.s = z;
        this.x = (short) (this.x | 512);
    }

    public final void d(mmy mmyVar) {
        if (mmyVar != null) {
            this.v = mmyVar;
            return;
        }
        throw new NullPointerException("Null conversationParentalApprovalStatus");
    }

    public final void e(int i) {
        this.i = i;
        this.x = (short) (this.x | 1);
    }

    public final void f(qpd qpdVar) {
        if (qpdVar != null) {
            this.t = qpdVar;
            return;
        }
        throw new NullPointerException("Null errorState");
    }

    public final void g(boolean z) {
        this.u = z;
        this.x = (short) (this.x | 1024);
    }

    public final void h(boolean z) {
        this.k = z;
        this.x = (short) (this.x | 4);
    }

    public final void i(boolean z) {
        this.l = z;
        this.x = (short) (this.x | 8);
    }

    public final void j(boolean z) {
        this.q = z;
        this.x = (short) (this.x | 256);
    }

    public final void k(int i) {
        this.m = i;
        this.x = (short) (this.x | 16);
    }

    public final void l(boolean z) {
        this.n = z;
        this.x = (short) (this.x | 32);
    }

    public final void m(Optional optional) {
        if (optional != null) {
            this.w = optional;
            return;
        }
        throw new NullPointerException("Null rcsGroupLastSyncTimestamp");
    }

    public final void n(long j) {
        this.o = j;
        this.x = (short) (this.x | 64);
    }

    public final void o(int i) {
        this.p = i;
        this.x = (short) (this.x | 128);
    }

    public final void p(boolean z) {
        this.j = z;
        this.x = (short) (this.x | 2);
    }

    public final void q(xhv xhvVar) {
        if (xhvVar != null) {
            this.r = xhvVar;
            return;
        }
        throw new NullPointerException("Null smsThreadId");
    }

    public ikk(byte[] bArr) {
        this.e = Optional.empty();
        this.w = Optional.empty();
    }
}
