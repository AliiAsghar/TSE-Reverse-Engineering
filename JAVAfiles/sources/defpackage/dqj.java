package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqj {
    public static final dqj a = new dqj(0);
    public static final dqj b = new dqj(1);
    public static final dqj c = new dqj(2);
    public final int d;

    public dqj(int i) {
        this.d = i;
    }

    public final boolean a(dqj dqjVar) {
        int i = this.d;
        if ((dqjVar.d | i) == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dqj) && this.d == ((dqj) obj).d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        if (this.d == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.d & b.d) != 0) {
            arrayList.add("Underline");
        }
        if ((this.d & c.d) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration.".concat(String.valueOf((String) arrayList.get(0)));
        }
        return "TextDecoration[" + dru.d(arrayList, ", ", null, 62) + ']';
    }
}
