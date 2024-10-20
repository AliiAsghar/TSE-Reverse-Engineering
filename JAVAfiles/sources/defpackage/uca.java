package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class uca extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return new ArrayDeque();
    }
}
