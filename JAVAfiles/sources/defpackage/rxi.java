package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rxi {
    private static final utz a = uuh.b("enable_modified_by_for_create_participant", false);

    public static final rxg a() {
        if (((Boolean) a.e()).booleanValue()) {
            rxg o = vcp.o();
            if (o == null) {
                return rxg.c;
            }
            return o;
        }
        return rxg.b;
    }
}
