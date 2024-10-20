package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import j$.util.Comparator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ked {
    private static final alvi j = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/text/TextBubbleUiAdapter");
    public final Context a;
    public final khb b;
    public final arwe c;
    public final arpi d;
    public final ConcurrentHashMap e;
    public final arqr f;
    public final arqr g;
    public final lkd h;
    public final abvz i;
    private final ydc k;
    private final aadi l;
    private final uza m;
    private final kdu n;
    private final xca o;
    private final phb p;
    private final piz q;
    private final zfm r;
    private final ibi s;

    public ked(Context context, ydc ydcVar, aadi aadiVar, uza uzaVar, ibi ibiVar, lkd lkdVar, kdu kduVar, khb khbVar, xca xcaVar, obk obkVar, abvz abvzVar, arwe arweVar, arpi arpiVar, zfm zfmVar, phb phbVar, piz pizVar) {
        context.getClass();
        ydcVar.getClass();
        aadiVar.getClass();
        lkdVar.getClass();
        khbVar.getClass();
        xcaVar.getClass();
        obkVar.getClass();
        abvzVar.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        zfmVar.getClass();
        this.a = context;
        this.k = ydcVar;
        this.l = aadiVar;
        this.m = uzaVar;
        this.s = ibiVar;
        this.h = lkdVar;
        this.n = kduVar;
        this.b = khbVar;
        this.o = xcaVar;
        this.i = abvzVar;
        this.c = arweVar;
        this.d = arpiVar;
        this.r = zfmVar;
        this.p = phbVar;
        this.q = pizVar;
        this.e = new ConcurrentHashMap();
        this.f = qkf.f(new jya(this, 11, (boolean[][]) null), arweVar);
        this.g = qkf.f(new jya(this, 12, (float[][]) null), arweVar);
    }

    public static final List d(List list) {
        Comparator thenComparing = Comparator.EL.thenComparing(Comparator.EL.thenComparing(new lvh(1), new kdw(eif.p, 0)), new kdw(eif.q, 2));
        thenComparing.getClass();
        return aqjn.au(list, thenComparing);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r3 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String f(defpackage.kdv r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            myr r1 = r11.a
            boolean r1 = defpackage.lga.bu(r1)
            java.lang.String r2 = "\n"
            if (r1 == 0) goto L22
            android.content.Context r1 = r10.a
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2132022642(0x7f141572, float:1.968371E38)
            java.lang.String r1 = r1.getString(r3)
            r0.append(r1)
            r0.append(r2)
        L22:
            xca r1 = r10.o
            android.content.Context r3 = r10.a
            myr r4 = r11.a
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r4 = defpackage.lga.bt(r4)
            java.lang.String r1 = r1.d(r3, r4)
            myr r3 = r11.a
            java.lang.String r3 = r3.b()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L5d
            android.content.Context r4 = r10.a
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2132018096(0x7f1403b0, float:1.967449E38)
            java.lang.String r4 = r4.getString(r5)
            r0.append(r4)
            r0.append(r1)
            if (r3 != 0) goto L68
            r0.append(r2)
            goto L5f
        L5d:
            if (r3 != 0) goto L68
        L5f:
            myr r2 = r11.a
            java.lang.String r2 = r2.b()
            r0.append(r2)
        L68:
            java.lang.String r0 = r0.toString()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto Ld7
            piz r2 = r10.q
            boolean r2 = r2.a()
            java.lang.String r3 = "Detected an empty text message. Message length=%s, subject length=%s"
            r4 = 0
            java.lang.String r5 = "generateFullMessage"
            java.lang.String r6 = "com/google/android/apps/messaging/conversation2/messagelist/message/bubble/text/TextBubbleUiAdapter"
            java.lang.String r7 = "TextBubbleUiAdapter.kt"
            if (r2 == 0) goto Lb2
            alvi r2 = defpackage.ked.j
            alvw r2 = r2.h()
            alvg r2 = (defpackage.alvg) r2
            com.google.android.apps.messaging.shared.api.messaging.MessageId r8 = r11.q
            alvz r9 = defpackage.ydl.c
            r2.X(r9, r8)
            r8 = 293(0x125, float:4.1E-43)
            alvw r2 = r2.h(r6, r5, r8, r7)
            alvg r2 = (defpackage.alvg) r2
            myr r11 = r11.a
            java.lang.String r11 = r11.b()
            int r11 = r11.length()
            if (r1 == 0) goto Lae
            int r1 = r1.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
        Lae:
            r2.w(r3, r11, r4)
            goto Ld7
        Lb2:
            alvi r2 = defpackage.ked.j
            alvw r2 = r2.h()
            r8 = 301(0x12d, float:4.22E-43)
            alvw r2 = r2.h(r6, r5, r8, r7)
            alvg r2 = (defpackage.alvg) r2
            myr r11 = r11.a
            java.lang.String r11 = r11.b()
            int r11 = r11.length()
            if (r1 == 0) goto Ld4
            int r1 = r1.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
        Ld4:
            r2.w(r3, r11, r4)
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ked.f(kdv):java.lang.String");
    }

    private final boolean g(String str) {
        if (this.k.e() && str != null && str.length() != 0 && this.k.f(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a7  */
    /* JADX WARN: Type inference failed for: r0v43, types: [ascv, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qkg a(defpackage.arwe r33, defpackage.kdv r34) {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ked.a(arwe, kdv):qkg");
    }

    public final List b(kdv kdvVar, String str) {
        aein aeinVar;
        Matcher matcher = null;
        aron aronVar = new aron((byte[]) null);
        kap kapVar = kdvVar.l;
        if (kapVar != null) {
            ibi ibiVar = this.s;
            ArrayList arrayList = new ArrayList();
            String str2 = kapVar.b;
            qyh qyhVar = (qyh) ibiVar.a;
            String[] b = qyhVar.b(str2);
            uac G = uac.G();
            Matcher a = qyhVar.a(b, str, (StringBuilder) G.b, (HashSet) G.a);
            if (true == ((HashSet) G.a).isEmpty()) {
                matcher = a;
            }
            if (matcher != null) {
                int i = 0;
                while (matcher.find(i)) {
                    boolean z = kapVar.a;
                    int start = matcher.start();
                    int end = matcher.end();
                    if (z) {
                        aeinVar = aein.b;
                    } else {
                        aeinVar = aein.a;
                    }
                    arrayList.add(new aeie(aeinVar, start, end, (arqr) null, 24));
                    i = end;
                }
            }
            aronVar.addAll(aqjn.ax(arrayList));
        }
        return aqjn.x(aronVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aezf c(kdv kdvVar, String str, List list, arqg arqgVar) {
        alog<String> n;
        List list2;
        boolean z;
        boolean g = g(kdvVar.a.b());
        ydc ydcVar = this.k;
        boolean g2 = g(str);
        if (!ydcVar.e()) {
            alvw i = ydc.a.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils", "getEmojisListUsingEmojiCompat", 350, "EmojiUtils.java")).q("Bugle: EmojiCompat initialization failed");
            int i2 = alog.d;
            n = alsx.a;
        } else if (TextUtils.isEmpty(str)) {
            int i3 = alog.d;
            n = alsx.a;
        } else {
            CharSequence c = ydcVar.b.c(str);
            if (!(c instanceof Spannable)) {
                int i4 = alog.d;
                n = alsx.a;
            } else {
                ArrayList arrayList = new ArrayList();
                Spannable spannable = (Spannable) c;
                ekb[] ekbVarArr = (ekb[]) spannable.getSpans(0, spannable.length(), ekb.class);
                int length = ekbVarArr.length;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 < length) {
                        ekb ekbVar = ekbVarArr[i5];
                        int spanStart = spannable.getSpanStart(ekbVar);
                        int spanEnd = spannable.getSpanEnd(ekbVar);
                        if (i6 != spanStart && !ydc.c(str, i6, spanStart)) {
                            int i7 = alog.d;
                            n = alsx.a;
                            break;
                        }
                        arrayList.add(str.substring(spanStart, spanEnd));
                        i5++;
                        i6 = spanEnd;
                    } else if (i6 != str.length() && !ydc.c(str, i6, str.length())) {
                        int i8 = alog.d;
                        n = alsx.a;
                    } else {
                        n = alog.n(arrayList);
                    }
                }
            }
        }
        n.getClass();
        if (!n.isEmpty() && n.size() <= ((Number) aaci.f.e()).intValue()) {
            aron aronVar = new aron((byte[]) null);
            for (String str2 : n) {
                aadi aadiVar = this.l;
                str2.getClass();
                aronVar.add(new aeza(str2, (String) ((Map) aadiVar.a.c()).get(str2)));
            }
            list2 = aqjn.x(aronVar);
        } else {
            list2 = null;
        }
        aezj aezjVar = new aezj((byte[]) null);
        arqg arqgVar2 = kdvVar.n;
        boolean z2 = kdvVar.o;
        aexx aexxVar = kdvVar.s;
        if (wtj.a().booleanValue() && yhx.i) {
            alog a = kdvVar.a.a();
            a.getClass();
            if (!a.isEmpty()) {
                alur it = a.iterator();
                while (it.hasNext()) {
                    if (((qdq) it.next()).e() == myq.OTP) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        return new aezf(str, list, kdvVar.e, g, kdvVar.d, kdvVar.b, kdvVar.c, arqgVar, g2, list2, aezjVar, arqgVar2, z2, false, aexxVar, z, new aeio(this.p.a()), 98560);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r26, defpackage.kdv r27, defpackage.arpe r28) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ked.e(java.lang.String, kdv, arpe):java.lang.Object");
    }
}
