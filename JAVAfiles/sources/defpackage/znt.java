package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class znt extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    int h;
    final /* synthetic */ znu i;
    final /* synthetic */ adiv j;
    final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znt(znu znuVar, adiv adivVar, int i, arpe arpeVar) {
        super(2, arpeVar);
        this.i = znuVar;
        this.j = adivVar;
        this.k = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((znt) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        amtx y;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        adiv adivVar;
        Object obj7;
        arpl arplVar = arpl.a;
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                obj2 = this.g;
                Object obj8 = this.f;
                obj5 = this.e;
                obj3 = this.d;
                obj4 = this.c;
                Object obj9 = this.b;
                Object obj10 = this.a;
                aqil.P(obj);
                obj7 = obj8;
                adivVar = obj9;
                obj6 = obj10;
            } else {
                arsb arsbVar = (arsb) this.c;
                arsb arsbVar2 = (arsb) this.a;
                try {
                    aqil.P(obj);
                    arsbVar.a = (qvo) obj;
                    int i2 = this.k;
                    znu znuVar = this.i;
                    adiv adivVar2 = this.j;
                    ahmn bB = aktp.bB(amtx.a.createBuilder());
                    bB.A(i2);
                    ahmn bF = aktp.bF(amwv.a.createBuilder());
                    wez wezVar = (wez) znuVar.g.b();
                    qwe qweVar = ((qvo) arsbVar2.a).c;
                    qweVar.getClass();
                    this.a = znuVar;
                    this.b = adivVar2;
                    this.c = bB;
                    this.d = bF;
                    this.e = bF;
                    this.f = bB;
                    this.g = bF;
                    this.h = 2;
                    Object m = wezVar.m(qweVar, this);
                    if (m != arplVar) {
                        obj2 = bF;
                        obj3 = obj2;
                        obj4 = bB;
                        obj = m;
                        obj5 = obj3;
                        obj7 = bB;
                        adivVar = adivVar2;
                        obj6 = znuVar;
                    } else {
                        return arplVar;
                    }
                } catch (IllegalArgumentException e) {
                    ((alvg) ((alvg) znu.a.i()).g(e).h("com/google/android/apps/messaging/ui/appsettings/analytics/ToggleRcsChatsEventLogger$logTogglePerSimRcsChatsEvent$1", "invokeSuspend", 139, "ToggleRcsChatsEventLogger.kt")).q("Failed to log a toggle global RCS Chats Event");
                    return arnb.a;
                }
            }
            ((ahmn) obj2).D(((adjl) obj).a);
            ((ahmn) obj5).C(((acnu) ((znu) obj6).d.b()).a(adivVar));
            ((ahmn) obj7).z(((ahmn) obj3).B());
            y = ((ahmn) obj4).y();
        } else {
            aqil.P(obj);
            int i3 = this.k;
            znu znuVar2 = this.i;
            adiv adivVar3 = this.j;
            ahmn bB2 = aktp.bB(amtx.a.createBuilder());
            bB2.A(i3);
            ahmn bF2 = aktp.bF(amwv.a.createBuilder());
            bF2.D(((adjc) znuVar2.e.b()).b(adom.n(adivVar3).a).a);
            bF2.C(((acnu) znuVar2.d.b()).a(adivVar3));
            bB2.z(bF2.B());
            y = bB2.y();
        }
        mar a = ((mbb) this.i.b.b()).a();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfqVar.getClass();
        alzz.n(amfp.TOGGLE_RCS_CHATS_EVENT, amfqVar);
        aozy createBuilder = amtv.a.createBuilder();
        createBuilder.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amtv amtvVar = (amtv) createBuilder.b;
        amtvVar.c = y;
        amtvVar.b = 2;
        alzz.r(aktp.aA(createBuilder), amfqVar);
        a.b((amfq) alzz.h(amfqVar).toBuilder(), mbt.LOG_SPEC_RCS_SETTINGS_UI_EVENTS);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new znt(this.i, this.j, this.k, arpeVar);
    }
}
