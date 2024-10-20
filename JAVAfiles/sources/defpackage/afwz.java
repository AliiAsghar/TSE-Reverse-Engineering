package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwz extends no {
    public final afke c;
    public final arqr d;
    public final arqr e;
    public final aday g;
    private final arml h = armd.a(new afww(this, 4));
    public final List f = arnv.a;

    public afwz(aday adayVar, afke afkeVar, arqr arqrVar, arqr arqrVar2) {
        this.g = adayVar;
        this.c = afkeVar;
        this.d = arqrVar;
        this.e = arqrVar2;
    }

    @Override // defpackage.no
    public final int b() {
        return this.f.size();
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_row_layout, viewGroup, false);
        inflate.getClass();
        return new afwx(this, inflate);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        afwx afwxVar = (afwx) ooVar;
        afwxVar.getClass();
        z(afwxVar, i, arnv.a);
    }

    @Override // defpackage.no
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void z(afwx afwxVar, int i, List list) {
        afwxVar.getClass();
        list.getClass();
        if (((adwq) this.h.a()).f(afwxVar, i, list)) {
            return;
        }
        arro.b("userQuery");
        throw null;
    }
}
