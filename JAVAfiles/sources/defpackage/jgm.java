package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentMap;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgm implements afkr {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/EmojiUsageLogger");
    private final Context b;
    private final ConcurrentMap c;
    private final mcy d;

    public jgm(Context context, ConcurrentMap concurrentMap, mcy mcyVar) {
        context.getClass();
        concurrentMap.getClass();
        this.b = context;
        this.c = concurrentMap;
        this.d = mcyVar;
    }

    private final void a(int i, jgj jgjVar, Integer num) {
        Integer num2;
        ahlp aV = akec.aV(amoq.a.createBuilder());
        jgn.c(aV, jgjVar.b);
        hlc.Y(aV, jgjVar.b, Boolean.valueOf(jgjVar.a));
        amoq A = aV.A();
        if (num != null) {
            num.intValue();
            if (jgjVar.b != 3) {
                num2 = num;
                if (num2 == null && num2.intValue() < 0) {
                    throw new IllegalArgumentException(a.cc(num2, "listPosition ", " is negative"));
                }
                mcy mcyVar = this.d;
                qjh.l(mcyVar.a, null, new mgs(mcyVar, i, A, num2, (arpe) null, 1), 3);
            }
        }
        num2 = null;
        if (num2 == null) {
        }
        mcy mcyVar2 = this.d;
        qjh.l(mcyVar2.a, null, new mgs(mcyVar2, i, A, num2, (arpe) null, 1), 3);
    }

    @Override // defpackage.afkr
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        afnr afnrVar = (afnr) obj;
        jgj I = hlc.I(afnrVar, lgb.E(this.b));
        alvw e = a.e();
        e.X(alwp.a, "BugleComposeRow2");
        ((alvg) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/EmojiUsageLogger", "onAddedToDraft", 34, "EmojiUsageLogger.kt")).t("EmojiUsageLogger.onAddedToDraft %s", I);
        ConcurrentMap.EL.merge(this.c, I, 1, new jgl(new gck(I, 10), 0));
        a(2, I, afnrVar.c);
    }

    @Override // defpackage.afkr
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        afnr afnrVar = (afnr) obj;
        jgj I = hlc.I(afnrVar, lgb.E(this.b));
        alvi alviVar = a;
        alvw e = alviVar.e();
        e.X(alwp.a, "BugleComposeRow2");
        ((alvg) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/EmojiUsageLogger", "onRemovedFromDraft", 47, "EmojiUsageLogger.kt")).t("EmojiUsageLogger.onRemovedFromDraft %s", I);
        arrx arrxVar = new arrx();
        ConcurrentMap.EL.computeIfPresent(this.c, I, new jgl(new ifn(arrxVar, I, 2), 1));
        if (!arrxVar.a) {
            alvw i = alviVar.i();
            i.X(alwp.a, "BugleComposeRow2");
            ((alvg) i.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/EmojiUsageLogger", "onRemovedFromDraft", 58, "EmojiUsageLogger.kt")).t("EmojiUsage removed from draft but was not in cache: %s", I);
        }
        a(4, I, afnrVar.c);
    }

    @Override // defpackage.afkr
    public final void c(List list) {
    }
}
