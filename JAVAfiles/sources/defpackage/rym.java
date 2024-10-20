package defpackage;

import android.provider.MediaStore;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rym implements emx {
    private static final utz e = uuh.f(uuh.b, "p2p_share_recent_image_age_limit_millis", TimeUnit.MINUTES.toMillis(1));
    public final ryo b;
    public long d;
    private final xnv f;
    private final yjf g;
    private final yio h;
    private final aker i;
    private final atsg k;
    public final Set a = new HashSet();
    private boolean j = false;
    public ConversationIdType c = ruy.a;

    public rym(atsg atsgVar, xnv xnvVar, yjf yjfVar, yio yioVar, ryo ryoVar, aksr aksrVar) {
        this.k = atsgVar;
        this.b = ryoVar;
        this.i = new ryl(this, aksrVar);
        this.f = xnvVar;
        this.g = yjfVar;
        this.h = yioVar;
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        if (this.j) {
            this.j = false;
            this.k.k(this.i);
            this.c = ruy.a;
        }
    }

    @Override // defpackage.emx
    public final void gG(enm enmVar) {
        if (this.h.e() && this.g.n() && !this.c.b()) {
            long epochMilli = this.f.f().toEpochMilli() - ((Long) e.e()).longValue();
            this.d = epochMilli;
            if (!this.j) {
                this.b.a(this.c, null, epochMilli, this.a);
                this.j = true;
                this.k.j(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.i);
            }
        }
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void i(enm enmVar) {
    }
}
