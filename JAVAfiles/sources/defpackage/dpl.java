package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpl implements dpo {
    public cas a;

    public dpl() {
        cas casVar;
        if (ekt.g()) {
            casVar = a();
        } else {
            casVar = null;
        }
        this.a = casVar;
    }

    public final cas a() {
        ekt c = ekt.c();
        if (c.b() == 1) {
            return new dpq(true);
        }
        final byu byuVar = new byu(false, cav.a);
        c.k(new dyp() { // from class: dpl.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null);
            }

            @Override // defpackage.dyp
            public final void a(Throwable th) {
                this.a = dpp.a;
            }

            @Override // defpackage.dyp
            public final void b() {
                byn.this.h(true);
                this.a = new dpq(true);
            }
        });
        return byuVar;
    }
}
