package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class afoe implements asaj, arrk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public afoe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.arrk
    public final armh b() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return new arrd(2, this.a, afpg.class, "onContainerWidthChanged", "onContainerWidthChanged(I)V", 4);
            }
            return new arrm(2, this.a, gdt.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
        return new arrd(2, this.a, afof.class, "onRecyclerViewWidthChanged", "onRecyclerViewWidthChanged(I)V", 4);
    }

    public final boolean equals(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (!(obj instanceof asaj) || !(obj instanceof arrk)) {
                    return false;
                }
                return d.F(b(), ((arrk) obj).b());
            }
            if (!(obj instanceof asaj) || !(obj instanceof arrk)) {
                return false;
            }
            return d.F(b(), ((arrk) obj).b());
        }
        if (!(obj instanceof asaj) || !(obj instanceof arrk)) {
            return false;
        }
        return d.F(b(), ((arrk) obj).b());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [gdt, java.lang.Object] */
    @Override // defpackage.asaj
    public final /* synthetic */ Object fv(Object obj, arpe arpeVar) {
        int i = this.b;
        adef adefVar = null;
        Object obj2 = null;
        if (i != 0) {
            if (i != 1) {
                int intValue = ((Number) obj).intValue();
                Object obj3 = ((afpg) this.a).l;
                if (true == (obj3 instanceof agvz)) {
                    obj2 = obj3;
                }
                if (obj2 != null) {
                    agvz agvzVar = (agvz) obj2;
                    agvzVar.d().f = intValue;
                    agvzVar.d().p();
                    agwf agwfVar = agvzVar.x;
                    if (agwfVar != null) {
                        agwfVar.p();
                    }
                }
                return arnb.a;
            }
            Object a = this.a.a((gpx) obj, arpeVar);
            if (a == arpl.a) {
                return a;
            }
            return arnb.a;
        }
        int intValue2 = ((Number) obj).intValue();
        Object obj4 = this.a;
        Context y = ((cg) obj4).y();
        afof afofVar = (afof) obj4;
        afofVar.e().K(y, intValue2);
        afofVar.o().K(y, intValue2);
        GridLayoutManager gridLayoutManager = afofVar.aj;
        if (gridLayoutManager != null) {
            gridLayoutManager.r(afofVar.e().f);
        }
        adef adefVar2 = afofVar.ao;
        if (adefVar2 == null) {
            arro.b("views");
        } else {
            adefVar = adefVar2;
        }
        ((RecyclerView) adefVar.d).ai(afofVar.e().f * 12);
        return arnb.a;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return b().hashCode();
            }
            return b().hashCode();
        }
        return b().hashCode();
    }
}
