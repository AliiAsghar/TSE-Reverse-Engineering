package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agem extends agai implements ageb {
    static final /* synthetic */ artm[] aP;
    private final arsn a;
    public boolean aQ;
    protected agdq aR;
    public int aS;
    protected ahjj aT;
    private agea b;

    static {
        arrr arrrVar = new arrr(agem.class, "colors", "getColors()Lcom/google/android/libraries/compose/ui/composable/theme/HugoColors;", 0);
        int i = arsc.a;
        aP = new artm[]{arrrVar};
    }

    public agem() {
        this((Integer) null, 3);
    }

    public static final void bw(agea ageaVar, int i) {
        boolean g = ageaVar.g();
        ageaVar.e(i);
        if (g) {
            ageaVar.j(false);
        }
    }

    public static /* synthetic */ void bx(agem agemVar) {
        agea gx = agemVar.gx();
        if (gx != null) {
            gx.j(true);
        }
    }

    public abstract agek aM();

    public final agdq bt() {
        agdq agdqVar = this.aR;
        if (agdqVar != null) {
            return agdqVar;
        }
        arro.b("renderingStrategy");
        return null;
    }

    public final void bu(agea ageaVar) {
        int i = this.aS;
        if (i != 0) {
            bw(ageaVar, i);
            this.aS = 0;
        }
    }

    public final void bv(afzr afzrVar) {
        this.a.d(aP[0], afzrVar);
    }

    public final void by() {
        this.aQ = true;
        afzr afzrVar = (afzr) this.a.c(aP[0]);
        if (afzrVar != null) {
            aT(afzrVar);
        }
    }

    public final ahjj bz() {
        ahjj ahjjVar = this.aT;
        if (ahjjVar != null) {
            return ahjjVar;
        }
        arro.b("renderingStateHandler");
        return null;
    }

    public void gA(agdq agdqVar, ahjj ahjjVar) {
        agdqVar.getClass();
        ahjjVar.getClass();
        this.aR = agdqVar;
        this.aT = ahjjVar;
        bv(agdqVar.k);
    }

    public agea gx() {
        agea ageaVar = this.b;
        if (ageaVar == null) {
            ageaVar = r();
            if (ageaVar != null) {
                bu(ageaVar);
            }
            this.b = ageaVar;
        }
        return ageaVar;
    }

    public void gy(agdp agdpVar) {
        agdpVar.getClass();
    }

    public void gz() {
        bx(this);
    }

    @Override // defpackage.cg
    public final void k() {
        super.k();
        gx();
    }

    public agem(Integer num) {
        this(num, 2);
    }

    public agem(Integer num, agen agenVar) {
        super(num, agenVar);
        this.a = new agel(this);
    }

    public /* synthetic */ agem(Integer num, int i) {
        this(1 == (i & 1) ? null : num, (agen) null);
    }

    public void aX() {
    }

    public void aY() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aT(afzr afzrVar) {
    }
}
