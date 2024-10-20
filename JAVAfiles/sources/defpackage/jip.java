package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jip extends arpw implements arqw {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ asai c;
    final /* synthetic */ jiu d;
    final /* synthetic */ arsb e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jip(arpe arpeVar, asai asaiVar, jiu jiuVar, arsb arsbVar) {
        super(3, arpeVar);
        this.c = asaiVar;
        this.d = jiuVar;
        this.e = arsbVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        jip jipVar = new jip((arpe) obj3, this.c, this.d, this.e);
        jipVar.f = (asaj) obj;
        jipVar.b = obj2;
        return jipVar.b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [asaj, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        asai Q;
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            ?? r8 = this.f;
            mis misVar = (mis) this.b;
            if (misVar != mis.NONE) {
                alvw d = jiu.a.d();
                d.X(alwp.a, "BugleComposeRow2");
                ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver$transportCapabilityDataFlow$1$invokeSuspend$$inlined$flatMapLatest$1", "invokeSuspend", 461, "MapiTransportCapabilityResolver.kt")).t("Disabled Transport Capability with ComposeDisabledReason %s", misVar);
                misVar.getClass();
                Q = new aghw(new jje(misVar), 9);
            } else {
                asai a = asar.a(new idx(this.c, this.d, 12));
                jiu jiuVar = this.d;
                Q = arrn.Q(a, jiuVar.o, jiuVar.p, jiuVar.q, new jio(this.e, jiuVar, null));
            }
            this.a = 1;
            if (armd.r(r8, Q, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }
}
