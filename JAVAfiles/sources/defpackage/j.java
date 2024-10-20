package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class j extends Format {
    private static final String[] d = {"number", "date", "time", "spellout", "ordinal", "duration"};
    private static final String[] e = {"", "currency", "percent", "integer"};
    private static final String[] f = {"", "short", "medium", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG, "full"};
    private static final Locale g = new Locale("");
    static final long serialVersionUID = 7136212545847378652L;
    public transient Locale a;
    public transient z b;
    public transient Map c;
    private transient DateFormat h;
    private transient NumberFormat i;
    private transient i j;
    private transient i k;

    public j(String str, Locale locale) {
        Cloneable numberFormat;
        this.a = locale;
        try {
            z zVar = this.b;
            if (zVar == null) {
                this.b = new z(str);
            } else {
                zVar.i(str);
            }
            Map map = this.c;
            if (map != null) {
                map.clear();
            }
            int b = this.b.b() - 2;
            int i = 1;
            while (i < b) {
                y d2 = this.b.d(i);
                if (d2.e == 6 && d2.b() == 2) {
                    z zVar2 = this.b;
                    int i2 = i + 3;
                    String f2 = zVar2.f(zVar2.d(i + 2));
                    String str2 = "";
                    y d3 = this.b.d(i2);
                    if (d3.e == 11) {
                        str2 = this.b.f(d3);
                        i2 = i + 4;
                    }
                    int c = c(f2, d);
                    if (c != 0) {
                        if (c != 1) {
                            if (c == 2) {
                                int c2 = c(str2, f);
                                if (c2 != 0) {
                                    if (c2 != 1) {
                                        if (c2 != 2) {
                                            if (c2 != 3) {
                                                if (c2 != 4) {
                                                    numberFormat = new SimpleDateFormat(str2, this.a);
                                                } else {
                                                    numberFormat = DateFormat.getTimeInstance(0, this.a);
                                                }
                                            } else {
                                                numberFormat = DateFormat.getTimeInstance(1, this.a);
                                            }
                                        } else {
                                            numberFormat = DateFormat.getTimeInstance(2, this.a);
                                        }
                                    } else {
                                        numberFormat = DateFormat.getTimeInstance(3, this.a);
                                    }
                                } else {
                                    numberFormat = DateFormat.getTimeInstance(2, this.a);
                                }
                            } else {
                                throw new IllegalArgumentException(a.bW(f2, "Unknown format type \"", "\""));
                            }
                        } else {
                            int c3 = c(str2, f);
                            if (c3 != 0) {
                                if (c3 != 1) {
                                    if (c3 != 2) {
                                        if (c3 != 3) {
                                            if (c3 != 4) {
                                                numberFormat = new SimpleDateFormat(str2, this.a);
                                            } else {
                                                numberFormat = DateFormat.getDateInstance(0, this.a);
                                            }
                                        } else {
                                            numberFormat = DateFormat.getDateInstance(1, this.a);
                                        }
                                    } else {
                                        numberFormat = DateFormat.getDateInstance(2, this.a);
                                    }
                                } else {
                                    numberFormat = DateFormat.getDateInstance(3, this.a);
                                }
                            } else {
                                numberFormat = DateFormat.getDateInstance(2, this.a);
                            }
                        }
                    } else {
                        int c4 = c(str2, e);
                        if (c4 != 0) {
                            if (c4 != 1) {
                                if (c4 != 2) {
                                    if (c4 != 3) {
                                        numberFormat = new DecimalFormat(str2, new DecimalFormatSymbols(this.a));
                                    } else {
                                        numberFormat = NumberFormat.getIntegerInstance(this.a);
                                    }
                                } else {
                                    numberFormat = NumberFormat.getPercentInstance(this.a);
                                }
                            } else {
                                numberFormat = NumberFormat.getCurrencyInstance(this.a);
                            }
                        } else {
                            numberFormat = NumberFormat.getInstance(this.a);
                        }
                    }
                    if (this.c == null) {
                        this.c = new HashMap();
                    }
                    this.c.put(Integer.valueOf(i), numberFormat);
                    i = i2;
                }
                i++;
            }
        } catch (RuntimeException e2) {
            z zVar3 = this.b;
            if (zVar3 != null) {
                zVar3.a = null;
                zVar3.d = false;
                zVar3.b.clear();
                ArrayList arrayList = zVar3.c;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            Map map2 = this.c;
            if (map2 != null) {
                map2.clear();
            }
            throw e2;
        }
    }

    private static final int c(String str, String[] strArr) {
        byte[] bArr = e.a;
        if (str.length() != 0 && (e.a(str.charAt(0)) || e.a(str.charAt(str.length() - 1)))) {
            int length = str.length();
            int i = 0;
            while (i < length && e.a(str.charAt(i))) {
                i++;
            }
            if (i < length) {
                while (true) {
                    int i2 = length - 1;
                    if (!e.a(str.charAt(i2))) {
                        break;
                    }
                    length = i2;
                }
            }
            str = str.substring(i, length);
        }
        String lowerCase = str.toLowerCase(g);
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (lowerCase.equals(strArr[i3])) {
                return i3;
            }
        }
        return -1;
    }

    private final void d(String str, ParsePosition parsePosition, Object[] objArr, Map map) {
        String str2;
        String num;
        Object obj;
        short s;
        String str3;
        int length;
        Object obj2;
        Object obj3;
        Map map2;
        z zVar;
        int i;
        int i2;
        Format format;
        if (str == null) {
            return;
        }
        z zVar2 = this.b;
        String str4 = zVar2.a;
        int a = zVar2.d(0).a();
        int index = parsePosition.getIndex();
        ParsePosition parsePosition2 = new ParsePosition(0);
        boolean z = true;
        int i3 = 1;
        while (true) {
            y d2 = this.b.d(i3);
            int i4 = d2.e;
            int i5 = d2.a - a;
            if (i5 != 0 && !str4.regionMatches(a, str, index, i5)) {
                parsePosition.setErrorIndex(index);
                return;
            }
            index += i5;
            if (i4 == 2) {
                parsePosition.setIndex(index);
                return;
            }
            if (i4 != 3 && i4 != 4) {
                int c = this.b.c(i3);
                int b = d2.b();
                y d3 = this.b.d(i3 + 1);
                if (objArr != null) {
                    s = d3.c;
                    obj = Integer.valueOf(s);
                    num = null;
                } else {
                    if (d3.e == 9) {
                        num = this.b.f(d3);
                    } else {
                        num = Integer.toString(d3.c);
                    }
                    obj = num;
                    s = 0;
                }
                int i6 = i3 + 2;
                Map map3 = this.c;
                if (map3 != null && (format = (Format) map3.get(Integer.valueOf(i3))) != null) {
                    parsePosition2.setIndex(index);
                    obj3 = format.parseObject(str, parsePosition2);
                    if (parsePosition2.getIndex() == index) {
                        parsePosition.setErrorIndex(index);
                        return;
                    } else {
                        index = parsePosition2.getIndex();
                        str2 = str4;
                        str3 = num;
                    }
                } else if (b != z && ((map2 = this.c) == null || !map2.containsKey(Integer.valueOf(i3)))) {
                    if (b == 3) {
                        parsePosition2.setIndex(index);
                        z zVar3 = this.b;
                        int index2 = parsePosition2.getIndex();
                        double d4 = Double.NaN;
                        int i7 = index2;
                        int i8 = i6;
                        while (true) {
                            if (zVar3.h(i8) != 7) {
                                double a2 = zVar3.a(zVar3.d(i8));
                                int i9 = i8 + 2;
                                int c2 = zVar3.c(i9);
                                String str5 = zVar3.a;
                                str2 = str4;
                                int a3 = zVar3.d(i9).a();
                                int i10 = 0;
                                while (true) {
                                    i9++;
                                    str3 = num;
                                    y d5 = zVar3.d(i9);
                                    zVar = zVar3;
                                    if (i9 != c2 && d5.e != 3) {
                                        zVar3 = zVar;
                                        num = str3;
                                    }
                                    int i11 = d5.a - a3;
                                    if (i11 != 0 && !str.regionMatches(index2, str5, a3, i11)) {
                                        i = -1;
                                        break;
                                    }
                                    i10 += i11;
                                    if (i9 == c2) {
                                        i = i10;
                                        break;
                                    } else {
                                        a3 = d5.a();
                                        zVar3 = zVar;
                                        num = str3;
                                    }
                                }
                                if (i >= 0 && (i2 = i + index2) > i7) {
                                    if (i2 == str.length()) {
                                        i7 = i2;
                                        d4 = a2;
                                        break;
                                    } else {
                                        i7 = i2;
                                        d4 = a2;
                                    }
                                }
                                i8 = c2 + 1;
                                zVar3 = zVar;
                                str4 = str2;
                                num = str3;
                            } else {
                                str2 = str4;
                                str3 = num;
                                break;
                            }
                        }
                        if (i7 == index2) {
                            parsePosition2.setErrorIndex(index2);
                        } else {
                            parsePosition2.setIndex(i7);
                        }
                        if (parsePosition2.getIndex() == index) {
                            parsePosition.setErrorIndex(index);
                            return;
                        } else {
                            obj3 = Double.valueOf(d4);
                            index = parsePosition2.getIndex();
                            z = true;
                        }
                    } else {
                        if (!d.b(b) && b != 5) {
                            throw new IllegalStateException("unexpected argType ".concat(d.a(b)));
                        }
                        throw new UnsupportedOperationException("Parsing of plural/select/selectordinal argument is not supported.");
                    }
                } else {
                    str2 = str4;
                    str3 = num;
                    StringBuilder sb = new StringBuilder();
                    z zVar4 = this.b;
                    String str6 = zVar4.a;
                    int a4 = zVar4.d(c).a();
                    int i12 = c + 1;
                    while (true) {
                        y d6 = this.b.d(i12);
                        int i13 = d6.e;
                        sb.append((CharSequence) str6, a4, d6.a);
                        if (i13 == 6 || i13 == 2) {
                            break;
                        }
                        i12++;
                        a4 = d6.a();
                    }
                    String sb2 = sb.toString();
                    if (sb2.length() != 0) {
                        length = str.indexOf(sb2, index);
                    } else {
                        length = str.length();
                    }
                    if (length < 0) {
                        parsePosition.setErrorIndex(index);
                        return;
                    }
                    String substring = str.substring(index, length);
                    boolean equals = substring.equals(a.bX(obj, "{", "}"));
                    if (true == equals) {
                        obj2 = null;
                    } else {
                        obj2 = substring;
                    }
                    index = length;
                    z = !equals;
                    obj3 = obj2;
                }
                if (z) {
                    if (objArr != null) {
                        objArr[s] = obj3;
                    } else {
                        if (map != null) {
                            map.put(str3, obj3);
                        }
                        a = this.b.d(c).a();
                        i3 = c;
                    }
                }
                a = this.b.d(c).a();
                i3 = c;
            } else {
                str2 = str4;
                a = d2.a();
            }
            i3++;
            z = true;
            str4 = str2;
        }
    }

    private final void e(Object obj, arhj arhjVar, FieldPosition fieldPosition) {
        if (obj != null && !(obj instanceof Map)) {
            f((Object[]) obj, null, arhjVar, fieldPosition);
        } else {
            f(null, (Map) obj, arhjVar, fieldPosition);
        }
    }

    private final void f(Object[] objArr, Map map, arhj arhjVar, FieldPosition fieldPosition) {
        if (objArr != null && this.b.d) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        b(0, null, objArr, map, null, arhjVar, fieldPosition);
    }

    private final void g(int i, h hVar, Object[] objArr, Map map, Object[] objArr2, arhj arhjVar) {
        if (this.b.f != 2) {
            b(i, hVar, objArr, map, objArr2, arhjVar, null);
            return;
        }
        throw new UnsupportedOperationException("JDK apostrophe mode not supported");
    }

    public final NumberFormat a() {
        if (this.i == null) {
            this.i = NumberFormat.getInstance(this.a);
        }
        return this.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x032c, code lost:
    
        r9 = 6;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0496 A[LOOP:2: B:111:0x0231->B:122:0x0496, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04a9 A[EDGE_INSN: B:123:0x04a9->B:124:0x04a9 BREAK  A[LOOP:2: B:111:0x0231->B:122:0x0496], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0578  */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Appendable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r35, defpackage.h r36, java.lang.Object[] r37, java.util.Map r38, java.lang.Object[] r39, defpackage.arhj r40, java.text.FieldPosition r41) {
        /*
            Method dump skipped, instructions count: 1471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j.b(int, h, java.lang.Object[], java.util.Map, java.lang.Object[], arhj, java.text.FieldPosition):void");
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        e(obj, new arhj(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    @Override // java.text.Format
    public final AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        if (obj != null) {
            StringBuilder sb = new StringBuilder();
            arhj arhjVar = new arhj(sb);
            arhjVar.c = new ArrayList();
            e(obj, arhjVar, null);
            AttributedString attributedString = new AttributedString(sb.toString());
            for (fxg fxgVar : arhjVar.c) {
                attributedString.addAttribute((AttributedCharacterIterator.Attribute) fxgVar.d, fxgVar.c, fxgVar.a, fxgVar.b);
            }
            return attributedString.getIterator();
        }
        throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
    }

    public final int hashCode() {
        return this.b.a.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        if (!this.b.d) {
            int i = 0;
            short s = -1;
            while (true) {
                if (i != 0) {
                    i = this.b.c(i);
                }
                while (true) {
                    i++;
                    int h = this.b.h(i);
                    if (h == 6) {
                        break;
                    }
                    if (h == 2) {
                        i = -1;
                        break;
                    }
                }
                if (i < 0) {
                    break;
                }
                short s2 = this.b.d(i + 1).c;
                if (s2 > s) {
                    s = s2;
                }
            }
            Object[] objArr = new Object[s + 1];
            int index = parsePosition.getIndex();
            d(str, parsePosition, objArr, null);
            if (parsePosition.getIndex() == index) {
                return null;
            }
            return objArr;
        }
        HashMap hashMap = new HashMap();
        int index2 = parsePosition.getIndex();
        d(str, parsePosition, null, hashMap);
        if (parsePosition.getIndex() == index2) {
            return null;
        }
        return hashMap;
    }
}
