package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aewp extends arrp implements arqw {
    final /* synthetic */ arqw a;
    final /* synthetic */ arqw b;
    final /* synthetic */ aewn c;
    final /* synthetic */ long d;
    final /* synthetic */ cmb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aewp(arqw arqwVar, arqw arqwVar2, aewn aewnVar, long j, cmb cmbVar) {
        super(3);
        this.a = arqwVar;
        this.b = arqwVar2;
        this.c = aewnVar;
        this.d = j;
        this.e = cmbVar;
    }

    public static final float b(byn bynVar) {
        return ((Number) bynVar.a()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [aap, java.lang.Object] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float f;
        float f2;
        float f3;
        float f4;
        cga cgaVar = (cga) obj;
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        cgaVar.getClass();
        bwjVar.y(-34819592);
        bwjVar.y(-1667750163);
        Object h = bwjVar.h();
        if (h == bwj.a.a) {
            h = new czj();
            bwjVar.B(h);
        }
        czj czjVar = (czj) h;
        bwjVar.q();
        bwjVar.y(-1667748392);
        Object h2 = bwjVar.h();
        if (h2 == bwj.a.a) {
            h2 = new czj();
            bwjVar.B(h2);
        }
        czj czjVar2 = (czj) h2;
        bwjVar.q();
        bwjVar.y(-1667746544);
        Object h3 = bwjVar.h();
        if (h3 == bwj.a.a) {
            h3 = new czj();
            bwjVar.B(h3);
        }
        czj czjVar3 = (czj) h3;
        bwjVar.q();
        bwjVar.y(-1667742924);
        Object h4 = bwjVar.h();
        if (h4 == bwj.a.a) {
            byu byuVar = new byu(Float.valueOf(brg.a), cav.a);
            bwjVar.B(byuVar);
            h4 = byuVar;
        }
        byn bynVar = (byn) h4;
        bwjVar.q();
        bwjVar.y(-1667739551);
        Object h5 = bwjVar.h();
        if (h5 == bwj.a.a) {
            h5 = new abd(true);
            bwjVar.B(h5);
        }
        abd abdVar = (abd) h5;
        bwjVar.q();
        abdVar.d(true);
        abt c = aby.c(abdVar, "placeholder_crossfade", bwjVar, 48, 0);
        arqw arqwVar = this.a;
        acg acgVar = aci.a;
        boolean booleanValue = ((Boolean) c.e()).booleanValue();
        bwjVar.y(-233744397);
        if (true != booleanValue) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        bwjVar.q();
        Float valueOf = Float.valueOf(f);
        boolean booleanValue2 = ((Boolean) c.f()).booleanValue();
        bwjVar.y(-233744397);
        if (true != booleanValue2) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        bwjVar.q();
        cas e = aby.e(c, valueOf, Float.valueOf(f2), arqwVar.a(c.d(), bwjVar, 0), acgVar, bwjVar, 196608);
        arqw arqwVar2 = this.b;
        acg acgVar2 = aci.a;
        boolean booleanValue3 = ((Boolean) c.e()).booleanValue();
        bwjVar.y(-211364743);
        if (true != booleanValue3) {
            f3 = 1.0f;
        } else {
            f3 = brg.a;
        }
        bwjVar.q();
        Float valueOf2 = Float.valueOf(f3);
        boolean booleanValue4 = ((Boolean) c.f()).booleanValue();
        bwjVar.y(-211364743);
        if (true != booleanValue4) {
            f4 = 1.0f;
        } else {
            f4 = brg.a;
        }
        bwjVar.q();
        cas e2 = aby.e(c, valueOf2, Float.valueOf(f4), arqwVar2.a(c.d(), bwjVar, 0), acgVar2, bwjVar, 196608);
        aaw b = this.c.b();
        bwjVar.y(-1667713921);
        bynVar.h(Float.valueOf(((Number) aay.a(aay.b(bwjVar), brg.a, 1.0f, b, bwjVar).a()).floatValue()));
        bwjVar.q();
        bwjVar.y(-1667704087);
        Object h6 = bwjVar.h();
        if (h6 == bwj.a.a) {
            h6 = new ckc();
            bwjVar.B(h6);
        }
        clp clpVar = (clp) h6;
        bwjVar.q();
        bwjVar.y(-1667701514);
        boolean F = bwjVar.F(this.d) | bwjVar.G(this.e) | bwjVar.G(this.c);
        cmb cmbVar = this.e;
        long j = this.d;
        aewn aewnVar = this.c;
        Object h7 = bwjVar.h();
        if (F || h7 == bwj.a.a) {
            h7 = cho.c(cgaVar, new aewo(clpVar, czjVar3, cmbVar, j, aewnVar, czjVar2, czjVar, e2, e, bynVar));
            bwjVar.B(h7);
        }
        cga cgaVar2 = (cga) h7;
        bwjVar.q();
        bwjVar.q();
        return cgaVar2;
    }
}
