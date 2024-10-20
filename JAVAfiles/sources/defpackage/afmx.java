package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class afmx extends afnb {
    public abstract aflu b(aflq aflqVar, aflr aflrVar);

    public abstract Set c();

    @Override // defpackage.afnb
    public final Set f() {
        int size = c().size();
        arml armlVar = aflr.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet(size * afwv.S().size());
        for (aflq aflqVar : c()) {
            for (aflr aflrVar : afwv.S()) {
                aflrVar.getClass();
                linkedHashSet.add(b(aflqVar, aflrVar));
            }
        }
        return linkedHashSet;
    }
}
