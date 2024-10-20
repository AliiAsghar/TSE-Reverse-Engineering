package defpackage;

import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhb extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhb(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v43, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object, lih] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r1v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [armf, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        ltt lttVar;
        boolean z = true;
        String str = null;
        switch (this.b) {
            case 0:
                znj znjVar = (znj) ((lhe) this.a).m.b();
                aiwl a = wus.a();
                a.i(wuk.IMAGE_COMPRESSION);
                a.k(yfq.a);
                return znjVar.ab(a.f());
            case 1:
                return new aejt[((asai[]) this.a).length];
            case 2:
                return ((znj) ((lhm) this.a).j).e();
            case 3:
                ((lhw) this.a).b.a();
                return arnb.a;
            case 4:
                return ((aov) this.a).d().i();
            case 5:
                return Boolean.valueOf(((aov) this.a).i());
            case 6:
                int b = ((gqg) this.a).b();
                boolean z2 = ((gqg) this.a).c().a instanceof gax;
                if (b <= 0 && z2) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                ljn.d((ljn) ((mlt) this.a).d.b(), 3, 0, 0, 6);
                mlt mltVar = (mlt) this.a;
                mltVar.j.f(mltVar.l.b());
                return arnb.a;
            case 8:
                ljn.d((ljn) ((mlt) this.a).d.b(), 2, 0, 0, 6);
                ?? r0 = ((mlt) this.a).j;
                long longValue = ((Number) r0.c()).longValue();
                Object b2 = ((mlt) this.a).g.b();
                b2.getClass();
                r0.f(Long.valueOf(longValue + ((Number) b2).longValue()));
                return arnb.a;
            case 9:
                return (String) ((lii) this.a).a.a();
            case 10:
                return ((aov) this.a).d().i();
            case 11:
                ljn.d((ljn) ((ljp) this.a).a.b(), 11, 0, 0, 6);
                if (((Boolean) ((ljp) this.a).f.c()).booleanValue()) {
                    ((ljp) this.a).e.c();
                    ((ljp) this.a).f.f(false);
                } else {
                    ((lkd) ((ljp) this.a).k).b(llg.a);
                }
                return arnb.a;
            case 12:
                ljn.d((ljn) ((ljp) this.a).a.b(), 9, 0, 0, 6);
                ((ljp) this.a).f.f(true);
                return arnb.a;
            case 13:
                ((lre) this.a).a();
                return arnb.a;
            case 14:
                String str2 = ((ltk) this.a).e;
                if (str2 != null) {
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        return str2;
                    }
                }
                String str3 = ((ltk) this.a).f;
                if (str3 == null || str3.length() <= 0) {
                    str3 = null;
                }
                if (str3 == null) {
                    String str4 = ((ltk) this.a).d;
                    if (str4 != null && str4.length() > 0) {
                        str = str4;
                    }
                    if (str == null) {
                        String str5 = ((ltk) this.a).c;
                        if (str5 == null) {
                            return "";
                        }
                        return str5;
                    }
                    return str;
                }
                return str3;
            case 15:
                aozy createBuilder = ltr.a.createBuilder();
                createBuilder.getClass();
                ltk ltkVar = (ltk) this.a;
                if (((Boolean) ltkVar.g.a()).booleanValue()) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ltr ltrVar = (ltr) createBuilder.b;
                    ltrVar.c = Integer.valueOf(a.al(3));
                    ltrVar.b = 2;
                } else {
                    aozy createBuilder2 = ltt.a.createBuilder();
                    createBuilder2.getClass();
                    String str6 = (String) ltkVar.h.a();
                    str6.getClass();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar = createBuilder2.b;
                    ((ltt) apagVar).b = str6;
                    String str7 = ltkVar.a;
                    if (!apagVar.isMutable()) {
                        createBuilder2.u();
                    }
                    ((ltt) createBuilder2.b).c = str7;
                    apag s = createBuilder2.s();
                    s.getClass();
                    ltt lttVar2 = (ltt) s;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ltr ltrVar2 = (ltr) createBuilder.b;
                    ltrVar2.c = lttVar2;
                    ltrVar2.b = 3;
                }
                apag s2 = createBuilder.s();
                s2.getClass();
                return (ltr) s2;
            case 16:
                if (((ltk) this.a).b == -2) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                ltq ltqVar = ((RepliedToDataAdapter) this.a).a.d;
                if (ltqVar == null) {
                    ltqVar = ltq.a;
                }
                ltr ltrVar3 = ltqVar.c;
                if (ltrVar3 == null) {
                    ltrVar3 = ltr.a;
                }
                if (ltrVar3.b != 3) {
                    return null;
                }
                ltq ltqVar2 = ((RepliedToDataAdapter) this.a).a.d;
                if (ltqVar2 == null) {
                    ltqVar2 = ltq.a;
                }
                ltr ltrVar4 = ltqVar2.c;
                if (ltrVar4 == null) {
                    ltrVar4 = ltr.a;
                }
                if (ltrVar4.b == 3) {
                    lttVar = (ltt) ltrVar4.c;
                } else {
                    lttVar = ltt.a;
                }
                return lttVar.c;
            case 18:
                return this.a;
            case 19:
                ConversationId c = ((mps) this.a).a.c();
                c.getClass();
                return new RbmConversationId(((BugleConversationId) c).a);
            default:
                return new CoreBugleMessageId(((mty) this.a).b.A(), -1L);
        }
    }
}
