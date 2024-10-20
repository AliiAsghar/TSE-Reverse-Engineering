package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ante implements anmw {
    public final String a;
    final Class b;
    public final int c;

    public ante(String str, Class cls, int i) {
        this.a = str;
        this.b = cls;
        this.c = i;
    }

    @Override // defpackage.anmw
    public final anxf a(aozb aozbVar) {
        aozy createBuilder = anxg.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        String str = this.a;
        apag apagVar = createBuilder.b;
        ((anxg) apagVar).b = str;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        aozbVar.getClass();
        ((anxg) apagVar2).c = aozbVar;
        anxp anxpVar = anxp.RAW;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        ((anxg) createBuilder.b).d = anxpVar.a();
        anuf b = antq.a.b(antk.a.b(antq.a.g(anub.a((anxg) createBuilder.s())), null), anua.class, annj.a);
        aozy createBuilder2 = anxf.a.createBuilder();
        anua anuaVar = (anua) b;
        String str2 = anuaVar.a;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar3 = createBuilder2.b;
        str2.getClass();
        ((anxf) apagVar3).b = str2;
        aozb aozbVar2 = anuaVar.c;
        if (!apagVar3.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar4 = createBuilder2.b;
        aozbVar2.getClass();
        ((anxf) apagVar4).c = aozbVar2;
        int i = anuaVar.f;
        if (!apagVar4.isMutable()) {
            createBuilder2.u();
        }
        ((anxf) createBuilder2.b).d = a.am(i);
        return (anxf) createBuilder2.s();
    }

    @Override // defpackage.anmw
    public final Class b() {
        return this.b;
    }

    @Override // defpackage.anmw
    public final Object c(aozb aozbVar) {
        return antp.a.c(antq.a.a(anua.a(this.a, aozbVar, this.c, anxp.RAW, null), annj.a), this.b);
    }

    @Override // defpackage.anmw
    public final String d() {
        return this.a;
    }
}
