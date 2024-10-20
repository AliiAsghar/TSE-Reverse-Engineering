package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alwg extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return new Random();
    }
}
