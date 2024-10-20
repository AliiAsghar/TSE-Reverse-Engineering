package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaao extends GridLayoutManager {
    final /* synthetic */ aaar J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaao(aaar aaarVar, Context context, int i) {
        super(i);
        this.J = aaarVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final boolean ah() {
        if (this.J.ak.isShowing()) {
            return false;
        }
        return super.ah();
    }
}
