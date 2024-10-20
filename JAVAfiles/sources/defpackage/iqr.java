package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqr implements iqq {
    private final Context a;
    private final /* synthetic */ int b;
    private final Object c;

    public iqr(Context context, Object obj, int i) {
        this.b = i;
        this.a = context;
        this.c = obj;
    }

    @Override // defpackage.iqq
    public final Optional a() {
        if (this.b != 0) {
            return Optional.empty();
        }
        return Optional.of(this.c);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, vqu] */
    @Override // defpackage.iqq
    public final String b() {
        if (this.b != 0) {
            return gvf.P(this.a, R.string.snackbar_text_label_rcs_group_created_too_large, "max_group_size_including_self", Integer.valueOf(this.c.f(Optional.empty())));
        }
        return this.a.getString(R.string.snackbar_text_label_rcs_group_self_only_v2);
    }
}
