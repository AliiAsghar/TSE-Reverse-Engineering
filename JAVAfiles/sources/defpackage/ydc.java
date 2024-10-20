package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import j$.util.DesugarArrays;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydc {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils");
    private static final List c;
    private static final List d;
    private static final List e;
    private static final List f;
    public ejx b;
    private alhr g = albo.D(new xyn(4));
    private final znj j = new znj((byte[]) null, (byte[]) null);
    private final dyl h = new ycz(this);
    private final dyp i = new yda();

    static {
        ArrayList arrayList = new ArrayList();
        c = arrayList;
        d = new ArrayList();
        e = new ArrayList();
        f = new ArrayList();
        arrayList.add(35);
        arrayList.add(42);
        for (int i = 0; i <= 9; i++) {
            c.add(Integer.valueOf(i + 48));
        }
        List list = d;
        list.add(65038);
        list.add(65039);
        list.add(8205);
        List list2 = e;
        list2.add(8294);
        list2.add(8297);
        List list3 = f;
        list3.add(127995);
        list3.add(127996);
        list3.add(127997);
        list3.add(127998);
        list3.add(127999);
        list3.add(8205);
        list3.add(65038);
        list3.add(65039);
    }

    public ydc(Context context) {
        if (yhx.f(context)) {
            ebq ebqVar = new ebq("Noto Color Emoji Compat");
            eke ekeVar = new eke(context, ebqVar);
            List list = c;
            ekeVar.c = true;
            int i = 0;
            if (list != null) {
                ekeVar.d = new int[list.size()];
                Iterator it = list.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    ekeVar.d[i2] = ((Integer) it.next()).intValue();
                    i2++;
                }
                Arrays.sort(ekeVar.d);
            } else {
                ekeVar.d = null;
            }
            ekeVar.a(this.h);
            eld eldVar = new eld(context, ebqVar);
            List list2 = c;
            eldVar.b = true;
            if (list2 != null) {
                eldVar.c = new int[list2.size()];
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    eldVar.c[i] = ((Integer) it2.next()).intValue();
                    i++;
                }
                Arrays.sort(eldVar.c);
            } else {
                eldVar.c = null;
            }
            dyp dypVar = this.i;
            Executor e2 = dym.e();
            d.aC(dypVar, "initCallback cannot be null");
            if (eldVar.d == null) {
                eldVar.d = new to();
            }
            eldVar.d.add(new fvq(e2, dypVar));
            if (((Boolean) utw.ag.e()).booleanValue()) {
                ekeVar.b = true;
                eldVar.a = true;
            }
            alvw g = a.g();
            g.X(alwp.a, "Bugle");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils", "emojiInit", 164, "EmojiUtils.java")).q("Initializing EmojiCompat");
            ejx.g(ekeVar);
            if (ekt.b == null) {
                synchronized (ekt.a) {
                    if (ekt.b == null) {
                        ekt.b = new ekt(eldVar);
                    }
                }
            }
        }
    }

    public static boolean c(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int codePointAt = Character.codePointAt(charSequence, i);
            if (codePointAt != 10 && codePointAt != 32 && !e.contains(Integer.valueOf(codePointAt))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map, java.lang.Object] */
    private final amgm h(final String str, final boolean z) {
        Object obj;
        ycx ycxVar = new ycx(str, z);
        arqg arqgVar = new arqg() { // from class: ycy
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00d0, code lost:
            
                if (r1 <= 0) goto L40;
             */
            @Override // defpackage.arqg
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instructions count: 225
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ycy.a():java.lang.Object");
            }
        };
        znj znjVar = this.j;
        synchronized (znjVar.a) {
            obj = ((xxo) znjVar.b).get(ycxVar);
            if (obj == null) {
                obj = arqgVar.a();
            }
            ((xxo) znjVar.b).remove(ycxVar);
            znjVar.b.put(ycxVar, obj);
        }
        return (amgm) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ece a(String str) {
        alog alogVar;
        boolean z;
        if (!e()) {
            alogVar = null;
        } else {
            CharSequence c2 = this.b.c(str);
            if (!(c2 instanceof Spannable)) {
                int i = alog.d;
                alogVar = alsx.a;
            } else {
                Spannable spannable = (Spannable) c2;
                Stream sorted = DesugarArrays.stream((ekb[]) spannable.getSpans(0, spannable.length(), ekb.class)).map(new xol(spannable, 17)).sorted();
                int i2 = alog.d;
                alogVar = (alog) sorted.collect(alls.a);
            }
        }
        if (alogVar == null) {
            return new ece(-1, -1);
        }
        int size = alogVar.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            ydb ydbVar = (ydb) alogVar.get(i5);
            if (ydbVar.a >= i4) {
                z = true;
            } else {
                z = false;
            }
            albo.T(z);
            i3 += ydbVar.a - i4;
            i4 = ydbVar.b;
        }
        return new ece(Integer.valueOf(alogVar.size()), Integer.valueOf(i3 + (str.length() - i4)));
    }

    public final amgm b(String str) {
        return h(str, false);
    }

    public final boolean d(CharSequence charSequence) {
        ejx ejxVar = this.b;
        if (ejxVar != null) {
            dye.f(ejxVar.f(), "Not initialized yet");
            d.aC(charSequence, "sequence cannot be null");
            if (((ahuq) ejxVar.j.a).d(charSequence) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean e() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public final boolean f(CharSequence charSequence) {
        amgm h = h(charSequence.toString(), true);
        if (h == amgm.EMOJI_STATUS_SINGLE_EMOJI_ONLY || h == amgm.EMOJI_STATUS_ALL_EMOJI) {
            return true;
        }
        return false;
    }

    public final boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((TextPaint) this.g.get()).hasGlyph(str);
    }
}
