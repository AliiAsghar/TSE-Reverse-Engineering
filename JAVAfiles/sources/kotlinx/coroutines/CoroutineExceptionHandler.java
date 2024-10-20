package kotlinx.coroutines;

import defpackage.akty;
import defpackage.arpg;
import defpackage.arpi;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface CoroutineExceptionHandler extends arpg {
    public static final akty c = akty.b;

    void handleException(arpi arpiVar, Throwable th);
}
