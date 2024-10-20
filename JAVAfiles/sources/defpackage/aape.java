package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aape extends no {
    private final aapf c;

    public aape(aapf aapfVar) {
        this.c = aapfVar;
    }

    @Override // defpackage.no
    public final int b() {
        return this.c.a();
    }

    @Override // defpackage.no
    public final int c(int i) {
        return this.c.b(i).m();
    }

    @Override // defpackage.no
    public final /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        return new oo(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        this.c.b(i).e(ooVar.a);
    }

    public final void m() {
        for (int i = 0; i < this.c.a(); i++) {
            this.c.b(i);
        }
    }
}
