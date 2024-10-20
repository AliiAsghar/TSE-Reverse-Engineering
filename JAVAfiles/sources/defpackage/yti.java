package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yti {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/util/ui/UiUtil");
    protected final yjv a;
    private final Context c;

    public yti(Context context, yjv yjvVar) {
        this.c = context;
        this.a = yjvVar;
    }

    public final void a(String str, String str2) {
        ClipboardManager clipboardManager = (ClipboardManager) this.c.getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, str));
            if (Build.VERSION.SDK_INT <= 32) {
                Toast.makeText(this.c, str2, 1).show();
                return;
            }
            return;
        }
        alvw i = b.i();
        i.X(alwp.a, "Bugle");
        ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/util/ui/UiUtil", "copyToClipboardAndShowToast", 63, "UiUtil.java")).q("Could not get clipboard system service.");
    }

    public final boolean b(Context context) {
        if (this.a.e() && this.a.d() && yhx.h(context)) {
            return true;
        }
        return false;
    }

    public final boolean c(RecyclerView recyclerView, boolean z) {
        int left;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.m;
        if (linearLayoutManager == null) {
            return false;
        }
        int L = linearLayoutManager.L();
        View U = linearLayoutManager.U(L);
        if (L <= 0 && U != null) {
            if (z) {
                left = U.getTop();
            } else {
                left = U.getLeft();
            }
            if (left >= 0) {
                return true;
            }
        }
        return false;
    }
}
