package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atnv implements Serializable {
    private static final long serialVersionUID = -125354057735389003L;
    private TreeSet a = new TreeSet();

    private atnv() {
    }

    private static void c(atkv atkvVar, TreeSet treeSet, int i) {
        int intValue = ((((Integer) treeSet.last()).intValue() & 255) >> 3) + 1;
        int[] iArr = new int[intValue];
        atkvVar.g(i);
        atkvVar.g(intValue);
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            int i2 = (intValue2 & 255) >> 3;
            iArr[i2] = (1 << (7 - (intValue2 % 8))) | iArr[i2];
        }
        for (int i3 = 0; i3 < intValue; i3++) {
            atkvVar.g(iArr[i3]);
        }
    }

    public final void a(atkv atkvVar) {
        if (this.a.size() == 0) {
            return;
        }
        TreeSet treeSet = new TreeSet();
        Iterator it = this.a.iterator();
        int i = -1;
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            int i2 = intValue >> 8;
            if (i2 != i) {
                if (treeSet.size() > 0) {
                    c(atkvVar, treeSet, i);
                    treeSet.clear();
                }
                i = i2;
            }
            treeSet.add(new Integer(intValue));
        }
        c(atkvVar, treeSet, i);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            stringBuffer.append(atnu.a(((Integer) it.next()).intValue()));
            if (it.hasNext()) {
                stringBuffer.append(' ');
            }
        }
        return stringBuffer.toString();
    }

    public atnv(atkt atktVar) {
        while (atktVar.d() > 0) {
            if (atktVar.d() >= 2) {
                int c = atktVar.c();
                int c2 = atktVar.c();
                if (c2 > atktVar.d()) {
                    throw new atoc("invalid bitmap");
                }
                for (int i = 0; i < c2; i++) {
                    int c3 = atktVar.c();
                    if (c3 != 0) {
                        for (int i2 = 0; i2 < 8; i2++) {
                            if (((1 << (7 - i2)) & c3) != 0) {
                                this.a.add(atma.b((c * 256) + (i * 8) + i2));
                            }
                        }
                    }
                }
            } else {
                throw new atoc("invalid bitmap descriptor");
            }
        }
    }
}
