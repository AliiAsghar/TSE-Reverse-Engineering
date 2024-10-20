package defpackage;

import android.content.Intent;
import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaii extends rtu {
    final /* synthetic */ aaij a;

    public aaii(aaij aaijVar) {
        this.a = aaijVar;
    }

    @Override // defpackage.rtu
    public final long a() {
        return -1L;
    }

    @Override // defpackage.rtu
    public final long b() {
        return -1L;
    }

    @Override // defpackage.rtu
    public final Intent c() {
        return null;
    }

    @Override // defpackage.rtu
    public final Uri d() {
        if (this.a.s.q() == null) {
            return null;
        }
        return Uri.parse(this.a.s.q());
    }

    @Override // defpackage.rtu
    public final Optional j() {
        return Optional.empty();
    }

    @Override // defpackage.rtu
    public final Optional k() {
        return Optional.empty();
    }

    @Override // defpackage.rtu
    public final String l() {
        rru rruVar = this.a.s;
        String r = rruVar.r();
        String str = (String) rruVar.n().map(new zkf(18)).orElse(null);
        if (str == null || str.equals(r) || !this.a.s.x()) {
            return null;
        }
        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && str.equals("+18339913448")) {
            return null;
        }
        return str;
    }

    @Override // defpackage.rtu
    public final String m() {
        return this.a.s.r();
    }

    @Override // defpackage.rtu
    public final String n() {
        return null;
    }
}
