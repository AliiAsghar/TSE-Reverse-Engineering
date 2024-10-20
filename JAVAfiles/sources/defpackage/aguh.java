package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aguh implements agva {
    public final aguq a;
    private final alog b;

    public aguh(Context context) {
        this.a = aguq.e(context);
        alob alobVar = new alob();
        agux aguxVar = agux.b;
        int i = 16;
        if (aguxVar == null) {
            synchronized (agux.class) {
                aguxVar = agux.b;
                if (aguxVar == null) {
                    aguxVar = new agux(context);
                    ListenableFuture listenableFuture = aguxVar.h;
                    if (listenableFuture != null && !listenableFuture.isDone()) {
                        aguxVar.h.cancel(false);
                    }
                    agvc agvcVar = aguxVar.e;
                    aguxVar.h = ancj.f(((aguj) agvcVar).d.a(), new agui(agvcVar, 0), ((aguj) agvcVar).b);
                    aguxVar.i = albo.bY(aguxVar.h, aguxVar.f.k).a(new aaze(aguxVar, 15), aguxVar.g);
                    albo.bR(aguxVar.i, new pum(16), aguxVar.g);
                    agux.b = aguxVar;
                }
            }
        }
        alobVar.h(aguxVar);
        agvg agvgVar = agvg.b;
        if (agvgVar == null) {
            synchronized (agvg.class) {
                agvgVar = agvg.b;
                if (agvgVar == null) {
                    agvgVar = new agvg(context);
                    ListenableFuture listenableFuture2 = agvgVar.h;
                    if (listenableFuture2 != null && !listenableFuture2.isDone()) {
                        agvgVar.h.cancel(true);
                    }
                    agvc agvcVar2 = agvgVar.f;
                    agvgVar.h = albo.bM(new aaze(agvcVar2, 12), ((aguk) agvcVar2).c);
                    agvgVar.g = albo.bY(agvgVar.h, agvgVar.c.k).a(new aaze(agvgVar, i), agvgVar.e);
                    agvg.b = agvgVar;
                }
            }
        }
        alobVar.h(agvgVar);
        this.b = alobVar.g();
    }

    @Override // defpackage.agva
    public final /* synthetic */ aguz a() {
        return this.a;
    }

    @Override // defpackage.agvb
    public final ListenableFuture b() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            alog alogVar = this.b;
            if (i2 < ((alsx) alogVar).c) {
                arrayList.add(((agvb) alogVar.get(i2)).b());
                i2++;
            } else {
                return albo.bV(arrayList).a(new agug(i), andi.a);
            }
        }
    }

    @Override // defpackage.agvb
    public final String c(String str) {
        String str2;
        String str3 = null;
        int i = 0;
        agux aguxVar = null;
        agvg agvgVar = null;
        while (true) {
            alog alogVar = this.b;
            if (i >= ((alsx) alogVar).c) {
                break;
            }
            agvb agvbVar = (agvb) alogVar.get(i);
            if (agvbVar instanceof agux) {
                aguxVar = (agux) agvbVar;
            }
            if (agvbVar instanceof agvg) {
                agvgVar = (agvg) agvbVar;
            }
            i++;
        }
        aguy a = this.a.a(str);
        if (aguxVar != null && a != aguy.SKINTONE_AND_GENDER_DIRECTIONAL) {
            str2 = aguxVar.c(str);
            if (str2 != null) {
                return str2;
            }
        } else {
            str2 = null;
        }
        if (agvgVar != null) {
            str2 = (String) agvgVar.d.get(agvgVar.c.d(str));
            if (aguxVar != null) {
                if (str2 != null) {
                    str = str2;
                }
                agve b = aguxVar.f.b(str);
                if (b != null && alzz.aT(b.b, new evp(10)) && alzz.aT(b.b, new evp(11))) {
                    agvd g = aguxVar.g();
                    if (g == null) {
                        g = agux.f(b);
                    }
                    agvd h = aguxVar.h();
                    if (h == null) {
                        h = agux.i(b);
                    }
                    str3 = aguxVar.k(aguxVar.f.d(str), agux.j(h, g, aguxVar.a(str)));
                }
            }
            if (str3 != null) {
                return str3;
            }
        }
        return str2;
    }

    @Override // defpackage.agvb
    public final boolean d(String str) {
        int i = 0;
        boolean z = false;
        while (true) {
            alog alogVar = this.b;
            if (i < ((alsx) alogVar).c) {
                if (!((agvb) alogVar.get(i)).d(str) && !z) {
                    z = false;
                } else {
                    z = true;
                }
                i++;
            } else {
                return z;
            }
        }
    }

    @Override // defpackage.agvb
    public final int e() {
        if (this.b.isEmpty()) {
            return 1;
        }
        return ((agvb) this.b.get(0)).e();
    }
}
