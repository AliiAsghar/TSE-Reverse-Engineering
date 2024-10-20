package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class wyy implements wyw, xzh {
    public static final /* synthetic */ int a = 0;
    private static final xze b = xze.g("Bugle", "MmsSmsThreadIdResolverMessagingIdentityImpl");
    private static final alwo c = alwo.o("Bugle");
    private static final alpt d = alpt.r("ʼUNKNOWN_SENDER!ʼ", "ʼWAP_PUSH_SI!ʼ");
    private final Context e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final Map i = new HashMap();

    public wyy(Context context, armf armfVar, armf armfVar2, armf armfVar3) {
        this.e = context;
        this.f = armfVar;
        this.g = armfVar2;
        this.h = armfVar3;
    }

    private static boolean c(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            msh mshVar = (msh) it.next();
            Iterator it2 = collection2.iterator();
            while (it2.hasNext()) {
                if (mshVar.equals((msh) it2.next())) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.wyw
    public final long a(msh mshVar) {
        xyl.h();
        if (mshVar.w()) {
            alwl alwlVar = (alwl) c.h();
            alwlVar.Z(alwk.FULL);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverMessagingIdentityImpl", "safeResolveFromRecipient", 140, "MmsSmsThreadIdResolverMessagingIdentityImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromRecipient returned invalid thread id because parameter was a null recipient");
            return -1L;
        }
        return b(alog.r(mshVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0197 A[SYNTHETIC] */
    @Override // defpackage.wyw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(java.util.Collection r14) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyy.b(java.util.Collection):long");
    }

    @Override // defpackage.xzh
    public final void l(int i) {
        synchronized (this.i) {
            this.i.clear();
        }
    }
}
