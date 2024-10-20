package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aggf extends arsm {
    public aggf() {
        super(null);
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        int width;
        aggb aggbVar = (aggb) obj2;
        aggb aggbVar2 = (aggb) obj;
        if (aggbVar2 != null) {
            ((alvg) aggb.b.d().h("com/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver", "detach", 82, "LayoutManagerSizeObserver.kt")).q("Stopped observing size of RecyclerView");
            aggbVar2.a(null);
        }
        if (aggbVar != null) {
            if (((Number) aggbVar.f.a(aggbVar.e)).intValue() == 0) {
                width = aggbVar.d.getHeight();
            } else {
                width = aggbVar.d.getWidth();
            }
            Integer valueOf = Integer.valueOf(width);
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                aggbVar.g.a(Integer.valueOf(valueOf.intValue()));
            }
            aggbVar.a(arrn.J(aggbVar.c, null, null, new afju(aggbVar, valueOf, (arpe) null, 8), 3));
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
