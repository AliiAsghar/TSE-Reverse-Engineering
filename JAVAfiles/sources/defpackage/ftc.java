package defpackage;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftc {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map c;
    private static final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = DesugarCollections.unmodifiableMap(hashMap2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString a(java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftc.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0150, code lost:
    
        if (r15 == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0152, code lost:
    
        if (r15 == 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0154, code lost:
    
        if (r15 == 2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0157, code lost:
    
        if (r15 == 3) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0159, code lost:
    
        if (r15 == 4) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015b, code lost:
    
        r3 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015c, code lost:
    
        if (r15 == 5) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015e, code lost:
    
        defpackage.eub.f("WebvttCueParser", "Invalid alignment value: ".concat(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0168, code lost:
    
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016a, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016c, code lost:
    
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016d, code lost:
    
        r17.d = r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0181. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x00b0. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(java.lang.String r16, defpackage.ftb r17) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftc.b(java.lang.String, ftb):void");
    }

    public static mkk c(String str, Matcher matcher, euf eufVar, List list) {
        ftb ftbVar = new ftb();
        try {
            String group = matcher.group(1);
            dzg.g(group);
            ftbVar.a = fte.b(group);
            String group2 = matcher.group(2);
            dzg.g(group2);
            ftbVar.b = fte.b(group2);
            String group3 = matcher.group(3);
            dzg.g(group3);
            b(group3, ftbVar);
            StringBuilder sb = new StringBuilder();
            String u = eufVar.u();
            while (!TextUtils.isEmpty(u)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(u.trim());
                u = eufVar.u();
            }
            ftbVar.c = a(str, sb.toString(), list);
            return new mkk(ftbVar.a().a(), ftbVar.a, ftbVar.b);
        } catch (NumberFormatException unused) {
            eub.f("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static int d(List list, String str, aksr aksrVar) {
        List e = e(list, str, aksrVar);
        for (int i = 0; i < e.size(); i++) {
            int i2 = ((fta) e.get(i)).b.o;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Set, java.lang.Object] */
    private static List e(List list, String str, aksr aksrVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            fsy fsyVar = (fsy) list.get(i);
            ?? r4 = aksrVar.c;
            ?? r5 = aksrVar.b;
            Object obj = aksrVar.d;
            if (fsyVar.a.isEmpty() && fsyVar.b.isEmpty() && fsyVar.c.isEmpty() && fsyVar.d.isEmpty()) {
                if (TextUtils.isEmpty(r4)) {
                    size = 1;
                }
                size = 0;
            } else {
                int b2 = fsy.b(fsy.b(fsy.b(0, fsyVar.a, str, 1073741824), fsyVar.b, (String) r4, 2), fsyVar.d, (String) obj, 4);
                if (b2 != -1 && r5.containsAll(fsyVar.c)) {
                    size = b2 + (fsyVar.c.size() * 4);
                }
                size = 0;
            }
            if (size > 0) {
                arrayList.add(new fta(size, fsyVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.Set, java.lang.Object] */
    private static void f(String str, aksr aksrVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c2;
        int i = aksrVar.a;
        int length = spannableStringBuilder.length();
        String str2 = (String) aksrVar.c;
        int hashCode = str2.hashCode();
        int i2 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode != 3511770) {
                        if (hashCode != 98) {
                            if (hashCode != 99) {
                                if (hashCode != 117) {
                                    if (hashCode == 118 && str2.equals("v")) {
                                        c2 = 5;
                                    }
                                    c2 = 65535;
                                } else {
                                    if (str2.equals("u")) {
                                        c2 = 3;
                                    }
                                    c2 = 65535;
                                }
                            } else {
                                if (str2.equals("c")) {
                                    c2 = 4;
                                }
                                c2 = 65535;
                            }
                        } else {
                            if (str2.equals("b")) {
                                c2 = 0;
                            }
                            c2 = 65535;
                        }
                    } else {
                        if (str2.equals("ruby")) {
                            c2 = 2;
                        }
                        c2 = 65535;
                    }
                } else {
                    if (str2.equals("lang")) {
                        c2 = 6;
                    }
                    c2 = 65535;
                }
            } else {
                if (str2.equals("i")) {
                    c2 = 1;
                }
                c2 = 65535;
            }
        } else {
            if (str2.equals("")) {
                c2 = 7;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 2:
                int d2 = d(list2, str, aksrVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, fsz.a);
                int i3 = aksrVar.a;
                int i4 = 0;
                int i5 = 0;
                while (i4 < arrayList.size()) {
                    if ("rt".equals(((fsz) arrayList.get(i4)).c.c)) {
                        fsz fszVar = (fsz) arrayList.get(i4);
                        int d3 = d(list2, str, fszVar.c);
                        if (d3 == i2) {
                            if (d2 != i2) {
                                d3 = d2;
                            } else {
                                d3 = 1;
                            }
                        }
                        int i6 = fszVar.c.a - i5;
                        int i7 = fszVar.b - i5;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i6, i7);
                        spannableStringBuilder.delete(i6, i7);
                        spannableStringBuilder.setSpan(new ete(subSequence.toString(), d3), i3, i6, 33);
                        i5 += subSequence.length();
                        i3 = i6;
                    }
                    i4++;
                    i2 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 4:
                for (String str3 : aksrVar.b) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new etg((String) aksrVar.d), i, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List e = e(list2, str, aksrVar);
        for (int i8 = 0; i8 < e.size(); i8++) {
            fsy fsyVar = ((fta) e.get(i8)).b;
            if (fsyVar != null) {
                if (fsyVar.a() != -1) {
                    dzg.j(spannableStringBuilder, new StyleSpan(fsyVar.a()), i, length);
                }
                if (fsyVar.j == 1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (fsyVar.g) {
                    if (fsyVar.g) {
                        dzg.j(spannableStringBuilder, new ForegroundColorSpan(fsyVar.f), i, length);
                    } else {
                        throw new IllegalStateException("Font color not defined");
                    }
                }
                if (fsyVar.i) {
                    if (fsyVar.i) {
                        dzg.j(spannableStringBuilder, new BackgroundColorSpan(fsyVar.h), i, length);
                    } else {
                        throw new IllegalStateException("Background color not defined.");
                    }
                }
                if (fsyVar.e != null) {
                    dzg.j(spannableStringBuilder, new TypefaceSpan(fsyVar.e), i, length);
                }
                int i9 = fsyVar.m;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            dzg.j(spannableStringBuilder, new RelativeSizeSpan(fsyVar.n / 100.0f), i, length);
                        }
                    } else {
                        dzg.j(spannableStringBuilder, new RelativeSizeSpan(fsyVar.n), i, length);
                    }
                } else {
                    dzg.j(spannableStringBuilder, new AbsoluteSizeSpan((int) fsyVar.n, true), i, length);
                }
                if (fsyVar.p) {
                    spannableStringBuilder.setSpan(new etc(), i, length, 33);
                }
            }
        }
    }
}
