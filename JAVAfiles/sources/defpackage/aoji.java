package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoji implements aojm {
    private final String a;
    private final aojj b;

    public aoji(Set set, aojj aojjVar) {
        this.a = b(set);
        this.b = aojjVar;
    }

    private static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aojk aojkVar = (aojk) it.next();
            sb.append(aojkVar.a);
            sb.append('/');
            sb.append(aojkVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.aojm
    public final String a() {
        if (this.b.a().isEmpty()) {
            return this.a;
        }
        return this.a + " " + b(this.b.a());
    }
}
