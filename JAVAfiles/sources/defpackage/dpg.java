package defpackage;

import android.graphics.Typeface;
import defpackage.dli;
import defpackage.dmp;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpg implements dih {
    public final dje a;
    public final dli.a b;
    public final dpi c;
    public final CharSequence d;
    public final djq e;
    public dps f;
    public final int g;
    private final String h;
    private final List i;
    private final List j;
    private final dqv k;
    private final boolean l;

    /* compiled from: PG */
    /* renamed from: dpg$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqx<dli, dlx, dls, dlt, Typeface> {
        public AnonymousClass1() {
            super(4);
        }

        @Override // defpackage.arqx
        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = ((dls) obj3).a;
            int i2 = ((dlt) obj4).a;
            cas a = dpg.this.b.a((dli) obj, (dlx) obj2, i, i2);
            if (!(a instanceof dmp.b)) {
                dps dpsVar = new dps(a, dpg.this.f);
                dpg.this.f = dpsVar;
                Object obj5 = dpsVar.a;
                obj5.getClass();
                return (Typeface) obj5;
            }
            Object a2 = a.a();
            a2.getClass();
            return (Typeface) a2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x035c, code lost:
    
        if (defpackage.drm.b(r4.i()) != 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0097, code lost:
    
        if (r5 == 1) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0181 A[LOOP:0: B:38:0x017b->B:40:0x0181, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0285 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a7  */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v22, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dpg(java.lang.String r46, defpackage.dje r47, java.util.List r48, java.util.List r49, dli.a r50, defpackage.dqv r51) {
        /*
            Method dump skipped, instructions count: 2113
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpg.<init>(java.lang.String, dje, java.util.List, java.util.List, dli$a, dqv):void");
    }

    @Override // defpackage.dih
    public final float a() {
        return this.e.b();
    }

    @Override // defpackage.dih
    public final float b() {
        float f;
        djq djqVar = this.e;
        if (!Float.isNaN(djqVar.c)) {
            return djqVar.c;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(djqVar.b.getTextLocale());
        CharSequence charSequence = djqVar.a;
        lineInstance.setText(new djk(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new Comparator() { // from class: djp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                armo armoVar = (armo) obj;
                armo armoVar2 = (armo) obj2;
                return (((Number) armoVar.b).intValue() - ((Number) armoVar.a).intValue()) - (((Number) armoVar2.b).intValue() - ((Number) armoVar2.a).intValue());
            }
        });
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new armo(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                armo armoVar = (armo) priorityQueue.peek();
                if (armoVar != null && ((Number) armoVar.b).intValue() - ((Number) armoVar.a).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new armo(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = brg.a;
        } else {
            Iterator it = priorityQueue.iterator();
            if (it.hasNext()) {
                armo armoVar2 = (armo) it.next();
                float a = djqVar.a(((Number) armoVar2.a).intValue(), ((Number) armoVar2.b).intValue());
                while (it.hasNext()) {
                    armo armoVar3 = (armo) it.next();
                    a = Math.max(a, djqVar.a(((Number) armoVar3.a).intValue(), ((Number) armoVar3.b).intValue()));
                }
                f = a;
            } else {
                throw new NoSuchElementException();
            }
        }
        djqVar.c = f;
        return f;
    }

    @Override // defpackage.dih
    public final boolean c() {
        dps dpsVar = this.f;
        if (dpsVar != null && dpsVar.a()) {
            return true;
        }
        if (this.l || !dph.a(this.a)) {
            return false;
        }
        int i = dpn.a;
        if (((Boolean) dpn.a().a()).booleanValue()) {
            return true;
        }
        return false;
    }
}
