package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ruu {
    public Optional a;
    public Optional b;
    public Optional c;
    public Optional d;
    public Optional e;
    private xhv f;
    private tqc g;
    private Optional h;
    private alog i;
    private boolean j;
    private boolean k;
    private int l;
    private Optional m;
    private long n;
    private boolean o;
    private boolean p;
    private Optional q;
    private Optional r;
    private boolean s;
    private byte t;
    private int u;
    private int v;

    public ruu() {
        throw null;
    }

    public final ruv a() {
        if ((this.t & 64) != 0) {
            if (this.p) {
                if (this.d.isEmpty()) {
                    ((alwl) ((alwl) ruv.a.i()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/GetOrCreateConversationParameters$Builder", "build", 223, "GetOrCreateConversationParameters.java")).q("Attempting to create a RCS group conversation without RCS group ID.");
                }
                if (this.e.isEmpty()) {
                    ((alwl) ((alwl) ruv.a.i()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/GetOrCreateConversationParameters$Builder", "build", 228, "GetOrCreateConversationParameters.java")).q("Attempting to create a RCS group conversation without RCS group self MSISDN.");
                }
            } else {
                this.r.isPresent();
            }
            if (this.t == -1 && this.f != null && this.g != null && this.i != null && this.u != 0 && this.v != 0) {
                return new ruv(this.f, this.g, this.a, this.h, this.i, this.j, this.k, this.b, this.l, this.m, this.n, this.c, this.o, this.u, this.p, this.d, this.q, this.e, this.r, this.s, this.v);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f == null) {
                sb.append(" threadId");
            }
            if (this.g == null) {
                sb.append(" archiveStatus");
            }
            if (this.i == null) {
                sb.append(" participants");
            }
            if ((this.t & 1) == 0) {
                sb.append(" notificationEnabled");
            }
            if ((this.t & 2) == 0) {
                sb.append(" notificationVibration");
            }
            if ((this.t & 4) == 0) {
                sb.append(" sourceType");
            }
            if ((this.t & 8) == 0) {
                sb.append(" joinState");
            }
            if ((this.t & 16) == 0) {
                sb.append(" rcsSessionId");
            }
            if ((this.t & 32) == 0) {
                sb.append(" hasBeenRestoredFromTelephony");
            }
            if (this.u == 0) {
                sb.append(" restorationSource");
            }
            if ((this.t & 64) == 0) {
                sb.append(" isRcsGroup");
            }
            if ((this.t & 128) == 0) {
                sb.append(" shouldTriggerCreationListeners");
            }
            if (this.v == 0) {
                sb.append(" conversationCreationSource");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new IllegalStateException("Property \"isRcsGroup\" has not been set");
    }

    public final void b(tqc tqcVar) {
        if (tqcVar != null) {
            this.g = tqcVar;
            return;
        }
        throw new NullPointerException("Null archiveStatus");
    }

    public final void c(String str) {
        this.c = Optional.of(str);
    }

    public final void d(Optional optional) {
        if (optional != null) {
            this.h = optional;
            return;
        }
        throw new NullPointerException("Null defaultSelfParticipant");
    }

    public final void e(boolean z) {
        this.o = z;
        this.t = (byte) (this.t | 32);
    }

    public final void f(boolean z) {
        this.p = z;
        this.t = (byte) (this.t | 64);
    }

    public final void g(int i) {
        this.l = i;
        this.t = (byte) (this.t | 8);
    }

    public final void h(boolean z) {
        this.j = z;
        this.t = (byte) (this.t | 1);
    }

    public final void i(boolean z) {
        this.k = z;
        this.t = (byte) (this.t | 2);
    }

    public final void j(List list) {
        this.i = alog.n(list);
    }

    public final void k(Optional optional) {
        if (optional != null) {
            this.q = optional;
            return;
        }
        throw new NullPointerException("Null rcsConferenceUri");
    }

    public final void l(String str) {
        this.q = Optional.of(str);
    }

    public final void m(Optional optional) {
        if (optional != null) {
            this.d = optional;
            return;
        }
        throw new NullPointerException("Null rcsGroupId");
    }

    public final void n(Optional optional) {
        if (optional != null) {
            this.e = optional;
            return;
        }
        throw new NullPointerException("Null rcsGroupSelfMsisdn");
    }

    public final void o(long j) {
        this.n = j;
        this.t = (byte) (this.t | 16);
    }

    public final void p(int i) {
        if (i != 0) {
            this.u = i;
            return;
        }
        throw new NullPointerException("Null restorationSource");
    }

    public final void q(boolean z) {
        this.s = z;
        this.t = (byte) (this.t | Byte.MIN_VALUE);
    }

    public final void r() {
        this.t = (byte) (this.t | 4);
    }

    public final void s(xhv xhvVar) {
        if (xhvVar != null) {
            this.f = xhvVar;
            return;
        }
        throw new NullPointerException("Null threadId");
    }

    public final void t(int i) {
        if (i != 0) {
            this.v = i;
            return;
        }
        throw new NullPointerException("Null conversationCreationSource");
    }

    public ruu(byte[] bArr) {
        this.a = Optional.empty();
        this.h = Optional.empty();
        this.b = Optional.empty();
        this.m = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.q = Optional.empty();
        this.e = Optional.empty();
        this.r = Optional.empty();
    }

    public ruu(ruv ruvVar) {
        this.a = Optional.empty();
        this.h = Optional.empty();
        this.b = Optional.empty();
        this.m = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.q = Optional.empty();
        this.e = Optional.empty();
        this.r = Optional.empty();
        this.f = ruvVar.b;
        this.g = ruvVar.c;
        this.a = ruvVar.d;
        this.h = ruvVar.e;
        this.i = ruvVar.f;
        this.j = ruvVar.g;
        this.k = ruvVar.h;
        this.b = ruvVar.i;
        this.l = ruvVar.j;
        this.m = ruvVar.k;
        this.n = ruvVar.l;
        this.c = ruvVar.m;
        this.o = ruvVar.n;
        this.u = ruvVar.u;
        this.p = ruvVar.o;
        this.d = ruvVar.p;
        this.q = ruvVar.q;
        this.e = ruvVar.r;
        this.r = ruvVar.s;
        this.s = ruvVar.t;
        this.v = ruvVar.v;
        this.t = (byte) -1;
    }
}
