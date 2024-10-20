package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmd extends xzs {
    private final Resources a;
    private final int b;
    private final yjy c;
    private final ryg k;
    private final via l;

    public zmd(yjy yjyVar, ryg rygVar, via viaVar, Resources resources, int i) {
        super("Bugle.Async.SimFullReceiver.handleSimFull.Duration");
        this.a = resources;
        this.k = rygVar;
        this.c = yjyVar;
        this.l = viaVar;
        this.b = i;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        int i = this.b;
        if (i == -1) {
            i = this.c.j().a();
        }
        if (this.c.a() <= 1) {
            return null;
        }
        String h = this.k.f(i).h();
        if (h == null) {
            xzb.n("Bugle", "subscriptionName is empty");
            return null;
        }
        return this.a.getString(R.string.sim_specific_settings, h);
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        this.l.w(this.b, (String) obj);
    }
}
