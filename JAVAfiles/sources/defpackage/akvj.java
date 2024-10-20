package defpackage;

import android.util.SparseArray;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akvj implements akta, akib {
    private final ArrayDeque a = new ArrayDeque(20);

    @Override // defpackage.akta
    public final void b(aktq aktqVar, SparseArray sparseArray) {
        synchronized (this.a) {
            if (this.a.size() == 20) {
                this.a.removeFirst();
            }
            this.a.addLast(aktqVar);
        }
    }
}
