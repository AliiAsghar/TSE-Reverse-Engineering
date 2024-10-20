package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edr extends edw {
    public edr(Class cls) {
        super(R.id.tag_screen_reader_focusable, cls);
    }

    @Override // defpackage.edw
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(eed.g(view));
    }

    @Override // defpackage.edw
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        eed.e(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.edw
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        if (!f((Boolean) obj, (Boolean) obj2)) {
            return true;
        }
        return false;
    }
}
