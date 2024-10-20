package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyc extends no {
    public final Optional c;

    public kyc(Optional optional) {
        this.c = optional;
    }

    @Override // defpackage.no
    public final int b() {
        if (this.c.isEmpty() || !((kwp) this.c.get()).a()) {
            return 0;
        }
        return 1;
    }

    @Override // defpackage.no
    public final int c(int i) {
        return 2;
    }

    @Override // defpackage.no
    public final oo e(ViewGroup viewGroup, int i) {
        this.c.isPresent();
        albo.U(false, "Tried to create prefix ViewHolder when no home banner host was present");
        kwp kwpVar = (kwp) this.c.get();
        LayoutInflater.from(viewGroup.getContext());
        return new kxl(kwpVar.b());
    }

    @Override // defpackage.no
    public final void g(oo ooVar, int i) {
        int i2 = alog.d;
        z(ooVar, i, alsx.a);
    }

    @Override // defpackage.no
    public final long gI(int i) {
        return 2147483646L;
    }

    @Override // defpackage.no
    public final void z(oo ooVar, int i, List list) {
        if (i < b()) {
            this.c.isPresent();
        }
    }
}
