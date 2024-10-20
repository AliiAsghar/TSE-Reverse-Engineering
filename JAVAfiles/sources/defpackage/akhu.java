package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akhu extends no {
    public final algj c;
    public final akhs d;
    public List e;
    private final algk f;
    private final algk g;
    private final arrt h;

    public akhu(algk algkVar, algk algkVar2, algj algjVar, akhs akhsVar, arrt arrtVar) {
        this.f = algkVar;
        this.g = algkVar2;
        this.c = algjVar;
        this.d = akhsVar;
        this.h = arrtVar;
    }

    @Override // defpackage.no
    public final int b() {
        List list = this.e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.no
    public final int c(int i) {
        this.e.get(i);
        return this.h.d((akhz) ((algm) this.f).a);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        return new akhx(this.h.e(i).a(viewGroup), (byte[]) null);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        akhx akhxVar = (akhx) ooVar;
        akhz e = this.h.e(akhxVar.f);
        try {
            e.b(akhxVar.s, this.e.get(i));
        } catch (ClassCastException e2) {
            throw new IllegalStateException(String.format("Attempting to bind data with an incompatible ViewBinder class (%s). Check that your ViewBinder function is correct.", e), e2);
        }
    }

    @Override // defpackage.no
    public final long gI(int i) {
        if (this.e != null) {
            return this.g.apply(r0.get(i)).hashCode();
        }
        return -1L;
    }

    @Override // defpackage.no
    public final void gJ(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        boolean z = true;
        if (recyclerView.q && b() <= 0 && (layoutParams.height == -2 || layoutParams.width == -2)) {
            z = false;
        }
        albo.U(z, "RecyclerViews that use WRAP_CONTENT with setHasFixedSize(true) won't resize on new data. If you have static data, you should set it on the adapter before setAdapter().");
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void k(oo ooVar) {
        akhx akhxVar = (akhx) ooVar;
        this.h.e(akhxVar.f).c(akhxVar.s);
    }
}
