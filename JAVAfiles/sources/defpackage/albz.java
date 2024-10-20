package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class albz extends alce {
    private static final long serialVersionUID = -1522852442442473691L;
    protected final String a;
    private final String h;
    private final boolean i;

    static {
        int i = alby.a;
    }

    protected albz() {
        super(null, alce.c, alce.b);
        this.a = null;
        this.h = "googleapis.com";
        this.i = false;
    }

    protected algv a() {
        algv aj = albo.aj(this);
        aj.c();
        aj.b("quotaProjectId", null);
        aj.b("universeDomain", this.h);
        aj.h("isExplicitUniverseDomain", false);
        return aj;
    }

    @Override // defpackage.alce
    public boolean equals(Object obj) {
        if (!(obj instanceof albz)) {
            return false;
        }
        albz albzVar = (albz) obj;
        String str = albzVar.a;
        if (Objects.equals(null, null) && Objects.equals(this.h, albzVar.h)) {
            boolean z = albzVar.i;
            if (Objects.equals(false, false)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.alce
    public int hashCode() {
        return Objects.hash(null, this.h, false);
    }

    @Override // defpackage.alce
    public final String toString() {
        return a().toString();
    }
}
