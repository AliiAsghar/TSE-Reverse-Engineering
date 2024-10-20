package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsd {
    private static final Queue a = new ArrayDeque(0);
    private int b;
    private int c;
    private Object d;

    private hsd() {
    }

    public static hsd a(Object obj, int i, int i2) {
        hsd hsdVar;
        Queue queue = a;
        synchronized (queue) {
            hsdVar = (hsd) queue.poll();
        }
        if (hsdVar == null) {
            hsdVar = new hsd();
        }
        hsdVar.d = obj;
        hsdVar.c = i;
        hsdVar.b = i2;
        return hsdVar;
    }

    public final void b() {
        Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hsd) {
            hsd hsdVar = (hsd) obj;
            if (this.c == hsdVar.c && this.b == hsdVar.b && this.d.equals(hsdVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d.hashCode();
    }
}
