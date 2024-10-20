package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkg extends zhz {
    protected final int g;
    private final ykw h;

    public zkg(ykw ykwVar, Context context, int i) {
        super(context);
        this.h = ykwVar;
        this.g = ykwVar.d(context.getString(R.string.rcs_default_sharing_method_key), i != 1 ? 0 : i);
    }

    @Override // defpackage.zhz
    public final void b(int i) {
        this.h.j(this.a.getString(R.string.rcs_default_sharing_method_key), i);
        d();
    }

    @Override // defpackage.zhz
    public final void c() {
        this.b = this.a.getString(R.string.rcs_default_sharing_method_title);
        this.c = this.a.getResources().getStringArray(R.array.rcs_default_sharing_method_options);
        this.d = this.g;
        super.c();
    }
}
