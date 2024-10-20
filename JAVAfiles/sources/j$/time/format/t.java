package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class t implements InterfaceC0086f {
    private static volatile AbstractMap.SimpleImmutableEntry c;
    private static volatile AbstractMap.SimpleImmutableEntry d;
    private final j$.time.temporal.n a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(j$.time.temporal.n nVar, String str) {
        this.a = nVar;
        this.b = str;
    }

    private static int b(w wVar, CharSequence charSequence, int i, int i2, k kVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            wVar.n(ZoneId.of(upperCase));
            return i2;
        }
        if (charSequence.charAt(i2) != '0' && !wVar.b(charSequence.charAt(i2), 'Z')) {
            w d2 = wVar.d();
            int t = kVar.t(d2, charSequence, i2);
            try {
                if (t < 0) {
                    if (kVar == k.e) {
                        return ~i;
                    }
                    wVar.n(ZoneId.of(upperCase));
                    return i2;
                }
                wVar.n(ZoneId.d0(upperCase, ZoneOffset.ofTotalSeconds((int) d2.j(ChronoField.OFFSET_SECONDS).longValue())));
                return t;
            } catch (DateTimeException unused) {
                return ~i;
            }
        }
        wVar.n(ZoneId.of(upperCase));
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public n a(w wVar) {
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry;
        Set a = j$.time.zone.i.a();
        int size = a.size();
        if (wVar.k()) {
            simpleImmutableEntry = c;
        } else {
            simpleImmutableEntry = d;
        }
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    if (wVar.k()) {
                        simpleImmutableEntry = c;
                    } else {
                        simpleImmutableEntry = d;
                    }
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), n.g(a, wVar));
                        if (wVar.k()) {
                            c = simpleImmutableEntry;
                        } else {
                            d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (n) simpleImmutableEntry.getValue();
    }

    @Override // j$.time.format.InterfaceC0086f
    public boolean n(z zVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) zVar.f(this.a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.m());
        return true;
    }

    @Override // j$.time.format.InterfaceC0086f
    public final int t(w wVar, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i <= length) {
            if (i == length) {
                return ~i;
            }
            char charAt = charSequence.charAt(i);
            if (charAt != '+' && charAt != '-') {
                int i3 = i + 2;
                if (length >= i3) {
                    char charAt2 = charSequence.charAt(i + 1);
                    if (wVar.b(charAt, 'U') && wVar.b(charAt2, 'T')) {
                        int i4 = i + 3;
                        if (length >= i4 && wVar.b(charSequence.charAt(i3), 'C')) {
                            return b(wVar, charSequence, i, i4, k.f);
                        }
                        return b(wVar, charSequence, i, i3, k.f);
                    }
                    if (wVar.b(charAt, 'G') && length >= (i2 = i + 3) && wVar.b(charAt2, 'M') && wVar.b(charSequence.charAt(i3), 'T')) {
                        int i5 = i + 4;
                        if (length >= i5 && wVar.b(charSequence.charAt(i2), '0')) {
                            wVar.n(ZoneId.of("GMT0"));
                            return i5;
                        }
                        return b(wVar, charSequence, i, i2, k.f);
                    }
                }
                n a = a(wVar);
                ParsePosition parsePosition = new ParsePosition(i);
                String d2 = a.d(charSequence, parsePosition);
                if (d2 == null) {
                    if (wVar.b(charAt, 'Z')) {
                        wVar.n(ZoneOffset.UTC);
                        return i + 1;
                    }
                    return ~i;
                }
                wVar.n(ZoneId.of(d2));
                return parsePosition.getIndex();
            }
            return b(wVar, charSequence, i, i, k.e);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        return this.b;
    }
}
