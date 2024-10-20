package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxf {
    public static final alwo a = alwo.o("BugleConnectivity");
    public final anen b;
    public final xyt c;
    public final enh d;
    public yao e;
    public rsm f;
    public rre g;
    public int h = -1;
    public int i = -1;
    public final qze j;
    public final ansy k;
    public ahjj l;
    private final ahiy m;

    public zxf(ansy ansyVar, anen anenVar, xyt xytVar, ahiy ahiyVar, qze qzeVar, enh enhVar) {
        this.k = ansyVar;
        this.b = anenVar;
        this.c = xytVar;
        this.m = ahiyVar;
        this.j = qzeVar;
        this.d = enhVar;
    }

    public final void a() {
        this.m.q(aktp.ag(null), "CONVERSATION_BOTTOM_BAR_DATA_SERVICE_KEY");
    }

    public final void b(int i) {
        yaq yaqVar = (yaq) this.c.a();
        yao yaoVar = this.e;
        aozy createBuilder = yam.a.createBuilder();
        yal yalVar = yal.SPECIFIED_SUBSCRIPTION;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        yam yamVar = (yam) apagVar;
        yamVar.c = yalVar.e;
        yamVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        yam yamVar2 = (yam) createBuilder.b;
        yamVar2.b |= 2;
        yamVar2.d = i;
        yaqVar.j(yaoVar, (yam) createBuilder.s());
    }

    public final void c(int i) {
        yaq yaqVar = (yaq) this.c.a();
        yao yaoVar = this.e;
        aozy createBuilder = yam.a.createBuilder();
        yal yalVar = yal.SPECIFIED_SUBSCRIPTION;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        yam yamVar = (yam) apagVar;
        yamVar.c = yalVar.e;
        yamVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        yam yamVar2 = (yam) createBuilder.b;
        yamVar2.b |= 2;
        yamVar2.d = i;
        yaqVar.k(yaoVar, (yam) createBuilder.s());
    }
}
