package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class edt extends edw {
    public edt(Class cls) {
        super(R.id.tag_state_description, cls, 64, 30);
    }

    @Override // defpackage.edw
    public final /* synthetic */ Object a(View view) {
        return eef.b(view);
    }

    @Override // defpackage.edw
    public final /* synthetic */ void b(View view, Object obj) {
        eef.c(view, (CharSequence) obj);
    }

    @Override // defpackage.edw
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        if (!TextUtils.equals((CharSequence) obj, (CharSequence) obj2)) {
            return true;
        }
        return false;
    }
}
