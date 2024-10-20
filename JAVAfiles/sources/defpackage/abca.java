package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.ui.vcard.VCardDetailFragment;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abca extends xzs {
    final /* synthetic */ Uri a;
    final /* synthetic */ VCardDetailFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abca(VCardDetailFragment vCardDetailFragment, Uri uri) {
        super("Bugle.Async.VCardDetailFragment.onOptionsItemSelected.Duration");
        this.a = uri;
        this.b = vCardDetailFragment;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        VCardDetailFragment vCardDetailFragment = this.b;
        Uri uri = vCardDetailFragment.d;
        if (uri != null) {
            return uri;
        }
        return uhl.f(this.a, vCardDetailFragment.fe());
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Uri uri = (Uri) obj;
        if (uri != null) {
            Uri e = uhl.e(this.b.x(), uri);
            VCardDetailFragment vCardDetailFragment = this.b;
            vCardDetailFragment.d = e;
            if (vCardDetailFragment.fe() != null) {
                String m = ((rtl) vCardDetailFragment.a.a()).m();
                if (!TextUtils.isEmpty(m)) {
                    synchronized (uhl.a) {
                        uhl.a.put(e, m);
                    }
                }
                VCardDetailFragment vCardDetailFragment2 = this.b;
                vCardDetailFragment2.e.b(vCardDetailFragment2.fe(), e);
            }
        }
    }
}
