package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahmf {
    final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final anna c = anna.e('/');
    private static final Pattern b = Pattern.compile("^(\\*[a-z]+\\*).*");

    static String a(String str) {
        List c2 = c.c(str);
        if (c2.size() != 3) {
            ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "sanitizeSyncName", 56, "HashingNameSanitizer.java")).t("malformed sync name: %s", str);
            return "MALFORMED";
        }
        return (String) c2.get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ashm b(defpackage.ahme r14, defpackage.ashm r15) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahmf.b(ahme, ashm):ashm");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ashm c(ashm ashmVar) {
        ashh ashhVar = ashmVar.e;
        if (ashhVar == null) {
            ashhVar = ashh.a;
        }
        if ((ashhVar.b & 1) != 0) {
            ashh ashhVar2 = ashmVar.e;
            if (ashhVar2 == null) {
                ashhVar2 = ashh.a;
            }
            ConcurrentHashMap concurrentHashMap = this.a;
            aozy builder = ashhVar2.toBuilder();
            Long l = (Long) concurrentHashMap.get(Long.valueOf(((ashh) builder.b).c));
            l.getClass();
            aozy builder2 = ashmVar.toBuilder();
            long longValue = l.longValue();
            if (!builder.b.isMutable()) {
                builder.u();
            }
            ashh ashhVar3 = (ashh) builder.b;
            ashhVar3.b |= 1;
            ashhVar3.c = longValue;
            if (!builder2.b.isMutable()) {
                builder2.u();
            }
            ashm ashmVar2 = (ashm) builder2.b;
            ashh ashhVar4 = (ashh) builder.s();
            ashhVar4.getClass();
            ashmVar2.e = ashhVar4;
            ashmVar2.b |= 4;
            return (ashm) builder2.s();
        }
        return ashmVar;
    }
}
