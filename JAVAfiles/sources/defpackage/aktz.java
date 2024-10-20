package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aktz implements aryk {
    public static final akty a = new akty();
    public final aksb b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final aktx f;

    public aktz(aksb aksbVar, boolean z, boolean z2, boolean z3) {
        this.b = aksbVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        boolean z4 = false;
        if (z && !z2) {
            z4 = true;
        }
        this.f = new aktx(aksbVar, z4);
    }

    @Override // defpackage.aryk
    public final /* bridge */ /* synthetic */ Object a(arpi arpiVar) {
        arpiVar.getClass();
        akru b = akqj.b();
        aktx aktxVar = b.e;
        akry akryVar = b.c;
        aktx aktxVar2 = this.f;
        b.e = aktxVar2;
        akqj.w(b, aktxVar2.a, 1);
        return new alhm(akryVar, aktxVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, akry] */
    @Override // defpackage.aryk
    public final /* bridge */ /* synthetic */ void b(arpi arpiVar, Object obj) {
        alhm alhmVar = (alhm) obj;
        arpiVar.getClass();
        alhmVar.getClass();
        ?? r3 = alhmVar.b;
        akru b = akqj.b();
        akqj.w(b, r3, 3);
        b.e = (aktx) alhmVar.a;
    }

    public final aktz c() {
        boolean z;
        boolean z2;
        boolean z3;
        aktx aktxVar = akqj.b().e;
        if (aktxVar != null) {
            z = aktxVar.e();
        } else {
            z = false;
        }
        boolean z4 = true;
        if (aktxVar != null) {
            z2 = aktxVar.b;
        } else {
            z2 = true;
        }
        aksb aksbVar = this.b;
        if (!akqj.a && !this.c && !this.e) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((z2 && !z && !this.d && !this.f.e()) || this.e) {
            z4 = false;
        }
        return new aktz(aksbVar, z3, z4, false);
    }

    @Override // defpackage.arpi
    public final <R> R fold(R r, arqv<? super R, ? super arpg, ? extends R> arqvVar) {
        return (R) arhi.k(this, r, arqvVar);
    }

    @Override // defpackage.arpg, defpackage.arpi
    public final <E extends arpg> E get(arph<E> arphVar) {
        return (E) arhi.l(this, arphVar);
    }

    @Override // defpackage.arpg
    public final arph<?> getKey() {
        return a;
    }

    @Override // defpackage.arpi
    public final arpi minusKey(arph<?> arphVar) {
        return arhi.m(this, arphVar);
    }

    @Override // defpackage.arpi
    public final arpi plus(arpi arpiVar) {
        return arhi.n(this, arpiVar);
    }
}
