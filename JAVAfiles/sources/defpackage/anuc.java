package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class anuc extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        SecureRandom a = anud.a();
        a.nextLong();
        return a;
    }
}
