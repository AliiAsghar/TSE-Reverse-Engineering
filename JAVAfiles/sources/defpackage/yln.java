package defpackage;

import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class yln implements ylm {
    private final armf a;
    private final armf b;
    private final armf c;

    public yln(armf armfVar, armf armfVar2, armf armfVar3) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
    }

    @Override // defpackage.ylm
    public final int a() {
        Optional e = e();
        if (adab.n()) {
            return 1;
        }
        if (!adab.d() || e.isEmpty()) {
            return -1;
        }
        return ((Configuration) e.get()).mInstantMessageConfiguration.mDefaultSharingMethod;
    }

    @Override // defpackage.ylm
    public final int b() {
        return znj.H(e());
    }

    @Override // defpackage.ylm
    public final int c() {
        return znj.I(e());
    }

    @Override // defpackage.ylm
    public final int d() {
        return znj.J(e());
    }

    @Override // defpackage.ylm
    public final Optional e() {
        return ((adje) this.a.b()).l();
    }

    @Override // defpackage.ylm
    public final String f() {
        Optional e = e();
        if (e.isEmpty()) {
            return "";
        }
        return ((znj) this.c.b()).G((Configuration) e.get());
    }

    @Override // defpackage.ylm
    public final String g() {
        return (String) ((adnv) this.b.b()).c().orElse("");
    }
}
