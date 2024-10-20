package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rlw implements aglx {
    public static final rlw a = new rlw();
    public static final Map b = aqjn.m(new armo(c("_id"), d("_id")), new armo(c("message_id"), d("message_id")), new armo(c("trigger_url"), d("trigger_url")), new armo(c("expiration_time_millis"), d("expiration_time_millis")), new armo(c("link_title"), d("link_title")), new armo(c("link_description"), d("link_description")), new armo(c("link_image_url"), d("link_image_url")), new armo(c("link_domain"), d("link_domain")), new armo(c("link_canonical_url"), d("link_canonical_url")));

    private rlw() {
    }

    private static final rlp c(String str) {
        String str2;
        agmh[] h = ujy.h();
        for (int i = 0; i < 9; i++) {
            agmh agmhVar = h[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (rlp) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final ssk d(String str) {
        String str2;
        agmh[] g = tvu.g();
        for (int i = 0; i < 11; i++) {
            agmh agmhVar = g[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (ssk) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.aglx
    public final void a() {
        rlr rlrVar = new rlr();
        rlrVar.e();
        rlrVar.a().V();
    }

    @Override // defpackage.aglx
    public final void b() {
        agof agofVar = new agof("link_preview_backup", "backup");
        agofVar.d = 5;
        Map map = b;
        rlp[] rlpVarArr = (rlp[]) map.keySet().toArray(new rlp[0]);
        agofVar.b((agmh[]) Arrays.copyOf(rlpVarArr, rlpVarArr.length));
        ssp c = sss.c();
        c.q();
        ssk[] sskVarArr = (ssk[]) map.values().toArray(new ssk[0]);
        c.c((ssk[]) Arrays.copyOf(sskVarArr, sskVarArr.length));
        agofVar.c = c.b();
        agofVar.a().a();
    }
}
