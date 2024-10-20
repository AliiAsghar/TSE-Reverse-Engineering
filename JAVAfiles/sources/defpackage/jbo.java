package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbo extends eor {
    public boolean a;
    public boolean b;
    public boolean c;
    public Boolean d;
    public Boolean e;
    public qdq f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final ohm k;
    private final armf l;
    private boolean m;
    private final ConversationIdType n;
    private final kor o;

    public jbo(eog eogVar, armf armfVar, armf armfVar2, armf armfVar3, uvi uviVar, arwe arweVar, armf armfVar4, kor korVar, ohm ohmVar, armf armfVar5) {
        eogVar.getClass();
        armfVar.getClass();
        armfVar3.getClass();
        uviVar.getClass();
        arweVar.getClass();
        armfVar4.getClass();
        korVar.getClass();
        armfVar5.getClass();
        this.g = armfVar;
        this.h = armfVar2;
        this.i = armfVar3;
        this.j = armfVar4;
        this.o = korVar;
        this.k = ohmVar;
        this.l = armfVar5;
        this.n = ruy.b((String) eogVar.a("conversation_id"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ashu b() {
        Boolean bool = this.d;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = this.e;
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
                apaa apaaVar = (apaa) ashu.a.createBuilder();
                apae apaeVar = ashp.b;
                aozy createBuilder = ashp.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                ashp ashpVar = (ashp) apagVar;
                ashpVar.c |= 8;
                ashpVar.f = booleanValue;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                ashp ashpVar2 = (ashp) createBuilder.b;
                ashpVar2.c |= 16;
                ashpVar2.g = booleanValue2;
                apaaVar.ct(apaeVar, createBuilder.s());
                return (ashu) apaaVar.s();
            }
            return null;
        }
        return null;
    }

    public final void a(ajwt ajwtVar, Activity activity) {
        if (!this.m && this.a && this.b && this.c) {
            this.m = true;
            akrh e = aktp.e("ConversationStartupTrackers#onReady");
            try {
                ahqe.a.b(activity);
                this.o.j(mgv.r, 0, b());
                this.o.j(mgw.a, 0, b());
                mgv mgvVar = (mgv) this.g.b();
                mgvVar.f(mgv.s);
                mgvVar.f(mgv.t);
                mgvVar.f(mgv.u);
                if (((osb) this.l.b()).a()) {
                    mgvVar.f(yci.o);
                    mgvVar.f(yci.n);
                }
                if (this.k.a()) {
                    mgvVar.f(yci.h);
                }
                mgvVar.c(new ahka("Conversation data loaded"));
                qiu.h(((xcj) this.h.b()).a(ajwtVar));
                if (activity != null && activity.getIntent().getBooleanExtra("via_rcs_not_delivered_notification", false)) {
                    ((znj) this.j.b()).ah();
                }
                e = aktp.e("ConversationStartupTrackers#populateCache#convoV1");
                try {
                    akul a = ((qyj) this.i.b()).a(this.n);
                    e.b(a);
                    qiu.h(a);
                    armd.i(e, null);
                    qdq qdqVar = this.f;
                    if (qdqVar != null && ((Boolean) ((ixd) qdqVar.a).by.b()).booleanValue()) {
                        ((ixd) qdqVar.a).bz.ifPresent(new ivn(16));
                    }
                    armd.i(e, null);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }
}
