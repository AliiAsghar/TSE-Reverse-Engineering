package defpackage;

import android.view.ViewGroup;
import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agbm extends arsm {
    final /* synthetic */ agbn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agbm(Object obj, agbn agbnVar) {
        super(obj);
        this.a = agbnVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        agbk agbkVar = (agbk) obj2;
        agbk agbkVar2 = (agbk) obj;
        if (agbkVar2 instanceof agbi) {
            agbi agbiVar = (agbi) agbkVar2;
            agbiVar.b.d(agbb.a);
            agbn agbnVar = this.a;
            agbnVar.d().removeView(agbiVar.a);
        }
        if (agbkVar instanceof agbi) {
            ViewGroup d = this.a.d();
            d.getClass();
            agbi agbiVar2 = (agbi) agbkVar;
            agbr agbrVar = agbiVar2.a;
            if (d.getChildCount() > 0) {
                d.addView(agbrVar);
            } else {
                d.setOnHierarchyChangeListener(new agad(d, d, agbrVar));
            }
            KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = agbiVar2.b;
            agbn agbnVar2 = this.a;
            keyboardDetectorViewInsetsListener.d(new agba(agbnVar2.b, agbiVar2.c));
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        if (!d.F(obj, obj2)) {
            return true;
        }
        return false;
    }
}
