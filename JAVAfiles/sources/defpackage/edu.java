package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edu extends edw {
    public edu(Class cls) {
        super(R.id.tag_accessibility_heading, cls);
    }

    @Override // defpackage.edw
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(eed.f(view));
    }

    @Override // defpackage.edw
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        eed.c(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.edw
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        if (!f((Boolean) obj, (Boolean) obj2)) {
            return true;
        }
        return false;
    }
}
