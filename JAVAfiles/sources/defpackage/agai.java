package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class agai extends cg implements afyf {
    static final /* synthetic */ artm[] aD;
    public static final alvi aE;
    public static final afiu aF;
    public final agaj aG;
    public anca aH;
    public armf aI;
    public arwe aJ;
    public Optional aK;
    public final arml aL;
    public arqg aM;
    public Instant aN;
    protected arqg aO;
    private final arsn ag;
    private Instant ah;
    private final arml c;
    private final arml d;
    private final arml e;
    private final Integer fx;
    private final arsn fy;

    static {
        arrr arrrVar = new arrr(agai.class, "configurationOverride", "getConfigurationOverride()Lcom/google/android/libraries/compose/ui/fragment/HugoFragmentConfiguration;", 0);
        int i = arsc.a;
        aD = new artm[]{arrrVar, new arrr(agai.class, "isUiReady", "isUiReady()Z", 0)};
        aE = alvi.m("com/google/android/libraries/compose/ui/fragment/HugoFragment");
        aF = new afiu(0L);
    }

    public agai() {
        this(null, null);
    }

    @Override // defpackage.cg
    public View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.K(layoutInflater, viewGroup, bundle);
        Integer num = this.fx;
        if (num != null) {
            View inflate = I().inflate(num.intValue(), viewGroup, false);
            inflate.getClass();
            return inflate;
        }
        throw new IllegalArgumentException("No layoutId provided despite no onCreateView override.");
    }

    public final afke bh() {
        return (afke) this.e.a();
    }

    public final agaj bi() {
        return (agaj) this.d.a();
    }

    public final agaj bj() {
        if (gD()) {
            agaj bk = bk();
            if (bk == null) {
                return bi();
            }
            return bk;
        }
        return (agaj) this.c.a();
    }

    public final agaj bk() {
        return (agaj) this.fy.c(aD[0]);
    }

    public final anca bl() {
        anca ancaVar = this.aH;
        if (ancaVar != null) {
            return ancaVar;
        }
        arro.b("timeSource");
        return null;
    }

    public final Duration bm() {
        Duration between = Duration.between(this.ah, this.aN);
        between.getClass();
        return between;
    }

    public final arqg bn() {
        arqg arqgVar = this.aO;
        if (arqgVar != null) {
            return arqgVar;
        }
        arro.b("draftController");
        return null;
    }

    public final arwe bo() {
        arwe arweVar = this.aJ;
        if (arweVar != null) {
            return arweVar;
        }
        arro.b("uiScope");
        return null;
    }

    public final void bp(agaj agajVar) {
        this.fy.d(aD[0], agajVar);
    }

    public final void bq(Instant instant) {
        instant.getClass();
        this.aN = instant;
    }

    public final boolean br() {
        return ((Boolean) this.ag.c(aD[1])).booleanValue();
    }

    public final void bs() {
        this.ag.d(aD[1], true);
    }

    @Override // defpackage.cg
    public void f(Context context) {
        super.f(context);
        this.ah = bl().a();
    }

    public void gB(arqg arqgVar) {
        this.aO = arqgVar;
    }

    public void gC(agaj agajVar) {
        alvg alvgVar = (alvg) aE.g().h("com/google/android/libraries/compose/ui/fragment/HugoFragment", "onConfigurationChangedAfterUiReady", 216, "HugoFragment.kt");
        int i = arsc.a;
        alvgVar.t("%s configuration has changed", new arrh(getClass()).c());
    }

    public boolean gD() {
        return false;
    }

    public boolean gE() {
        return false;
    }

    public agai(Integer num, agaj agajVar) {
        this.fx = num;
        this.aG = agajVar;
        this.fy = new agag(this);
        this.aL = armd.a(new afzg(this, 4));
        this.c = armd.a(new afzg(this, 3));
        this.d = armd.a(new afzg(this, 2));
        this.e = armd.a(new afzg(this, 5));
        this.ag = new agah(false, this);
        Instant instant = Instant.EPOCH;
        instant.getClass();
        this.ah = instant;
        Instant instant2 = Instant.EPOCH;
        instant2.getClass();
        this.aN = instant2;
        N().c(new agaf(0));
    }
}
