package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.gms.common.Feature;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aarj implements ancr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aarj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [alhr, java.lang.Object] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        alog n;
        ListenableFuture bI;
        int i = 5;
        int i2 = 13;
        int i3 = 12;
        int i4 = 3;
        int i5 = 6;
        Object obj = null;
        int i6 = 0;
        switch (this.b) {
            case 0:
                aark aarkVar = (aark) this.a;
                if (aarkVar.e()) {
                    return aktp.ae();
                }
                aarkVar.e = true;
                return akul.g(((yaq) aarkVar.b.a()).f());
            case 1:
                aark aarkVar2 = (aark) this.a;
                if (aarkVar2.e()) {
                    return aktp.ae();
                }
                aarkVar2.e = true;
                return akul.g(((yaq) aarkVar2.b.a()).f());
            case 2:
                Object obj2 = this.a;
                return albo.bN(new aarj(obj2, i4), ((abzz) obj2).c);
            case 3:
                ajxp ajxpVar = new ajxp(null);
                ajxpVar.c = new abxb(i4);
                ajxpVar.d = new Feature[]{abzq.a};
                ajxpVar.c();
                ajxpVar.b = 13801;
                abtl b = ajxpVar.b();
                Object obj3 = this.a;
                abzz abzzVar = (abzz) obj3;
                return ancj.g(ancd.f(ancj.f(anee.o(agkx.f(((abrc) abzzVar.d).g(b))), new abes(i5), abzzVar.c), Exception.class, new abes(i4), abzzVar.c), new aang(obj3, 19), abzzVar.c);
            case 4:
                this.a.run();
                return aneh.a;
            case 5:
                atsg atsgVar = (atsg) this.a;
                algw algwVar = (algw) atsgVar.g.get();
                boolean f = algwVar.f();
                Object obj4 = atsgVar.f.get();
                if (f) {
                    algw algwVar2 = (algw) obj4;
                    if (algwVar2.f()) {
                        ahnj ahnjVar = new ahnj((File) algwVar.b(), (String) algwVar2.b());
                        int a = ahnjVar.a();
                        ahnjVar.b().delete();
                        ahnjVar.b = 0;
                        ahnjVar.c = true;
                        if (a >= ((ahnk) atsgVar.a.b()).c) {
                            Object obj5 = atsgVar.d;
                            ahmq a2 = ahmr.a();
                            aozy createBuilder = asjt.a.createBuilder();
                            aozy createBuilder2 = asjr.a.createBuilder();
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            asjr asjrVar = (asjr) createBuilder2.b;
                            asjrVar.c = 6;
                            asjrVar.b |= 1;
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            asjt asjtVar = (asjt) createBuilder.b;
                            asjr asjrVar2 = (asjr) createBuilder2.s();
                            asjrVar2.getClass();
                            asjtVar.w = asjrVar2;
                            asjtVar.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
                            a2.e((asjt) createBuilder.s());
                            return ((ahmu) obj5).b(a2.a());
                        }
                        return aneh.a;
                    }
                }
                return aneh.a;
            case 6:
                ahnq ahnqVar = (ahnq) this.a;
                if (ahnqVar.m() && !ahnqVar.c.getAndSet(true)) {
                    return ahnqVar.o(6, (ahni) ahnqVar.b.b(), ((ahnk) ahnqVar.e.b()).f);
                }
                return aneh.a;
            case 7:
                ahnq ahnqVar2 = (ahnq) this.a;
                if (ahnqVar2.m()) {
                    atsg atsgVar2 = ahnqVar2.g;
                    if (!((AtomicBoolean) atsgVar2.b).getAndSet(false)) {
                        ListenableFuture listenableFuture = aneh.a;
                    } else {
                        albo.bN(new aarj(atsgVar2, i), atsgVar2.e);
                    }
                }
                return aneh.a;
            case 8:
                return ((ahob) this.a).j();
            case 9:
                return ahob.i((ahob) this.a);
            case 10:
                return aneh.a;
            case 11:
                return ((ahps) this.a).c();
            case 12:
                Object obj6 = this.a;
                ancs d = akto.d(new ahce(obj6, i2));
                aiws aiwsVar = (aiws) obj6;
                return albo.bJ(ancj.g(aiwsVar.b, d, aiwsVar.c));
            case 13:
                Object obj7 = this.a;
                aiws aiwsVar2 = (aiws) obj7;
                try {
                    return albo.bI(((aiws) obj7).b((Uri) albo.bQ(aiwsVar2.b)));
                } catch (IOException e) {
                    ahmn ahmnVar = new ahmn(obj7, null);
                    if (!aiwsVar2.d.f()) {
                        return albo.bH(e);
                    }
                    if (!(e instanceof aive) && !(e.getCause() instanceof aive)) {
                        return ancj.g(((aiwj) aiwsVar2.d.b()).a(e, ahmnVar), akto.d(new ahce(obj7, i3)), aiwsVar2.c);
                    }
                    return albo.bH(e);
                }
            case 14:
                return this.a;
            case 15:
                return albo.bI(this.a);
            case 16:
                Object obj8 = this.a;
                synchronized (((ajyc) obj8).d) {
                    n = alog.n(((ajyc) obj8).d);
                }
                ArrayList arrayList = new ArrayList(n.size());
                int size = n.size();
                while (i6 < size) {
                    try {
                        bI = ((ajyb) n.get(i6)).a();
                    } catch (Throwable th) {
                        ((alvg) ((alvg) ((alvg) ajyc.a.h()).g(th)).h("com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl", "notifyRequirementStateChanged", (char) 198, "AccountRequirementManagerImpl.java")).q("OnRequirementStateChanged observer failed.");
                        bI = albo.bI(null);
                    }
                    arrayList.add(bI);
                    i6++;
                }
                return albo.bV(arrayList).a(new aidu(obj, 18), andi.a);
            case 17:
                return aktp.ah(new ybh(this.a, i3), andi.a);
            case 18:
                return ((aiwu) this.a).a();
            case 19:
                Object obj9 = this.a;
                akad akadVar = (akad) obj9;
                ajzk ajzkVar = akadVar.d;
                ListenableFuture b2 = akadVar.b();
                ListenableFuture g = ancj.g(ancj.g(anee.o(ajzkVar.d()), akto.d(new ajzp(obj9, i)), akadVar.g), akto.d(new ajzp(obj9, i5)), akadVar.f);
                return albo.bW(b2, g).a(akto.k(new ahes(b2, g, i2)), akadVar.f);
            default:
                Object obj10 = this.a;
                akad akadVar2 = (akad) obj10;
                alog t = akadVar2.h.t(true);
                alpr alprVar = new alpr();
                int i7 = ((alsx) t).c;
                while (i6 < i7) {
                    File file = (File) t.get(i6);
                    try {
                        alprVar.c(Integer.valueOf(Integer.parseInt(file.getName())));
                    } catch (NumberFormatException e2) {
                        ((alvg) ((alvg) ((alvg) akad.a.h()).g(e2)).h("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet", "cleanUpObseleteAccountDirsInternal", 172, "WipeoutAccountsSynclet.java")).t("Account directory name is malformed. Directory name: %s", file.getName());
                    }
                    i6++;
                }
                return ancj.g(aktp.Y(((ahiy) ((ansy) akadVar2.i.a).a).y(), new ajwz(i3), andi.a), akto.d(new ahsi(obj10, alprVar.g(), 10)), akadVar2.g);
        }
    }
}
