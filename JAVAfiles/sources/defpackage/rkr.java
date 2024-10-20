package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rkr implements rkg {
    private static final String a = String.valueOf(((agmh) rkq.e.g).d()).concat("_expression");
    private static final String b = String.valueOf(((agmh) rkq.e.b).d()).concat("_expression");
    private static final String c = String.valueOf(((agmh) rkq.e.c).d()).concat("_expression");

    private static final void c(agoz agozVar, int i) {
        agof agofVar = new agof("conversation_participants_backup", "backup");
        jat jatVar = rkq.e;
        agofVar.b((agmh) jatVar.d, (agmh) jatVar.e, (agmh) jatVar.f, (agmh) jatVar.g, (agmh) jatVar.b, (agmh) jatVar.c);
        agofVar.c = agozVar;
        agofVar.d = i;
        agofVar.a().a();
    }

    @Override // defpackage.rkd
    public final void a() {
        rkm rkmVar = new rkm();
        rkmVar.e();
        rkmVar.a().V();
    }

    @Override // defpackage.rkd
    public final void b(rkc rkcVar) {
        sla a2 = sld.a();
        jat jatVar = sld.e;
        a2.c((skw) jatVar.d, (skw) jatVar.e, (skw) jatVar.f);
        agpk agpkVar = new agpk("$V", new Object[]{sld.e.b});
        String str = a;
        a2.n(agpkVar, str);
        agpk agpkVar2 = new agpk("0", new Object[0]);
        String str2 = b;
        a2.n(agpkVar2, str2);
        agpk agpkVar3 = new agpk("ROW_NUMBER() OVER()", new Object[0]);
        String str3 = c;
        a2.n(agpkVar3, str3);
        c(a2.b(), 0);
        if (rkcVar.a) {
            smm smmVar = new smm(smp.a);
            ifq ifqVar = smp.d;
            smmVar.c((smi) ifqVar.a, (smi) ifqVar.c, (smi) ifqVar.d);
            smmVar.n(new agpk("1", new Object[0]), str);
            smmVar.n(new agpk("1", new Object[0]), str2);
            smmVar.n(new agpk("$V + ROW_NUMBER() OVER()", new Object[]{Integer.valueOf(sld.a().b().i())}), str3);
            c(smmVar.b(), 4);
        }
    }
}
