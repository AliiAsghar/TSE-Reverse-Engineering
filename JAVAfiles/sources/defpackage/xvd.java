package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class xvd {
    public final Context a;
    protected final xve b;
    private final msh c;

    public xvd(Context context, xve xveVar, msh mshVar) {
        this.a = context;
        this.b = xveVar;
        this.c = mshVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract Intent e();

    public final Drawable f(int i) {
        Drawable drawable = this.a.getDrawable(b());
        drawable.getClass();
        Drawable mutate = drawable.mutate();
        mutate.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        int dimension = (int) this.a.getResources().getDimension(R.dimen.business_action_default_icon_size);
        mutate.setBounds(0, 0, dimension, dimension);
        return mutate;
    }

    public abstract String g(String str);

    public final String h() {
        return this.c.g();
    }

    public final boolean i() {
        return this.b.d(e());
    }

    public abstract int j();
}
