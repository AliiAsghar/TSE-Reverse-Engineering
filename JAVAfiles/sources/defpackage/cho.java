package defpackage;

import androidx.compose.ui.draw.DrawBehindElement;
import androidx.compose.ui.draw.DrawWithCacheElement;
import androidx.compose.ui.draw.DrawWithContentElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cho {
    public static final cga a(cga cgaVar, arqr arqrVar) {
        return cgaVar.a(new DrawBehindElement(arqrVar));
    }

    public static final cga b(cga cgaVar, arqr arqrVar) {
        return cgaVar.a(new DrawWithCacheElement(arqrVar));
    }

    public static final cga c(cga cgaVar, arqr arqrVar) {
        return cgaVar.a(new DrawWithContentElement(arqrVar));
    }
}
