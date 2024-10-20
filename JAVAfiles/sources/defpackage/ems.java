package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ems extends eox implements eov {
    final /* synthetic */ ansy a;
    private final enh b;
    private final ajwt c;
    private final iba d;

    /* JADX WARN: Type inference failed for: r2v1, types: [gjz, java.lang.Object] */
    public ems(ansy ansyVar, ajwt ajwtVar) {
        this.a = ansyVar;
        ?? r2 = ansyVar.a;
        r2.getClass();
        this.d = r2.aK();
        this.b = r2.N();
        this.c = ajwtVar;
    }

    private final eor e(String str, Class cls) {
        enh enhVar = this.b;
        enhVar.getClass();
        eoi r = dyv.r(this.d, enhVar, str, null);
        eog eogVar = r.a;
        albo.T(cls.equals(akku.class));
        akku akkuVar = new akku(eogVar, (alhm) this.a.b, this.c);
        akkuVar.l("androidx.lifecycle.savedstate.vm.tag", r);
        return akkuVar;
    }

    @Override // defpackage.eov
    public final eor a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            if (this.b != null) {
                return e(canonicalName, cls);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.eov
    public final eor b(Class cls, epd epdVar) {
        String str = (String) epdVar.a(eow.d);
        if (str != null) {
            return e(str, cls);
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // defpackage.eov
    public final /* synthetic */ eor c(artf artfVar, epd epdVar) {
        return dyx.e(this, artfVar, epdVar);
    }

    @Override // defpackage.eox
    public final void d(eor eorVar) {
        enh enhVar = this.b;
        enhVar.getClass();
        dyv.s(eorVar, this.d, enhVar);
    }
}
