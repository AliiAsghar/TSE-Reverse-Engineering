package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atir implements atjg, atje {
    private static final Map a = new ConcurrentHashMap();
    private final atfy b;
    private final boolean c;

    public atir(atfy atfyVar, boolean z) {
        this.b = atfyVar;
        this.c = z;
    }

    @Override // defpackage.atje
    public final int a() {
        return b();
    }

    @Override // defpackage.atjg
    public final int b() {
        if (this.c) {
            return 6;
        }
        return 20;
    }

    @Override // defpackage.atje
    public final int c(atja atjaVar, CharSequence charSequence, int i) {
        int intValue;
        Map map;
        Map map2 = a;
        Locale locale = atjaVar.b;
        Map map3 = (Map) map2.get(locale);
        if (map3 == null) {
            map3 = new ConcurrentHashMap();
            map2.put(locale, map3);
        }
        Object[] objArr = (Object[]) map3.get(this.b);
        if (objArr == null) {
            map = new ConcurrentHashMap(32);
            atgj atgjVar = new atgj(atgc.a);
            atfy atfyVar = this.b;
            atfw a2 = atfyVar.a(atgjVar.b);
            if (a2.u()) {
                atgi atgiVar = new atgi(atgjVar, a2);
                int d = atgiVar.b.d();
                int c = atgiVar.b.c();
                if (c - d <= 32) {
                    intValue = atgiVar.b.b(locale);
                    while (d <= c) {
                        atgj atgjVar2 = atgiVar.a;
                        long h = atgiVar.b.h(atgjVar2.a, d);
                        atfu atfuVar = atgjVar2.b;
                        atgjVar2.a = h;
                        map.put(atgiVar.e(locale), Boolean.TRUE);
                        map.put(atgiVar.e(locale).toLowerCase(locale), Boolean.TRUE);
                        map.put(atgiVar.e(locale).toUpperCase(locale), Boolean.TRUE);
                        map.put(atgiVar.f(locale), Boolean.TRUE);
                        map.put(atgiVar.f(locale).toLowerCase(locale), Boolean.TRUE);
                        map.put(atgiVar.f(locale).toUpperCase(locale), Boolean.TRUE);
                        d++;
                    }
                    if ("en".equals(locale.getLanguage()) && this.b == atfy.b) {
                        map.put("BCE", Boolean.TRUE);
                        map.put("bce", Boolean.TRUE);
                        map.put("CE", Boolean.TRUE);
                        map.put("ce", Boolean.TRUE);
                        intValue = 3;
                    }
                    map3.put(this.b, new Object[]{map, Integer.valueOf(intValue)});
                }
                return ~i;
            }
            throw new IllegalArgumentException("Field '" + atfyVar.y + "' is not supported");
        }
        Map map4 = (Map) objArr[0];
        intValue = ((Integer) objArr[1]).intValue();
        map = map4;
        for (int min = Math.min(charSequence.length(), i + intValue); min > i; min--) {
            String charSequence2 = charSequence.subSequence(i, min).toString();
            if (map.containsKey(charSequence2)) {
                atfy atfyVar2 = this.b;
                atiy c2 = atjaVar.c();
                c2.a = atfyVar2.a(atjaVar.a);
                c2.b = 0;
                c2.c = charSequence2;
                c2.d = locale;
                return min;
            }
        }
        return ~i;
    }

    @Override // defpackage.atjg
    public final void d(Appendable appendable, long j, atfu atfuVar, int i, atgc atgcVar, Locale locale) {
        String n;
        try {
            atfw a2 = this.b.a(atfuVar);
            if (this.c) {
                n = a2.l(j, locale);
            } else {
                n = a2.n(j, locale);
            }
            appendable.append(n);
        } catch (RuntimeException unused) {
            appendable.append((char) 65533);
        }
    }
}
