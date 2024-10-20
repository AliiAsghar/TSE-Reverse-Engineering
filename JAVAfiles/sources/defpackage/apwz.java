package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apwz implements eov {
    public static final epc a = new eok();
    private final Map b;
    private final eov c;
    private final eov d;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        Map a();

        Map b();
    }

    public apwz(Map map, eov eovVar, ksc kscVar) {
        this.b = map;
        this.c = eovVar;
        this.d = new apxc(kscVar, 1);
    }

    @Override // defpackage.eov
    public final eor a(Class cls) {
        if (this.b.containsKey(cls)) {
            return dyx.f();
        }
        return this.c.a(cls);
    }

    @Override // defpackage.eov
    public final eor b(Class cls, epd epdVar) {
        if (this.b.containsKey(cls)) {
            return this.d.b(cls, epdVar);
        }
        return this.c.b(cls, epdVar);
    }

    @Override // defpackage.eov
    public final /* synthetic */ eor c(artf artfVar, epd epdVar) {
        return dyx.e(this, artfVar, epdVar);
    }
}
