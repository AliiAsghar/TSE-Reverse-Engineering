package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afkw implements afkx {
    private static final alvi a = alvi.m("com/google/android/libraries/compose/draft/attachments/ManagedDraftAttachmentsController");
    private final Activity b;
    private final afks c;
    private final arml d;

    public afkw(Activity activity, afks afksVar, apwt apwtVar) {
        this.b = activity;
        this.c = afksVar;
        this.d = armd.a(new afjm(apwtVar, 3));
    }

    private final afkt h(afcq afcqVar) {
        aezb aezbVar = new aezb(this, 13);
        afcqVar.getClass();
        return (afkt) arrn.f(arrn.j(new een(new afcr(afcqVar.getClass(), null), 4), aezbVar));
    }

    private final boolean i(afcq afcqVar) {
        List a2 = this.c.a();
        if ((a2 instanceof Collection) && a2.isEmpty()) {
            return false;
        }
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            if (aeke.cj((afcq) it.next(), afcqVar)) {
                return true;
            }
        }
        return false;
    }

    public final Map a() {
        return (Map) this.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.afku
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.afcq r8, defpackage.arpe r9) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afkw.b(afcq, arpe):java.lang.Object");
    }

    @Override // defpackage.afkx
    public final ascv c() {
        return this.c.b;
    }

    @Override // defpackage.afku
    public final void d() {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            ((afkt) it.next()).b();
        }
        this.c.b();
    }

    @Override // defpackage.afku
    public final void e() {
        for (afcq afcqVar : this.c.a()) {
            afkt h = h(afcqVar);
            if (h != null) {
                h.c(afcqVar);
            }
        }
        this.c.b();
    }

    @Override // defpackage.afku
    public final void f(afcq afcqVar) {
        afcqVar.getClass();
        if (i(afcqVar)) {
            afkt h = h(afcqVar);
            if (h != null) {
                h.d(afcqVar);
            }
            afks afksVar = this.c;
            List a2 = afksVar.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : a2) {
                if (!aeke.cj((afcq) obj, afcqVar)) {
                    arrayList.add(obj);
                }
            }
            afksVar.a.h(arrayList);
            return;
        }
        ((alvg) a.h().h("com/google/android/libraries/compose/draft/attachments/ManagedDraftAttachmentsController", "removeAttachment", 74, "ManagedDraftAttachmentsController.kt")).t("Skipping removal of %s, which wasn't added", afcqVar);
    }

    @Override // defpackage.afku
    public final /* bridge */ /* synthetic */ void g(afcq afcqVar) {
        throw new UnsupportedOperationException("send() should be implemented by client DraftAttachmentsController and is unsupported in ManagedDraftAttachmentsController");
    }
}
