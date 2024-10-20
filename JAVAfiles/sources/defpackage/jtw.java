package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jtw extends arpw implements arra {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ boolean e;
    /* synthetic */ boolean f;
    final /* synthetic */ jub g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtw(jub jubVar, arpe arpeVar) {
        super(7, arpeVar);
        this.g = jubVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [agfn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [aeny, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z;
        boolean z2;
        aqil.P(obj);
        ?? r2 = this.a;
        ?? r1 = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        boolean z3 = this.e;
        boolean z4 = this.f;
        jub jubVar = this.g;
        boolean a = ((ogx) jubVar.f.b()).a();
        afyo afyoVar = new afyo((agfn) r1, jubVar.p, jubVar, a);
        aepi aepiVar = null;
        aeoa aeoaVar = null;
        if (this.g.k.a() && (this.g.j instanceof EmergencySosConversationId)) {
            alvw g = jub.a.g();
            g.X(alwp.a, "BugleComposeRow2");
            ((alvg) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl$data$1", "invokeSuspend", 336, "InputsUiAdapterImpl.kt")).q("ComposeRowInputsUiData set to null for EmergencySosConversationId");
        } else {
            if (!((Boolean) yig.ao.e()).booleanValue() && ((opm) this.g.e.b()).a()) {
                z = false;
            } else {
                z = true;
            }
            aemm aemmVar = new aemm(z3, z, ((pli) this.g.n.b()).a(), new jmy(this.g, 16));
            aepd aepdVar = new aepd(null);
            if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && z4) {
                z2 = true;
            } else {
                z2 = false;
            }
            jub jubVar2 = this.g;
            ghu ghuVar = new ghu((Object) jubVar2, 8, (char[][]) null);
            Object b = jubVar2.l.b();
            b.getClass();
            boolean booleanValue = ((Boolean) b).booleanValue();
            Object e = nhr.i.e();
            e.getClass();
            int intValue = ((Number) e).intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        aepiVar = aepi.VOICE_BUTTON_BACKGROUND_TERTIARY_CONTAINER;
                    }
                } else {
                    aepiVar = aepi.VOICE_BUTTON_BACKGROUND_PRIMARY;
                }
            } else {
                aepiVar = aepi.VOICE_BUTTON_BACKGROUND_DEFAULT;
            }
            if (aepiVar == null) {
                aepiVar = aepi.VOICE_BUTTON_BACKGROUND_DEFAULT;
            }
            aeoaVar = new aeoa(r2, (aepp) obj2, (aemn) obj3, aemmVar, aepdVar, z2, new aenz(booleanValue, aepiVar), ghuVar, 32);
        }
        return new jts(afyoVar, aeoaVar);
    }

    @Override // defpackage.arra
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean booleanValue = ((Boolean) obj5).booleanValue();
        boolean booleanValue2 = ((Boolean) obj6).booleanValue();
        jtw jtwVar = new jtw(this.g, (arpe) obj7);
        jtwVar.a = (aeny) obj;
        jtwVar.b = (agfn) obj2;
        jtwVar.c = (aepp) obj3;
        jtwVar.d = (aemn) obj4;
        jtwVar.e = booleanValue;
        jtwVar.f = booleanValue2;
        return jtwVar.b(arnb.a);
    }
}
