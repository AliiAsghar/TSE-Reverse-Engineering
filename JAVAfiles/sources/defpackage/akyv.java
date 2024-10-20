package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akyv extends akyw {
    private Optional a = Optional.empty();
    private Optional b = Optional.empty();
    private Optional c = Optional.empty();
    private Optional d = Optional.empty();

    @Override // defpackage.akyw, defpackage.akxo
    public final /* bridge */ /* synthetic */ Object a() {
        return new akyx(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.akyw
    public final void b(String str) {
        this.b = Optional.of(str);
    }

    @Override // defpackage.akyw
    public final void c(akza akzaVar) {
        this.d = Optional.of(akzaVar);
    }

    @Override // defpackage.akyw
    public final void d(int i) {
        this.c = Optional.of(Integer.valueOf(i));
    }

    @Override // defpackage.akyw
    public final void e(alaa alaaVar) {
        this.a = Optional.of(alaaVar);
    }
}
