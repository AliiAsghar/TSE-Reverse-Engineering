package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbn extends no {
    private final LayoutInflater c;
    private final abbm d;

    public abbn(Context context, abbm abbmVar) {
        this.c = new abbd(context);
        this.d = abbmVar;
    }

    @Override // defpackage.no
    public final int b() {
        return 0;
    }

    @Override // defpackage.no
    public final oo e(ViewGroup viewGroup, int i) {
        return this.d.a(viewGroup, i, this.c);
    }

    @Override // defpackage.no
    public final void g(oo ooVar, int i) {
    }
}
