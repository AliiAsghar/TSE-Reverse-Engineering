package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mlx {
    private mod A;
    private mmy B;
    private boolean C;
    private vvh D;
    public ConversationId a;
    public String b;
    public String c;
    public String d;
    public nfw e;
    public Uri f;
    public String g;
    public Instant h;
    public mnk i;
    public utk j;
    public boolean k;
    public boolean l;
    public short m;
    private boolean n;
    private tqc o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private boolean u;
    private qpd v;
    private int w;
    private amjj x;
    private long y;
    private boolean z;

    public final mly a() {
        ConversationId conversationId;
        tqc tqcVar;
        qpd qpdVar;
        amjj amjjVar;
        mod modVar;
        mmy mmyVar;
        vvh vvhVar;
        utk utkVar;
        if (this.m == 8191 && (conversationId = this.a) != null && (tqcVar = this.o) != null && (qpdVar = this.v) != null && (amjjVar = this.x) != null && (modVar = this.A) != null && (mmyVar = this.B) != null && (vvhVar = this.D) != null && (utkVar = this.j) != null) {
            return new mly(conversationId, this.n, tqcVar, this.p, this.q, this.r, this.s, this.b, this.t, this.u, qpdVar, this.w, amjjVar, this.c, this.d, this.e, this.f, this.y, this.g, this.h, this.i, this.z, modVar, mmyVar, this.C, vvhVar, utkVar, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if ((this.m & 1) == 0) {
            sb.append(" nameIsAutomatic");
        }
        if (this.o == null) {
            sb.append(" archiveStatus");
        }
        if ((this.m & 2) == 0) {
            sb.append(" deleted");
        }
        if ((this.m & 4) == 0) {
            sb.append(" isUnread");
        }
        if ((this.m & 8) == 0) {
            sb.append(" isEncrypted");
        }
        if ((this.m & 16) == 0) {
            sb.append(" wasPreviouslyEncrypted");
        }
        if ((this.m & 32) == 0) {
            sb.append(" conversationType");
        }
        if ((this.m & 64) == 0) {
            sb.append(" hasRbmBotRecipient");
        }
        if (this.v == null) {
            sb.append(" errorState");
        }
        if ((this.m & 128) == 0) {
            sb.append(" joinState");
        }
        if (this.x == null) {
            sb.append(" sendMode");
        }
        if ((this.m & 256) == 0) {
            sb.append(" rcsChatSessionId");
        }
        if ((this.m & 512) == 0) {
            sb.append(" sessionAllowsRevocation");
        }
        if (this.A == null) {
            sb.append(" palMode");
        }
        if (this.B == null) {
            sb.append(" parentalApprovalStatus");
        }
        if ((this.m & 1024) == 0) {
            sb.append(" canRemovePeople");
        }
        if (this.D == null) {
            sb.append(" mmsGroupUpgradeStatus");
        }
        if (this.j == null) {
            sb.append(" encryptionProtocol");
        }
        if ((this.m & 2048) == 0) {
            sb.append(" longPressActionsEnabled");
        }
        if ((this.m & 4096) == 0) {
            sb.append(" shouldShowSimName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(tqc tqcVar) {
        if (tqcVar != null) {
            this.o = tqcVar;
            return;
        }
        throw new NullPointerException("Null archiveStatus");
    }

    public final void c(boolean z) {
        this.C = z;
        this.m = (short) (this.m | 1024);
    }

    public final void d(int i) {
        this.t = i;
        this.m = (short) (this.m | 32);
    }

    public final void e(boolean z) {
        this.p = z;
        this.m = (short) (this.m | 2);
    }

    public final void f(qpd qpdVar) {
        if (qpdVar != null) {
            this.v = qpdVar;
            return;
        }
        throw new NullPointerException("Null errorState");
    }

    public final void g(boolean z) {
        this.u = z;
        this.m = (short) (this.m | 64);
    }

    public final void h(boolean z) {
        this.r = z;
        this.m = (short) (this.m | 8);
    }

    public final void i(boolean z) {
        this.q = z;
        this.m = (short) (this.m | 4);
    }

    public final void j(int i) {
        this.w = i;
        this.m = (short) (this.m | 128);
    }

    public final void k(vvh vvhVar) {
        if (vvhVar != null) {
            this.D = vvhVar;
            return;
        }
        throw new NullPointerException("Null mmsGroupUpgradeStatus");
    }

    public final void l(boolean z) {
        this.n = z;
        this.m = (short) (this.m | 1);
    }

    public final void m(mod modVar) {
        if (modVar != null) {
            this.A = modVar;
            return;
        }
        throw new NullPointerException("Null palMode");
    }

    public final void n(mmy mmyVar) {
        if (mmyVar != null) {
            this.B = mmyVar;
            return;
        }
        throw new NullPointerException("Null parentalApprovalStatus");
    }

    public final void o(long j) {
        this.y = j;
        this.m = (short) (this.m | 256);
    }

    public final void p(amjj amjjVar) {
        if (amjjVar != null) {
            this.x = amjjVar;
            return;
        }
        throw new NullPointerException("Null sendMode");
    }

    public final void q(boolean z) {
        this.z = z;
        this.m = (short) (this.m | 512);
    }

    public final void r(boolean z) {
        this.s = z;
        this.m = (short) (this.m | 16);
    }
}
