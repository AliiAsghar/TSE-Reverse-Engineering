package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class annl {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static anxk a(anxi anxiVar) {
        aozy createBuilder = anxk.a.createBuilder();
        int i = anxiVar.b;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anxk) createBuilder.b).b = i;
        for (anxh anxhVar : anxiVar.c) {
            aozy createBuilder2 = anxj.a.createBuilder();
            anxf anxfVar = anxhVar.c;
            if (anxfVar == null) {
                anxfVar = anxf.a;
            }
            String str = anxfVar.b;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            str.getClass();
            ((anxj) apagVar).b = str;
            int Z = a.Z(anxhVar.d);
            if (Z == 0) {
                Z = 1;
            }
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            ((anxj) createBuilder2.b).c = a.ak(Z);
            anxp b = anxp.b(anxhVar.f);
            if (b == null) {
                b = anxp.UNRECOGNIZED;
            }
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((anxj) createBuilder2.b).e = b.a();
            int i2 = anxhVar.e;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((anxj) createBuilder2.b).d = i2;
            anxj anxjVar = (anxj) createBuilder2.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            anxk anxkVar = (anxk) createBuilder.b;
            anxjVar.getClass();
            apax apaxVar = anxkVar.c;
            if (!apaxVar.c()) {
                anxkVar.c = apag.mutableCopy(apaxVar);
            }
            anxkVar.c.add(anxjVar);
        }
        return (anxk) createBuilder.s();
    }
}
