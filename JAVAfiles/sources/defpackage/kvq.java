package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class kvq implements akbp<apdj<lar>, List<String>> {
    final /* synthetic */ kvw a;

    public kvq(kvw kvwVar) {
        this.a = kvwVar;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        kuy.a.r("Failed to change the archive status of conversations", th);
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        int i;
        AccessibilityEvent obtain;
        final List list = (List) obj2;
        final lar larVar = (lar) ((apdj) obj).a(lar.a, aozs.a());
        final boolean z = larVar.c;
        Runnable runnable = new Runnable() { // from class: kvp
            @Override // java.lang.Runnable
            public final void run() {
                tqc tqcVar;
                alog d = ruy.d(list);
                if (z) {
                    tqcVar = tqc.UNARCHIVED;
                } else {
                    tqcVar = tqc.ARCHIVED;
                }
                amfe b = amfe.b(larVar.d);
                if (b == null) {
                    b = amfe.UNKNOWN_BUGLE_CONVERSATION_ORIGIN;
                }
                kvw kvwVar = kvq.this.a;
                yyb.aO(kvwVar.z.a(d, tqcVar, b, kvwVar.af), "Bugle", "HomeFragmentPeer: failed to undo changes to conversations archive status");
            }
        };
        if (true != z) {
            i = R.plurals.unarchived_toast_message;
        } else {
            i = R.plurals.archived_toast_message;
        }
        int size = list.size();
        String quantityString = this.a.b.z().getQuantityString(i, size, Integer.valueOf(size));
        kvw kvwVar = this.a;
        Snackbar q = Snackbar.q(kvwVar.g(kvwVar.b), quantityString, 0);
        q.s(this.a.b.y().getResources().getString(R.string.snack_bar_undo), new klx(runnable, 17));
        q.m(this.a.T.a());
        q.i();
        ghw ghwVar = (ghw) this.a.au.b();
        quantityString.getClass();
        Object systemService = ((Context) ghwVar.a).getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (accessibilityManager.isEnabled()) {
            if (Build.VERSION.SDK_INT >= 30) {
                obtain = new AccessibilityEvent();
            } else {
                obtain = AccessibilityEvent.obtain();
                obtain.getClass();
            }
            obtain.setEventType(16384);
            obtain.getText().add(quantityString);
            obtain.setClassName(ghwVar.getClass().getName());
            obtain.setPackageName(((Context) ghwVar.a).getPackageName());
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
        amfe b = amfe.b(larVar.d);
        if (b == null) {
            b = amfe.UNKNOWN_BUGLE_CONVERSATION_ORIGIN;
        }
        if (b != amfe.CONVERSATION_FROM_LIST_SWIPE) {
            this.a.o();
        }
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
