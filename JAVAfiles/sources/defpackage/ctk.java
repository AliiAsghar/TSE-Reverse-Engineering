package defpackage;

import androidx.compose.ui.layout.LayoutIdElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctk {
    public static final cga a(cga cgaVar, Object obj) {
        return cgaVar.a(new LayoutIdElement(obj));
    }

    public static final Object b(cuc cucVar) {
        ctm ctmVar;
        Object f = cucVar.f();
        if (f instanceof ctm) {
            ctmVar = (ctm) f;
        } else {
            ctmVar = null;
        }
        if (ctmVar == null) {
            return null;
        }
        return ctmVar.b();
    }
}
