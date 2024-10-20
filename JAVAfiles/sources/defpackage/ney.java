package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class ney implements ncq, puj {
    public static final psv a = psv.c();
    public static final alwo b = alwo.o("BugleRecipients");
    public final psz c;
    public final msh d;
    public final lgg e;
    private final anen f;
    private final anen g;
    private final int h;
    private final yyt i;

    public ney(wfh wfhVar, anen anenVar, anen anenVar2, psz pszVar, lgg lggVar, msh mshVar, int i) {
        this.i = wfhVar.Y(new neq(this, (puj) this, 2));
        this.f = anenVar;
        this.g = anenVar2;
        this.c = pszVar;
        this.e = lggVar;
        this.d = mshVar;
        this.h = i;
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        if (this.d.e().isEmpty()) {
            alwl alwlVar = (alwl) b.g();
            alwlVar.X(ydl.C, d());
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/RcsContactsRcsCapabilitiesSupplier", "subscribeToChanges", 164, "RcsContactsRcsCapabilitiesSupplier.java")).q("RCS Capabilities will NEVER change: No RCS Identifier.");
            return yga.d;
        }
        return this.i.w(new nem(ncpVar, 3), "RcsContactsRcsCapabilitiesSupplier::register", "RcsContactsRcsCapabilitiesSupplier::callback", "RcsContactsRcsCapabilitiesSupplier::unregister");
    }

    @Override // defpackage.ncq
    public final akul b() {
        if (this.d.e().isEmpty()) {
            alwl alwlVar = (alwl) b.g();
            alwlVar.X(ydl.C, d());
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/RcsContactsRcsCapabilitiesSupplier", "getAsync", 82, "RcsContactsRcsCapabilitiesSupplier.java")).q("RCS Disabled: No RCS Identifier.");
            return aktp.ag(lga.Z(a));
        }
        int i = 7;
        if (this.h == 1) {
            alwl alwlVar2 = (alwl) b.g();
            alwlVar2.X(ydl.C, d());
            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/RcsContactsRcsCapabilitiesSupplier", "getAsync", 89, "RcsContactsRcsCapabilitiesSupplier.java")).q("Retrieving RCS Capabilities from Service RPC.");
            return this.c.b(this.d).f(Throwable.class, new lso(this, 18), this.g).h(new ndd(this, i), this.g);
        }
        return aktp.ai(new mig(this, i), this.f).f(Throwable.class, new lso(this, 19), this.g).h(new mme(15), this.g);
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final String d() {
        return yyb.bi(this.d).toString();
    }

    @Override // defpackage.puj
    public final void f(msh mshVar, psv psvVar) {
        if (!mshVar.equals(this.d)) {
            return;
        }
        alwl alwlVar = (alwl) b.g();
        alwlVar.X(ydl.C, d());
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/RcsContactsRcsCapabilitiesSupplier", "onRcsCapabilitiesUpdateLegacy", 206, "RcsContactsRcsCapabilitiesSupplier.java")).q("RCS Capabilities Updated.");
        this.i.y(new mqr(20), "RcsContactsRcsCapabilitiesSupplier::onRcsCapabilitiesUpdate");
    }
}
