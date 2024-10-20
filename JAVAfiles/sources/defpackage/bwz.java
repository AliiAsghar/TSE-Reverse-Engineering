package defpackage;

import defpackage.cdm;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwz {
    public static final byx a(bzd[] bzdVarArr, byx byxVar, byx byxVar2) {
        cdm.a aVar = new cdm.a(cdm.d);
        for (bzd bzdVar : bzdVarArr) {
            bwv bwvVar = bzdVar.a;
            if (bzdVar.f || !c(byxVar, bwvVar)) {
                cax caxVar = (cax) byxVar2.get(bwvVar);
                bzdVar.getClass();
                aVar.put(bwvVar, ((bzc) bwvVar).b(bzdVar, caxVar));
            }
        }
        return aVar.b();
    }

    public static final Object b(byx byxVar, bwv bwvVar) {
        bwvVar.getClass();
        Object obj = byxVar.get(bwvVar);
        if (obj == null) {
            obj = bwvVar.a();
        }
        return ((cax) obj).a(byxVar);
    }

    public static final boolean c(byx byxVar, bwv bwvVar) {
        return byxVar.containsKey(bwvVar);
    }
}
