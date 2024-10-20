package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agbr extends View {
    public final Set a;

    public agbr(Context context) {
        super(context);
        this.a = new LinkedHashSet();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((agbq) it.next()).c(z);
        }
    }
}
