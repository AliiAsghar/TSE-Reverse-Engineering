package defpackage;

import android.util.Pair;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fau implements fhb, fdq {
    public final /* synthetic */ fax a;
    private final fav b;

    public fau(fax faxVar, fav favVar) {
        this.a = faxVar;
        this.b = favVar;
    }

    private final Pair k(fgv fgvVar) {
        fgv fgvVar2;
        fgv fgvVar3 = null;
        if (fgvVar != null) {
            fav favVar = this.b;
            int i = 0;
            while (true) {
                if (i < favVar.c.size()) {
                    if (((fgv) favVar.c.get(i)).d == fgvVar.d) {
                        fgvVar2 = fgvVar.a(Pair.create(favVar.b, fgvVar.a));
                        break;
                    }
                    i++;
                } else {
                    fgvVar2 = null;
                    break;
                }
            }
            if (fgvVar2 == null) {
                return null;
            }
            fgvVar3 = fgvVar2;
        }
        return Pair.create(Integer.valueOf(this.b.d), fgvVar3);
    }

    @Override // defpackage.fdq
    public final void b(int i, fgv fgvVar) {
        Pair k = k(fgvVar);
        if (k != null) {
            fax faxVar = this.a;
            faxVar.g.b(new ewq(this, k, 12, null));
        }
    }

    @Override // defpackage.fdq
    public final void c(int i, fgv fgvVar) {
        Pair k = k(fgvVar);
        if (k != null) {
            fax faxVar = this.a;
            faxVar.g.b(new ewq(this, k, 13, null));
        }
    }

    @Override // defpackage.fdq
    public final void d(int i, fgv fgvVar, int i2) {
        Pair k = k(fgvVar);
        if (k != null) {
            fax faxVar = this.a;
            faxVar.g.b(new qq(this, k, i2, 5, (byte[]) null));
        }
    }

    @Override // defpackage.fdq
    public final void e(int i, fgv fgvVar, Exception exc) {
        Pair k = k(fgvVar);
        if (k != null) {
            fax faxVar = this.a;
            faxVar.g.b(new faq(this, k, exc, 2, (char[]) null));
        }
    }

    @Override // defpackage.fhb
    public final void eA(int i, fgv fgvVar, fgr fgrVar) {
        Pair k = k(fgvVar);
        if (k != null) {
            fax faxVar = this.a;
            faxVar.g.b(new faq(this, k, fgrVar, 3, (char[]) null));
        }
    }

    @Override // defpackage.fdq
    public final void f(int i, fgv fgvVar) {
        Pair k = k(fgvVar);
        if (k != null) {
            fax faxVar = this.a;
            faxVar.g.b(new ewq(this, k, 14, null));
        }
    }

    @Override // defpackage.fhb
    public final void g(int i, fgv fgvVar, fgm fgmVar, fgr fgrVar) {
        Pair k = k(fgvVar);
        if (k != null) {
            fax faxVar = this.a;
            faxVar.g.b(new eex(this, k, fgmVar, fgrVar, 2));
        }
    }

    @Override // defpackage.fhb
    public final void h(int i, fgv fgvVar, fgm fgmVar, fgr fgrVar) {
        Pair k = k(fgvVar);
        if (k != null) {
            fax faxVar = this.a;
            faxVar.g.b(new eex(this, k, fgmVar, fgrVar, 4));
        }
    }

    @Override // defpackage.fhb
    public final void i(int i, fgv fgvVar, fgm fgmVar, fgr fgrVar, IOException iOException, boolean z) {
        Pair k = k(fgvVar);
        if (k != null) {
            fax faxVar = this.a;
            faxVar.g.b(new qzc(this, k, fgmVar, fgrVar, iOException, z, 1));
        }
    }

    @Override // defpackage.fhb
    public final void j(int i, fgv fgvVar, fgm fgmVar, fgr fgrVar) {
        Pair k = k(fgvVar);
        if (k != null) {
            fax faxVar = this.a;
            faxVar.g.b(new eex(this, k, fgmVar, fgrVar, 3));
        }
    }
}
