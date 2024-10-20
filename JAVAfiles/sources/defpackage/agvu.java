package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agvu implements agvx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public agvu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.agvx
    public final void a(int i, int i2) {
        agwm agwmVar;
        int e;
        int i3;
        if (this.b == 0) {
            agwf agwfVar = ((agvz) this.a).x;
            if (agwfVar != null && (e = agvz.e(i)) <= agwfVar.b() - 1 && e != (i3 = agwfVar.d)) {
                agwfVar.d = e;
                if (i3 != -1) {
                    agwfVar.r(i3, false);
                }
                agwfVar.r(agwfVar.d, true);
            }
            agvz agvzVar = (agvz) this.a;
            RecyclerView recyclerView = agvzVar.v;
            if (recyclerView != null && (agwmVar = agvzVar.d) != null && agwmVar.k) {
                recyclerView.ae(agvz.e(i));
            }
            agvz agvzVar2 = (agvz) this.a;
            if (agvzVar2.y != null && i == 0) {
                aguz aguzVar = agvzVar2.m;
                agvj agvjVar = (agvj) agvzVar2.i.get();
                agvz agvzVar3 = (agvz) this.a;
                albo.bR(aglo.z(aguzVar, agvjVar, agvzVar3.s, agvzVar3.e, agvzVar3.f, agvzVar3.p), new adnx(this, 7), agtz.b);
            }
            agvx agvxVar = ((agvz) this.a).c;
            if (agvxVar != null && i2 == 3) {
                ahjj ahjjVar = (ahjj) ((afpg) ((agvu) agvxVar).a).f.a();
                if (ahjjVar.b() == agdp.b) {
                    ahjjVar.d(agdp.a);
                    return;
                } else {
                    ahjjVar.c(false);
                    return;
                }
            }
            return;
        }
        throw null;
    }
}
