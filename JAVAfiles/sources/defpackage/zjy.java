package defpackage;

import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjy implements znl {
    final /* synthetic */ zjx a;

    public zjy(zjx zjxVar) {
        this.a = zjxVar;
    }

    @Override // defpackage.znl
    public final void a(Optional optional) {
        if (!optional.equals(this.a.u)) {
            zjx zjxVar = this.a;
            msh t = ((msk) zjxVar.Z.b()).t(zjxVar.r.h, zjxVar.m);
            if ((zjxVar.r.b & 32) == 0 || !optional.equals(Optional.of(t))) {
                akul c = this.a.b().c(optional);
                zjx zjxVar2 = this.a;
                ahlp l = ahlp.l(c);
                zjx zjxVar3 = this.a;
                zjxVar2.P.j(l, new ahlp(zjxVar3.l), zjxVar3.w);
            }
        }
    }
}
