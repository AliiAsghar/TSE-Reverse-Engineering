package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class v implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean a = false;
    public final List b = new ArrayList();

    public final void a(u uVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            String str = uVar.a;
            if (str.equals(((u) it.next()).a)) {
                throw new IllegalArgumentException("Duplicate keyword: ".concat(String.valueOf(str)));
            }
        }
        this.b.add(uVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (u uVar : this.b) {
            if (sb.length() != 0) {
                sb.append(";  ");
            }
            sb.append(uVar);
        }
        return sb.toString();
    }
}
