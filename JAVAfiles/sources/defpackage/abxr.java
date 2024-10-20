package defpackage;

import android.os.Bundle;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abxr {
    public abxs a;
    public Bundle b;
    public LinkedList c;
    private final ahjj d = new ahjj(this, (byte[]) null);

    public final void a(int i) {
        while (!this.c.isEmpty() && ((abxq) this.c.getLast()).a() >= i) {
            this.c.removeLast();
        }
    }

    public final void b(Bundle bundle, abxq abxqVar) {
        if (this.a != null) {
            abxqVar.b();
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(abxqVar);
        if (bundle != null) {
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        c(this.d);
    }

    protected abstract void c(ahjj ahjjVar);
}
