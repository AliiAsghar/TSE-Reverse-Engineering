package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaom implements vgw {
    public static final alhr a = uuh.w("propagate_registration_debugging_state");
    private final ahiy b;

    public aaom(ahiy ahiyVar) {
        this.b = ahiyVar;
    }

    @Override // defpackage.vgw
    public final akul f(String str, ved vedVar, ved vedVar2, int i) {
        if (((Boolean) ((utz) a.get()).e()).booleanValue()) {
            this.b.q(albo.bI(null), new akgc("debug_tachyon_state_data_source"));
        }
        return aktp.ag(null);
    }
}
