package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nes implements ncq {
    public static final alwo a = alwo.o("BugleRecipients");
    public final msh b;
    public final int c;
    public final qsa d;
    public final qsa e;
    public final yyt f;
    private final anen g;
    private final anen h;

    public nes(wfh wfhVar, anen anenVar, anen anenVar2, lgg lggVar, qsa qsaVar, qsa qsaVar2, msh mshVar, int i) {
        this.f = wfhVar.Y(new neq(lggVar, new ner(this), 0));
        this.g = anenVar;
        this.h = anenVar2;
        this.d = qsaVar;
        this.e = qsaVar2;
        this.b = mshVar;
        this.c = i;
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        if (this.b.e().isEmpty()) {
            alwl alwlVar = (alwl) a.g();
            alwlVar.X(ydl.C, d());
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier", "subscribeToChanges", 136, "ProviderRcsCapabilitiesSupplier.java")).q("RCS Capabilities will NEVER change: No RCS Identifier.");
            return yga.d;
        }
        return this.f.w(new nem(ncpVar, 2), "ProviderRcsCapabilitiesSupplier::register", "ProviderRcsCapabilitiesSupplier::callback", "ProviderRcsCapabilitiesSupplier::unregister");
    }

    @Override // defpackage.ncq
    public final akul b() {
        akul aj;
        if (this.b.e().isEmpty()) {
            alwl alwlVar = (alwl) a.g();
            alwlVar.X(ydl.C, d());
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier", "getAsync", 86, "ProviderRcsCapabilitiesSupplier.java")).q("RCS Disabled: No RCS Identifier.");
            return aktp.ag(lga.aa(qry.b()));
        }
        if (this.c == 1) {
            alwl alwlVar2 = (alwl) a.g();
            alwlVar2.X(ydl.C, d());
            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier", "getAsync", 95, "ProviderRcsCapabilitiesSupplier.java")).q("Retrieving RCS Capabilities from Network.");
            aj = aktp.aj(new ikm(this, 11), this.h);
        } else {
            alwl alwlVar3 = (alwl) a.g();
            alwlVar3.X(ydl.C, d());
            ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier", "getAsync", 103, "ProviderRcsCapabilitiesSupplier.java")).q("Retrieving RCS Capabilities from Storage.");
            aj = aktp.aj(new ikm(this, 12), this.h);
        }
        return aj.h(new ndd(this, 6), this.g);
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final String d() {
        return yyb.bi(this.b).toString();
    }
}
