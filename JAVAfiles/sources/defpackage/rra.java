package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rra extends rqz implements ufw, ufz {
    public ufz a;
    private boolean b = false;
    private final ufw c;

    public rra() {
    }

    @Override // defpackage.ufw
    public final int c() {
        return 0;
    }

    @Override // defpackage.ufw
    public final int d() {
        return this.c.d();
    }

    @Override // defpackage.rqz
    public final void e(String str) {
        if (!this.b) {
            super.e(str);
            this.b = true;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.ufz
    public final void fC(ufw ufwVar) {
        ufz ufzVar;
        if (super.h() && (ufzVar = this.a) != null) {
            ufzVar.fC(ufwVar);
        }
    }

    @Override // defpackage.ufz
    public final void fD(ufw ufwVar, ugg uggVar, boolean z) {
        ufz ufzVar;
        if (super.h() && (ufzVar = this.a) != null) {
            ufzVar.fD(ufwVar, uggVar, z);
        }
    }

    @Override // defpackage.rqz
    protected final void g() {
        this.a = null;
    }

    @Override // defpackage.rqz
    public final boolean h() {
        return super.h();
    }

    @Override // defpackage.ufw
    public final ufv j() {
        return this.c.j();
    }

    @Override // defpackage.ufw
    public final ufx k() {
        return this.c.k();
    }

    @Override // defpackage.ufw
    public final ugg l(List list) {
        return this.c.l(list);
    }

    @Override // defpackage.ufw
    public final String m() {
        return this.c.m();
    }

    public rra(ufz ufzVar, ufw ufwVar) {
        this.a = ufzVar;
        this.c = ufwVar;
    }
}
