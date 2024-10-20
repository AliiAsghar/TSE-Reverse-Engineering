package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqtm {
    private List a;
    private final aqrm b = aqrm.a;
    private Object[][] c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

    public final aqto a() {
        return new aqto(this.a, this.b, this.c);
    }

    public final void b(aqtn aqtnVar, Object obj) {
        int i = 0;
        while (true) {
            Object[][] objArr = this.c;
            if (i < objArr.length) {
                if (aqtnVar.equals(objArr[i][0])) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            Object[][] objArr2 = this.c;
            int length = objArr2.length;
            Object[][] objArr3 = (Object[][]) Array.newInstance((Class<?>) Object.class, length + 1, 2);
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            this.c = objArr3;
            i = objArr3.length - 1;
        }
        Object[][] objArr4 = this.c;
        Object[] objArr5 = new Object[2];
        objArr5[0] = aqtnVar;
        objArr5[1] = obj;
        objArr4[i] = objArr5;
    }

    public final void c(List list) {
        d.t(!list.isEmpty(), "addrs is empty");
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
