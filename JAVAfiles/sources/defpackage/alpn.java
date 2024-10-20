package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alpn implements Serializable {
    private static final long serialVersionUID = 0;
    private final alor a;

    public alpn(alor alorVar) {
        this.a = alorVar;
    }

    Object readResolve() {
        if (!this.a.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            aluq listIterator = this.a.entrySet().listIterator();
            while (listIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) listIterator.next();
                alzz.aY((alst) entry.getKey(), entry.getValue(), arrayList);
            }
            return alzz.aX(arrayList);
        }
        return alpo.a;
    }
}
