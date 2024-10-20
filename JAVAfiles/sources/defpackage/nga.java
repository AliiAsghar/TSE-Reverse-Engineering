package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nga implements ncq, yfx {
    public static final alwo a = alwo.o("BugleSelfIdentity");
    public final anen b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final int f;
    public final String g;
    public final yyt h;
    private final apwt i;
    private final armf j;
    private final Optional k;
    private yga l;

    public nga(armf armfVar, armf armfVar2, wfh wfhVar, anen anenVar, armf armfVar3, apwt apwtVar, armf armfVar4, Optional optional, ykb ykbVar) {
        this.d = armfVar;
        this.e = armfVar2;
        this.h = wfhVar.Y(this);
        this.b = anenVar;
        this.c = armfVar3;
        this.i = apwtVar;
        this.j = armfVar4;
        this.k = optional;
        int a2 = ykbVar.a();
        this.f = a2;
        if (((olx) armfVar.b()).a()) {
            adom.m(a2);
        }
        this.g = ykbVar.t();
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.h.w(new nem(ncpVar, 4), "EtouffeeEncryptionStateSupplier::register", "EtouffeeEncryptionStateSupplier::callback", "EtouffeeEncryptionStateSupplier::unregister");
    }

    @Override // defpackage.ncq
    public final akul b() {
        return aktp.aj(new ikm(this, 13), this.b);
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Optional d() {
        aiut.b();
        if (this.k.isPresent()) {
            return this.k;
        }
        return ((jat) this.j.b()).z(this.f);
    }

    @Override // defpackage.yfx
    public final void fs() {
        nfy nfyVar = (nfy) this.i.b();
        this.l = nfyVar.b.w(new nem(this, 5), "EtouffeeEncryptionStateListener::register", "EtouffeeEncryptionStateListener::callback", "EtouffeeEncryptionStateListener::unregister");
    }

    @Override // defpackage.yfx
    public final void ft() {
        yga ygaVar = this.l;
        if (ygaVar != null) {
            ygaVar.a();
            this.l = null;
        }
    }
}
