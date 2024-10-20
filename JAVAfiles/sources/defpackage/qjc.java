package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class qjc {
    private static final utz a = uuh.i(uuh.b, "future_callbacks_always_crash", false);

    @Deprecated
    public static andy a(andy andyVar) {
        if (!qjd.a() && !((Boolean) a.e()).booleanValue()) {
            return andyVar;
        }
        return new qit(new qdm(andyVar, 3), new qcq(9), new RuntimeException());
    }
}
