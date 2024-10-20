package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqt extends hyr implements hqv {
    public hqu a;

    public hqt(long j) {
        super(j);
    }

    @Override // defpackage.hyr
    protected final /* bridge */ /* synthetic */ int a(Object obj) {
        hpt hptVar = (hpt) obj;
        if (hptVar == null) {
            return 1;
        }
        return hptVar.a();
    }

    @Override // defpackage.hqv
    public final /* bridge */ /* synthetic */ hpt b(hne hneVar) {
        return (hpt) super.j(hneVar);
    }

    @Override // defpackage.hyr
    protected final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        hpt hptVar = (hpt) obj2;
        hqu hquVar = this.a;
        if (hquVar != null && hptVar != null) {
            ((hpf) hquVar).f.a(hptVar, true);
        }
    }

    @Override // defpackage.hqv
    public final /* bridge */ /* synthetic */ void d(hne hneVar, hpt hptVar) {
    }
}
