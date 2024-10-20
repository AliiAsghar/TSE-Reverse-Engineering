package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akhy extends no {
    public final algj c;
    public List e;
    private final algk f;
    private final arrt g = new arrt((char[]) null);
    public final akhs d = new akhv(this);

    public akhy(algk algkVar, algj algjVar) {
        this.f = algkVar;
        this.c = algjVar;
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
        return this.g.d((akhz) this.f.apply(this.e.get(i)));
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        return new akhx(this.g.e(i).a(viewGroup));
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        akhx akhxVar = (akhx) ooVar;
        akhz e = this.g.e(akhxVar.f);
        try {
            e.b(akhxVar.s, this.e.get(i));
        } catch (ClassCastException e2) {
            throw new IllegalStateException(String.format("Attempting to bind data with an incompatible ViewBinder class (%s). Check that your ViewBinder function is correct.", e), e2);
        }
    }

    @Override // defpackage.no
    public final void gJ(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        boolean z = true;
        if (recyclerView.q && (layoutParams.height == -2 || layoutParams.width == -2)) {
            z = false;
        }
        albo.U(z, "RecyclerViews that use WRAP_CONTENT with setHasFixedSize(true) won't resize on new data.");
        recyclerView.af(new akhw(this, recyclerView));
    }

    @Override // defpackage.no
    public final void gK(RecyclerView recyclerView) {
        oq oqVar = recyclerView.Q;
        if (oqVar instanceof akhw) {
            recyclerView.af(((akhw) oqVar).c);
        }
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void k(oo ooVar) {
        akhx akhxVar = (akhx) ooVar;
        this.g.e(akhxVar.f).c(akhxVar.s);
    }
}
