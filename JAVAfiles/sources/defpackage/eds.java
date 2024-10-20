package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eds extends edw {
    public eds(Class cls) {
        super(R.id.tag_accessibility_pane_title, cls, 8, 28);
    }

    @Override // defpackage.edw
    public final /* synthetic */ Object a(View view) {
        return eed.a(view);
    }

    @Override // defpackage.edw
    public final /* synthetic */ void b(View view, Object obj) {
        eed.d(view, (CharSequence) obj);
    }

    @Override // defpackage.edw
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        if (!TextUtils.equals((CharSequence) obj, (CharSequence) obj2)) {
            return true;
        }
        return false;
    }
}
