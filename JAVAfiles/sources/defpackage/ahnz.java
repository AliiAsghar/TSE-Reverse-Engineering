package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.text.InputFilter;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ahnz {
    public static asqc a;

    public ahnz() {
    }

    public static ajcj A(ajci ajciVar, Context context) {
        Set c = ajciVar.c();
        if (c.isEmpty()) {
            return x(context);
        }
        Map y = y();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : y.entrySet()) {
            if (c.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ajcj v = v(context, linkedHashMap);
        Map z = z();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : z.entrySet()) {
            if (c.contains((String) entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return v.a(w(context, linkedHashMap2));
    }

    public static void B(ajci ajciVar, LottieAnimationView lottieAnimationView, ajcj ajcjVar) {
        lottieAnimationView.getClass();
        ajciVar.f(lottieAnimationView, ajcjVar);
    }

    public static hbt C(final ajci ajciVar, final LottieAnimationView lottieAnimationView, final ajcj ajcjVar) {
        hbt i = hbf.i(lottieAnimationView.getContext(), ajciVar.a(), null);
        i.e(new hbn() { // from class: ajcf
            @Override // defpackage.hbn
            public final void a(Object obj) {
                LottieAnimationView lottieAnimationView2 = LottieAnimationView.this;
                lottieAnimationView2.f((hbb) obj);
                ajciVar.g(lottieAnimationView2, ajcjVar);
            }
        });
        i.getClass();
        return i;
    }

    public static void D(ajci ajciVar, LottieAnimationView lottieAnimationView, ajcj ajcjVar) {
        for (apvu apvuVar : ajciVar.b()) {
            Integer num = (Integer) ajcjVar.a.get(apvuVar.b);
            if (num != null) {
                List list = apvuVar.a;
                final int intValue = num.intValue();
                final int i = 0;
                String[] strArr = (String[]) list.toArray(new String[0]);
                heo heoVar = new heo((String[]) Arrays.copyOf(strArr, strArr.length));
                String str = apvuVar.d;
                if (d.F(str, apvv.a.g)) {
                    final int i2 = 1;
                    lottieAnimationView.a(heoVar, hbq.b, new hii() { // from class: ajcg
                        @Override // defpackage.hii
                        public final Object a() {
                            if (i2 != 0) {
                                return Integer.valueOf(intValue);
                            }
                            return Integer.valueOf(intValue);
                        }
                    });
                } else if (d.F(str, apvv.b.g)) {
                    lottieAnimationView.a(heoVar, hbq.a, new hii() { // from class: ajcg
                        @Override // defpackage.hii
                        public final Object a() {
                            if (i != 0) {
                                return Integer.valueOf(intValue);
                            }
                            return Integer.valueOf(intValue);
                        }
                    });
                } else if (d.F(str, apvv.c.g)) {
                    final hbw hbwVar = new hbw(intValue);
                    lottieAnimationView.a(heoVar, hbq.K, new hii() { // from class: ajch
                        @Override // defpackage.hii
                        public final Object a() {
                            return hbw.this;
                        }
                    });
                }
            }
        }
    }

    public static void E(ajci ajciVar, LottieAnimationView lottieAnimationView) {
        lottieAnimationView.getClass();
        Context context = lottieAnimationView.getContext();
        context.getClass();
        ajciVar.f(lottieAnimationView, ajciVar.d(context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean F(int r7, defpackage.apri r8, defpackage.aiza r9) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahnz.F(int, apri, aiza):boolean");
    }

    public static boolean G(boolean z, apri apriVar, aiza aizaVar) {
        ahnz ahnzVar = aizp.c;
        if (!aizp.b(aqrg.a.get().a(aizp.b)) || !z || F(0, apriVar, aizaVar)) {
            return false;
        }
        return true;
    }

    public static apnu H(apqx apqxVar) {
        aozy createBuilder = apnu.a.createBuilder();
        int i = apqxVar.b;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((apnu) apagVar).b = i;
        int i2 = apqxVar.c;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        ((apnu) apagVar2).c = i2;
        String str = apqxVar.d;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apnu apnuVar = (apnu) createBuilder.b;
        str.getClass();
        apnuVar.d = str;
        return (apnu) createBuilder.s();
    }

    public static void I(apqe apqeVar, apqf apqfVar, asgf asgfVar, Context context, String str) {
        int i;
        int i2;
        char c;
        apry apryVar;
        aprg aprgVar;
        aprq aprqVar;
        aprh aprhVar;
        aprz aprzVar;
        ahnz ahnzVar = aizp.c;
        if (aizp.c(aqpe.b(aizp.b))) {
            aozy createBuilder = appc.a.createBuilder();
            if ((apqeVar.b & 1) != 0) {
                apsb apsbVar = apqeVar.c;
                if (apsbVar == null) {
                    apsbVar = apsb.a;
                }
                aozy createBuilder2 = appg.a.createBuilder();
                String str2 = apsbVar.b;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar = createBuilder2.b;
                str2.getClass();
                ((appg) apagVar).b = str2;
                apax apaxVar = apsbVar.c;
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                appg appgVar = (appg) createBuilder2.b;
                apax apaxVar2 = appgVar.c;
                if (!apaxVar2.c()) {
                    appgVar.c = apag.mutableCopy(apaxVar2);
                }
                aoyj.addAll(apaxVar, appgVar.c);
                boolean z = apsbVar.d;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((appg) createBuilder2.b).d = z;
                appg appgVar2 = (appg) createBuilder2.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                appc appcVar = (appc) createBuilder.b;
                appgVar2.getClass();
                appcVar.c = appgVar2;
                appcVar.b |= 1;
            }
            aozy createBuilder3 = appd.a.createBuilder();
            String str3 = apqfVar.e;
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar2 = createBuilder3.b;
            str3.getClass();
            ((appd) apagVar2).e = str3;
            String str4 = apqfVar.g;
            if (!apagVar2.isMutable()) {
                createBuilder3.u();
            }
            appd appdVar = (appd) createBuilder3.b;
            str4.getClass();
            appdVar.g = str4;
            if ((apqfVar.b & 1) != 0) {
                aprx aprxVar = apqfVar.c;
                if (aprxVar == null) {
                    aprxVar = aprx.a;
                }
                aozy createBuilder4 = apoy.a.createBuilder();
                String str5 = aprxVar.b;
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                apag apagVar3 = createBuilder4.b;
                str5.getClass();
                ((apoy) apagVar3).b = str5;
                aozb aozbVar = aprxVar.c;
                if (!apagVar3.isMutable()) {
                    createBuilder4.u();
                }
                apoy apoyVar = (apoy) createBuilder4.b;
                aozbVar.getClass();
                apoyVar.c = aozbVar;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                appd appdVar2 = (appd) createBuilder3.b;
                apoy apoyVar2 = (apoy) createBuilder4.s();
                apoyVar2.getClass();
                appdVar2.c = apoyVar2;
                appdVar2.b |= 1;
            }
            if ((apqfVar.b & 2) != 0) {
                apri apriVar = apqfVar.d;
                if (apriVar == null) {
                    apriVar = apri.a;
                }
                aozy createBuilder5 = apom.a.createBuilder();
                if ((apriVar.b & 1) != 0) {
                    apre apreVar = apriVar.c;
                    if (apreVar == null) {
                        apreVar = apre.a;
                    }
                    aozy createBuilder6 = apoc.a.createBuilder();
                    boolean z2 = apreVar.b;
                    if (!createBuilder6.b.isMutable()) {
                        createBuilder6.u();
                    }
                    apag apagVar4 = createBuilder6.b;
                    ((apoc) apagVar4).b = z2;
                    String str6 = apreVar.c;
                    if (!apagVar4.isMutable()) {
                        createBuilder6.u();
                    }
                    apoc apocVar = (apoc) createBuilder6.b;
                    str6.getClass();
                    apocVar.c = str6;
                    if (!createBuilder5.b.isMutable()) {
                        createBuilder5.u();
                    }
                    apom apomVar = (apom) createBuilder5.b;
                    apoc apocVar2 = (apoc) createBuilder6.s();
                    apocVar2.getClass();
                    apomVar.c = apocVar2;
                    apomVar.b |= 1;
                }
                if ((apriVar.b & 2) != 0) {
                    apqp apqpVar = apriVar.d;
                    if (apqpVar == null) {
                        apqpVar = apqp.b;
                    }
                    aozy createBuilder7 = apnn.a.createBuilder();
                    String str7 = apqpVar.c;
                    if (!createBuilder7.b.isMutable()) {
                        createBuilder7.u();
                    }
                    apag apagVar5 = createBuilder7.b;
                    str7.getClass();
                    ((apnn) apagVar5).b = str7;
                    String str8 = apqpVar.d;
                    if (!apagVar5.isMutable()) {
                        createBuilder7.u();
                    }
                    apag apagVar6 = createBuilder7.b;
                    str8.getClass();
                    ((apnn) apagVar6).c = str8;
                    String str9 = apqpVar.e;
                    if (!apagVar6.isMutable()) {
                        createBuilder7.u();
                    }
                    apnn apnnVar = (apnn) createBuilder7.b;
                    str9.getClass();
                    apnnVar.d = str9;
                    ahnz ahnzVar2 = aizp.c;
                    if (aizp.c(aqqo.b(aizp.b)) && apqpVar.f.size() > 0) {
                        apao apaoVar = apqpVar.f;
                        if (!createBuilder7.b.isMutable()) {
                            createBuilder7.u();
                        }
                        apnn apnnVar2 = (apnn) createBuilder7.b;
                        apao apaoVar2 = apnnVar2.e;
                        if (!apaoVar2.c()) {
                            apnnVar2.e = apag.mutableCopy(apaoVar2);
                        }
                        Iterator<E> it = apaoVar.iterator();
                        while (it.hasNext()) {
                            apnnVar2.e.g(((Integer) it.next()).intValue());
                        }
                    }
                    if (!createBuilder5.b.isMutable()) {
                        createBuilder5.u();
                    }
                    apom apomVar2 = (apom) createBuilder5.b;
                    apnn apnnVar3 = (apnn) createBuilder7.s();
                    apnnVar3.getClass();
                    apomVar2.d = apnnVar3;
                    apomVar2.b |= 2;
                }
                if ((apriVar.b & 4) != 0) {
                    apqs apqsVar = apriVar.e;
                    if (apqsVar == null) {
                        apqsVar = apqs.b;
                    }
                    aozy createBuilder8 = apnp.a.createBuilder();
                    int i3 = apqsVar.e;
                    if (!createBuilder8.b.isMutable()) {
                        createBuilder8.u();
                    }
                    ((apnp) createBuilder8.b).d = i3;
                    if ((apqsVar.c & 1) != 0) {
                        apqq apqqVar = apqsVar.d;
                        if (apqqVar == null) {
                            apqqVar = apqq.a;
                        }
                        aozy createBuilder9 = apno.a.createBuilder();
                        aozn aoznVar = apqqVar.b;
                        if (aoznVar == null) {
                            aoznVar = aozn.a;
                        }
                        if (!createBuilder9.b.isMutable()) {
                            createBuilder9.u();
                        }
                        apag apagVar7 = createBuilder9.b;
                        apno apnoVar = (apno) apagVar7;
                        aoznVar.getClass();
                        apnoVar.c = aoznVar;
                        apnoVar.b |= 1;
                        aozn aoznVar2 = apqqVar.c;
                        if (aoznVar2 == null) {
                            aoznVar2 = aozn.a;
                        }
                        if (!apagVar7.isMutable()) {
                            createBuilder9.u();
                        }
                        apno apnoVar2 = (apno) createBuilder9.b;
                        aoznVar2.getClass();
                        apnoVar2.d = aoznVar2;
                        apnoVar2.b |= 2;
                        if (!createBuilder8.b.isMutable()) {
                            createBuilder8.u();
                        }
                        apnp apnpVar = (apnp) createBuilder8.b;
                        apno apnoVar3 = (apno) createBuilder9.s();
                        apnoVar3.getClass();
                        apnpVar.c = apnoVar3;
                        apnpVar.b |= 1;
                    }
                    ahnz ahnzVar3 = aizp.c;
                    if (aizp.c(aqqo.b(aizp.b)) && apqsVar.f.size() > 0) {
                        apao apaoVar3 = apqsVar.f;
                        if (!createBuilder8.b.isMutable()) {
                            createBuilder8.u();
                        }
                        apnp apnpVar2 = (apnp) createBuilder8.b;
                        apao apaoVar4 = apnpVar2.e;
                        if (!apaoVar4.c()) {
                            apnpVar2.e = apag.mutableCopy(apaoVar4);
                        }
                        Iterator<E> it2 = apaoVar3.iterator();
                        while (it2.hasNext()) {
                            apnpVar2.e.g(((Integer) it2.next()).intValue());
                        }
                    }
                    if (!createBuilder5.b.isMutable()) {
                        createBuilder5.u();
                    }
                    apom apomVar3 = (apom) createBuilder5.b;
                    apnp apnpVar3 = (apnp) createBuilder8.s();
                    apnpVar3.getClass();
                    apomVar3.e = apnpVar3;
                    apomVar3.b |= 4;
                }
                if ((apriVar.b & 8) != 0) {
                    aprj aprjVar = apriVar.f;
                    if (aprjVar == null) {
                        aprjVar = aprj.a;
                    }
                    aozy createBuilder10 = apon.a.createBuilder();
                    boolean z3 = aprjVar.b;
                    if (!createBuilder10.b.isMutable()) {
                        createBuilder10.u();
                    }
                    apag apagVar8 = createBuilder10.b;
                    ((apon) apagVar8).b = z3;
                    boolean z4 = aprjVar.c;
                    if (!apagVar8.isMutable()) {
                        createBuilder10.u();
                    }
                    ((apon) createBuilder10.b).c = z4;
                    if (!createBuilder5.b.isMutable()) {
                        createBuilder5.u();
                    }
                    apom apomVar4 = (apom) createBuilder5.b;
                    apon aponVar = (apon) createBuilder10.s();
                    aponVar.getClass();
                    apomVar4.f = aponVar;
                    apomVar4.b |= 8;
                }
                if (apriVar.g.size() > 0) {
                    for (apro aproVar : apriVar.g) {
                        aozy createBuilder11 = apoq.a.createBuilder();
                        int i4 = aproVar.e;
                        if (!createBuilder11.b.isMutable()) {
                            createBuilder11.u();
                        }
                        apag apagVar9 = createBuilder11.b;
                        ((apoq) apagVar9).d = i4;
                        String str10 = aproVar.f;
                        if (!apagVar9.isMutable()) {
                            createBuilder11.u();
                        }
                        apag apagVar10 = createBuilder11.b;
                        str10.getClass();
                        ((apoq) apagVar10).e = str10;
                        String str11 = aproVar.g;
                        if (!apagVar10.isMutable()) {
                            createBuilder11.u();
                        }
                        apag apagVar11 = createBuilder11.b;
                        str11.getClass();
                        ((apoq) apagVar11).f = str11;
                        int i5 = aproVar.i;
                        if (!apagVar11.isMutable()) {
                            createBuilder11.u();
                        }
                        apag apagVar12 = createBuilder11.b;
                        ((apoq) apagVar12).h = i5;
                        boolean z5 = aproVar.j;
                        if (!apagVar12.isMutable()) {
                            createBuilder11.u();
                        }
                        ((apoq) createBuilder11.b).i = z5;
                        if (aproVar.h.size() > 0) {
                            for (apsa apsaVar : aproVar.h) {
                                aozy createBuilder12 = appf.a.createBuilder();
                                String str12 = apsaVar.d;
                                if (!createBuilder12.b.isMutable()) {
                                    createBuilder12.u();
                                }
                                appf appfVar = (appf) createBuilder12.b;
                                str12.getClass();
                                appfVar.d = str12;
                                if (apsaVar.b == 2) {
                                    aozy createBuilder13 = appe.a.createBuilder();
                                    if (apsaVar.b == 2) {
                                        aprzVar = (aprz) apsaVar.c;
                                    } else {
                                        aprzVar = aprz.a;
                                    }
                                    int i6 = aprzVar.b;
                                    if (!createBuilder13.b.isMutable()) {
                                        createBuilder13.u();
                                    }
                                    ((appe) createBuilder13.b).b = i6;
                                    if (!createBuilder12.b.isMutable()) {
                                        createBuilder12.u();
                                    }
                                    appf appfVar2 = (appf) createBuilder12.b;
                                    appe appeVar = (appe) createBuilder13.s();
                                    appeVar.getClass();
                                    appfVar2.c = appeVar;
                                    appfVar2.b = 2;
                                }
                                if (!createBuilder11.b.isMutable()) {
                                    createBuilder11.u();
                                }
                                apoq apoqVar = (apoq) createBuilder11.b;
                                appf appfVar3 = (appf) createBuilder12.s();
                                appfVar3.getClass();
                                apax apaxVar3 = apoqVar.g;
                                if (!apaxVar3.c()) {
                                    apoqVar.g = apag.mutableCopy(apaxVar3);
                                }
                                apoqVar.g.add(appfVar3);
                            }
                        }
                        int i7 = aproVar.c;
                        int i8 = i7 != 0 ? i7 != 4 ? i7 != 5 ? i7 != 6 ? i7 != 7 ? 0 : 4 : 3 : 2 : 1 : 5;
                        int i9 = i8 - 1;
                        if (i8 != 0) {
                            if (i9 == 0) {
                                if (i7 == 4) {
                                    apryVar = (apry) aproVar.d;
                                } else {
                                    apryVar = apry.a;
                                }
                                aozy createBuilder14 = apoz.a.createBuilder();
                                int i10 = apryVar.d;
                                if (!createBuilder14.b.isMutable()) {
                                    createBuilder14.u();
                                }
                                ((apoz) createBuilder14.b).d = i10;
                                if ((apryVar.b & 1) != 0) {
                                    apqh apqhVar = apryVar.c;
                                    if (apqhVar == null) {
                                        apqhVar = apqh.a;
                                    }
                                    apnh U = U(apqhVar);
                                    if (!createBuilder14.b.isMutable()) {
                                        createBuilder14.u();
                                    }
                                    apoz apozVar = (apoz) createBuilder14.b;
                                    U.getClass();
                                    apozVar.c = U;
                                    apozVar.b |= 1;
                                }
                                if (!createBuilder11.b.isMutable()) {
                                    createBuilder11.u();
                                }
                                apoq apoqVar2 = (apoq) createBuilder11.b;
                                apoz apozVar2 = (apoz) createBuilder14.s();
                                apozVar2.getClass();
                                apoqVar2.c = apozVar2;
                                apoqVar2.b = 4;
                            } else if (i9 == 1) {
                                if (i7 == 5) {
                                    aprgVar = (aprg) aproVar.d;
                                } else {
                                    aprgVar = aprg.a;
                                }
                                aozy createBuilder15 = apok.a.createBuilder();
                                if ((aprgVar.b & 1) != 0) {
                                    apqh apqhVar2 = aprgVar.c;
                                    if (apqhVar2 == null) {
                                        apqhVar2 = apqh.a;
                                    }
                                    apnh U2 = U(apqhVar2);
                                    if (!createBuilder15.b.isMutable()) {
                                        createBuilder15.u();
                                    }
                                    apok apokVar = (apok) createBuilder15.b;
                                    U2.getClass();
                                    apokVar.c = U2;
                                    apokVar.b |= 1;
                                }
                                if (!createBuilder11.b.isMutable()) {
                                    createBuilder11.u();
                                }
                                apoq apoqVar3 = (apoq) createBuilder11.b;
                                apok apokVar2 = (apok) createBuilder15.s();
                                apokVar2.getClass();
                                apoqVar3.c = apokVar2;
                                apoqVar3.b = 5;
                            } else if (i9 == 2) {
                                if (i7 == 6) {
                                    aprqVar = (aprq) aproVar.d;
                                } else {
                                    aprqVar = aprq.a;
                                }
                                aozy createBuilder16 = apor.a.createBuilder();
                                int i11 = aprqVar.b;
                                if (!createBuilder16.b.isMutable()) {
                                    createBuilder16.u();
                                }
                                apag apagVar13 = createBuilder16.b;
                                ((apor) apagVar13).b = i11;
                                int i12 = aprqVar.c;
                                if (!apagVar13.isMutable()) {
                                    createBuilder16.u();
                                }
                                apag apagVar14 = createBuilder16.b;
                                ((apor) apagVar14).c = i12;
                                String str13 = aprqVar.e;
                                if (!apagVar14.isMutable()) {
                                    createBuilder16.u();
                                }
                                apag apagVar15 = createBuilder16.b;
                                str13.getClass();
                                ((apor) apagVar15).e = str13;
                                String str14 = aprqVar.f;
                                if (!apagVar15.isMutable()) {
                                    createBuilder16.u();
                                }
                                apor aporVar = (apor) createBuilder16.b;
                                str14.getClass();
                                aporVar.f = str14;
                                if (aprqVar.d.size() > 0) {
                                    apao apaoVar5 = aprqVar.d;
                                    if (!createBuilder16.b.isMutable()) {
                                        createBuilder16.u();
                                    }
                                    apor aporVar2 = (apor) createBuilder16.b;
                                    apao apaoVar6 = aporVar2.d;
                                    if (!apaoVar6.c()) {
                                        aporVar2.d = apag.mutableCopy(apaoVar6);
                                    }
                                    aoyj.addAll(apaoVar5, aporVar2.d);
                                }
                                if (!createBuilder11.b.isMutable()) {
                                    createBuilder11.u();
                                }
                                apoq apoqVar4 = (apoq) createBuilder11.b;
                                apor aporVar3 = (apor) createBuilder16.s();
                                aporVar3.getClass();
                                apoqVar4.c = aporVar3;
                                apoqVar4.b = 6;
                            } else if (i9 == 3) {
                                if (i7 == 7) {
                                    aprhVar = (aprh) aproVar.d;
                                } else {
                                    aprhVar = aprh.a;
                                }
                                aozy createBuilder17 = apol.a.createBuilder();
                                String str15 = aprhVar.b;
                                if (!createBuilder17.b.isMutable()) {
                                    createBuilder17.u();
                                }
                                apag apagVar16 = createBuilder17.b;
                                str15.getClass();
                                ((apol) apagVar16).b = str15;
                                String str16 = aprhVar.c;
                                if (!apagVar16.isMutable()) {
                                    createBuilder17.u();
                                }
                                apol apolVar = (apol) createBuilder17.b;
                                str16.getClass();
                                apolVar.c = str16;
                                if (!createBuilder11.b.isMutable()) {
                                    createBuilder11.u();
                                }
                                apoq apoqVar5 = (apoq) createBuilder11.b;
                                apol apolVar2 = (apol) createBuilder17.s();
                                apolVar2.getClass();
                                apoqVar5.c = apolVar2;
                                apoqVar5.b = 7;
                            }
                            if (!createBuilder5.b.isMutable()) {
                                createBuilder5.u();
                            }
                            apom apomVar5 = (apom) createBuilder5.b;
                            apoq apoqVar6 = (apoq) createBuilder11.s();
                            apoqVar6.getClass();
                            apax apaxVar4 = apomVar5.g;
                            if (!apaxVar4.c()) {
                                apomVar5.g = apag.mutableCopy(apaxVar4);
                            }
                            apomVar5.g.add(apoqVar6);
                        } else {
                            throw null;
                        }
                    }
                }
                i = 7;
                i2 = 6;
                if (apriVar.h.size() > 0) {
                    Iterator<E> it3 = apriVar.h.iterator();
                    while (it3.hasNext()) {
                        int intValue = ((Integer) it3.next()).intValue();
                        if (!createBuilder5.b.isMutable()) {
                            createBuilder5.u();
                        }
                        apom apomVar6 = (apom) createBuilder5.b;
                        apao apaoVar7 = apomVar6.h;
                        if (!apaoVar7.c()) {
                            apomVar6.h = apag.mutableCopy(apaoVar7);
                        }
                        apomVar6.h.g(intValue);
                    }
                }
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                appd appdVar3 = (appd) createBuilder3.b;
                apom apomVar7 = (apom) createBuilder5.s();
                apomVar7.getClass();
                appdVar3.d = apomVar7;
                appdVar3.b |= 2;
            } else {
                i = 7;
                i2 = 6;
            }
            if (apqfVar.f.size() > 0) {
                for (String str17 : apqfVar.f) {
                    switch (str17.hashCode()) {
                        case -2076636191:
                            if (str17.equals("FAILED_TO_FETCH_SURVEY")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -2056938406:
                            if (str17.equals("UNSUPPORTED_CRONET_ENGINE")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -1938530698:
                            if (str17.equals("BACKEND_TIMEOUT")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1577734254:
                            if (str17.equals("NO_AVAILABLE_SURVEY")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 2076341913:
                            if (str17.equals("TRIGGER_ID_NOT_SET")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    c = 65535;
                    int i13 = c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? 2 : i : i2 : 5 : 4 : 3;
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    appd appdVar4 = (appd) createBuilder3.b;
                    apao apaoVar8 = appdVar4.f;
                    if (!apaoVar8.c()) {
                        appdVar4.f = apag.mutableCopy(apaoVar8);
                    }
                    appdVar4.f.g(a.ao(i13));
                }
            }
            aizq a2 = aizq.a();
            aozy createBuilder18 = apob.a.createBuilder();
            if (!createBuilder18.b.isMutable()) {
                createBuilder18.u();
            }
            apob apobVar = (apob) createBuilder18.b;
            appc appcVar2 = (appc) createBuilder.s();
            appcVar2.getClass();
            apobVar.c = appcVar2;
            apobVar.b = 2;
            if (!createBuilder18.b.isMutable()) {
                createBuilder18.u();
            }
            apob apobVar2 = (apob) createBuilder18.b;
            appd appdVar5 = (appd) createBuilder3.s();
            appdVar5.getClass();
            apobVar2.e = appdVar5;
            apobVar2.d = 4;
            a2.b((apob) createBuilder18.s(), asgfVar.b(), asgfVar.a(), context, str);
        }
    }

    public static void J(asgf asgfVar, Context context, String str) {
        ahnz ahnzVar = aizp.c;
        if (!aizp.c(aqpe.b(aizp.b))) {
            return;
        }
        aizq a2 = aizq.a();
        aozy createBuilder = appi.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((appi) createBuilder.b).b = a.ap(2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((appi) createBuilder.b).c = a.aj(6);
        a2.d((appi) createBuilder.s(), asgfVar.b(), asgfVar.a(), context, str);
    }

    public static void K(asgf asgfVar, Context context, String str) {
        ahnz ahnzVar = aizp.c;
        if (!aizp.c(aqpe.b(aizp.b))) {
            return;
        }
        aizq a2 = aizq.a();
        aozy createBuilder = appi.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((appi) createBuilder.b).b = a.ap(2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((appi) createBuilder.b).c = a.aj(8);
        a2.d((appi) createBuilder.s(), asgfVar.b(), asgfVar.a(), context, str);
    }

    public static void L(asgf asgfVar, Context context, String str) {
        ahnz ahnzVar = aizp.c;
        if (!aizp.c(aqpe.b(aizp.b))) {
            return;
        }
        aizq a2 = aizq.a();
        aozy createBuilder = appi.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((appi) createBuilder.b).b = a.ap(2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((appi) createBuilder.b).c = a.aj(7);
        a2.d((appi) createBuilder.s(), asgfVar.b(), asgfVar.a(), context, str);
    }

    public static void M(EditText editText, TextView textView) {
        eek.n(editText, new aizo(editText, textView));
    }

    public static Drawable N(Drawable drawable, Context context, int i) {
        Drawable mutate = drawable.getConstantState().newDrawable(context.getResources()).mutate();
        mutate.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        return mutate;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0138 A[LOOP:0: B:34:0x0132->B:36:0x0138, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List O(android.content.Context r12, java.lang.String r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahnz.O(android.content.Context, java.lang.String, android.os.Bundle):java.util.List");
    }

    public static void P(Activity activity, TextView textView, String str, String str2, String str3, String str4, aizn aiznVar) {
        Resources resources = activity.getResources();
        if (((UiModeManager) albo.D(new ahsz(activity, 12)).get()).getCurrentModeType() == 3) {
            textView.setText(resources.getString(R.string.survey_legal_text_car));
        } else {
            String string = resources.getString(R.string.survey_account_and_system_info);
            String string2 = resources.getString(R.string.survey_privacy);
            String string3 = resources.getString(R.string.survey_terms);
            String string4 = resources.getString(R.string.survey_legal_text, string, string2, string3);
            if (str2 != null) {
                string4 = string4.replace("Google", str2);
            }
            SpannableString spannableString = new SpannableString(string4);
            W(spannableString, string, new aizk(aiznVar));
            W(spannableString, string2, new aizl(str3, activity, str));
            W(spannableString, string3, new aizm(activity, str4, str));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString);
        }
        ahnz ahnzVar = aizp.c;
        if (aizp.c(aqqx.a.get().d(aizp.b))) {
            String packageName = activity.getPackageName();
            ahnz ahnzVar2 = aizp.c;
            String[] split = TextUtils.split(aqqx.a.get().a(aizp.b), ",");
            int i = 0;
            while (true) {
                if (i >= split.length) {
                    break;
                }
                split[i] = split[i].trim();
                i++;
            }
            for (String str5 : split) {
                if (TextUtils.equals(str5, packageName)) {
                    eek.n(textView, new aizs(textView));
                    return;
                }
            }
        }
    }

    public static void Q(Context context, String str) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            mka mkaVar = new mka();
            mkaVar.k(Color.parseColor("#eeeeee"));
            efu l = mkaVar.l();
            tc tcVar = new tc();
            tcVar.a(l);
            try {
                tcVar.b().b(context, Uri.parse(str));
                return;
            } catch (ActivityNotFoundException unused) {
                Log.e("ResourceUtils", "No app found to open URL: ".concat(str));
                return;
            }
        }
        Toast.makeText(context, context.getString(R.string.survey_network_request_failed), 0).show();
    }

    public static void R(ImageView imageView, Context context, int i) {
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            imageView.setImageDrawable(N(drawable, context, i));
        }
    }

    public static Drawable S(Context context) {
        return N(context.getDrawable(R.drawable.survey_close_button_icon), context, context.getColor(R.color.survey_close_icon_color));
    }

    public static eu T(Context context) {
        if (d.r()) {
            return new ajgi(new ContextThemeWrapper(context, R.style.SurveyMaterialComponentsTheme), R.style.SurveyMaterialAlertDialogStyle);
        }
        return new eu(context, R.style.SurveyAlertDialogTheme);
    }

    private static apnh U(apqh apqhVar) {
        aozy createBuilder = apnh.a.createBuilder();
        for (apqg apqgVar : apqhVar.b) {
            aozy createBuilder2 = apng.a.createBuilder();
            int i = apqgVar.c;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            ((apng) apagVar).b = i;
            int i2 = apqgVar.d;
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar2 = createBuilder2.b;
            ((apng) apagVar2).c = i2;
            String str = apqgVar.e;
            if (!apagVar2.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar3 = createBuilder2.b;
            str.getClass();
            ((apng) apagVar3).d = str;
            boolean z = apqgVar.f;
            if (!apagVar3.isMutable()) {
                createBuilder2.u();
            }
            ((apng) createBuilder2.b).e = z;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apnh apnhVar = (apnh) createBuilder.b;
            apng apngVar = (apng) createBuilder2.s();
            apngVar.getClass();
            apax apaxVar = apnhVar.b;
            if (!apaxVar.c()) {
                apnhVar.b = apag.mutableCopy(apaxVar);
            }
            apnhVar.b.add(apngVar);
        }
        return (apnh) createBuilder.s();
    }

    private static void V(int i, String str, List list, Resources resources) {
        if (!TextUtils.isEmpty(str)) {
            list.add(new ece(resources.getString(i), str));
        }
    }

    private static void W(Spannable spannable, String str, ClickableSpan clickableSpan) {
        int indexOf = spannable.toString().indexOf(str);
        int length = str.length() + indexOf;
        if (indexOf >= 0) {
            spannable.setSpan(clickableSpan, indexOf, length, 0);
        }
    }

    public static asik a(asik asikVar, long j) {
        aozy builder = asikVar.toBuilder();
        apag apagVar = builder.b;
        asik asikVar2 = (asik) apagVar;
        if ((asikVar2.b & 2) != 0) {
            long j2 = asikVar2.d - j;
            if (!apagVar.isMutable()) {
                builder.u();
            }
            asik asikVar3 = (asik) builder.b;
            asikVar3.b |= 2;
            asikVar3.d = j2;
        }
        apag apagVar2 = builder.b;
        asik asikVar4 = (asik) apagVar2;
        if ((asikVar4.b & 4) != 0) {
            long j3 = asikVar4.e - j;
            if (!apagVar2.isMutable()) {
                builder.u();
            }
            asik asikVar5 = (asik) builder.b;
            asikVar5.b |= 4;
            asikVar5.e = j3;
        }
        apag apagVar3 = builder.b;
        asik asikVar6 = (asik) apagVar3;
        if ((asikVar6.b & 8) != 0) {
            long j4 = asikVar6.f - j;
            if (!apagVar3.isMutable()) {
                builder.u();
            }
            asik asikVar7 = (asik) builder.b;
            asikVar7.b |= 8;
            asikVar7.f = j4;
        }
        return (asik) builder.s();
    }

    public static aibe b(aowx aowxVar) {
        ArrayList arrayList = new ArrayList();
        for (aoww aowwVar : aowxVar.b) {
            aozn aoznVar = aowwVar.b;
            if (aoznVar == null) {
                aoznVar = aozn.a;
            }
            arrayList.add(new ahzh(Duration.ofSeconds(aoznVar.b, aoznVar.c), aowwVar.c));
        }
        return new ahzw(alog.n(arrayList));
    }

    public static int c(int i, int i2) {
        return eap.h(i, (Color.alpha(i) * i2) / 255);
    }

    public static int d(View view, int i) {
        return i(view.getContext(), ajgk.i(view.getContext(), i, view.getClass().getCanonicalName()));
    }

    public static int e(Context context, int i, int i2) {
        Integer h = h(context, i);
        if (h != null) {
            return h.intValue();
        }
        return i2;
    }

    public static int f(Context context, int i, String str) {
        return i(context, ajgk.i(context, i, str));
    }

    public static int g(int i, int i2, float f) {
        return eap.g(eap.h(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static Integer h(Context context, int i) {
        TypedValue h = ajgk.h(context, i);
        if (h != null) {
            return Integer.valueOf(i(context, h));
        }
        return null;
    }

    private static int i(Context context, TypedValue typedValue) {
        if (typedValue.resourceId != 0) {
            return context.getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    private static void j(Spannable spannable) {
        for (SpanWatcher spanWatcher : (SpanWatcher[]) spannable.getSpans(0, spannable.length(), SpanWatcher.class)) {
            spannable.removeSpan(spanWatcher);
        }
    }

    public static boolean k(int i) {
        if (i != 0 && eap.b(i) > 0.5d) {
            return true;
        }
        return false;
    }

    public static float l(float f, float f2, int i) {
        return f + (Math.max(0, i - 1) * f2);
    }

    public static float m(float f, float f2, int i) {
        if (i > 0) {
            return f + (f2 / 2.0f);
        }
        return f;
    }

    public static float n(Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_gone_size);
    }

    public static float o(float f, float f2, float f3, int i) {
        if (i > 0) {
            return f2 + (f3 / 2.0f);
        }
        return f;
    }

    public static int p(int[] iArr) {
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public static void q(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static void r(CharSequence charSequence) {
        if (charSequence != null) {
            if (charSequence instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
                j(spannableStringBuilder);
                spannableStringBuilder.clearSpans();
                spannableStringBuilder.setFilters(new InputFilter[0]);
                return;
            }
            if (charSequence instanceof SpannableString) {
                SpannableString spannableString = (SpannableString) charSequence;
                spannableString.removeSpan(null);
                Object[] spans = spannableString.getSpans(0, spannableString.length(), Object.class);
                if (spans != null && (r3 = spans.length) != 0) {
                    spannableString.setSpan(null, 0, 0, 0);
                    j(spannableString);
                    while (true) {
                        int length = length - 1;
                        if (length >= 0) {
                            spannableString.removeSpan(spans[length]);
                        } else {
                            spannableString.removeSpan(null);
                            return;
                        }
                    }
                }
            }
        }
    }

    public static void s(TextView textView) {
        u(textView, LinkMovementMethod.getInstance());
    }

    public static void t(TextView textView) {
        AccessibilityManager accessibilityManager;
        if (textView != null && Build.VERSION.SDK_INT < 28 && (accessibilityManager = (AccessibilityManager) textView.getContext().getSystemService("accessibility")) != null && accessibilityManager.isEnabled()) {
            textView.addOnAttachStateChangeListener(new ajcw(0));
            if (textView instanceof EditText) {
                ((EditText) textView).addTextChangedListener(new ajcv());
            }
        }
    }

    public static void u(TextView textView, MovementMethod movementMethod) {
        boolean isClickable = textView.isClickable();
        boolean isLongClickable = textView.isLongClickable();
        textView.setMovementMethod(movementMethod);
        textView.setClickable(isClickable);
        textView.setLongClickable(isLongClickable);
    }

    public static ajcj v(Context context, Map map) {
        List ax = aqjn.ax(map.entrySet());
        ArrayList arrayList = new ArrayList(aqjn.J(ax, 10));
        Iterator it = ax.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getValue()).intValue()));
        }
        int[] aI = aqjn.aI(arrayList);
        arsb arsbVar = new arsb();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(aI);
        try {
            ArrayList arrayList2 = new ArrayList(aqjn.J(ax, 10));
            int i = 0;
            for (Object obj : ax) {
                int i2 = i + 1;
                if (i < 0) {
                    aqjn.G();
                }
                arrayList2.add(new armo((String) ((Map.Entry) obj).getKey(), Integer.valueOf(obtainStyledAttributes.getColor(i, -16777216))));
                i = i2;
            }
            arsbVar.a = aqjn.q(arrayList2);
            obtainStyledAttributes.recycle();
            return new ajcj((Map) arsbVar.a);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static ajcj w(Context context, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(aqjn.i(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), Integer.valueOf(new ajgm(context).a(e(context, R.attr.colorSurface, 0), context.getResources().getDimension(((ahfj) entry.getValue()).g))));
        }
        return new ajcj(linkedHashMap);
    }

    public static ajcj x(Context context) {
        context.getClass();
        return v(context, y()).a(w(context, z()));
    }

    public static Map y() {
        return aqjn.m(new armo("Background", Integer.valueOf(android.R.attr.colorBackground)), new armo("On Background", Integer.valueOf(R.attr.colorOnBackground)), new armo("Surface Variant", Integer.valueOf(R.attr.colorSurfaceVariant)), new armo("Inverse Surface", Integer.valueOf(R.attr.colorSurfaceInverse)), new armo("On Surface", Integer.valueOf(R.attr.colorOnSurface)), new armo("On Surface Variant", Integer.valueOf(R.attr.colorOnSurfaceVariant)), new armo("Inverse On Surface", Integer.valueOf(R.attr.colorOnSurfaceInverse)), new armo("Primary", Integer.valueOf(R.attr.colorPrimary)), new armo("Inverse Primary", Integer.valueOf(R.attr.colorPrimaryInverse)), new armo("On Primary", Integer.valueOf(R.attr.colorOnPrimary)), new armo("Primary Container", Integer.valueOf(R.attr.colorPrimaryContainer)), new armo("On Primary Container", Integer.valueOf(R.attr.colorOnPrimaryContainer)), new armo("Secondary", Integer.valueOf(R.attr.colorSecondary)), new armo("On Secondary", Integer.valueOf(R.attr.colorOnSecondary)), new armo("Secondary Container", Integer.valueOf(R.attr.colorSecondaryContainer)), new armo("On Secondary Container", Integer.valueOf(R.attr.colorOnSecondaryContainer)), new armo("Tertiary", Integer.valueOf(R.attr.colorTertiary)), new armo("Tertiary Container", Integer.valueOf(R.attr.colorTertiaryContainer)), new armo("On Tertiary Container", Integer.valueOf(R.attr.colorOnTertiaryContainer)), new armo("Error", Integer.valueOf(R.attr.colorError)), new armo("On Error", Integer.valueOf(R.attr.colorOnError)), new armo("Outline", Integer.valueOf(R.attr.colorOutline)));
    }

    public static Map z() {
        return aqjn.m(new armo("Surface 0", ahfj.SURFACE_0), new armo("Surface 1", ahfj.SURFACE_1), new armo("Surface 2", ahfj.SURFACE_2), new armo("Surface 3", ahfj.SURFACE_3), new armo("Surface 4", ahfj.SURFACE_4), new armo("Surface 5", ahfj.SURFACE_5));
    }

    public ahnz(byte[] bArr) {
    }

    public ahnz(int[] iArr) {
    }
}
