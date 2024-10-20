package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yyi extends arpw implements arqv {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyi(yyj yyjVar, boolean z, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = yyjVar;
        this.a = z;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return ((yyi) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((yyi) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((yyi) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [byn, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = this.c;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                aqil.P(obj);
                this.b.h(Boolean.valueOf(this.a));
                return arnb.a;
            }
            aqil.P(obj);
            alvw e = jsy.a.e();
            e.X(alwp.a, "BugleComposeRow2");
            ((alvg) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl$onUrgentChange$1", "invokeSuspend", 180, "SubjectUrgentUiAdapterImpl.kt")).t("Urgent changed %b", Boolean.valueOf(this.a));
            ((jsy) this.b).i.e(new jsw(this.a, 0));
            return arnb.a;
        }
        aqil.P(obj);
        yyj yyjVar = (yyj) this.b;
        yyf yyfVar = null;
        tqc tqcVar = null;
        if (yyjVar.g.e) {
            aiut.b();
            ConversationIdType conversationIdType = new ConversationIdType(yyjVar.g.c);
            if (!conversationIdType.b()) {
                tqcVar = ((rtz) yyjVar.d.b()).r(conversationIdType);
            }
            yyfVar = new yyf(((rxq) yyjVar.c.b()).a(yyjVar.g.d), tqcVar);
        }
        boolean z = this.a;
        if (z && yyb.b(yyfVar)) {
            i2 = 2;
        } else if (z && yyb.a(yyfVar)) {
            i2 = 3;
        } else if (!z) {
            if (yyb.b(yyfVar)) {
                i2 = 5;
            } else if (yyb.a(yyfVar)) {
                i2 = 6;
            } else {
                i2 = 4;
            }
        }
        ((mbl) ((yyj) this.b).f.b()).e("Bugle.Spam.UrlClick.Counts", i2);
        return arnb.a;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [byn, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return new yyi(this.a, (byn) this.b, arpeVar, 2);
            }
            return new yyi(this.a, (jsy) this.b, arpeVar, 1);
        }
        return new yyi((yyj) this.b, this.a, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyi(boolean z, byn bynVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = z;
        this.b = bynVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyi(boolean z, jsy jsyVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = z;
        this.b = jsyVar;
    }
}
