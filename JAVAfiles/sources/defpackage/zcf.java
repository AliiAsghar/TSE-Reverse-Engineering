package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcf {
    public static final xze a = xze.g("BugleContacts", "AddPeopleToGroupHandlerImpl");
    public final arpi b;
    public final lkd c;
    public final vyv d;
    private final Context e;
    private final zbu f;
    private final znj g;

    public zcf(Context context, arpi arpiVar, znj znjVar, zbu zbuVar, lkd lkdVar, vyv vyvVar) {
        context.getClass();
        arpiVar.getClass();
        znjVar.getClass();
        zbuVar.getClass();
        lkdVar.getClass();
        this.e = context;
        this.b = arpiVar;
        this.g = znjVar;
        this.f = zbuVar;
        this.c = lkdVar;
        this.d = vyvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[EDGE_INSN: B:25:0x0061->B:14:0x0061 BREAK  A[LOOP:0: B:18:0x0050->B:24:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.zce
            if (r0 == 0) goto L13
            r0 = r6
            zce r0 = (defpackage.zce) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zce r0 = new zce
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.aqil.P(r6)
            zbu r6 = r4.f
            r0.c = r3
            java.lang.Object r6 = r6.g(r5, r0)
            if (r6 == r1) goto L66
        L3c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r5 = r6 instanceof java.util.Collection
            if (r5 == 0) goto L4c
            r5 = r6
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L4c
            goto L61
        L4c:
            java.util.Iterator r5 = r6.iterator()
        L50:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L61
            java.lang.Object r6 = r5.next()
            zbm r6 = (defpackage.zbm) r6
            boolean r6 = r6.b
            if (r6 != 0) goto L50
            r3 = 0
        L61:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zcf.a(java.util.List, arpe):java.lang.Object");
    }

    public final void b(String str) {
        String string;
        if (str != null) {
            string = this.e.getString(R.string.user_inviting_failed, str);
        } else {
            string = this.e.getString(R.string.user_inviting_failed_plural);
        }
        string.getClass();
        this.g.d(string);
    }
}
