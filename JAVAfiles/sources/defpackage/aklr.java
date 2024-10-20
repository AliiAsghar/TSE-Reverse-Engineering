package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aklr extends apxb {
    public aklr(Activity activity) {
        super(activity);
    }

    @Override // defpackage.apxb
    protected final Object a() {
        boolean z = this.a.getApplication() instanceof aklg;
        Activity activity = this.a;
        albo.Z(z, "TikTok activity, %s, cannot be attached to a non-TikTok application, %s.", activity.getClass().getSimpleName(), activity.getApplication().getClass().getSimpleName());
        return super.a();
    }
}
