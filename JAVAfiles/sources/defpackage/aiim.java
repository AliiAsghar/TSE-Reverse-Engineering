package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiim {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public aiim(alog alogVar, alog alogVar2, alog alogVar3) {
        this.b = null;
        this.c = alogVar;
        this.a = alogVar2;
        this.d = alogVar3;
    }

    public static aiim c(ahvp ahvpVar) {
        return new aiim(ahvpVar, (ahui) null, ahts.a);
    }

    public static String f(String str, char c) {
        String valueOf = String.valueOf(albo.aq(Integer.toHexString(c)));
        alfs alfsVar = new alfs(c);
        String concat = "%".concat(valueOf);
        int length = concat.length();
        int i = 0;
        if (length == 0) {
            String charSequence = str.toString();
            int d = alfsVar.d(charSequence);
            if (d != -1) {
                char[] charArray = charSequence.toCharArray();
                int i2 = 1;
                while (true) {
                    d++;
                    while (d != charArray.length) {
                        char c2 = charArray[d];
                        if (alfsVar.c(c2)) {
                            break;
                        }
                        charArray[d - i2] = c2;
                        d++;
                    }
                    return new String(charArray, 0, d - i2);
                    i2++;
                }
            } else {
                return charSequence;
            }
        } else {
            if (length == 1) {
                return str.toString().replace(alfsVar.a, concat.charAt(0));
            }
            String charSequence2 = str.toString();
            int d2 = alfsVar.d(charSequence2);
            if (d2 != -1) {
                int length2 = charSequence2.length();
                StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
                do {
                    sb.append((CharSequence) charSequence2, i, d2);
                    sb.append((CharSequence) concat);
                    i = d2 + 1;
                    d2 = alfsVar.e(charSequence2, i);
                } while (d2 != -1);
                sb.append((CharSequence) charSequence2, i, length2);
                return sb.toString();
            }
            return charSequence2;
        }
    }

    public static String g(String str) {
        return f(f(f(str, '%'), '|'), '>');
    }

    public static /* synthetic */ void v(aiim aiimVar, Integer num, Integer num2, Integer num3, View.OnClickListener onClickListener) {
        int i = 8;
        ((View) aiimVar.c).setVisibility(8);
        num.intValue();
        int intValue = num.intValue();
        Object obj = aiimVar.a;
        ((TextView) obj).setText(intValue);
        ((View) obj).setVisibility(0);
        Object obj2 = aiimVar.b;
        if (num2 != null) {
            ((TextView) obj2).setText(num2.intValue());
        }
        if (num2 != null) {
            i = 0;
        }
        ((View) obj2).setVisibility(i);
        Object obj3 = aiimVar.d;
        num3.intValue();
        int intValue2 = num3.intValue();
        Button button = (Button) obj3;
        button.setText(intValue2);
        button.setOnClickListener(onClickListener);
        ((View) obj3).setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.Map, java.lang.Object] */
    private final synchronized adzw w(aecj aecjVar) {
        Object obj;
        ?? r15 = this.c;
        obj = r15.get(aecjVar);
        if (obj == null) {
            Object obj2 = this.a;
            qdq qdqVar = (qdq) ((kru) ((qdq) obj2).a).a.rJ.b();
            aedd aeddVar = (aedd) ((kru) ((qdq) obj2).a).a.rK.b();
            krv krvVar = ((kru) ((qdq) obj2).a).a;
            aeca hd = krvVar.hd();
            Context context = (Context) krvVar.n.b();
            context.getClass();
            adzp adzpVar = new adzp(aqmz.a.get().a(context));
            krv krvVar2 = ((kru) ((qdq) obj2).a).a;
            arwb Mc = krvVar2.Mc();
            aedw aedwVar = (aedw) krvVar2.rI.b();
            aegu aeguVar = (aegu) ((kru) ((qdq) obj2).a).a.i.b();
            krv krvVar3 = ((kru) ((qdq) obj2).a).a;
            aeak ha = krvVar3.ha();
            aeak ha2 = krvVar3.ha();
            boolean z = krvVar3.ha().h;
            adzw adzwVar = new adzw(aecjVar, qdqVar, aeddVar, hd, adzpVar, Mc, aedwVar, aeguVar, ha.f, ha2.g, z);
            r15.put(aecjVar, adzwVar);
            obj = adzwVar;
        }
        return (adzw) obj;
    }

    public final boolean a(aipj aipjVar) {
        return this.a.equals(aipjVar);
    }

    public final String b() {
        Object obj = this.b;
        if (obj != null) {
            return ((ahvp) obj).c;
        }
        Object obj2 = this.a;
        obj2.getClass();
        return ((ahui) obj2).a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final ListenableFuture d(String str) {
        ahiu.f("%s: submitting request for in-progress download future with key: %s", "DownloadFutureMap", str);
        return ((adwv) this.a).c(new ahes(this, str, 3), this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void e(String str) {
        ahiu.f("%s: submitting request to remove in-progress download future with key: %s", "DownloadFutureMap", str);
        ((adwv) this.a).d(new xpx(this, str, 10), this.c);
    }

    public final void h() {
        long j = ((agst) this.d).b;
        ((EnumMap) this.c).put((EnumMap) agsu.APP, (agsu) Long.toString(j));
    }

    public final void i() {
        String str = ((agst) this.d).a;
        ((EnumMap) this.c).put((EnumMap) agsu.OS, (agsu) str);
    }

    public final void j() {
        if (((AtomicBoolean) this.a).getAndSet(false)) {
            ((dtq) this.d).c();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    public final void k() {
        if (((AtomicBoolean) this.a).getAndSet(false)) {
            this.b.run();
            ((dtq) this.d).b(null);
        }
    }

    public final void l() {
        ((View) this.c).setVisibility(8);
        ((View) this.a).setVisibility(8);
        ((View) this.b).setVisibility(8);
        ((View) this.d).setVisibility(8);
    }

    public final void m(int i, int i2) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        Button button = (Button) this.d;
        button.setBackgroundTintList(valueOf);
        button.setTextColor(i2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    public final afxo n(afxe afxeVar, boolean z) {
        Context context = (Context) this.d.b();
        context.getClass();
        arwe arweVar = (arwe) this.c.b();
        arweVar.getClass();
        aiim aiimVar = (aiim) this.a.b();
        aiimVar.getClass();
        afke afkeVar = (afke) this.b.b();
        afkeVar.getClass();
        afxeVar.getClass();
        return new afxo(context, arweVar, aiimVar, afkeVar, afxeVar, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    public final aflf o(EditText editText) {
        afjy afjyVar = (afjy) this.b.b();
        agcp agcpVar = (agcp) this.a.b();
        agcpVar.getClass();
        aday adayVar = (aday) this.d.b();
        adayVar.getClass();
        afke afkeVar = (afke) this.c.b();
        afkeVar.getClass();
        return new aflf(afjyVar, agcpVar, adayVar, afkeVar, editText);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0061  */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v18, types: [aiim] */
    /* JADX WARN: Type inference failed for: r7v19, types: [aiim] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [aiim] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(java.util.List r19, defpackage.arpe r20) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiim.p(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.Collection, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.String r7, int r8, defpackage.arqv r9, defpackage.arpe r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.afkm
            if (r0 == 0) goto L13
            r0 = r10
            afkm r0 = (defpackage.afkm) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            afkm r0 = new afkm
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.String r7 = r0.c
            aiim r8 = r0.e
            defpackage.aqil.P(r10)
            goto L7d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            defpackage.aqil.P(r10)
            goto L67
        L3a:
            defpackage.aqil.P(r10)
            if (r8 <= 0) goto L54
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            java.lang.String r2 = "_"
            r10.append(r2)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            goto L55
        L54:
            r10 = r7
        L55:
            java.lang.Object r2 = r6.c
            boolean r2 = r2.contains(r10)
            if (r2 == 0) goto L68
            int r8 = r8 + r4
            r0.b = r4
            java.lang.Object r10 = r6.q(r7, r8, r9, r0)
            if (r10 != r1) goto L67
            return r1
        L67:
            return r10
        L68:
            java.lang.Object r7 = r6.c
            r7.add(r10)
            r0.e = r6
            r0.c = r10
            r0.b = r3
            java.lang.Object r7 = r9.a(r10, r0)
            if (r7 == r1) goto L83
            r8 = r6
            r5 = r10
            r10 = r7
            r7 = r5
        L7d:
            java.lang.Object r8 = r8.c
            r8.remove(r7)
            return r10
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiim.q(java.lang.String, int, arqv, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r10v2, types: [afko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [afko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [afko, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.util.List r9, defpackage.arpe r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiim.r(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean s(afkj afkjVar) {
        afkjVar.getClass();
        alog alogVar = afkjVar.k;
        if ((alogVar instanceof Collection) && alogVar.isEmpty()) {
            return false;
        }
        alur it = alogVar.iterator();
        while (it.hasNext()) {
            if (egl.e((Context) this.d, (String) it.next()) == 0) {
                alog alogVar2 = afkjVar.m;
                if (!(alogVar2 instanceof Collection) || !alogVar2.isEmpty()) {
                    alur it2 = alogVar2.iterator();
                    while (it2.hasNext()) {
                        if (egl.e((Context) this.d, (String) it2.next()) != -1) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object t(afkj afkjVar, arpe arpeVar) {
        return aeke.bM(this, afkjVar, true, arpeVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r7 == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(java.lang.String r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.adzo
            if (r0 == 0) goto L13
            r0 = r7
            adzo r0 = (defpackage.adzo) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            adzo r0 = new adzo
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            adzw r6 = r0.c
            defpackage.aqil.P(r7)
            goto L81
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.aqil.P(r7)
            r6.getClass()
            java.lang.Object r7 = r5.b
            j$.util.Optional r7 = (j$.util.Optional) r7
            java.lang.Object r7 = defpackage.arsd.k(r7)
            armf r7 = (defpackage.armf) r7
            r2 = 0
            if (r7 == 0) goto L57
            java.lang.Object r7 = r7.b()
            aecj r7 = (defpackage.aecj) r7
            if (r7 == 0) goto L57
            java.lang.String r4 = r7.a
            int r4 = r4.length()
            if (r4 > 0) goto L55
            r7 = r2
        L55:
            if (r7 != 0) goto L68
        L57:
            java.lang.Object r7 = r5.d
            aecj r4 = new aecj
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r7 = r7.getPackageName()
            r7.getClass()
            r4.<init>(r7, r6)
            r7 = r4
        L68:
            adzw r6 = r5.w(r7)
            r0.c = r6
            r0.b = r3
            adzu r7 = new adzu
            r7.<init>(r6, r2)
            java.lang.Object r7 = defpackage.arwi.d(r7, r0)
            arpl r0 = defpackage.arpl.a
            if (r7 == r0) goto L7f
            arnb r7 = defpackage.arnb.a
        L7f:
            if (r7 == r1) goto L82
        L81:
            return r6
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiim.u(java.lang.String, arpe):java.lang.Object");
    }

    public aiim(Context context, aiij aiijVar, agxw agxwVar, aigs aigsVar) {
        this.a = context;
        this.d = aiijVar;
        this.b = agxwVar;
        this.c = aigsVar;
    }

    public aiim(String str, Class cls, agzu agzuVar, agzz agzzVar) {
        this.c = str;
        this.b = cls;
        this.d = agzuVar;
        this.a = agzzVar;
    }

    public aiim(aipj aipjVar, aipj aipjVar2, alpx alpxVar, Map map) {
        alpxVar.getClass();
        this.d = alpxVar;
        aipjVar.getClass();
        this.c = aipjVar;
        aipjVar2.getClass();
        this.a = aipjVar2;
        this.b = alor.j(map);
    }

    public aiim(Context context, Optional optional, qdq qdqVar, qdq qdqVar2) {
        context.getClass();
        qdqVar.getClass();
        qdqVar2.getClass();
        this.d = context;
        this.b = optional;
        this.a = qdqVar;
        this.c = new LinkedHashMap();
    }

    public aiim(Executor executor, ahiw ahiwVar) {
        this.a = new adwv((char[]) null);
        this.b = new HashMap();
        this.c = executor;
        this.d = ahiwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Map] */
    public aiim(ahvp ahvpVar, ahui ahuiVar, ahts ahtsVar) {
        String str;
        ahuh ahuhVar;
        alor g;
        alor g2;
        aozb aozbVar;
        long j;
        String str2;
        long longValue;
        aozb aozbVar2;
        albo.T((ahvpVar != null) ^ (ahuiVar != null));
        this.b = ahvpVar;
        this.a = ahuiVar;
        this.d = ahtsVar;
        String str3 = "__phenotype_configuration_version";
        int i = 5;
        if (ahvpVar != null) {
            alok h = alor.h(ahvpVar.g.size() + 3);
            for (ahvq ahvqVar : ahvpVar.g) {
                int i2 = ahvqVar.c;
                int i3 = i2 != 0 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != i ? i2 != 6 ? 0 : i : 4 : 3 : 2 : 1 : 6;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                if (i4 == 0) {
                    h.h(ahvqVar.e, Long.valueOf(i2 == 2 ? ((Long) ahvqVar.d).longValue() : 0L));
                } else if (i4 == 1) {
                    h.h(ahvqVar.e, Boolean.valueOf(i2 == 3 ? ((Boolean) ahvqVar.d).booleanValue() : false));
                } else if (i4 == 2) {
                    h.h(ahvqVar.e, Double.valueOf(i2 == 4 ? ((Double) ahvqVar.d).doubleValue() : 0.0d));
                } else if (i4 == 3) {
                    h.h(ahvqVar.e, i2 == 5 ? (String) ahvqVar.d : "");
                } else if (i4 == 4) {
                    String str4 = ahvqVar.e;
                    if (i2 == 6) {
                        aozbVar2 = (aozb) ahvqVar.d;
                    } else {
                        aozbVar2 = aozb.b;
                    }
                    h.h(str4, aozbVar2.H());
                }
                i = 5;
            }
            h.h("__phenotype_server_token", ahvpVar.e);
            h.h("__phenotype_snapshot_token", ahvpVar.c);
            h.h("__phenotype_configuration_version", Long.valueOf(ahvpVar.f));
            g = h.g();
        } else {
            ahuiVar.getClass();
            if (ahuiVar.c.f.size() > 0) {
                ahuhVar = ahuiVar.b;
                Collection<ahtw> values = DesugarCollections.unmodifiableMap(ahuiVar.c.f).values();
                if (values == null) {
                    g2 = altc.a;
                } else {
                    alok alokVar = new alok();
                    for (ahtw ahtwVar : values) {
                        int i5 = ahtwVar.c;
                        int a = ahop.a(i5);
                        int i6 = a - 1;
                        if (a == 0) {
                            throw null;
                        }
                        if (i6 == 0) {
                            alokVar.h(ahtwVar.e, Long.valueOf(i5 == 1 ? ((Long) ahtwVar.d).longValue() : 0L));
                        } else if (i6 == 1) {
                            alokVar.h(ahtwVar.e, Boolean.valueOf(i5 == 2 ? ((Boolean) ahtwVar.d).booleanValue() : false));
                        } else if (i6 == 2) {
                            alokVar.h(ahtwVar.e, Double.valueOf(i5 == 3 ? ((Double) ahtwVar.d).doubleValue() : 0.0d));
                        } else if (i6 == 3) {
                            alokVar.h(ahtwVar.e, i5 == 4 ? (String) ahtwVar.d : "");
                        } else if (i6 == 4) {
                            String str5 = ahtwVar.e;
                            if (i5 == 5) {
                                aozbVar = (aozb) ahtwVar.d;
                            } else {
                                aozbVar = aozb.b;
                            }
                            alokVar.h(str5, aozbVar.H());
                        } else {
                            throw new IllegalStateException("Could not serialize Flag for override: ".concat(String.valueOf(ahtwVar.e)));
                        }
                    }
                    g2 = alokVar.g();
                }
                if (g2.isEmpty()) {
                    str = "__phenotype_configuration_version";
                } else {
                    HashMap hashMap = new HashMap(g2);
                    alqd alqdVar = new alqd(also.a);
                    aluq listIterator = ahuhVar.b.listIterator();
                    while (listIterator.hasNext()) {
                        ahug ahugVar = (ahug) listIterator.next();
                        Object remove = hashMap.remove(ahugVar.b());
                        if (remove != null) {
                            if (!(remove instanceof String) && !(remove instanceof byte[])) {
                                if (remove instanceof Boolean) {
                                    if (((Boolean) remove).booleanValue()) {
                                        str2 = str3;
                                        alqdVar.m(new ahug(ahugVar.a, ahugVar.b, 1, ahugVar.d, ahugVar.e));
                                    } else {
                                        str2 = str3;
                                        alqdVar.m(new ahug(ahugVar.a, ahugVar.b, 0, ahugVar.d, ahugVar.e));
                                    }
                                } else {
                                    str2 = str3;
                                    if (remove instanceof Long) {
                                        longValue = ((Long) remove).longValue();
                                    } else if (remove instanceof Double) {
                                        longValue = Double.doubleToRawLongBits(((Double) remove).doubleValue());
                                    } else {
                                        throw new IllegalStateException("Cannot serialize override for existing flag " + ahugVar.b() + ": " + remove.toString());
                                    }
                                    alqdVar.m(new ahug(ahugVar.a, ahugVar.b, ahugVar.c, longValue, ahugVar.e));
                                }
                                str3 = str2;
                            } else {
                                alqdVar.m(new ahug(ahugVar.a, ahugVar.b, ahugVar.c, ahugVar.d, remove));
                                str3 = str3;
                                hashMap = hashMap;
                            }
                        } else {
                            alqdVar.m(ahugVar);
                        }
                    }
                    HashMap hashMap2 = hashMap;
                    str = str3;
                    for (String str6 : hashMap2.keySet()) {
                        ?? r5 = hashMap2;
                        Object obj = r5.get(str6);
                        int length = str6.length();
                        if (length <= 19 && length != 0) {
                            long charAt = str6.charAt(0) - '0';
                            if (charAt >= 1 && charAt <= 9) {
                                int i7 = 1;
                                while (true) {
                                    if (i7 < length) {
                                        int charAt2 = str6.charAt(i7) - '0';
                                        if ((charAt2 < 0) || (charAt2 > 9)) {
                                            break;
                                        }
                                        charAt = (charAt * 10) + charAt2;
                                        i7++;
                                        length = length;
                                    } else if (charAt >= 0 && charAt <= 2305843009213693951L) {
                                        j = charAt;
                                    }
                                }
                            }
                        }
                        j = 0;
                        String str7 = j == 0 ? str6 : null;
                        if (obj instanceof String) {
                            alqdVar.m(new ahug(j, str7, 4, 0L, obj));
                        } else if (obj instanceof byte[]) {
                            alqdVar.m(new ahug(j, str7, 5, 0L, obj));
                        } else if (obj instanceof Boolean) {
                            if (((Boolean) obj).booleanValue()) {
                                alqdVar.m(new ahug(j, str7, 1, 0L, null));
                            } else {
                                alqdVar.m(new ahug(j, str7, 0, 0L, null));
                            }
                        } else if (obj instanceof Long) {
                            alqdVar.m(new ahug(j, str7, 2, ((Long) obj).longValue(), null));
                        } else if (obj instanceof Double) {
                            alqdVar.m(new ahug(j, str7, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                        } else {
                            throw new IllegalStateException("Cannot serialize override " + str6 + ": " + String.valueOf(obj));
                        }
                        hashMap2 = r5;
                    }
                    ahuhVar = new ahuh(alqdVar.g());
                }
            } else {
                str = "__phenotype_configuration_version";
                ahuhVar = ahuiVar.b;
            }
            alok h2 = alor.h(ahuhVar.b.size() + 3);
            aluq listIterator2 = ahuhVar.b.listIterator();
            while (listIterator2.hasNext()) {
                ahug ahugVar2 = (ahug) listIterator2.next();
                h2.h(ahugVar2.b(), ahugVar2.a());
            }
            h2.h("__phenotype_server_token", ahuiVar.c.d);
            h2.h("__phenotype_snapshot_token", ahuiVar.a());
            h2.h(str, Long.valueOf(ahuiVar.c.e));
            g = h2.g();
        }
        this.c = g;
    }

    public aiim(Activity activity, Optional optional, afke afkeVar) {
        activity.getClass();
        afkeVar.getClass();
        this.a = afkeVar;
        this.c = new LinkedHashSet();
        this.b = (afko) arsd.k(optional);
        if (activity instanceof cj) {
            this.d = (cj) activity;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public aiim(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
    }

    public aiim(ViewGroup viewGroup) {
        View findViewById = viewGroup.findViewById(R.id.emoji_gallery_container);
        findViewById.getClass();
        View findViewById2 = viewGroup.findViewById(R.id.emoji_gallery_recycler_view);
        findViewById2.getClass();
        this.c = (EmojiPickerBodyRecyclerView) findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.recycler_view_bottom_border_view);
        findViewById3.getClass();
        this.a = findViewById3;
        View findViewById4 = viewGroup.findViewById(R.id.emoji_categories_list);
        findViewById4.getClass();
        this.d = (RecyclerView) findViewById4;
        View findViewById5 = viewGroup.findViewById(R.id.emoji_bar_backspace);
        findViewById5.getClass();
        this.b = (ImageButton) findViewById5;
    }

    public aiim(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.b = armfVar4;
    }

    public aiim(View view) {
        View inflate = ((ViewStub) eek.b(view, R.id.error_prompt)).inflate();
        this.c = (ImageView) eek.b(inflate, R.id.error_image);
        this.a = (TextView) eek.b(inflate, R.id.error_description);
        this.b = (TextView) eek.b(inflate, R.id.error_caption);
        this.d = (Button) eek.b(inflate, R.id.error_button);
    }

    public aiim(Runnable runnable, dtq dtqVar, agnt agntVar) {
        this.a = new AtomicBoolean(true);
        this.b = runnable;
        this.d = dtqVar;
        this.c = agntVar;
    }

    public aiim(Context context, agst agstVar) {
        this.c = new EnumMap(agsu.class);
        if (!TextUtils.isEmpty("BundledEmojiListLoader")) {
            this.b = context;
            this.a = "BundledEmojiListLoader";
            this.d = agstVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    aiim() {
        /*
            r1 = this;
            int r0 = defpackage.alog.d
            alog r0 = defpackage.alsx.a
            r1.<init>(r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiim.<init>():void");
    }
}
