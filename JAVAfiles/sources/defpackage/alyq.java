package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alyq extends alyn {
    public static final alyn a = new alyq();

    private alyq() {
    }

    @Override // defpackage.alyn
    public final alww a(String str) {
        return new alyk(Logger.getLogger(str.replace('$', '.')));
    }

    public final String toString() {
        return "Default logger backend factory";
    }
}
