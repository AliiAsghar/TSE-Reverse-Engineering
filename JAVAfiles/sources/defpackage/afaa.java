package defpackage;

import defpackage.bwj;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afaa extends arrp implements arqv {
    final /* synthetic */ arqy a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ahhm c;
    final /* synthetic */ boolean d;
    final /* synthetic */ arqw e;
    final /* synthetic */ bse f;
    final /* synthetic */ arqv g;
    final /* synthetic */ arqv h;
    final /* synthetic */ blh i;
    final /* synthetic */ arqr j;
    final /* synthetic */ arqv k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afaa(arqy arqyVar, boolean z, ahhm ahhmVar, boolean z2, arqw arqwVar, bse bseVar, arqv arqvVar, arqv arqvVar2, blh blhVar, arqr arqrVar, arqv arqvVar3) {
        super(2);
        this.a = arqyVar;
        this.b = z;
        this.c = ahhmVar;
        this.d = z2;
        this.e = arqwVar;
        this.f = bseVar;
        this.g = arqvVar;
        this.h = arqvVar2;
        this.i = blhVar;
        this.j = arqrVar;
        this.k = arqvVar3;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        boolean z;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            arqy arqyVar = this.a;
            boolean z2 = this.b;
            ahhm ahhmVar = this.c;
            boolean z3 = this.d;
            Boolean valueOf = Boolean.valueOf(z2);
            if (z3 && !this.b) {
                z = true;
            } else {
                z = false;
            }
            afad.b((aezm) arqyVar.f(valueOf, ahhmVar, Boolean.valueOf(z), bwjVar, 0), (afae) this.e.a(afaf.a(this.f), bwjVar, 0), (aezu) this.g.a(bwjVar, 0), this.h, bwjVar, 0);
            blh blhVar = this.i;
            bwjVar.y(-1810928453);
            boolean G = bwjVar.G(this.j) | bwjVar.G(this.k);
            arqr arqrVar = this.j;
            arqv arqvVar = this.k;
            Object h = bwjVar.h();
            if (G || h == bwj.a.a) {
                h = new aafa(arqrVar, arqvVar, (arpe) null, 18);
                bwjVar.B(h);
            }
            bwjVar.q();
            bxl.g(blhVar, (arqv) h, bwjVar);
        }
        return arnb.a;
    }
}
