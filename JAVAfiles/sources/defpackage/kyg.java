package defpackage;

import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyg extends hd {
    private static final alwo b = alwo.o("Bugle");
    final Map a;

    public kyg(Map map) {
        this.a = map;
    }

    @Override // defpackage.hd
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        kzx kzxVar = (kzx) obj;
        kzx kzxVar2 = (kzx) obj2;
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : ((alor) this.a).entrySet()) {
            kzz kzzVar = (kzz) entry.getKey();
            if (((kzy) entry.getValue()).d(kzxVar, kzxVar2)) {
                hashSet.add(kzzVar);
            }
        }
        if (!hashSet.isEmpty()) {
            ((alwl) ((alwl) b.g()).h("com/google/android/apps/messaging/home/list/DiffCallback", "getChangePayload", 61, "DiffCallback.java")).t("ConversationListViewParts to be rebound %s", hashSet);
        }
        return new kzv(alpt.o(hashSet), false);
    }

    @Override // defpackage.hd
    public final /* synthetic */ boolean b(Object obj, Object obj2) {
        return ((kzx) obj).equals((kzx) obj2);
    }

    @Override // defpackage.hd
    public final /* synthetic */ boolean c(Object obj, Object obj2) {
        return ((kzx) obj).a.l.equals(((kzx) obj2).a.l);
    }
}
