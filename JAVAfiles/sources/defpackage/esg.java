package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esg {
    public static final esg a;
    public final alog b;

    static {
        int i = alog.d;
        a = new esg(alsx.a);
        eul.M(0);
    }

    public esg(List list) {
        this.b = alog.n(list);
    }

    public final boolean a() {
        return this.b.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            esf esfVar = (esf) this.b.get(i2);
            boolean[] zArr = esfVar.d;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (zArr[i3]) {
                    if (esfVar.a() == i) {
                        return true;
                    }
                } else {
                    i3++;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return alzz.at(this.b, ((esg) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
