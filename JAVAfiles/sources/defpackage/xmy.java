package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xmy implements xhj {
    private final wul a;
    private final xnf b;

    public xmy(Context context, znj znjVar) {
        aiwl a = wus.a();
        a.i(wuk.DRM_WIPEOUT_HEURISTIC);
        a.k(xmz.a);
        wul ab = znjVar.ab(a.f());
        this.a = ab;
        this.b = new xnf(context, ab);
    }

    private final void b() {
        this.b.a(Uri.parse("content://mms/drm"), new xnb(1));
    }

    @Override // defpackage.xhj
    public final Optional a() {
        try {
            xmz xmzVar = (xmz) this.a.l();
            if (TextUtils.isEmpty(xmzVar.b)) {
                b();
                return Optional.empty();
            }
            xnf xnfVar = this.b;
            Uri parse = Uri.parse(xmzVar.b);
            String str = xmzVar.c;
            Cursor query = xnfVar.b.getContentResolver().query(parse, new String[]{"_data"}, null, null, null, null);
            try {
                albo.C(query);
                boolean z = false;
                if (query.moveToNext() && query.getString(0).equals(str)) {
                    z = true;
                }
                if (!z) {
                    xyo c = xnf.a.c();
                    c.H("Detected telephony wipeout. Clearing internal state of the table heuristic.");
                    c.q();
                    xnfVar.c.n();
                }
                boolean z2 = !z;
                if (query != null) {
                    query.close();
                }
                if (!z) {
                    b();
                }
                return Optional.of(Boolean.valueOf(z2));
            } finally {
            }
        } catch (apba e) {
            throw new RuntimeException("DrmTableBasedWipeoutDetectionHeuristic is unable to access data in the data store.", e);
        }
    }
}
