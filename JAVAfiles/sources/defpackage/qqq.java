package defpackage;

import android.util.Log;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qqq {
    private final alog d;
    private final alog e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final LinkedList k;
    private final HashMap l = new HashMap();
    private final usk m;
    private static final alpt b = alpt.v(' ', '@', '.', ',', ':', '-', '(', ')', '+', '[', ']', '{', '}', '<', '>');
    private static final alpt c = alpt.t("ʼWAP_PUSH_SI!ʼ", "ʼUNKNOWN_SENDER!ʼ", "EMERGENCY+SERVICE+PROVIDER", "EMERGENCY+SERVICE+PROVIDER+DEMO");
    static final utz a = uuh.e(uuh.b, "bcm_number_of_digits_to_anonymize", Integer.MAX_VALUE);

    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [armf, java.lang.Object] */
    public qqq(armf armfVar, armf armfVar2, armf armfVar3, Function function, armf armfVar4, armf armfVar5, armf armfVar6, uac uacVar, String str) {
        Object apply;
        this.g = armfVar;
        this.h = armfVar2;
        this.i = armfVar3;
        this.j = armfVar5;
        this.f = armfVar4;
        if (!((acwi) armfVar6.b()).a()) {
            apply = function.apply(str);
            Random random = (Random) apply;
            this.m = null;
            ArrayList ap = alzz.ap('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K');
            Collections.shuffle(ap, random);
            this.d = alog.n(ap);
            ArrayList ap2 = alzz.ap('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z');
            Collections.shuffle(ap2, random);
            this.k = new LinkedList(ap2);
            if (((acxs) armfVar5.b()).a()) {
                ArrayList ap3 = alzz.ap('L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V');
                Collections.shuffle(ap3, random);
                this.e = alog.n(ap3);
                return;
            }
            this.e = alsx.a;
            return;
        }
        alpt alptVar = b;
        Function m329m = d$$ExternalSyntheticApiModelOutline0.m329m(uacVar.a.b());
        m329m.getClass();
        acxs acxsVar = (acxs) uacVar.b.b();
        acxsVar.getClass();
        alptVar.getClass();
        this.m = new usk(m329m, acxsVar, str, alptVar);
        int i = alog.d;
        this.d = alsx.a;
        this.k = new LinkedList();
        this.e = alsx.a;
    }

    private final Character e() {
        char c2 = '?';
        if (this.k.isEmpty()) {
            return '?';
        }
        try {
            Character ch = (Character) this.k.removeFirst();
            if (ch != null) {
                c2 = ch.charValue();
            }
            return Character.valueOf(c2);
        } catch (NoSuchElementException unused) {
            return '?';
        }
    }

    private final String f(String str) {
        StringBuilder sb = new StringBuilder();
        g(str, sb, 0);
        return sb.toString();
    }

    private final void g(String str, StringBuilder sb, int i) {
        alog alogVar;
        if (str.indexOf(64, i) == -1) {
            int max = Math.max(((Integer) a.e()).intValue(), 7);
            int length = str.length() - 1;
            while (length >= i && max > 0) {
                char charAt = str.charAt(length);
                if (!Character.isWhitespace(charAt) && !usk.i(charAt) && !b.contains(Character.valueOf(charAt))) {
                    max--;
                }
                length--;
            }
            int i2 = length + 1;
            while (i < i2) {
                sb.append(str.charAt(i));
                i++;
            }
        }
        while (i < str.length()) {
            char charAt2 = str.charAt(i);
            usk uskVar = this.m;
            if (uskVar != null) {
                sb.append(uskVar.h(charAt2));
            } else if (Character.isDigit(charAt2)) {
                if (((acxs) this.j.b()).a()) {
                    int digit = Character.digit(charAt2, 10);
                    if (charAt2 >= '0' && charAt2 <= '9') {
                        alogVar = this.d;
                    } else {
                        alogVar = this.e;
                    }
                    sb.append(alogVar.get(digit));
                } else {
                    sb.append(this.d.get(charAt2 - '0'));
                }
            } else {
                if (!Character.isWhitespace(charAt2) && !usk.i(charAt2)) {
                    alpt alptVar = b;
                    Character valueOf = Character.valueOf(charAt2);
                    if (!alptVar.contains(valueOf)) {
                        if (this.l.containsKey(valueOf)) {
                            sb.append(this.l.get(valueOf));
                        } else {
                            Character e = e();
                            this.l.put(valueOf, e);
                            sb.append(e);
                        }
                    }
                }
                sb.append(charAt2);
            }
            i++;
        }
    }

    public final qqo a(String str) {
        aodz aodzVar;
        Optional d;
        vxm a2;
        boolean z;
        Optional empty;
        Optional empty2;
        String valueOf;
        int indexOf;
        String a3 = ((yjs) this.g.b()).a();
        if (str == null) {
            str = "";
        }
        qqp qqpVar = null;
        try {
            aodzVar = ((anhn) this.f.b()).o(str.trim().trim(), a3);
        } catch (anhk unused) {
            aodzVar = null;
        }
        StringBuilder sb = new StringBuilder();
        boolean contains = c.contains(str);
        int i = 0;
        if (aodzVar != null) {
            if (aodzVar.g() && aodzVar.h() != 1 && aodzVar.h() != 5) {
                z = true;
            } else {
                z = false;
            }
            if (z && (indexOf = str.indexOf((valueOf = String.valueOf(aodzVar.c())))) >= 0) {
                sb.append((CharSequence) str, 0, valueOf.length() + indexOf);
                i = indexOf + valueOf.length();
            }
            String f = f(((anhn) this.f.b()).g(aodzVar));
            if (aodzVar.f()) {
                empty = Optional.of(new yjt(aodzVar.c()));
            } else {
                empty = Optional.empty();
            }
            if (z) {
                empty2 = Optional.of(new yjt(aodzVar.c()));
            } else {
                empty2 = Optional.empty();
            }
            qqpVar = new qqp(empty, empty2, f);
        }
        qqp qqpVar2 = qqpVar;
        g(str, sb, i);
        if (((vxq) this.h.b()).b(str) && (a2 = ((vxq) this.h.b()).a(str)) != null) {
            aozy createBuilder = amqy.a.createBuilder();
            String f2 = f(a2.c);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amqy amqyVar = (amqy) createBuilder.b;
            amqyVar.b |= 1;
            amqyVar.c = f2;
            return new qqo(a3, "", "", null, null, (amqy) createBuilder.s());
        }
        if (((vqq) this.i.b()).c(str)) {
            wyj e = ((vqq) this.i.b()).e(str);
            if (e == null) {
                d = Optional.empty();
            } else {
                d = d(e);
            }
            if (d.isPresent()) {
                return new qqo(a3, "", "", null, (amqv) d.get(), null);
            }
        }
        String sb2 = sb.toString();
        if (!contains) {
            str = f(str);
        }
        return new qqo(a3, sb2, str, qqpVar2, null, null);
    }

    public final String b(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        g(str, sb, 0);
        return sb.toString();
    }

    public final String c(String str) {
        if (Log.isLoggable("Bugle", 3)) {
            return a.bW(str, "raw-pii[", "]");
        }
        return a(str).b;
    }

    public final Optional d(wyj wyjVar) {
        aozy createBuilder = amqv.a.createBuilder();
        String f = f((String) wyjVar.c);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amqv amqvVar = (amqv) createBuilder.b;
        amqvVar.b |= 1;
        amqvVar.c = f;
        Object obj = wyjVar.b;
        if (obj != null) {
            String f2 = f((String) obj);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amqv amqvVar2 = (amqv) createBuilder.b;
            amqvVar2.b |= 4;
            amqvVar2.e = f2;
        }
        Object obj2 = wyjVar.a;
        if (obj2 != null) {
            String f3 = f((String) obj2);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amqv amqvVar3 = (amqv) createBuilder.b;
            amqvVar3.b |= 2;
            amqvVar3.d = f3;
        }
        return Optional.of((amqv) createBuilder.s());
    }
}
