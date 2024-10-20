package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxz extends cwe {
    public cxz(cwf cwfVar) {
        super(cwfVar);
    }

    @Override // defpackage.cwe
    protected final int a(cyn cynVar, csh cshVar) {
        cyc z = cynVar.z();
        z.getClass();
        return z.ei(cshVar);
    }

    @Override // defpackage.cwe
    protected final long b(cyn cynVar, long j) {
        cyc z = cynVar.z();
        z.getClass();
        long j2 = z.h;
        int a = dre.a(j2);
        int b = dre.b(j2);
        return d.aH((Float.floatToRawIntBits(a) << 32) | (Float.floatToRawIntBits(b) & 4294967295L), j);
    }

    @Override // defpackage.cwe
    protected final Map c(cyn cynVar) {
        cyc z = cynVar.z();
        z.getClass();
        return z.H().m();
    }
}
