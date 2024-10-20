package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoy {
    public static final epc a = new eok();
    private final euu b;

    public eoy(efu efuVar, eov eovVar) {
        this(efuVar, eovVar, epb.a);
    }

    public final eor a(Class cls) {
        return b(armd.f(cls));
    }

    public final eor b(artf artfVar) {
        String b = artfVar.b();
        if (b != null) {
            return this.b.a(artfVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final eor c(String str, Class cls) {
        return this.b.a(armd.f(cls), str);
    }

    public eoy(efu efuVar, eov eovVar, epd epdVar) {
        eovVar.getClass();
        epdVar.getClass();
        this.b = new euu(efuVar, eovVar, epdVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public eoy(defpackage.eoz r3) {
        /*
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof defpackage.enb
            efu r1 = r3.aL()
            if (r0 == 0) goto L13
            r0 = r3
            enb r0 = (defpackage.enb) r0
            eov r0 = r0.P()
            goto L15
        L13:
            epg r0 = defpackage.epg.a
        L15:
            epd r3 = defpackage.dzd.j(r3)
            r2.<init>(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eoy.<init>(eoz):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public eoy(eoz eozVar, eov eovVar) {
        this(eozVar.aL(), eovVar, dzd.j(eozVar));
        eozVar.getClass();
    }
}
