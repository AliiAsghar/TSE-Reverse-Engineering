package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zns extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ znu f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zns(znu znuVar, int i, arpe arpeVar) {
        super(2, arpeVar);
        this.f = znuVar;
        this.g = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zns) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Iterator it;
        aozy aozyVar;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        arpl arplVar = arpl.a;
        int i = this.e;
        if (i != 0) {
            it = null;
            if (i == 1) {
                arsb arsbVar = (arsb) this.c;
                arsb arsbVar2 = (arsb) this.a;
                try {
                    aqil.P(obj);
                    arsbVar.a = (qvo) obj;
                    znu znuVar = this.f;
                    obj2 = aktp.bF(amwv.a.createBuilder());
                    wez wezVar = (wez) znuVar.g.b();
                    qwe qweVar = ((qvo) arsbVar2.a).c;
                    qweVar.getClass();
                    this.a = znuVar;
                    this.b = obj2;
                    this.c = obj2;
                    this.d = obj2;
                    this.e = 2;
                    Object m = wezVar.m(qweVar, this);
                    if (m == arplVar) {
                        return arplVar;
                    }
                    obj5 = znuVar;
                    obj3 = obj2;
                    obj = m;
                    obj4 = obj3;
                } catch (IllegalArgumentException e) {
                    ((alvg) ((alvg) znu.a.i()).g(e).h("com/google/android/apps/messaging/ui/appsettings/analytics/ToggleRcsChatsEventLogger$logToggleGlobalRcsChatsEvent$1", "invokeSuspend", 68, "ToggleRcsChatsEventLogger.kt")).q("Failed to log a toggle global RCS Chats Event");
                    aozyVar = null;
                }
            } else {
                obj2 = this.d;
                obj3 = this.c;
                obj4 = this.b;
                obj5 = this.a;
                aqil.P(obj);
            }
            ((ahmn) obj2).D(((adjl) obj).a);
            ((ahmn) obj3).C(((acnu) ((znu) obj5).d.b()).a(null));
            ((ahmn) obj4).B();
            throw null;
        }
        aqil.P(obj);
        int i2 = this.g;
        aozy createBuilder = amtw.a.createBuilder();
        createBuilder.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amtw amtwVar = (amtw) createBuilder.b;
        amtwVar.c = i2 - 1;
        amtwVar.b |= 1;
        apag s = createBuilder.s();
        s.getClass();
        aozy builder = ((amtw) s).toBuilder();
        builder.getClass();
        it = ((wwn) this.f.c.b()).m().iterator();
        aozyVar = builder;
        while (it.hasNext()) {
            adiv adivVar = (adiv) it.next();
            znu znuVar2 = this.f;
            ahmn bF = aktp.bF(amwv.a.createBuilder());
            bF.D(((adjc) znuVar2.e.b()).b(adom.n(adivVar).a).a);
            bF.C(((acnu) znuVar2.d.b()).a(adivVar));
            amwv B = bF.B();
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            amtw amtwVar2 = (amtw) aozyVar.b;
            amtw amtwVar3 = amtw.a;
            apax apaxVar = amtwVar2.d;
            if (!apaxVar.c()) {
                amtwVar2.d = apag.mutableCopy(apaxVar);
            }
            amtwVar2.d.add(B);
        }
        mar a = ((mbb) this.f.b.b()).a();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfqVar.getClass();
        alzz.n(amfp.TOGGLE_RCS_CHATS_EVENT, amfqVar);
        aozy createBuilder2 = amtv.a.createBuilder();
        createBuilder2.getClass();
        amtw amtwVar4 = (amtw) aozyVar.s();
        amtwVar4.getClass();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amtv amtvVar = (amtv) createBuilder2.b;
        amtvVar.c = amtwVar4;
        amtvVar.b = 1;
        alzz.r(aktp.aA(createBuilder2), amfqVar);
        a.b((amfq) alzz.h(amfqVar).toBuilder(), mbt.LOG_SPEC_RCS_SETTINGS_UI_EVENTS);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new zns(this.f, this.g, arpeVar);
    }
}
