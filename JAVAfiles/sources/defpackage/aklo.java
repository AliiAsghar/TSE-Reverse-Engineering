package defpackage;

import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aklo extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return new Stack();
    }
}
