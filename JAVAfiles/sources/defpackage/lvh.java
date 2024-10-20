package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler;
import j$.util.Map;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Map;
import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvh implements Comparator {
    private final /* synthetic */ int a;

    public lvh(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.lang.Comparable] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return arrj.q(((luq) obj2).d, ((luq) obj).d);
            case 1:
                return arrj.q(Integer.valueOf(((aeig) obj).b()), Integer.valueOf(((aeig) obj2).b()));
            case 2:
                return arrj.q(((luq) obj2).d, ((luq) obj).d);
            case 3:
                arqr arqrVar = moz.a;
                msh f = ((ResolvedRecipient) obj).f();
                f.getClass();
                ?? a = arqrVar.a(f);
                arqr arqrVar2 = moz.a;
                msh f2 = ((ResolvedRecipient) obj2).f();
                f2.getClass();
                return arrj.q(a, arqrVar2.a(f2));
            case 4:
                return arrj.q(Boolean.valueOf(((nfw) obj2).p()), Boolean.valueOf(((nfw) obj).p()));
            case 5:
                return arrj.q(((miz) obj).b().a(), ((miz) obj2).b().a());
            case 6:
                return arrj.q(((mte) obj).a.r(false), ((mte) obj2).a.r(false));
            case 7:
                return arrj.q(Long.valueOf(((qlr) obj).a), Long.valueOf(((qlr) obj2).a));
            case 8:
                String str = qxq.a;
                return ((agnn) obj).a().compareTo(((agnn) obj2).a());
            case 9:
                return OnDeviceDatabaseUpgradeHandler.lambda$getAllCustomUpgradeSteps$0((Method) obj, (Method) obj2);
            case 10:
                return OnDeviceDatabaseUpgradeHandler.lambda$makeQueue$0((agns) obj, (agns) obj2);
            case 11:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 12:
                Map map = vdq.a;
                String name = ((CronetProvider) obj).getName();
                name.getClass();
                Integer num = (Integer) Map.EL.getOrDefault(map, name, Integer.MAX_VALUE);
                java.util.Map map2 = vdq.a;
                String name2 = ((CronetProvider) obj2).getName();
                name2.getClass();
                return arrj.q(num, (Integer) Map.EL.getOrDefault(map2, name2, Integer.MAX_VALUE));
            case 13:
                return apdr.a((apct) obj, (apct) obj2);
            case 14:
                return apdr.a((apct) obj, (apct) obj2);
            case 15:
                return apdr.a((apct) obj, (apct) obj2);
            case 16:
                return arrj.q(Integer.valueOf(((wjd) obj).c), Integer.valueOf(((wjd) obj2).c));
            case 17:
                return arrj.q(((wxb) obj).c, ((wxb) obj2).c);
            case 18:
                return arrj.q(Integer.valueOf(((xtg) obj).e), Integer.valueOf(((xtg) obj2).e));
            case 19:
                return ((yfa) obj).c().compareTo(((yfa) obj2).c());
            default:
                return arrj.q(aaya.c((ResolvedRecipient) obj), aaya.c((ResolvedRecipient) obj2));
        }
    }
}
