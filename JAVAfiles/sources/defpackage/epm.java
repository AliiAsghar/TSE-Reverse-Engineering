package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epm implements eov {
    private final /* synthetic */ int a;

    public epm(int i) {
        this.a = i;
    }

    @Override // defpackage.eov
    public final eor a(Class cls) {
        if (this.a != 0) {
            return new dc(true);
        }
        return new epn();
    }

    @Override // defpackage.eov
    public final /* synthetic */ eor b(Class cls, epd epdVar) {
        if (this.a != 0) {
            return dyx.g(this, cls);
        }
        return dyx.g(this, cls);
    }

    @Override // defpackage.eov
    public final /* synthetic */ eor c(artf artfVar, epd epdVar) {
        if (this.a != 0) {
            return dyx.e(this, artfVar, epdVar);
        }
        return dyx.e(this, artfVar, epdVar);
    }
}
