package defpackage;

import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rks implements aglx {
    public static final Map a = aqjn.m(new armo(c("_id"), d("_id")), new armo(c("conversation_id"), d("conversation_id")), new armo(c("participant_id"), d("participant_id")), new armo(c("is_normalized"), d("is_normalized")), new armo(c("rcs_group_join_status"), d("rcs_group_join_status")));

    private static final rkk c(String str) {
        String str2;
        agmh[] p = uvl.p();
        for (int i = 0; i < 6; i++) {
            agmh agmhVar = p[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (rkk) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final skw d(String str) {
        String str2;
        agmh[] G = wam.G();
        for (int i = 0; i < 6; i++) {
            agmh agmhVar = G[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (skw) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.aglx
    public final void a() {
        throw null;
    }

    @Override // defpackage.aglx
    public final void b() {
        throw null;
    }
}
