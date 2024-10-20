package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeby implements aecd {
    private final abnr a;
    private final Context b;

    public aeby(abnr abnrVar, Context context) {
        context.getClass();
        this.a = abnrVar;
        this.b = context;
    }

    private final void e(iaj iajVar) {
        this.a.h(iajVar, aglt.b(this.b, new aecc())).c();
    }

    private final aozy f(aecj aecjVar, aozb aozbVar) {
        aozy createBuilder = iaj.a.createBuilder();
        aozy createBuilder2 = iai.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        iai iaiVar = (iai) createBuilder2.b;
        iaiVar.b |= 16;
        iaiVar.c = aozbVar;
        String packageName = this.b.getPackageName();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        iai iaiVar2 = (iai) createBuilder2.b;
        packageName.getClass();
        iaiVar2.b |= 128;
        iaiVar2.d = packageName;
        long j = 0;
        if (!d.F(aecjVar.b, "")) {
            try {
                j = Long.parseLong(aecjVar.b);
            } catch (RuntimeException unused) {
            }
        }
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        iai iaiVar3 = (iai) apagVar;
        iaiVar3.b |= 512;
        iaiVar3.f = j;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        iai iaiVar4 = (iai) createBuilder2.b;
        iaiVar4.b |= 256;
        iaiVar4.e = 683537993L;
        iai iaiVar5 = (iai) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        iaj iajVar = (iaj) createBuilder.b;
        iaiVar5.getClass();
        iajVar.d = iaiVar5;
        iajVar.b |= 2;
        return createBuilder;
    }

    @Override // defpackage.aecd
    public final void a(aecj aecjVar, aozb aozbVar, iak iakVar) {
        aecjVar.getClass();
        aozy f = f(aecjVar, aozbVar);
        if (!f.b.isMutable()) {
            f.u();
        }
        iaj iajVar = (iaj) f.b;
        iaj iajVar2 = iaj.a;
        iajVar.f = iakVar;
        iajVar.b |= 8;
        apag s = f.s();
        s.getClass();
        e((iaj) s);
    }

    @Override // defpackage.aecd
    public final void b(aecj aecjVar, aozb aozbVar, ial ialVar) {
        aecjVar.getClass();
        aozy f = f(aecjVar, aozbVar);
        if (!f.b.isMutable()) {
            f.u();
        }
        iaj iajVar = (iaj) f.b;
        iaj iajVar2 = iaj.a;
        iajVar.e = ialVar;
        iajVar.b |= 4;
        apag s = f.s();
        s.getClass();
        e((iaj) s);
    }

    @Override // defpackage.aecd
    public final void c(aecj aecjVar, long j, aozb aozbVar, int i) {
        if (i != 0) {
        } else {
            throw null;
        }
    }

    @Override // defpackage.aecd
    public final void d(aecj aecjVar, aedm aedmVar) {
        aedmVar.getClass();
        aozy f = f(aecjVar, aedmVar.e);
        aozy createBuilder = iag.a.createBuilder();
        long g = arut.g(aedmVar.b);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        iag iagVar = (iag) createBuilder.b;
        iagVar.b |= 2;
        iagVar.e = g;
        aect aectVar = aedmVar.a;
        aozy createBuilder2 = iao.a.createBuilder();
        int Q = adcx.Q(aectVar.a) - 1;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        iao iaoVar = (iao) createBuilder2.b;
        iaoVar.b |= 1;
        iaoVar.c = Q;
        int P = adcx.P(aectVar.b) - 1;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        iao iaoVar2 = (iao) createBuilder2.b;
        iaoVar2.b |= 2;
        iaoVar2.d = P;
        apag s = createBuilder2.s();
        s.getClass();
        iao iaoVar3 = (iao) s;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        iag iagVar2 = (iag) createBuilder.b;
        iagVar2.d = iaoVar3;
        iagVar2.b |= 1;
        List<aede> list = aedmVar.c;
        ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
        for (aede aedeVar : list) {
            aozy createBuilder3 = iah.a.createBuilder();
            String str = aedeVar.c.a;
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar = createBuilder3.b;
            iah iahVar = (iah) apagVar;
            iahVar.b |= 1;
            iahVar.c = str;
            String str2 = aedeVar.c.b;
            if (!apagVar.isMutable()) {
                createBuilder3.u();
            }
            iah iahVar2 = (iah) createBuilder3.b;
            iahVar2.b |= 2;
            iahVar2.d = str2;
            long g2 = arut.g(aedeVar.b);
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            iah iahVar3 = (iah) createBuilder3.b;
            iahVar3.b |= 16;
            iahVar3.e = g2;
            adzz adzzVar = aedeVar.a;
            if (aedeVar.d != null) {
                aozy createBuilder4 = iaf.a.createBuilder();
                String str3 = aedeVar.d;
                str3.getClass();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                iaf iafVar = (iaf) createBuilder4.b;
                iafVar.b |= 1;
                iafVar.c = str3;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                iah iahVar4 = (iah) createBuilder3.b;
                iaf iafVar2 = (iaf) createBuilder4.s();
                iafVar2.getClass();
                iahVar4.f = iafVar2;
                iahVar4.b |= 32;
            }
            apag s2 = createBuilder3.s();
            s2.getClass();
            arrayList.add((iah) s2);
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        iag iagVar3 = (iag) createBuilder.b;
        apax apaxVar = iagVar3.c;
        if (!apaxVar.c()) {
            iagVar3.c = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(arrayList, iagVar3.c);
        apag s3 = createBuilder.s();
        s3.getClass();
        iag iagVar4 = (iag) s3;
        if (!f.b.isMutable()) {
            f.u();
        }
        iaj iajVar = (iaj) f.b;
        iaj iajVar2 = iaj.a;
        iajVar.c = iagVar4;
        iajVar.b |= 1;
        apag s4 = f.s();
        s4.getClass();
        e((iaj) s4);
    }
}
