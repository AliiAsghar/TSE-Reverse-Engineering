package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class affy {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/cameragallery/data/GalleryLoaderImpl");
    public final arwe b;
    public final aful c;
    public final afdv d;
    public final afke e;
    public final afhw f;
    public final affv g;
    public final arml h;

    public affy(arwe arweVar, Optional optional, aful afulVar, afdv afdvVar, afke afkeVar, armf armfVar, afhw afhwVar) {
        afhw afhwVar2;
        this.b = arweVar;
        this.c = afulVar;
        this.d = afdvVar;
        this.e = afkeVar;
        if (afhwVar == null) {
            afhwVar2 = new afhw(null, null, null, false, false, false, false, 1023);
        } else {
            afhwVar2 = afhwVar;
        }
        this.f = afhwVar2;
        armd.a(new aetz(armfVar, 15));
        this.g = (affv) arsd.k(optional);
        this.h = armd.a(new aetz(this, 16));
    }
}
