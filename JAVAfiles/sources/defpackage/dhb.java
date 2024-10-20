package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhb {
    private static final AtomicInteger a = new AtomicInteger(0);

    public static final int a() {
        return a.addAndGet(1);
    }

    public static final cga b(cga cgaVar, arqr arqrVar) {
        return cgaVar.a(new ClearAndSetSemanticsElement(arqrVar));
    }

    public static final cga c(cga cgaVar, boolean z, arqr arqrVar) {
        return cgaVar.a(new AppendedSemanticsElement(z, arqrVar));
    }

    public static /* synthetic */ cga d(cga cgaVar, arqr arqrVar) {
        return c(cgaVar, false, arqrVar);
    }
}
