package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class gfw extends oq {
    final RecyclerView c;
    final ecl d;
    final ecl e;

    public gfw(RecyclerView recyclerView) {
        super(recyclerView);
        this.d = ((oq) this).b;
        this.e = new gfv(this);
        this.c = recyclerView;
    }

    @Override // defpackage.oq
    public final ecl j() {
        return this.e;
    }
}
