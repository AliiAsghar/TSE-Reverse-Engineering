package defpackage;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajlx {
    public int a;
    public boolean b;
    public final Object c;

    public ajlx(FloatingActionButton floatingActionButton) {
        this.b = false;
        this.a = 0;
        this.c = floatingActionButton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(asqc asqcVar) {
        if (asqcVar != null && ((WeakReference) this.c).get() == asqcVar) {
            return true;
        }
        return false;
    }

    public ajlx(int i, asqc asqcVar) {
        this.c = new WeakReference(asqcVar);
        this.a = i;
    }
}
