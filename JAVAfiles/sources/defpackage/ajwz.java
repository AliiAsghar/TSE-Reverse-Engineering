package defpackage;

import android.accounts.Account;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.util.DesugarCollections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajwz implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ ajwz(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        ahcc ahccVar;
        boolean z = false;
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                ajza ajzaVar = (ajza) obj;
                if (ajzaVar == null) {
                    ahccVar = new ahcc(4, null);
                } else {
                    String str = ajzaVar.b.i;
                    if ("pseudonymous".equals(str)) {
                        ahccVar = new ahcc(2, null);
                    } else {
                        if (!"incognito".equals(str)) {
                            return null;
                        }
                        ahccVar = new ahcc(3, null);
                    }
                }
                return ahccVar;
            case 3:
                throw new ajxu();
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    return ajyz.a();
                }
                throw new ajxu();
            case 5:
                ajyz ajyzVar = (ajyz) obj;
                if (ajyzVar == null) {
                    return ajyz.a();
                }
                return ajyzVar;
            case 6:
                return ((ajza) obj).b;
            case 7:
                ajza ajzaVar2 = (ajza) obj;
                if (ajzaVar2.c == 2) {
                    z = true;
                }
                d.s(z);
                return ajzaVar2;
            case 8:
                ajzb ajzbVar = ((ajza) obj).b;
                return null;
            case 9:
                throw new ajzn((IllegalArgumentException) obj);
            case 10:
                String str2 = (String) obj;
                if (str2 != null) {
                    z = true;
                }
                d.t(z, "AccountId was not a Google account");
                return new Account(str2, "com.google");
            case 11:
                return null;
            case 12:
                return DesugarCollections.unmodifiableMap(((ajzw) obj).d).keySet();
            case 13:
                alob alobVar = new alob();
                for (ajzz ajzzVar : DesugarCollections.unmodifiableMap(((ajzw) obj).d).values()) {
                    int R = a.R(ajzzVar.e);
                    if (R != 0 && R == 2) {
                        alobVar.h(ansy.x(ajzzVar));
                    }
                }
                return alobVar.g();
            case 14:
                alob alobVar2 = new alob();
                Iterator it = DesugarCollections.unmodifiableMap(((ajzw) obj).d).values().iterator();
                while (it.hasNext()) {
                    alobVar2.h(ansy.x((ajzz) it.next()));
                }
                return alobVar2.g();
            case 15:
                return ansy.w((ajzw) obj);
            case 16:
                ((alvg) ((alvg) ((alvg) akad.a.h()).g((Throwable) obj)).h("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet", "sync", 90, "WipeoutAccountsSynclet.java")).q("Wipeout accounts task failed.");
                return null;
            case 17:
                return true;
            case 18:
                return new ProtoParsers$InternalDontUse(null, (apbt) obj);
            case 19:
                return null;
            default:
                return null;
        }
    }
}
