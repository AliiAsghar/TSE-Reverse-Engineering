package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.List;
import java.util.function.IntPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irq extends oq {
    public final IntPredicate c;
    public final aksr d;
    public boolean e;
    public alog f;
    private final ecl g;

    public irq(RecyclerView recyclerView, IntPredicate intPredicate, aksr aksrVar) {
        super(recyclerView);
        this.g = new irp(this);
        this.e = false;
        this.c = intPredicate;
        this.d = aksrVar;
    }

    @Override // defpackage.oq
    public final ecl j() {
        return this.g;
    }

    public final void l(List list) {
        alog alogVar = null;
        boolean z = true;
        if (list != null && list.contains(null)) {
            z = false;
        }
        d.t(z, "Setting menu items for MessageListAccessibilityDelegate where at least one item is null");
        if (list != null) {
            alogVar = alog.n(list);
        }
        this.f = alogVar;
    }
}
