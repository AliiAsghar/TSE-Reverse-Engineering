package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akko extends arrp implements arqr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akko(Object obj, Object obj2, int i) {
        super(1);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map$Entry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, arwl] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        aknr aknrVar;
        int i = this.c;
        int i2 = 19;
        byte[] bArr = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            Throwable th = (Throwable) obj;
                            if (th == null) {
                                ((aseh) this.b).a(this.a.o());
                            } else {
                                ((aseh) this.b).b(th);
                            }
                            return arnb.a;
                        }
                        ((aryv) this.b).a.removeCallbacks(this.a);
                        return arnb.a;
                    }
                    asai asaiVar = (asai) obj;
                    asaiVar.getClass();
                    return new akee(arhi.c(asaiVar, this.a), this.b, 2);
                }
                List list = (List) obj;
                list.getClass();
                Set entrySet = this.b.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : entrySet) {
                    if (!list.contains(((Map.Entry) obj2).getKey())) {
                        arrayList.add(obj2);
                    }
                }
                aron aronVar = new aron(bArr);
                Iterator it = arrayList.iterator();
                while (true) {
                    Object obj3 = this.a;
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        akkp akkpVar = (akkp) obj3;
                        ListenableFuture bP = albo.bP(aktp.X(new akdj(entry, 12), akkpVar.c), 180L, TimeUnit.SECONDS, akkpVar.c);
                        akat.c(bP, "Client StartupAfterPackageReplacedListener failed for key: %s", new aomj(aomi.NO_USER_DATA, entry.getKey()));
                        bP.getClass();
                        aronVar.add(aktp.Z(aktp.T(aktp.as(bP).m(new agug(10), andi.a), Exception.class, new akez(agdl.t, i2), andi.a), new ajzp(new akko(obj3, entry, 0), 18), akkpVar.b));
                    } else {
                        List x = aqjn.x(aronVar);
                        return aktp.aq(x).m(new aidu(x, 13), ((akkp) obj3).b);
                    }
                }
            } else {
                String str = (String) obj;
                str.getClass();
                if (((ahlp) this.a).h(str)) {
                    aknrVar = new aknr(1, 1);
                } else {
                    aknrVar = new aknr(1, 2);
                }
                Uri B = ((aohs) this.b).B(aknrVar, File.separator + "phenotype" + File.separator + str);
                B.getClass();
                return B;
            }
        } else {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            if (bool.booleanValue()) {
                Object obj4 = this.a;
                String str2 = (String) this.b.getKey();
                Object obj5 = this.a;
                str2.getClass();
                ahmn a = ((akkp) obj4).a();
                agrk agrkVar = new agrk((short[]) null);
                agrkVar.x("INSERT INTO ListenerSuccessfulRuns (listener_key, version_code) VALUES (?, ?)");
                agrkVar.z(str2);
                agrkVar.y(Long.valueOf(((akkp) obj5).d));
                ListenableFuture F = a.F(agrkVar.J());
                F.getClass();
                return aktp.Z(F, new ajzp(arua.b, i2), ((akkp) this.a).b);
            }
            return albo.bI(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akko(Object obj, Object obj2, int i, byte[] bArr) {
        super(1);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
