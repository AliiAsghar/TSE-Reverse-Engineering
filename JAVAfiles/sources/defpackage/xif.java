package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xif extends unp {
    private final Context a;
    private final armf b;
    private final armf c;

    public xif(Context context, armf armfVar, armf armfVar2) {
        this.a = context;
        this.b = armfVar;
        this.c = armfVar2;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        unv a = xim.a();
        une a2 = unf.a();
        a2.d(((Integer) xim.a.e()).intValue());
        a2.c(a);
        if (unv.FOREGROUND_SERVICE.equals(a)) {
            a2.b = ((via) this.b.b()).b(this.a.getString(R.string.forward_sync_foreground_notification_text));
        }
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("ForwardSyncBatchWorkItemHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        final xig xigVar = (xig) apbtVar;
        final xie xieVar = (xie) this.c.b();
        if (((Boolean) ((utz) wzp.a.get()).e()).booleanValue()) {
            xie.a.o("Legacy Forward Sync cannot start: sync redesign is enabled.");
            ((wyp) xieVar.n.b()).h(yyb.cD(xigVar.i), amvl.REDESIGN_ENABLED_DURING_EXECUTION);
            return aktp.ag(upm.b());
        }
        if (((ppf) xieVar.s.b()).a() && !((yjf) xieVar.r.b()).h()) {
            xie.a.o("Legacy Forward Sync cannot start: missing permissions.");
            return aktp.ag(upm.d());
        }
        return ((wzp) xieVar.j.b()).d().h(new algk() { // from class: xic
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:60:0x03bf  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0446  */
            /* JADX WARN: Type inference failed for: r0v78, types: [java.util.Set, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v17, types: [java.util.Set, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v6, types: [java.util.Set, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r11v7, types: [java.util.Set, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.Set, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Set, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v9, types: [java.util.Set, java.lang.Object] */
            @Override // defpackage.algk
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r53) {
                /*
                    Method dump skipped, instructions count: 2329
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.xic.apply(java.lang.Object):java.lang.Object");
            }
        }, xieVar.b);
    }

    @Override // defpackage.unx
    public final apca e() {
        return xig.a.getParserForType();
    }
}
