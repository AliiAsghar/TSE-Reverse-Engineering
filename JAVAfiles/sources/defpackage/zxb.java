package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxb implements egk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zxb(View view, int i) {
        this.b = i;
        this.a = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.egk
    public final boolean a(efu efuVar, int i, Bundle bundle) {
        String str;
        ameb amebVar;
        Bundle bundle2;
        ecq ecqVar;
        Uri linkUri;
        if (this.b != 0) {
            Bundle bundle3 = bundle;
            if ((i & 1) != 0) {
                try {
                    efuVar.F();
                    ?? r10 = ((efu) efuVar.a).a;
                    if (bundle == null) {
                        bundle2 = new Bundle();
                    } else {
                        bundle2 = new Bundle(bundle);
                    }
                    bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", r10);
                    bundle3 = bundle2;
                } catch (Exception e) {
                    Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                }
            }
            ClipData clipData = new ClipData(efuVar.D(), new ClipData.Item(efuVar.E()));
            if (Build.VERSION.SDK_INT >= 31) {
                ecqVar = new ecp(clipData, 2);
            } else {
                ecqVar = new ecr(clipData, 2);
            }
            Object obj = this.a;
            linkUri = ead$$ExternalSyntheticApiModelOutline0.m347m(((efu) efuVar.a).a).getLinkUri();
            ecqVar.e(linkUri);
            ecqVar.c(bundle3);
            if (eek.d((View) obj, dye.d(ecqVar)) != null) {
                return false;
            }
            return true;
        }
        aoij aoijVar = (aoij) this.a;
        Object obj2 = aoijVar.a;
        Object obj3 = aoijVar.c;
        Object obj4 = aoijVar.b;
        String[] strArr = zra.fq;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < 4) {
                str = strArr[i2];
                if (efuVar.D().hasMimeType(str)) {
                    break;
                }
                i2++;
            } else {
                str = null;
                break;
            }
        }
        if (str == null) {
            return false;
        }
        if ((i & 1) != 0) {
            try {
                efuVar.F();
            } catch (Exception e2) {
                zri.a.n("requestPermission failed", e2);
                return false;
            }
        }
        zri zriVar = (zri) obj2;
        Context context = zriVar.k;
        Uri E = efuVar.E();
        if (lgb.E(context) == 3) {
            amebVar = ameb.GBOARD_EMOJI;
        } else {
            amebVar = ameb.UNKNOWN_IME;
        }
        PendingAttachmentData b = ((rtg) zriVar.ae.b()).b(str, E, amebVar);
        b.f = aauk.a(b);
        ((mci) zriVar.Y.b()).f(b.f, ((rsr) zriVar.y.a()).k());
        ((rsr) zriVar.y.a()).D(b, (rrc) obj3);
        ((View) obj4).requestFocus();
        return true;
    }

    public zxb(aoij aoijVar, int i) {
        this.b = i;
        this.a = aoijVar;
    }
}
