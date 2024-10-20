package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvs implements zsq {
    public static final xze a = xze.g("Bugle", "SpamBanner2o");
    public final armf b;
    public final armf c;
    public final zsl d;
    public final ConversationIdType e;
    public ParticipantsTable.BindData g;
    private final Context h;
    private final enh i;
    private final anen j;
    private final akbo k;
    private ztr l;
    private final zwb n;
    private final zlc o;
    private final aohs p;
    public boolean f = false;
    private final akbp m = new akbp<apdj<amyx>, Void>() { // from class: zvs.1
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            zvs.a.q("Error updating as not spam, conversationId: ".concat(String.valueOf(String.valueOf(zvs.this.e))));
            zvs zvsVar = zvs.this;
            zvsVar.d.a(zvsVar, false);
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            zvs zvsVar = zvs.this;
            zvsVar.d.a(zvsVar, false);
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };

    public zvs(Context context, enh enhVar, zwb zwbVar, zlc zlcVar, akbo akboVar, aohs aohsVar, armf armfVar, armf armfVar2, anen anenVar, zsl zslVar, ConversationIdType conversationIdType) {
        this.h = context;
        this.i = enhVar;
        this.k = akboVar;
        this.p = aohsVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.j = anenVar;
        this.d = zslVar;
        this.e = conversationIdType;
        this.n = zwbVar;
        this.o = zlcVar;
    }

    @Override // defpackage.zsq
    public final zsm a() {
        return new zsm("SpamBanner2o", ((Boolean) zvv.a.e()).booleanValue());
    }

    @Override // defpackage.zsq
    public final void b() {
        qiu.h(aktp.ai(new ytr(this, 8), this.j));
    }

    @Override // defpackage.zsq
    public final void f() {
        this.k.b(this.m);
        ((igz) this.b.b()).c(new zhh(6));
    }

    @Override // defpackage.zsq
    public final void g() {
        zwb zwbVar = this.n;
        tay tayVar = zwbVar.c;
        if (tayVar != null) {
            tayVar.G(zwbVar.d);
        }
        enh enhVar = this.i;
        ConversationIdType conversationIdType = this.e;
        zwbVar.c = ush.g(conversationIdType);
        zwbVar.d = new zwa(zwbVar, conversationIdType);
        zwbVar.c.F(enhVar, zwbVar.d);
        this.p.C(new akfk(zwbVar.g, new izd(zwbVar, conversationIdType, 15, null), "SPAM_BANNER_STATE_KEY".concat(String.valueOf(String.valueOf(conversationIdType))), 2), new akgh<zvy>() { // from class: zvs.2
            @Override // defpackage.akgh
            public final void a(Throwable th) {
                zvs.a.q("Error getting get spam banner loaded data, conversationId: ".concat(String.valueOf(String.valueOf(zvs.this.e))));
                zvs zvsVar = zvs.this;
                zvsVar.d.a(zvsVar, false);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.akgh
            public final /* synthetic */ void c(Object obj) {
                zvy zvyVar = (zvy) obj;
                if (zvyVar.c) {
                    zvs.this.g = (ParticipantsTable.BindData) zvyVar.a.get(0);
                }
                zvs zvsVar = zvs.this;
                zvsVar.f = zvyVar.b;
                zvsVar.d.a(zvsVar, zvyVar.c);
            }

            @Override // defpackage.akgh
            public final void b() {
            }
        });
    }

    @Override // defpackage.zsq
    public final aabr h() {
        ztr a2 = this.o.a(this.h);
        this.l = a2;
        a2.e(this.h.getString(R.string.spam_banner_description));
        this.l.p();
        this.l.h(R.drawable.gs_gpp_maybe_vd_theme_24, ahnz.f(this.h, R.attr.colorErrorVariant, "SpamBanner2o"));
        this.l.m(this.h.getString(R.string.spam_banner_title_v2));
        this.l.d(this.h.getString(R.string.spam_banner_body_v2));
        this.l.l(this.h.getString(R.string.spam_banner_not_spam_button_v2));
        this.l.g(this.h.getString(R.string.spam_banner_spam_button_v2));
        this.l.i(new ztv(this, 10));
        ztr ztrVar = this.l;
        ztrVar.y = new ztw(this, 6);
        ztrVar.j(new ztv(this, 11));
        this.l.k(new ztv(this, 12));
        return this.l;
    }

    public final void i(int i) {
        final boolean z;
        ParticipantsTable.BindData bindData = this.g;
        bindData.getClass();
        amzu amzuVar = amzu.UNKNOWN_USER_ACTION_TYPE;
        if (i == 4) {
            amzuVar = amzu.DISMISSED_WARNING_BANNER;
        }
        final amzu amzuVar2 = amzuVar;
        akbo akboVar = this.k;
        final zwb zwbVar = this.n;
        final ConversationIdType conversationIdType = this.e;
        final String M = bindData.M();
        if (i != 4) {
            z = true;
        } else {
            z = false;
        }
        ahlp l = ahlp.l(aktp.ai(new Callable() { // from class: zvz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                amzu amzuVar3;
                amzu amzuVar4 = amzu.UNKNOWN_USER_ACTION_TYPE;
                ypi ypiVar = ypi.b;
                amfe amfeVar = amfe.CONVERSATION_FROM_UNSPAM_ACTION;
                amzu amzuVar5 = amzuVar2;
                if (amzuVar5 != amzuVar4) {
                    amzuVar3 = amzuVar5;
                } else {
                    amzuVar3 = null;
                }
                zwb.this.a.b(yyb.ae(false, conversationIdType, M, ypiVar, z, false, amfeVar, null, amzuVar3, 3, 11, 2));
                return null;
            }
        }, zwbVar.b));
        aozy createBuilder = amyx.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amyx amyxVar = (amyx) createBuilder.b;
        amyxVar.c = i - 1;
        amyxVar.b |= 1;
        akboVar.j(l, ahlp.m((amyx) createBuilder.s()), this.m);
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
