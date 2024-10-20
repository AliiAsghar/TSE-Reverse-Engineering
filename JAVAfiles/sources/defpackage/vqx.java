package defpackage;

import android.os.Bundle;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vqx {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public GroupInfo g;
    public apwq h;
    public LocationInformation i;
    private rve j;
    private String k;
    private qei l;
    private qei m;
    private boolean n;
    private long o;
    private long p;
    private long q;
    private int r;
    private boolean s;
    private int t;
    private Bundle u;
    private boolean v;
    private boolean w;
    private short x;

    public final vqy a() {
        rve rveVar;
        String str;
        qei qeiVar;
        qei qeiVar2;
        Bundle bundle;
        if (this.x == 511 && (rveVar = this.j) != null && (str = this.k) != null && (qeiVar = this.l) != null && (qeiVar2 = this.m) != null && (bundle = this.u) != null) {
            return new vqy(rveVar, str, qeiVar, qeiVar2, this.a, this.b, this.n, this.c, this.d, this.o, this.p, this.e, this.q, this.f, this.g, this.r, this.s, this.h, this.i, this.t, bundle, this.v, this.w);
        }
        StringBuilder sb = new StringBuilder();
        if (this.j == null) {
            sb.append(" rcsMessageId");
        }
        if (this.k == null) {
            sb.append(" remoteUserId");
        }
        if (this.l == null) {
            sb.append(" remoteChatEndpoint");
        }
        if (this.m == null) {
            sb.append(" selfChatEndpoint");
        }
        if ((this.x & 1) == 0) {
            sb.append(" isGroup");
        }
        if ((this.x & 2) == 0) {
            sb.append(" sentTimestamp");
        }
        if ((this.x & 4) == 0) {
            sb.append(" receivedTimestamp");
        }
        if ((this.x & 8) == 0) {
            sb.append(" rcsSessionId");
        }
        if ((this.x & 16) == 0) {
            sb.append(" spamVerdict");
        }
        if ((this.x & 32) == 0) {
            sb.append(" isMarkedAsBot");
        }
        if ((this.x & 64) == 0) {
            sb.append(" messageStatus");
        }
        if (this.u == null) {
            sb.append(" additionalMessageDetails");
        }
        if ((this.x & 128) == 0) {
            sb.append(" isDeliveryReportRequested");
        }
        if ((this.x & 256) == 0) {
            sb.append(" isDisplayReportRequested");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.u = bundle;
            return;
        }
        throw new NullPointerException("Null additionalMessageDetails");
    }

    public final void c(boolean z) {
        this.v = z;
        this.x = (short) (this.x | 128);
    }

    public final void d(boolean z) {
        this.w = z;
        this.x = (short) (this.x | 256);
    }

    public final void e(boolean z) {
        this.n = z;
        this.x = (short) (this.x | 1);
    }

    public final void f(boolean z) {
        this.s = z;
        this.x = (short) (this.x | 32);
    }

    public final void g(int i) {
        this.t = i;
        this.x = (short) (this.x | 64);
    }

    public final void h(rve rveVar) {
        if (rveVar != null) {
            this.j = rveVar;
            return;
        }
        throw new NullPointerException("Null rcsMessageId");
    }

    public final void i(long j) {
        this.q = j;
        this.x = (short) (this.x | 8);
    }

    public final void j(long j) {
        this.p = j;
        this.x = (short) (this.x | 4);
    }

    public final void k(qei qeiVar) {
        if (qeiVar != null) {
            this.l = qeiVar;
            return;
        }
        throw new NullPointerException("Null remoteChatEndpoint");
    }

    public final void l(String str) {
        if (str != null) {
            this.k = str;
            return;
        }
        throw new NullPointerException("Null remoteUserId");
    }

    public final void m(qei qeiVar) {
        if (qeiVar != null) {
            this.m = qeiVar;
            return;
        }
        throw new NullPointerException("Null selfChatEndpoint");
    }

    public final void n(long j) {
        this.o = j;
        this.x = (short) (this.x | 2);
    }

    public final void o(int i) {
        this.r = i;
        this.x = (short) (this.x | 16);
    }
}
