package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzb {
    public String A;
    public uyf B;
    public Optional C;
    private tqc D;
    private int E;
    private boolean F;
    private ConversationIdType G;
    private alhr H;
    private boolean I;
    private vvh J;
    private boolean K;
    private int L;
    private int M;
    private int N;
    private long O;
    private boolean P;
    private long Q;
    private long R;
    private boolean S;
    private boolean T;
    private int U;
    private int V;
    private long W;
    private int X;
    private int Y;
    private long Z;
    public String a;
    private SuperSortLabel aa;
    private boolean ab;
    private int ac;
    private boolean ad;
    private int ae;
    private boolean af;
    private int ag;
    private mmy ah;
    private boolean ai;
    private int aj;
    public String b;
    public String c;
    public Uri d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public MessageIdType j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public Uri s;
    public String t;
    public String u;
    public String v;
    public Function w;
    public aqcw x;
    public qhy y;
    public Optional z;

    public kzb() {
        throw null;
    }

    public final void A(int i) {
        this.V = i;
        this.aj |= 16384;
    }

    public final void B(long j) {
        this.W = j;
        this.aj |= 32768;
    }

    public final void C(int i) {
        this.ac = i;
        this.aj |= 1048576;
    }

    public final void D(int i) {
        this.X = i;
        this.aj |= 65536;
    }

    public final void E(int i) {
        this.Y = i;
        this.aj |= 131072;
    }

    public final void F(long j) {
        this.Z = j;
        this.aj |= 262144;
    }

    public final void G(int i) {
        this.ae = i;
        this.aj |= 4194304;
    }

    public final kzd a() {
        tqc tqcVar;
        ConversationIdType conversationIdType;
        alhr alhrVar;
        MessageIdType messageIdType;
        vvh vvhVar;
        Function function;
        SuperSortLabel superSortLabel;
        mmy mmyVar;
        if (this.aj == 67108863 && (tqcVar = this.D) != null && (conversationIdType = this.G) != null && (alhrVar = this.H) != null && (messageIdType = this.j) != null && (vvhVar = this.J) != null && (function = this.w) != null && (superSortLabel = this.aa) != null && (mmyVar = this.ah) != null) {
            return new kzd(tqcVar, this.a, this.E, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.F, conversationIdType, alhrVar, this.i, messageIdType, this.I, this.k, vvhVar, this.l, this.m, this.n, this.K, this.L, this.o, this.p, this.q, this.r, this.s, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.t, this.V, this.u, this.W, this.X, this.Y, this.v, this.Z, function, superSortLabel, this.ab, this.ac, this.x, this.y, this.z, this.A, this.B, this.C, this.ad, this.ae, this.af, this.ag, mmyVar, this.ai);
        }
        StringBuilder sb = new StringBuilder();
        if (this.D == null) {
            sb.append(" archiveStatus");
        }
        if ((this.aj & 1) == 0) {
            sb.append(" conversationType");
        }
        if ((this.aj & 2) == 0) {
            sb.append(" hasRbmBotRecipient");
        }
        if (this.G == null) {
            sb.append(" id_conversations");
        }
        if (this.H == null) {
            sb.append(" mapiConversationId");
        }
        if (this.j == null) {
            sb.append(" id_messages");
        }
        if ((this.aj & 4) == 0) {
            sb.append(" isEnterprise");
        }
        if (this.J == null) {
            sb.append(" groupUpgradeStatus");
        }
        if ((this.aj & 8) == 0) {
            sb.append(" notificationEnabled");
        }
        if ((this.aj & 16) == 0) {
            sb.append(" participantCount");
        }
        if ((this.aj & 32) == 0) {
            sb.append(" protocol");
        }
        if ((this.aj & 64) == 0) {
            sb.append(" rawTelephonyStatus");
        }
        if ((this.aj & 128) == 0) {
            sb.append(" rcsSessionId");
        }
        if ((this.aj & 256) == 0) {
            sb.append(" read");
        }
        if ((this.aj & 512) == 0) {
            sb.append(" receivedTimestamp");
        }
        if ((this.aj & 1024) == 0) {
            sb.append(" sentTimestamp");
        }
        if ((this.aj & 2048) == 0) {
            sb.append(" rcsSessionAllowsRevocation");
        }
        if ((this.aj & 4096) == 0) {
            sb.append(" showDraft");
        }
        if ((this.aj & 8192) == 0) {
            sb.append(" smsErrorCode");
        }
        if ((this.aj & 16384) == 0) {
            sb.append(" smsPriority");
        }
        if ((this.aj & 32768) == 0) {
            sb.append(" sortTimestamp");
        }
        if ((this.aj & 65536) == 0) {
            sb.append(" status");
        }
        if ((this.aj & 131072) == 0) {
            sb.append(" subId");
        }
        if ((this.aj & 262144) == 0) {
            sb.append(" triggerTime");
        }
        if (this.w == null) {
            sb.append(" getExpressionValueFunction");
        }
        if (this.aa == null) {
            sb.append(" label");
        }
        if ((this.aj & 524288) == 0) {
            sb.append(" pinStatus");
        }
        if ((this.aj & 1048576) == 0) {
            sb.append(" sourceType");
        }
        if ((this.aj & 2097152) == 0) {
            sb.append(" markedAsUnread");
        }
        if ((this.aj & 4194304) == 0) {
            sb.append(" unreadMessagesCount");
        }
        if ((this.aj & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) == 0) {
            sb.append(" hasMatrixParticipants");
        }
        if ((this.aj & 16777216) == 0) {
            sb.append(" joinState");
        }
        if (this.ah == null) {
            sb.append(" parentalApprovalStatus");
        }
        if ((this.aj & VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) == 0) {
            sb.append(" hasEmailDestination");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(tqc tqcVar) {
        if (tqcVar != null) {
            this.D = tqcVar;
            return;
        }
        throw new NullPointerException("Null archiveStatus");
    }

    public final void c(int i) {
        this.E = i;
        this.aj |= 1;
    }

    public final void d(vvh vvhVar) {
        if (vvhVar != null) {
            this.J = vvhVar;
            return;
        }
        throw new NullPointerException("Null groupUpgradeStatus");
    }

    public final void e(boolean z) {
        this.ai = z;
        this.aj |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
    }

    public final void f(boolean z) {
        this.af = z;
        this.aj |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
    }

    public final void g(boolean z) {
        this.F = z;
        this.aj |= 2;
    }

    public final void h(ConversationIdType conversationIdType) {
        if (conversationIdType != null) {
            this.G = conversationIdType;
            return;
        }
        throw new NullPointerException("Null id_conversations");
    }

    public final void i(boolean z) {
        this.I = z;
        this.aj |= 4;
    }

    public final void j(int i) {
        this.ag = i;
        this.aj |= 16777216;
    }

    public final void k(SuperSortLabel superSortLabel) {
        if (superSortLabel != null) {
            this.aa = superSortLabel;
            return;
        }
        throw new NullPointerException("Null label");
    }

    public final void l(alhr alhrVar) {
        if (alhrVar != null) {
            this.H = alhrVar;
            return;
        }
        throw new NullPointerException("Null mapiConversationId");
    }

    public final void m(boolean z) {
        this.ad = z;
        this.aj |= 2097152;
    }

    public final void n(boolean z) {
        this.K = z;
        this.aj |= 8;
    }

    public final void o(mmy mmyVar) {
        if (mmyVar != null) {
            this.ah = mmyVar;
            return;
        }
        throw new NullPointerException("Null parentalApprovalStatus");
    }

    public final void p(int i) {
        this.L = i;
        this.aj |= 16;
    }

    public final void q(boolean z) {
        this.ab = z;
        this.aj |= 524288;
    }

    public final void r(int i) {
        this.M = i;
        this.aj |= 32;
    }

    public final void s(int i) {
        this.N = i;
        this.aj |= 64;
    }

    public final void t(boolean z) {
        this.S = z;
        this.aj |= 2048;
    }

    public final void u(long j) {
        this.O = j;
        this.aj |= 128;
    }

    public final void v(boolean z) {
        this.P = z;
        this.aj |= 256;
    }

    public final void w(long j) {
        this.Q = j;
        this.aj |= 512;
    }

    public final void x(long j) {
        this.R = j;
        this.aj |= 1024;
    }

    public final void y(boolean z) {
        this.T = z;
        this.aj |= 4096;
    }

    public final void z(int i) {
        this.U = i;
        this.aj |= 8192;
    }

    public kzb(byte[] bArr) {
        this.z = Optional.empty();
        this.C = Optional.empty();
    }
}
