package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alvl extends alvz {
    public alvl(Class cls) {
        super("tags", cls, false);
    }

    @Override // defpackage.alvz
    public final /* bridge */ /* synthetic */ void a(Object obj, alvy alvyVar) {
        alzg alzgVar = new alzg((alzh) ((alzk) obj).c.d);
        while (alzgVar.hasNext()) {
            Map.Entry entry = (Map.Entry) alzgVar.next();
            if (!((Set) entry.getValue()).isEmpty()) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    alvyVar.a((String) entry.getKey(), it.next());
                }
            } else {
                alvyVar.a((String) entry.getKey(), null);
            }
        }
    }
}
