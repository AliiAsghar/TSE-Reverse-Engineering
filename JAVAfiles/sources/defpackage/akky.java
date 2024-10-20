package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akky implements eov {
    public final cg a;
    private final eov b;
    private final Set c;
    private final eov d;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    interface a {
        Map b();
    }

    public akky(cg cgVar, eov eovVar, Set set, ksa ksaVar) {
        this.a = cgVar;
        this.b = eovVar;
        this.c = set;
        this.d = new akkx(this, ksaVar);
    }

    @Override // defpackage.eov
    public final eor a(Class cls) {
        if (this.c.contains(cls.getName())) {
            return dyx.f();
        }
        return this.b.a(cls);
    }

    @Override // defpackage.eov
    public final eor b(Class cls, epd epdVar) {
        if (this.c.contains(cls.getName())) {
            return this.d.b(cls, epdVar);
        }
        return this.b.b(cls, epdVar);
    }

    @Override // defpackage.eov
    public final /* synthetic */ eor c(artf artfVar, epd epdVar) {
        return dyx.e(this, artfVar, epdVar);
    }
}
