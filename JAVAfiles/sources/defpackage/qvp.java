package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qvp {
    public volatile alpt a = altg.a;
    public volatile alor b = altc.a;

    public final alog a() {
        return alog.n(this.b.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Optional b(qwe qweVar) {
        return Optional.ofNullable((qvo) this.b.get(qweVar));
    }

    public final void c(Iterable iterable) {
        this.a = alpt.n(iterable);
    }

    public final void d(Iterable iterable) {
        alok alokVar = new alok();
        Iterable$EL.forEach(iterable, new qdm(alokVar, 8));
        this.b = alokVar.b();
    }
}
