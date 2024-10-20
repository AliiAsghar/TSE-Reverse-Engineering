package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.kids.TrustedContactsRequest;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acce extends abrc implements acbz {
    public static final zfm n;
    private static final accb o;
    private static final aaoc p;
    private static final abmt q;
    public final Set a;
    public boolean b;
    public final boolean m;

    static {
        abmt abmtVar = new abmt();
        q = abmtVar;
        accb accbVar = new accb();
        o = accbVar;
        p = new aaoc("ParentalControls.API", accbVar, abmtVar);
        n = new zfm("ParentalControlsClient");
    }

    public acce(Context context) {
        super(context, p, abqy.q, abrb.a);
        this.a = new LinkedHashSet();
        this.m = true;
        egl.h(this.c, new accc(this), new IntentFilter("android.app.action.PROFILE_OWNER_CHANGED"));
    }

    @Override // defpackage.acbz
    public final acir a(Set set) {
        if (set.isEmpty()) {
            return actx.s(arnw.a);
        }
        return w(new zwj(this, set, 15, null), new abcv(set, 7));
    }

    @Override // defpackage.acbz
    public final /* synthetic */ acir b(Uri uri) {
        return a(aqjn.e(uri)).e(new ahxq(uri, 1));
    }

    @Override // defpackage.acbz
    public final acir c(acby acbyVar) {
        acbyVar.getClass();
        this.a.add(acbyVar);
        return w(new zwj(acbyVar, this, 16, null), new abcv(acbyVar, 8));
    }

    @Override // defpackage.acbz
    public final acir d(TrustedContactsRequest trustedContactsRequest) {
        return w(new zwj(this, trustedContactsRequest, 17), accd.b);
    }

    public final acir w(arqg arqgVar, arqg arqgVar2) {
        if (this.b) {
            return actx.s(arqgVar2.a());
        }
        return ((acir) arqgVar.a()).a(new abpk(this, arqgVar2, 2, null));
    }
}
