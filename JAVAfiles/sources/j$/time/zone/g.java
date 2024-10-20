package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

/* loaded from: classes5.dex */
final class g implements PrivilegedAction {
    final /* synthetic */ ArrayList a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                i iVar = (i) i.class.cast(Class.forName(property, true, i.class.getClassLoader()).newInstance());
                i.e(iVar);
                this.a.add(iVar);
                return null;
            } catch (Exception e) {
                throw new Error(e);
            }
        }
        i.e(new h());
        return null;
    }
}
