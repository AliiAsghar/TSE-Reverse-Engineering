package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akjr implements akix {
    private volatile akja a;
    private alor b;
    private boolean c;
    private ansy d;

    public akjr(Map map, akja akjaVar) {
        this.a = akjaVar;
        this.b = alzz.bc(map);
    }

    @Override // defpackage.akix
    public final akja a() {
        return this.a;
    }

    @Override // defpackage.akix
    public final void b() {
        aiut.c();
        ansy ansyVar = this.d;
        ansyVar.getClass();
        this.b = (alor) ansyVar.a;
        ansyVar.getClass();
        this.a = (akja) ansyVar.b;
        this.c = false;
        this.d = null;
    }

    @Override // defpackage.akix
    public final boolean c() {
        aiut.c();
        if (this.d != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.akix
    public final boolean d(Map map, akja akjaVar) {
        aiut.c();
        alor bc = alzz.bc(map);
        if (this.c) {
            this.d = new ansy(bc, akjaVar, (byte[]) null);
            return false;
        }
        this.b = bc;
        this.a = akjaVar;
        return true;
    }

    @Override // defpackage.akix
    public final apuv e(String str, arqr arqrVar) {
        aiut.c();
        Object l = aqjn.l(this.b, str);
        l.getClass();
        apuv apuvVar = (apuv) l;
        if (!this.c) {
            arqrVar.a(this.a);
        }
        this.c = true;
        return apuvVar;
    }
}
