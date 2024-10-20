package com.google.android.libraries.compose.ui.views.recycler.reactive;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import defpackage.adwo;
import defpackage.aeke;
import defpackage.agfy;
import defpackage.aggb;
import defpackage.aggc;
import defpackage.aggd;
import defpackage.agge;
import defpackage.aggf;
import defpackage.aggg;
import defpackage.armd;
import defpackage.arml;
import defpackage.arrr;
import defpackage.arsc;
import defpackage.arsn;
import defpackage.artm;
import defpackage.arwe;
import defpackage.od;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ReactiveGridLayoutManager extends GridLayoutManager {
    static final /* synthetic */ artm[] J;
    public final aggg K;
    public RecyclerView L;
    private final arml M;
    private final arsn N;
    private final adwo O;

    static {
        arrr arrrVar = new arrr(ReactiveGridLayoutManager.class, "observer", "getObserver()Lcom/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver;", 0);
        int i = arsc.a;
        J = new artm[]{arrrVar};
    }

    public ReactiveGridLayoutManager(adwo adwoVar, int i, aggg agggVar) {
        super(1, 1);
        this.O = adwoVar;
        this.K = agggVar;
        this.M = armd.a(new agge(i));
        this.N = new aggf();
        aeke aekeVar = agggVar.b;
        this.g = new aggc(this);
    }

    private final agfy bJ() {
        return (agfy) this.M.a();
    }

    private final void bK(aggb aggbVar) {
        this.N.d(J[0], aggbVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final void Y(RecyclerView recyclerView, od odVar) {
        odVar.getClass();
        bJ().b(recyclerView);
        this.L = null;
        bK((aggb) null);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    @Override // defpackage.nw
    public final void aT(RecyclerView recyclerView) {
        this.L = recyclerView;
        bJ().a(recyclerView);
        aggd aggdVar = new aggd(this, 1);
        aggd aggdVar2 = new aggd(this, 0);
        arwe arweVar = (arwe) this.O.a.b();
        arweVar.getClass();
        bK(new aggb(arweVar, recyclerView, this, aggdVar, aggdVar2));
    }
}
