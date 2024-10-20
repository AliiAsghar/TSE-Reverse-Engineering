package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vdl {
    public static final /* synthetic */ int a = 0;

    static {
        uuh.h(uuh.b, "tachyon_cms_environment", "prod");
    }

    public static vcy a(armf armfVar, arky arkyVar, aqal aqalVar, vcv vcvVar) {
        if (((Boolean) armfVar.b()).booleanValue()) {
            return new vdb((arky) arkyVar.j(aoly.b, 8755), (aqal) aqalVar.j(aoly.b, 8755), Optional.empty(), vcvVar);
        }
        return new vdb(arkyVar, aqalVar, Optional.empty(), vcvVar);
    }
}
