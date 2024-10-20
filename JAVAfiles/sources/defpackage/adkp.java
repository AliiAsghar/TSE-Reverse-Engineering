package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adkp implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ adkp(adks adksVar, Context context, adlw adlwVar, String str, int i, Optional optional, adiv adivVar, int i2) {
        this.h = i2;
        this.b = adksVar;
        this.c = context;
        this.d = adlwVar;
        this.e = str;
        this.a = i;
        this.f = optional;
        this.g = adivVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, anen] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, adiv] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        char c;
        char c2;
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                alog<agun> alogVar = (alog) ((alor) albo.bQ(this.b)).get(Integer.valueOf(this.a));
                if (alogVar == null) {
                    int i2 = alog.d;
                    return alsx.a;
                }
                alog alogVar2 = (alog) albo.bQ(this.d);
                if (alogVar2 == null || alogVar2.size() != alogVar.size()) {
                    agxl.a();
                    alob alobVar = new alob();
                    for (agun agunVar : alogVar) {
                        Object obj = this.g;
                        StringBuilder sb = new StringBuilder();
                        agxe agxeVar = (agxe) obj;
                        if (true != agxl.c(agunVar.a, agxeVar)) {
                            c = '0';
                        } else {
                            c = '1';
                        }
                        sb.append(c);
                        alog alogVar3 = agunVar.b;
                        int size = alogVar3.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            if (true != agxl.c((String) alogVar3.get(i3), agxeVar)) {
                                c2 = '0';
                            } else {
                                c2 = '1';
                            }
                            sb.append(c2);
                        }
                        alobVar.h(sb.toString());
                    }
                    ?? r6 = this.f;
                    Object obj2 = this.e;
                    Object obj3 = this.c;
                    alogVar2 = alobVar.g();
                    ((agsw) obj3).d((String) obj2, alogVar2, r6);
                }
                alob alobVar2 = new alob();
                for (int i4 = 0; i4 < alogVar2.size(); i4++) {
                    String str = (String) alogVar2.get(i4);
                    if (!str.isEmpty()) {
                        agun agunVar2 = (agun) alogVar.get(i4);
                        if (str.indexOf(48) == -1) {
                            alobVar2.h(agunVar2);
                        } else if (str.indexOf(49) != -1) {
                            alob alobVar3 = new alob();
                            for (int i5 = 1; i5 < str.length(); i5++) {
                                if (str.charAt(i5) == '1') {
                                    alobVar3.h((String) agunVar2.b.get(i5 - 1));
                                }
                            }
                            alog g = alobVar3.g();
                            if (str.charAt(0) == '1') {
                                String str2 = agunVar2.a;
                                if (((alsx) g).c == 1) {
                                    g = alsx.a;
                                }
                                alobVar2.h(new agun(str2, g));
                            } else {
                                alsx alsxVar = (alsx) g;
                                if (alsxVar.c > 0) {
                                    String str3 = (String) g.get(0);
                                    if (alsxVar.c == 1) {
                                        g = alsx.a;
                                    }
                                    alobVar2.h(new agun(str3, g));
                                }
                            }
                        }
                    }
                }
                return alobVar2.g();
            }
            aozy createBuilder = anmo.a.createBuilder();
            String str4 = yuv.a(((ytp) this.c).f).a;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            anmo anmoVar = (anmo) createBuilder.b;
            str4.getClass();
            anmoVar.l = str4;
            String num = Integer.toString(Build.VERSION.SDK_INT);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            num.getClass();
            ((anmo) apagVar).m = num;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            Object obj4 = this.e;
            int i6 = this.a;
            ((anmo) createBuilder.b).q = a.am(i6);
            String name = obj4.getClass().getName();
            Throwable th = (Throwable) obj4;
            String str5 = name + ": " + th.getMessage();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((anmo) createBuilder.b).s = str5;
            if (th.getCause() != null) {
                String str6 = th.getCause().getClass().getName() + ": " + th.getCause().getMessage();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((anmo) createBuilder.b).t = str6;
            }
            anmf anmfVar = (anmf) this.f;
            if (anmfVar.f.size() > 0) {
                aozb aozbVar = (aozb) anmfVar.f.get(0);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                anmo anmoVar2 = (anmo) createBuilder.b;
                aozbVar.getClass();
                anmoVar2.r = aozbVar;
            }
            ytp.b(createBuilder, (akul) this.g, (akul) this.b, (akul) this.d, i6);
            return (anmo) createBuilder.s();
        }
        admx admxVar = (admx) ((Optional) this.f).orElse(null);
        ?? r8 = this.g;
        int i7 = this.a;
        Object obj5 = this.e;
        return ((adks) this.b).d((Context) this.c, (adlw) this.d, null, (String) obj5, i7, admxVar, r8);
    }

    public /* synthetic */ adkp(ListenableFuture listenableFuture, int i, ListenableFuture listenableFuture2, agxe agxeVar, agsw agswVar, String str, anen anenVar, int i2) {
        this.h = i2;
        this.b = listenableFuture;
        this.a = i;
        this.d = listenableFuture2;
        this.g = agxeVar;
        this.c = agswVar;
        this.e = str;
        this.f = anenVar;
    }

    public /* synthetic */ adkp(ytp ytpVar, anmf anmfVar, int i, Throwable th, akul akulVar, akul akulVar2, akul akulVar3, int i2) {
        this.h = i2;
        this.c = ytpVar;
        this.f = anmfVar;
        this.a = i;
        this.e = th;
        this.g = akulVar;
        this.b = akulVar2;
        this.d = akulVar3;
    }
}
