package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqml implements aqmk {
    public static final ahvf a;
    public static final ahvf b;
    public static final ahvf c;

    static {
        altg altgVar = altg.a;
        a = ahvj.c("CollectionBasisVerifierFeatures__enable_cbv_v2", false, "com.google.android.libraries.consentverifier", altgVar, true, false);
        b = ahvj.c("CollectionBasisVerifierFeatures__enable_google_signature_check", false, "com.google.android.libraries.consentverifier", altgVar, true, false);
        c = ahvj.c("CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false, "com.google.android.libraries.consentverifier", altgVar, true, false);
    }

    @Override // defpackage.aqmk
    public final boolean a() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.aqmk
    public final boolean b() {
        return ((Boolean) b.get()).booleanValue();
    }

    @Override // defpackage.aqmk
    public final void c() {
        ((Boolean) c.get()).booleanValue();
    }
}
