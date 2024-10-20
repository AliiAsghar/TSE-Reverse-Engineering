package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyk {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListUiAdapterImpl");
    public final jzf A;
    public final kfs B;
    public final kgz C;
    public final kgu D;
    public final lkd E;
    public final jxv F;
    public final kkc G;
    public final kjp H;
    public final ibi I;
    public final hmk J;
    public final lfl K;
    public final jat L;
    public final lfl M;
    public final ghw N;
    public final nei O;
    private final arwe P;
    private final arpi Q;
    private final armf R;
    private final armf S;
    private final armf T;
    private final List U;
    public final kgh b;
    public final khl c;
    public final khb d;
    public final Conversation e;
    public final arwe f;
    public final Context g;
    public final Set h;
    public final jxv i;
    public final armf j;
    public final ock k;
    public final obm l;
    public final jzr m;
    public final armf n;
    public final oyd o;
    public final armf p;
    public final oyh q;
    public final ajwt r;
    public final armf s;
    public final mjg t;
    public final ascd u;
    public final ascd v;
    public final arqr w;
    public final asai x;
    public final aeyk y;
    public final ascv z;

    public jyk(jat jatVar, jzf jzfVar, kgh kghVar, kfs kfsVar, khl khlVar, kkc kkcVar, kjp kjpVar, khb khbVar, lga lgaVar, lfl lflVar, kgz kgzVar, lfl lflVar2, ibi ibiVar, jxv jxvVar, kjc kjcVar, Conversation conversation, arwe arweVar, arwe arweVar2, arpi arpiVar, armf armfVar, Context context, lfl lflVar3, kjf kjfVar, asai asaiVar, kaq kaqVar, asai asaiVar2, asai asaiVar3, ConversationId conversationId, jzi jziVar, armf armfVar2, armf armfVar3, Set set, kgu kguVar, jxv jxvVar2, armf armfVar4, ock ockVar, obm obmVar, jzr jzrVar, ghw ghwVar, nei neiVar, hmk hmkVar, armf armfVar5, lkd lkdVar, oyd oydVar, armf armfVar6, oyh oyhVar, ajwt ajwtVar, armf armfVar7) {
        asai c;
        khlVar.getClass();
        kkcVar.getClass();
        kjpVar.getClass();
        khbVar.getClass();
        lgaVar.getClass();
        lflVar.getClass();
        kgzVar.getClass();
        lflVar2.getClass();
        jxvVar.getClass();
        kjcVar.getClass();
        conversation.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        arpiVar.getClass();
        armfVar.getClass();
        context.getClass();
        lflVar3.getClass();
        kjfVar.getClass();
        asaiVar.getClass();
        kaqVar.getClass();
        asaiVar2.getClass();
        asaiVar3.getClass();
        conversationId.getClass();
        jziVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        set.getClass();
        kguVar.getClass();
        jxvVar2.getClass();
        armfVar4.getClass();
        ockVar.getClass();
        obmVar.getClass();
        jzrVar.getClass();
        ghwVar.getClass();
        armfVar5.getClass();
        lkdVar.getClass();
        armfVar6.getClass();
        ajwtVar.getClass();
        armfVar7.getClass();
        this.L = jatVar;
        this.A = jzfVar;
        this.b = kghVar;
        this.B = kfsVar;
        this.c = khlVar;
        this.G = kkcVar;
        this.H = kjpVar;
        this.d = khbVar;
        this.M = lflVar;
        this.C = kgzVar;
        this.K = lflVar2;
        this.I = ibiVar;
        this.F = jxvVar;
        this.e = conversation;
        this.f = arweVar;
        this.P = arweVar2;
        this.Q = arpiVar;
        this.R = armfVar;
        this.g = context;
        this.S = armfVar3;
        this.h = set;
        this.D = kguVar;
        this.i = jxvVar2;
        this.j = armfVar4;
        this.k = ockVar;
        this.l = obmVar;
        this.m = jzrVar;
        this.N = ghwVar;
        this.O = neiVar;
        this.J = hmkVar;
        this.n = armfVar5;
        this.E = lkdVar;
        this.o = oydVar;
        this.p = armfVar6;
        this.q = oyhVar;
        this.r = ajwtVar;
        this.s = armfVar7;
        mjg b = conversation.b();
        this.t = b;
        this.u = ascy.a(null);
        this.v = ascy.a(false);
        qjh.l(arweVar, null, new jvr(kjfVar, this, (arpe) null, 9), 3);
        if (ymd.b()) {
            qjh.l(arweVar, arpiVar, new jks(this, (arpe) null, 5), 2);
        }
        this.T = armfVar2;
        this.w = new jsv(this, 12);
        mjd b2 = b.b();
        b2.getClass();
        kdp kdpVar = new kdp(asbm.a(new akee(new kdp(kfsVar.a(), b2, 3), new fzj((arpe) null, 5, (boolean[]) null), 10), new kfr(kfsVar, b2, (arpe) null, 0)), kfsVar, 4);
        Object b3 = armfVar2.b();
        b3.getClass();
        List B = aqjn.B(qkq.i(qkf.a(new akee((arqv) new fzs((arpe) null, 4, (int[]) null), (asai) kdpVar, 4), "MessageListPagingData")), qkq.i(qkf.a(khbVar.a(), "PagedMessageListUiAdapter::SelectionTracker")), qkq.i(qkf.a(kjfVar.a(), "PagedMessageListUiAdapter::CurrentResult")), qkq.i(qkf.a(kjfVar.b(), "PagedMessageListUiAdapter::SearchResults")), qkq.i(qkf.a(asar.a(new jxj(asaiVar, 3)), "PagedMessageListUiAdapter::ConversationProperties")), qkq.i(qkf.a(asar.a(new jxj(asaiVar3, 4)), "PagedMessageListUiAdapter::SelfIdentitiesCount")), qkq.i(qkf.a(kfsVar.e, "PagedMessageListUiAdapter::MessageIdWithLastReadMarker")), qkq.i(qkf.a(jziVar.a, "PagedMessageListUiAdapter::LastReadMarkerVisibility")), qkq.i(qkf.b(kjcVar.h, "PagedMessageListUiAdapter::PinchToZoomInteractionTracker")), qkq.i(qkf.a((asai) b3, "PagedMessageListUiAdapter::IsPenpalConversation")), qkq.i(qkf.a(asar.a(new jxj(kfsVar.f, 5)), "PagedMessageListUiAdapter::LatestReadMessageTimestamp")));
        this.U = B;
        long j = arut.a;
        Object b4 = armfVar.b();
        b4.getClass();
        long p = arsd.p(((Number) b4).longValue(), aruv.c);
        asai[] asaiVarArr = (asai[]) aqjn.ax(B).toArray(new asai[0]);
        int length = asaiVarArr.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = false;
        }
        int length2 = asaiVarArr.length;
        ArrayList arrayList = new ArrayList(length2);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            arrayList.add(new akee(asaiVarArr[i2], new jmk(zArr, i3, (arpe) null, 2, (char[]) null), 10));
            i2++;
            i3++;
        }
        this.x = new jxj(new jxj(new jdn(new akee((arqv) new jmo(arweVar, p, asaiVarArr, zArr, (arpe) null, 2, (char[]) null), (asai) new idx((asai[]) aqjn.ax(arrayList).toArray(new asai[0]), this, 19), 4), kaqVar.b, new jrw((arpe) null, 3, (short[]) null), 17, null), 2), 6);
        aeyk aeykVar = new aeyk(false, gvf.P(this.g, R.string.conversation_scroll_to_bottom_button_content_description, "count", 0), b(0, this.g), new jyb(this, 3));
        this.y = aeykVar;
        c = lflVar3.c(jza.b);
        asai a2 = asar.a(new jdn(c, asaiVar2, new jye(this, null), 17, null));
        arwe arweVar3 = this.f;
        int i4 = ascp.a;
        this.z = arrn.T(a2, arweVar3, asco.a(0L, 3), aeykVar);
    }

    public static final String b(int i, Context context) {
        if (i != 0) {
            if (i != 1) {
                return context.getString(R.string.unread_messages, Integer.valueOf(i));
            }
            return context.getString(R.string.unread_message, Integer.valueOf(i));
        }
        return null;
    }

    public final void a(jzj jzjVar) {
        alvi alviVar = a;
        ((alvg) alviVar.g().h("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListUiAdapterImpl", "onBottomReachedV2", 501, "PagedMessageListUiAdapterImpl.kt")).q("Bottom reached, maybe marking messages as read");
        if (jzjVar != null) {
            if (jzjVar instanceof jzx) {
                jzx jzxVar = (jzx) jzjVar;
                if (jzxVar.c.r() == 1) {
                    ((alvg) alviVar.e().h("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListUiAdapterImpl", "onBottomReachedV2", 515, "PagedMessageListUiAdapterImpl.kt")).t("Skipped marking as read: waiting until %s is interactable", jzxVar.f);
                    return;
                }
            }
            qjh.l(this.P, null, new jpc(this, (arpe) null, 20, (char[]) null), 3);
        }
    }
}
