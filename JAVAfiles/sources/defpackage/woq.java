package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class woq implements ancs {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ woq(Object obj, long j, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.a = j;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r11v31, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [armf, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        int i = this.d;
        int i2 = 3;
        int i3 = 0;
        if (i != 0) {
            int i4 = 1;
            if (i != 1) {
                if (i != 2) {
                    Object obj2 = null;
                    if (i != 3) {
                        return ((amdw) this.b).h.schedule(new aidu(obj2, 18), this.a, (TimeUnit) this.c);
                    }
                    Object obj3 = this.b;
                    aieo aieoVar = (aieo) obj3;
                    aleq aleqVar = aieoVar.c;
                    alek alekVar = (alek) obj;
                    aidj a = aidj.a(this.c);
                    int a2 = aleqVar.a();
                    alef alefVar = alekVar.g;
                    if (alefVar == null) {
                        alefVar = alef.a;
                    }
                    if (a2 > alefVar.b) {
                        return aktp.ag(null);
                    }
                    return aieoVar.j.a().e(aiej.class, new agui(obj3, 15), aieoVar.e).i(new actl(aieoVar, alekVar, a, this.a, 2), aieoVar.e).h(new ahnx(11), aieoVar.e).e(RuntimeException.class, new agui(obj3, 13), aieoVar.e);
                }
                alwl alwlVar = (alwl) ((alwl) xff.a.g()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "processInternalAndCatch", 145, "TachygramOutgoingOperationTemplate.java");
                xff xffVar = (xff) this.b;
                alwlVar.C("Executed outgoing tachygram operation %s, latency[ms]=%d", xffVar.b.h(), xffVar.i.a() - this.a);
                return xffVar.b.f(this.c, obj);
            }
            if (tvu.e(((mll) obj).r())) {
                Object obj4 = this.b;
                aozy createBuilder = vuk.a.createBuilder();
                String a3 = ((BugleConversationId) obj4).a.a();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                a3.getClass();
                ((vuk) apagVar).c = a3;
                vuj vujVar = vuj.DO_NOT_DELETE;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                long j = this.a;
                ((vuk) createBuilder.b).d = vujVar.a();
                apct b = apds.b(j);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                vuk vukVar = (vuk) apagVar2;
                b.getClass();
                vukVar.e = b;
                vukVar.b |= 1;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                Object obj5 = this.c;
                vuk vukVar2 = (vuk) createBuilder.b;
                vukVar2.b = 2 | vukVar2.b;
                vukVar2.f = false;
                mmg mmgVar = (mmg) obj5;
                return ((uof) mmgVar.o.a.b()).b(upk.a("leave_rcs_group_conversation", (vuk) createBuilder.s())).i(new jab(7), mmgVar.j).h(new mme(i4), mmgVar.j);
            }
            return aktp.af(new UnsupportedOperationException("Operation not supported"));
        }
        if (((Boolean) obj).booleanValue()) {
            long j2 = this.a;
            Object obj6 = this.c;
            Object obj7 = this.b;
            wor worVar = (wor) obj7;
            return akul.g(((aiwu) worVar.d.a).a()).h(new wop(((amme) obj6).name(), i3), andi.a).h(new tti(obj7, j2, i2), worVar.c);
        }
        return aktp.ag(false);
    }

    public /* synthetic */ woq(Object obj, Object obj2, long j, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }

    public /* synthetic */ woq(mmg mmgVar, BugleConversationId bugleConversationId, long j, int i) {
        this.d = i;
        this.c = mmgVar;
        this.b = bugleConversationId;
        this.a = j;
    }
}
