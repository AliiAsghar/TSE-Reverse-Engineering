package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wzx {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/sms/TelephonyRetryWrapperInterfaceImpl");

    public static final Optional b(arqg arqgVar, arqr arqrVar) {
        try {
            return Optional.ofNullable(arqgVar.a());
        } catch (Exception e) {
            return (Optional) arqrVar.a(e);
        }
    }

    public final Optional a(arqg arqgVar) {
        return b(arqgVar, new wyk(arqgVar, 2));
    }
}
