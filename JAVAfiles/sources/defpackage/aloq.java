package defpackage;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class aloq implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    public aloq(alor alorVar) {
        Object[] objArr = new Object[alorVar.size()];
        Object[] objArr2 = new Object[alorVar.size()];
        aluq listIterator = alorVar.entrySet().listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    public alok a(int i) {
        return new alok(i);
    }

    final Object readResolve() {
        Object obj = this.a;
        if (!(obj instanceof alpt)) {
            Object obj2 = this.b;
            Object[] objArr = (Object[]) obj;
            alok a = a(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                a.h(objArr[i], ((Object[]) obj2)[i]);
            }
            return a.b();
        }
        alpt alptVar = (alpt) obj;
        alnu alnuVar = (alnu) this.b;
        alok a2 = a(alptVar.size());
        aluq listIterator = alptVar.listIterator();
        aluq listIterator2 = alnuVar.listIterator();
        while (listIterator.hasNext()) {
            a2.h(listIterator.next(), listIterator2.next());
        }
        return a2.b();
    }
}
