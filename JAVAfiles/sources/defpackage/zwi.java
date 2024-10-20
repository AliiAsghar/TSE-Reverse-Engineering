package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwi implements zsq {
    public static final xze a = xze.g("Bugle", "UnblockUnspamBanner2o");
    public final cg b;
    public final Context c;
    public final akbo d;
    public final aksr e;
    public final zsl f;
    public final ConversationIdType g;
    public ztr h;
    public tqc i;
    public ParticipantsTable.BindData j;
    public ParticipantsTable.BindData k;
    public final akbp l = new akbp<Void, apdj<xxn>>() { // from class: zwi.1
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            zwi.a.q("Error unblock/unspam participant for conversationId: ".concat(String.valueOf(String.valueOf(zwi.this.g))));
            zwi.this.h.f(true);
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void c(Object obj, Object obj2) {
            boolean z;
            int i;
            amfe amfeVar;
            int i2;
            zwi zwiVar = zwi.this;
            zwiVar.f.a(zwiVar, false);
            xxn xxnVar = (xxn) ((apdj) obj2).a(xxn.a, aozs.a());
            if (!zwi.i(zwi.this.j)) {
                int i3 = xxnVar.b;
                if ((i3 & 16) == 0 && (i3 & 1) == 0 && (i3 & 2) == 0) {
                    return;
                }
                zwi zwiVar2 = zwi.this;
                ParticipantsTable.BindData bindData = zwiVar2.j;
                boolean R = bindData.R();
                if (bindData.T() && yyb.G(bindData.m()).c()) {
                    z = true;
                } else {
                    z = false;
                }
                if (R) {
                    if (z) {
                        i = R.string.unblock_unspam_snackbar;
                    } else {
                        i = R.string.unblock_snackbar;
                    }
                } else {
                    i = R.string.unspam_snackbar;
                }
                if (bindData.R()) {
                    amfeVar = amfe.CONVERSATION_FROM_UNBLOCK_ACTION;
                } else {
                    amfeVar = amfe.CONVERSATION_FROM_UNSPAM_ACTION;
                }
                amfe amfeVar2 = amfeVar;
                if (true != bindData.R()) {
                    i2 = 13;
                } else {
                    i2 = 12;
                }
                int i4 = i2;
                String O = bindData.O();
                if (O == null) {
                    zwi.a.q("Failed to set display destination in snackbar message for unblock/unspam banner because normalized destination is null");
                    O = "";
                }
                aktp.K(new zwh(zwiVar2.c.getString(i, O), zwiVar2.c.getString(R.string.unblock_unspam_snack_bar_undo), new mib(zwiVar2, amfeVar2, xxnVar, i4, 5, null)), zwiVar2.b);
                return;
            }
            zwi zwiVar3 = zwi.this;
            Context context = zwiVar3.c;
            aktp.K(new zwh(context.getString(R.string.unarchive_conversation_snackbar), context.getString(R.string.unblock_unspam_snack_bar_undo), new zom(zwiVar3, 15)), zwiVar3.b);
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final akbp m = new akbp<Void, Boolean>() { // from class: zwi.2
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            zwi.a.q("Error undoing unblock/unspam: ".concat(String.valueOf(String.valueOf(zwi.this.g))));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public int n;
    public final zwt o;
    private final enh p;
    private final zlc q;
    private final aohs r;

    public zwi(cg cgVar, Context context, enh enhVar, zlc zlcVar, akbo akboVar, aohs aohsVar, zwt zwtVar, aksr aksrVar, zsl zslVar, ConversationIdType conversationIdType) {
        this.b = cgVar;
        this.c = context;
        this.p = enhVar;
        this.d = akboVar;
        this.r = aohsVar;
        this.o = zwtVar;
        this.e = aksrVar;
        this.f = zslVar;
        this.g = conversationIdType;
        this.q = zlcVar;
    }

    public static boolean i(ParticipantsTable.BindData bindData) {
        if (bindData == null) {
            return true;
        }
        if (!bindData.T() && !bindData.R()) {
            return true;
        }
        return false;
    }

    private final void j() {
        this.h.m(this.c.getString(R.string.unspam_banner_title_v2));
        this.h.q(R.drawable.safer_with_google_shield, OptionalInt.empty());
        this.h.g(this.c.getString(R.string.unspam_banner_end_button));
    }

    @Override // defpackage.zsq
    public final zsm a() {
        return new zsm("UnblockUnspamBanner2o", true);
    }

    @Override // defpackage.zsq
    public final void f() {
        this.d.b(this.l);
        this.d.b(this.m);
    }

    @Override // defpackage.zsq
    public final void g() {
        zwt zwtVar = this.o;
        sne sneVar = zwtVar.g;
        if (sneVar != null) {
            sneVar.G(zwtVar.h);
        }
        enh enhVar = this.p;
        ConversationIdType conversationIdType = this.g;
        snf e = sni.e();
        e.w("setupConversationsQuery");
        e.f(new zkf(11));
        e.h(new zvp(conversationIdType, 2));
        zwtVar.g = e.b();
        zwtVar.h = new zwr(zwtVar, conversationIdType);
        zwtVar.g.F(enhVar, zwtVar.h);
        tay tayVar = zwtVar.e;
        if (tayVar != null) {
            tayVar.G(zwtVar.f);
        }
        zwtVar.e = ush.g(conversationIdType);
        zwtVar.f = new zws(zwtVar, conversationIdType);
        zwtVar.e.F(enhVar, zwtVar.f);
        this.r.C(new akfk(zwtVar.k, new izd(zwtVar, conversationIdType, 16, null), "UNBLOCK_UNSPAM_BANNER_STATE_KEY".concat(String.valueOf(String.valueOf(conversationIdType))), 2), new akgh<zwq>() { // from class: zwi.3
            @Override // defpackage.akgh
            public final void a(Throwable th) {
                zwi.a.q("Error getting get unblock/unspam banner loaded data, conversationId: ".concat(String.valueOf(String.valueOf(zwi.this.g))));
                zwi zwiVar = zwi.this;
                zwiVar.f.a(zwiVar, false);
            }

            @Override // defpackage.akgh
            public final /* synthetic */ void c(Object obj) {
                boolean z;
                zwq zwqVar = (zwq) obj;
                int i = zwqVar.c;
                zwi zwiVar = zwi.this;
                zwiVar.n = i;
                zwiVar.k = zwqVar.a;
                zwiVar.i = zwqVar.b;
                if (i != 5) {
                    z = true;
                } else {
                    z = false;
                }
                zwiVar.f.a(zwiVar, z);
            }

            @Override // defpackage.akgh
            public final void b() {
            }
        });
    }

    @Override // defpackage.zsq
    public final aabr h() {
        ztr a2 = this.q.a(this.c);
        this.h = a2;
        int i = this.n;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        albo.T(this.i.g());
                        this.h.e(this.c.getString(R.string.unspam_banner_description));
                        j();
                        this.h.m(this.c.getString(R.string.unspam_detected_title_v2));
                        this.h.d(this.c.getString(R.string.unspam_detected_body_v2));
                    } else {
                        throw new IllegalArgumentException("Unsupported BannerType: ".concat(aabr.aA(i)));
                    }
                } else {
                    a2.e(this.c.getString(R.string.unspam_banner_description));
                    j();
                    this.h.d(this.c.getString(R.string.unspam_banner_body_v3));
                }
            } else {
                a2.e(this.c.getString(R.string.unblock_banner_description));
                this.h.m(this.c.getString(R.string.unblock_banner_title));
                this.h.h(R.drawable.quantum_gm_ic_do_not_disturb_black_24, ahnz.f(this.c, R.attr.colorOnSurfaceVariant, "UnblockUnspamBanner2o"));
                this.h.d(this.c.getString(R.string.unblock_banner_body_v2));
                this.h.g(this.c.getString(R.string.unblock_banner_positive_button));
            }
            ztr ztrVar = this.h;
            ztrVar.x = false;
            ztrVar.r();
            this.h.j(new ztv(this, 13));
            return this.h;
        }
        throw null;
    }

    @Override // defpackage.zsq
    public final void b() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void e() {
    }
}
