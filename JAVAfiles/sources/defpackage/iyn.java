package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyn {
    public final boolean A;
    public final qpd B;
    public final armf G;
    public final a H;
    private final armf J;
    public rsd c;
    public iyq d;
    public iyo e;
    public String g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final apwt l;
    public final armf m;
    public final armf n;
    public final apwt o;
    public final apwt p;
    public final apwt q;
    public final apwt r;
    public final armf s;
    public final apwt t;
    public final apwt u;
    public final armf v;
    public final iyl w;
    public final ConversationIdType x;
    public final ConversationId y;
    public final boolean z;
    public static final xze a = xze.g("Bugle", "ConversationSettingsFragment");
    public static final alwo b = alwo.o("BugleNotifications");
    private static final alwo I = alwo.o("BugleNotifications");
    public Optional f = Optional.empty();
    public final akgh C = new akgh<Optional<String>>() { // from class: iyn.1
        @Override // defpackage.akgh
        public final void a(Throwable th) {
            iyn.a.q("Error getting group name data for conversation settings, conversationId: ".concat(String.valueOf(String.valueOf(iyn.this.x))));
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            Optional optional = (Optional) obj;
            if (optional.isPresent()) {
                iyo iyoVar = iyn.this.e;
                iyoVar.c = (String) optional.get();
                iyoVar.q(0);
            }
        }

        @Override // defpackage.akgh
        public final void b() {
        }
    };
    public final akbp D = new akbp<Void, Boolean>() { // from class: iyn.2
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            iyn.a.q("Error reporting not spam, conversationId: ".concat(String.valueOf(String.valueOf(iyn.this.x))));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            if (!((Boolean) obj2).booleanValue()) {
                iyn.a.q("Error reporting not spam, conversationId: ".concat(String.valueOf(String.valueOf(iyn.this.x))));
            }
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final akbp E = new akbp<ParticipantsTable.BindData, Void>() { // from class: iyn.3
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            iyn.a.q("Error unblocking destination");
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void c(Object obj, Object obj2) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
            ibi ibiVar = (ibi) iyn.this.s.b();
            pwq a2 = ifz.a();
            String J = bindData.J();
            J.getClass();
            a2.a = J;
            a2.l(bindData.R(), false);
            a2.m(bindData.T(), false);
            ibiVar.d(a2.h());
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final akbp F = new akbp<Void, apdj<lrn>>() { // from class: iyn.4
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            ((alwl) ((alwl) ((alwl) iyn.b.i()).g(th)).h("com/google/android/apps/messaging/conversation/settings/ConversationSettingsBaseFragmentPeer$4", "onFailure", (char) 285, "ConversationSettingsBaseFragmentPeer.java")).q("Missing self identity, can't show security key");
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            iyn iynVar = iyn.this;
            iyl iylVar = iynVar.w;
            iylVar.getClass();
            Context x = iylVar.x();
            armf armfVar = iynVar.j;
            armfVar.getClass();
            akto.n(x, ((lxe) ((Optional) armfVar.b()).orElseThrow()).a(x, (lrn) ((apdj) obj2).a(lrn.a, aozs.a())));
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };

    public iyn(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, apwt apwtVar, armf armfVar6, armf armfVar7, apwt apwtVar2, apwt apwtVar3, apwt apwtVar4, apwt apwtVar5, armf armfVar8, apwt apwtVar6, apwt apwtVar7, armf armfVar9, iyl iylVar, armf armfVar10, iym iymVar) {
        this.G = armfVar;
        this.h = armfVar2;
        this.i = armfVar3;
        this.j = armfVar4;
        this.k = armfVar5;
        this.l = apwtVar;
        this.m = armfVar6;
        this.n = armfVar7;
        this.o = apwtVar2;
        this.p = apwtVar3;
        this.q = apwtVar4;
        this.r = apwtVar5;
        this.s = armfVar8;
        this.t = apwtVar6;
        this.u = apwtVar7;
        this.v = armfVar9;
        this.J = armfVar10;
        this.w = iylVar;
        ConversationIdType b2 = ruy.b(iymVar.b);
        this.x = b2;
        this.y = new BugleConversationId(b2);
        this.A = iymVar.d;
        this.z = iymVar.c;
        qpd b3 = qpd.b(iymVar.f);
        this.B = b3 == null ? qpd.UNRECOGNIZED : b3;
        this.H = new a();
    }

    public final void a(String str) {
        Intent b2 = ((vml) this.J.b()).b(str, ((xzu) this.n.b()).f(this.x), this.x);
        if (b2 == null) {
            alwl alwlVar = (alwl) I.i();
            alwlVar.X(ydl.o, this.x.a());
            alwlVar.X(vjh.t, ((xzu) this.n.b()).f(this.x));
            ((alwl) alwlVar.h("com/google/android/apps/messaging/conversation/settings/ConversationSettingsBaseFragmentPeer", "createAndOpenNotificationChannel", 669, "ConversationSettingsBaseFragmentPeer.java")).q("intent is null, unable to open notification channel settings");
            return;
        }
        this.w.startActivityForResult(b2, 1001);
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class b implements akgh<rsf> {
        private final Consumer a;
        private final Consumer b;

        public b(Consumer consumer, Consumer consumer2) {
            this.a = consumer;
            this.b = consumer2;
        }

        @Override // defpackage.akgh
        public final void a(Throwable th) {
            this.b.q(th);
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            this.a.q((rsf) obj);
        }

        @Override // defpackage.akgh
        public final void b() {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class a implements akbp<Void, Boolean> {
        public a() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            iyn.a.q("Error creating shortcut, can't open notification settings");
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            if (!((Boolean) obj2).booleanValue()) {
                iyn.a.q("Error creating shortcut, can't open notification settings");
                return;
            }
            iyn iynVar = iyn.this;
            iyo iyoVar = iynVar.e;
            iyoVar.getClass();
            iynVar.a(iyoVar.c);
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
