package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class hpz {
    private final Queue a = new ArrayDeque(20);

    public abstract hqk a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hqk b() {
        hqk hqkVar = (hqk) this.a.poll();
        if (hqkVar == null) {
            return a();
        }
        return hqkVar;
    }

    public final void c(hqk hqkVar) {
        if (this.a.size() < 20) {
            this.a.offer(hqkVar);
        }
    }
}
