package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fum implements fuh {
    final /* synthetic */ fuo a;
    private final fjl b = new fjl(new byte[4], (byte[]) null);

    public fum(fuo fuoVar) {
        this.a = fuoVar;
    }

    @Override // defpackage.fuh
    public final void a(euf eufVar) {
        if (eufVar.j() == 0 && (eufVar.j() & 128) != 0) {
            eufVar.K(6);
            int b = eufVar.b() / 4;
            for (int i = 0; i < b; i++) {
                eufVar.L(this.b, 4);
                fjl fjlVar = this.b;
                int i2 = fjlVar.i(16);
                fjlVar.s(3);
                if (i2 == 0) {
                    this.b.s(13);
                } else {
                    int i3 = this.b.i(13);
                    if (this.a.b.get(i3) == null) {
                        fuo fuoVar = this.a;
                        fuoVar.b.put(i3, new fui(new fun(fuoVar, i3)));
                        this.a.f++;
                    }
                }
            }
            this.a.b.remove(0);
        }
    }

    @Override // defpackage.fuh
    public final void b(euj eujVar, flw flwVar, fuq fuqVar) {
    }
}
