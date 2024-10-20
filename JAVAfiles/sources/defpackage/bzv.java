package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzv implements arwe, bzt {
    public static final arpi a = new bwe();
    private final arpi b;
    private final arpi c;
    private volatile arpi d;

    public bzv(arpi arpiVar, arpi arpiVar2) {
        this.b = arpiVar;
        this.c = arpiVar2;
    }

    public final void a() {
        synchronized (this) {
            arpi arpiVar = this.d;
            if (arpiVar == null) {
                this.d = a;
            } else {
                arwi.w(arpiVar, new bxn());
            }
        }
    }

    @Override // defpackage.arwe
    public final arpi b() {
        arpi arpiVar = this.d;
        if (arpiVar == null || arpiVar == a) {
            synchronized (this) {
                arpiVar = this.d;
                if (arpiVar == null) {
                    arpi arpiVar2 = this.b;
                    arpiVar = arpiVar2.plus(new arxo((arxm) arpiVar2.get(arxm.c))).plus(this.c);
                } else if (arpiVar == a) {
                    arpi arpiVar3 = this.b;
                    arxo arxoVar = new arxo((arxm) arpiVar3.get(arxm.c));
                    arxoVar.v(new bxn());
                    arpiVar = arpiVar3.plus(arxoVar).plus(this.c);
                }
                this.d = arpiVar;
            }
        }
        arpiVar.getClass();
        return arpiVar;
    }

    @Override // defpackage.bzt
    public final void g() {
        a();
    }

    @Override // defpackage.bzt
    public final void h() {
        a();
    }

    @Override // defpackage.bzt
    public final void i() {
    }
}
